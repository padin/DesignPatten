package com.wyizd.hfdp.c09.n02componet;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午9:02:53
 * @Title 
 * @Discription 
 */
public class CompositeInterator implements Iterator<MenuComponet> {
	Stack<Iterator<MenuComponet>> stack = new Stack<>();
	
	public CompositeInterator(Iterator<MenuComponet> iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		}else {
			Iterator<MenuComponet> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}

	@Override
	public MenuComponet next() {
		if (hasNext()) {
			Iterator<MenuComponet> iterator  = stack.peek();
			MenuComponet mc = iterator.next();
			if (mc instanceof Menu) {
				stack.push(mc.createIterator());
			}
			return mc;
		}else {
			return null;
		}
	}

}
