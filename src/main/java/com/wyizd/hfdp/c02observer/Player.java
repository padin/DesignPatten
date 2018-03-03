package com.wyizd.hfdp.c02observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午1:21:34
 * @Title 
 * @Discription 
 */
public class Player implements Observer{
	Observable observable;
	public Player(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
		
	@Override
	public void update(Observable o, Object arg) {
		Boss boss = (Boss) o;
		System.out.println("player:"+ this + " =>boss:"+boss.getName() + "in "+ boss.getLocX()+"," +boss.getLocY());
	}

}
