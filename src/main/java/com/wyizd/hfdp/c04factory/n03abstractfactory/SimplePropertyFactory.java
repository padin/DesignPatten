package com.wyizd.hfdp.c04factory.n03abstractfactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:30:02
 * @Title 
 * @Discription 
 */
public class SimplePropertyFactory implements ArmPropertyFactory {


	@Override
	public String createQuality() {
		return "普通";
	}

	@Override
	public int createAtta() {
		return random.nextInt(33);
	}

	@Override
	public int createSpeed() {
		return random.nextInt(33);
	}

	@Override
	public int createDurability() {
		return random.nextInt(33);
	}

}
