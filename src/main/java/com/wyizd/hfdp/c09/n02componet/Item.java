package com.wyizd.hfdp.c09.n02componet;

import java.util.Iterator;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午8:47:22
 * @Title 
 * @Discription 
 */

public class Item extends MenuComponet{
	String description;
	public Item(String description) {
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public void print() {
		System.out.println(description);
	}

	@Override
	Iterator<MenuComponet> createIterator() {
		return null;
	}
	
	
	
}