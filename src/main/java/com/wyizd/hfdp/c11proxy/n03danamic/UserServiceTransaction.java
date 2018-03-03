package com.wyizd.hfdp.c11proxy.n03danamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午6:45:18
 * @Title
 * @Discription
 */
public class UserServiceTransaction implements InvocationHandler {
	UserService userService;

	public Object getProxyClass(UserService userService) {
		this.userService = userService;
		return Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		try {
			System.out.println("before transaction");
			Object o = method.invoke(userService, args);
			System.out.println("ok. connection.commit();");
			return o;
		} catch (Exception e) {
			System.out.println("error,connection.rollback()");
			e.printStackTrace();
		}

		return null;
	}

}
