package com.wyizd.hfdp.c11proxy.n03danamic;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午6:43:30
 * @Title
 * @Discription
 */
public class UserServiceImpl implements UserService {

	@Override
	public int add() {
		System.out.println("添加用户");
		@SuppressWarnings("unused")
		int i = 1/0;
		return 0;
	}

	

}
