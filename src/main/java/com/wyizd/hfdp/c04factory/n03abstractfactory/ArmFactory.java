package com.wyizd.hfdp.c04factory.n03abstractfactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:21:48
 * @Title 
 * @Discription 
 */
public abstract class ArmFactory {
	ArmPropertyFactory simple = new SimplePropertyFactory();
	ArmPropertyFactory skilful= new SkilfulPropertyFactory();
	ArmPropertyFactory rare= new RarePropertyFactory();
	public abstract Arm createArm(ArmQuality quality) ;
}
