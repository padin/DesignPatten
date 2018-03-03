package com.wyizd.ftdp.TestC07.N01;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c07adapter.n01.ArmAdapter;
import com.wyizd.hfdp.c07adapter.n01.ArmSword;
import com.wyizd.hfdp.c07adapter.n01.Fist;
import com.wyizd.hfdp.c07adapter.n01.IArm;
import com.wyizd.hfdp.c07adapter.n01.Player;


/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午9:55:39
 * @Title 
 * @Discription 
 */
class TestAdapter {

	@Test
	void test() {
		Player player = new Player();
		IArm arm = new ArmSword();
		arm.setAttr(10000);
		arm.setName("倚天剑");
		player.setArm(arm);
		player.attack();
		System.out.println("when the arm broke");
		player.setArm(new ArmAdapter(new Fist()));
		player.attack();
	}

}
