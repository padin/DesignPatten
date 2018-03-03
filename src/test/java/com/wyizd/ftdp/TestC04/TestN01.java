package com.wyizd.ftdp.TestC04;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c04factory.n01simplefactory.Arm;
import com.wyizd.hfdp.c04factory.n01simplefactory.ArmFactory;
import com.wyizd.hfdp.c04factory.n01simplefactory.SimpleArmFactory;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午9:05:04
 * @Title 
 * @Discription 
 */
class TestN01 {

	@Test
	void testSimpleFactory() {
		ArmFactory armFactory = new ArmFactory(new SimpleArmFactory());
		Arm arm = armFactory.create("knife");
		System.out.println(arm);
		arm = armFactory.create("sword");
		System.out.println(arm);
		
	}
	

}
