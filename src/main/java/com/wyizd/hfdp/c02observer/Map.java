package com.wyizd.hfdp.c02observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午1:15:42
 * @Title
 * @Discription
 */
public class Map implements Observer {

	Observable observable;

	public Map(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		Boss boss = (Boss) o;
		System.out.println("画制地图");
		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 50; y++) {
				if (y == boss.getLocX() && x == boss.getLocY()) {
					System.out.print("o");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
