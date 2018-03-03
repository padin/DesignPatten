package com.wyizd.hfdp.c11proxy.n01distance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 下午8:12:33
 * @Title 
 * @Discription 
 */
public class MyServiceImpl extends UnicastRemoteObject implements MyService {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1345936187427546605L;

	public MyServiceImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "你好";
	}
	
	
}
