package com.wyizd.ftdp.TestC04;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c04factory.n03abstractfactory.ArmFactory;
import com.wyizd.hfdp.c04factory.n03abstractfactory.ArmQuality;
import com.wyizd.hfdp.c04factory.n03abstractfactory.KnifeFactory;
import com.wyizd.hfdp.c04factory.n03abstractfactory.SwordFactory;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午9:56:20
 * @Title 测试抽象工厂
 * @Discription
 */
class TestN03 {

	@Test
	void testCreate() {
		Random random = new Random();
		ArmFactory armFactory;
		for (int j = 0; j < 100; j++) {
			int i = random.nextInt(2);
			if (i == 0) {
				armFactory = new KnifeFactory();
			} else {
				armFactory = new SwordFactory();
			}
			int k = random.nextInt(3);
			if (k == 0) {
				System.out.println(armFactory.createArm(ArmQuality.SIMPLE));
			} else if (k == 1) {
				System.out.println(armFactory.createArm(ArmQuality.SKILFUL));
			} else {
				System.out.println(armFactory.createArm(ArmQuality.RARE));
			}

		}

	}

}
