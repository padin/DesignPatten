package com.wyizd.hfdp.c11proxy.n01distance;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 下午8:12:03
 * @Title 
 * @Discription 
 */
public interface MyService extends Remote {
	public String sayHello() throws RemoteException;
}
