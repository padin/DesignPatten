package com.wyizd.hfdp.c04factory.n01simplefactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午8:59:02
 * @Title 
 * @Discription 
 */
public class ArmFactory {
	SimpleArmFactory saf ;
	public ArmFactory(SimpleArmFactory saf) {
		this.saf =saf ;
	}
	public Arm create(String type) {
		return saf.createArm(type);
	}
}
