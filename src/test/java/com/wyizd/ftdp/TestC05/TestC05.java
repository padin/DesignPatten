package com.wyizd.ftdp.TestC05;
import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c05singleton.Shop;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月27日 上午8:29:06
 * @Title 
 * @Discription 
 */
class TestC05 {
	@Test
	void test() {
		Shop shop = Shop.getInstance();
		System.out.println(shop.getList());
		shop.drop();
		shop.drop();
		shop.drop();
		shop.drop();
		shop = Shop.getInstance();
		System.out.println(shop.getList());
	}
}
