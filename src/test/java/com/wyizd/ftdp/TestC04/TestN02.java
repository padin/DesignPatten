package com.wyizd.ftdp.TestC04;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c04factory.n02factorymethod.Arm;
import com.wyizd.hfdp.c04factory.n02factorymethod.ArmFactory;
import com.wyizd.hfdp.c04factory.n02factorymethod.ArmType;
import com.wyizd.hfdp.c04factory.n02factorymethod.SimpleArmFactroy;
import com.wyizd.hfdp.c04factory.n02factorymethod.SkilfulArmFactroy;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午9:56:20
 * @Title 测试工厂方法
 * @Discription
 */
class TestN02  {


	@Test
	void testCreate() {
		ArmFactory armFactory = new SimpleArmFactroy();
		Arm arm = armFactory.create(ArmType.KNIFE);
		System.out.println(arm);

		armFactory = new SkilfulArmFactroy();
		arm = armFactory.create(ArmType.SWORD);
		System.out.println(arm);
	}

}
