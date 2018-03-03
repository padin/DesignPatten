package com.wyizd.ftdp.TestC11.n01destance;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c11proxy.n01distance.MyService;
import com.wyizd.hfdp.c11proxy.n01distance.MyServiceImpl;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 下午8:41:57
 * @Title 代理（保护）
 * @Discription 先要在控制台使用java工具 rmiregistry 注册服务
 */
class Client {

	@Test
	void test() {
		try {
			MyService myService = new MyServiceImpl();
			Naming.rebind("RemoteHello", myService);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		try {
			MyService service = (MyService) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}
