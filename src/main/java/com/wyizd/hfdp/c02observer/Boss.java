package com.wyizd.hfdp.c02observer;

import java.util.Observable;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午1:14:41
 * @Title
 * @Discription
 */
public class Boss extends Observable {
	String name;
	int locX;
	int locY;

	public Boss() {

	}

	public void createBoss(String name, int locX, int locY) {
		this.locX = locX;
		this.locY = locY;
		this.name = name;
		setChanged();
		notifyObservers();
	}

	public void move(int moveX, int moveY) {
		if (this.locX < 1 ){
			this.locX ++;
		}else if (this.locX > 50) {
			this.locX --;
		}else {
			locX = this.locX + moveX ;
		}
		if (this.locY < 1 ) {
			this.locY ++;
		}else if (this.locY > 20){
			this.locY -- ;
		}else {
			locY = this.locY + moveY ;
		}
		setChanged();
		notifyObservers();
	}

	public String getName() {
		return name;
	}

	public int getLocX() {
		return locX;
	}

	public int getLocY() {
		return locY;
	}

}
