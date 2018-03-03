package com.wyizd.hfdp.c05singleton;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月27日 上午8:26:35
 * @Title 
 * @Discription 
 */

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private static Shop shop = new Shop();
	private Shop() {}
	public static Shop getInstance() {
		return shop;
	}
	List<Commodity> list = new ArrayList<>();
	{
		for (int i = 0; i < 10; i++) {
			Commodity commodity = new Commodity();
			commodity.setId(i);
			commodity.setDescription("宝石");
			commodity.setPrice(1*3);
			list.add(commodity);
		}
	}
	
	public List<Commodity> getList(){
		return list;
	}
	public void drop() {
		list.remove(0);
	};
		
	
}
