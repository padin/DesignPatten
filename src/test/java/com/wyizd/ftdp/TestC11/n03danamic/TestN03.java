package com.wyizd.ftdp.TestC11.n03danamic;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c11proxy.n03danamic.UserService;
import com.wyizd.hfdp.c11proxy.n03danamic.UserServiceImpl;
import com.wyizd.hfdp.c11proxy.n03danamic.UserServiceTransaction;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午6:49:50
 * @Title 
 * @Discription 
 */
class TestN03 {

	@Test
	void test() {
		
		UserService userService = (UserService) new UserServiceTransaction().getProxyClass(new UserServiceImpl());
		userService.add();
		
	}

}
