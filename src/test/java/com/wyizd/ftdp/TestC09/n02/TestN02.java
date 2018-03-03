package com.wyizd.ftdp.TestC09.n02;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c09.n02componet.CompositeInterator;
import com.wyizd.hfdp.c09.n02componet.Item;
import com.wyizd.hfdp.c09.n02componet.Menu;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午9:14:35
 * @Title 
 * @Discription 
 */
class TestN02{

	@Test
	public void test() {
		Menu menu1 = new Menu("菜单1-1");
		Menu menu2 = new Menu("菜单2-1");
		Menu menu3 = new Menu("菜单2-2");
		

		Item item1 = new Item("节点3-1");
		Item item2 = new Item("节点3-2");
		Item item3 = new Item("节点3-1");
		Item item4 = new Item("节点3-2");
		
		menu1.add(menu2);
		menu1.add(menu3);
		
		menu2.add(item1);
		menu2.add(item2);
		menu3.add(item3);
		menu3.add(item4);
		
		menu1.print();
		
	}
	
	@Test
	public void test2() {
		Menu menu1 = new Menu("菜单1-1");
		Menu menu2 = new Menu("菜单2-1");
		Menu menu3 = new Menu("菜单2-2");
		

		Item item1 = new Item("节点3-1");
		Item item2 = new Item("节点3-2");
		Item item3 = new Item("节点3-1");
		Item item4 = new Item("节点3-2");
		
		menu1.add(menu2);
		menu1.add(menu3);
		
		menu2.add(item1);
		menu2.add(item2);
		menu3.add(item3);
		menu3.add(item4);
		
		CompositeInterator ci = new CompositeInterator(menu1.createIterator());
		System.out.println(menu1.getDescription());
		while (ci.hasNext()) {
			System.out.println(ci.next().getDescription());
		}
		
	}

}
