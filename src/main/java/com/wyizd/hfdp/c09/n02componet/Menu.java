package com.wyizd.hfdp.c09.n02componet;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午8:47:22
 * @Title 
 * @Discription 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponet{
	String description;
	List<MenuComponet> subMenu = new ArrayList<>();
	
	public Menu(String description) {
		this.description = description;
	}
	
	@Override
	public
	void add(MenuComponet menuComponet) {
		subMenu.add(menuComponet);
	}
	@Override
	public
	MenuComponet getChild(int index) {
		return subMenu.get(index);
	}
	@Override
	public String getDescription() {
		return this.description;
	}
	@Override
	public void print() {
		System.out.println(description);
		Iterator<MenuComponet> iterator = subMenu.iterator();
		while (iterator.hasNext()) {
			MenuComponet mc = iterator.next();
			mc.print();
		}
	}
	@Override
	public Iterator<MenuComponet> createIterator() {
		return subMenu.iterator();
	}
	
	
	
}
