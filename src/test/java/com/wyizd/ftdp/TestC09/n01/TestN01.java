package com.wyizd.ftdp.TestC09.n01;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c09.n01iterater.ArmMenu;
import com.wyizd.hfdp.c09.n01iterater.ArmousMenu;
import com.wyizd.hfdp.c09.n01iterater.Menu;
import com.wyizd.hfdp.c09.n01iterater.Package;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午5:49:38
 * @Title 
 * @Discription 
 */
class TestN01 {

	@Test
	void test() {
		List<Menu> list = new ArrayList<>();
		ArmMenu armMenu = new ArmMenu();
		ArmousMenu armousMenu = new ArmousMenu();
		list.add(armMenu);
		list.add(armousMenu);
		Package p = new Package(list);
		p.showAll();
	}

}
