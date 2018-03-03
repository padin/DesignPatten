package com.wyizd.hfdp.c01tactics;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 上午9:19:47
 * @Title 
 * @Discription 
 */
public class Enchaner extends Player{

	public Enchaner(String name) {
		super(name);
		attackable = new AttackWithFireMagic();
		defenceable = new DefenceableWithAirWall();
	}

	
	
}
