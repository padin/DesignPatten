package com.wyizd.hfdp.c09.n02componet;

import java.util.Iterator;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午9:29:58
 * @Title 
 * @Discription 
 */
public class NullIterator implements Iterator<MenuComponet> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponet next() {
		return null;
	}

}
