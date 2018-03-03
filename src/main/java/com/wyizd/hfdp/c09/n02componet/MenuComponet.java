package com.wyizd.hfdp.c09.n02componet;

import java.util.Iterator;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午8:48:46
 * @Title 
 * @Discription 
 */
public abstract class MenuComponet {
	public void add(MenuComponet menuComponet) {throw new UnsupportedOperationException();};
	public MenuComponet getChild(int index) {throw new UnsupportedOperationException();};
	public void remove(MenuComponet menuComponet) {throw new UnsupportedOperationException();};
	
	public String getDescription() {throw new  UnsupportedOperationException();};
	public void print() {throw new  UnsupportedOperationException();};
	
	abstract Iterator<MenuComponet> createIterator();
}
