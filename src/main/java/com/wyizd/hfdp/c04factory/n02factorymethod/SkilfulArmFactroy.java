package com.wyizd.hfdp.c04factory.n02factorymethod;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午9:17:01
 * @Title
 * @Discription
 */
public class SkilfulArmFactroy extends ArmFactory {

	@Override
	public Arm create(ArmType type) {

		switch (type) {
		case KNIFE:
			return new SkilfulKnifeArm();

		case SWORD:
			return new SkilfulSwordArm();
		}
		return null;
	}

}
