package com.wyizd.hfdp.c04factory.n03abstractfactory;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:30:02
 * @Title 
 * @Discription 
 */
public class SkilfulPropertyFactory implements ArmPropertyFactory {



	@Override
	public String createQuality() {
		return "精致";
	}

	@Override
	public int createAtta() {
		return random.nextInt(33)+33;
	}

	@Override
	public int createSpeed() {
		return random.nextInt(33)+33;
	}

	@Override
	public int createDurability() {
		return random.nextInt(33)+33;
	}

}
