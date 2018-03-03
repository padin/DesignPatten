package com.wyizd.hfdp.c04factory.n03abstractfactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:24:27
 * @Title 
 * @Discription 
 */
public class KnifeFactory extends ArmFactory{

	@Override
	public Arm createArm(ArmQuality quality) {
		switch (quality) {
		case SIMPLE:
			return new Arm(simple,"刀");
		case SKILFUL:
			return new Arm(skilful,"刀");
		case RARE:
			return new Arm(rare,"刀");
		}
		return null;
	}

}
