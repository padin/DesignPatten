package com.wyizd.hfdp.c04factory.n01simplefactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午8:49:00
 * @Title 
 * @Discription 
 */
public class SimpleArmFactory {
	public Arm createArm(String type) {
		Arm arm = null;
		switch (type) {
		case "knife":
			return new KnifeArm();
		case "sword":
			return new SwordArm();
		}
		return arm;

	}

}
