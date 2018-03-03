package com.wyizd.hfdp.c06command;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月28日 下午7:01:26
 * @Title 
 * @Discription 
 */
public class Player {
	int locationX = 0;
	int locationY = 0;

	public void moveX(int i) {
		this.locationX += i;
		System.out.println(toString());
	}

	public void moveY(int i) {
		this.locationY += i;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Player [locationX=" + locationX + ", locationY=" + locationY + "]";
	}
	


}
