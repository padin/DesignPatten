package com.wyizd.hfdp.c09.n01iterater;

import java.util.Iterator;
import java.util.List;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午5:26:33
 * @Title 
 * @Discription 
 */
public class Package {
	List<Menu> list ;
	public Package(List<Menu> list) {
		this.list = list;
	}
	
	public void showAll() {
		for (Menu menu : list) {
			print(menu);
		}
	}
	
	void print(Menu menu) {
		Iterator<Equipment> it = menu.createIterator();
		while (it.hasNext()) {
			Equipment equipment = it.next();
			System.out.println(equipment.discription+"\t"+equipment.count);
		}
	}
	

}
