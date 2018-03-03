package com.wyizd.hfdp.c04factory.n03abstractfactory;

import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午10:18:51
 * @Title 
 * @Discription 
 */
public interface ArmPropertyFactory {
	Random random = new Random();
	String createQuality();
	int createAtta();
	int createSpeed();
	int createDurability();
}
