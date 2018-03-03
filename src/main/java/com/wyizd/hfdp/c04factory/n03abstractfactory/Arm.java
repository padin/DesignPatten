package com.wyizd.hfdp.c04factory.n03abstractfactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:13:33
 * @Title 
 * @Discription 
 */
public class Arm {
	public Arm(ArmPropertyFactory armPropertyFactory,String type) {
		this.type = type ;
		this.quality = armPropertyFactory.createQuality();
		this.atta = armPropertyFactory.createAtta();
		this.speed = armPropertyFactory.createSpeed();
		this.durability = armPropertyFactory.createDurability();
	}
	String type;
	String quality;
	int atta;
	int speed;
	int durability;
	
	
	@Override
	public String toString() {
		return "Arm [类型=" + type + ", 品质=" + quality + ", 攻击力=" + atta + ", 速度=" + speed + ", 耐久="
				+ durability + "]";
	}
	
	
}
