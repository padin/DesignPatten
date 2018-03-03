package com.wyizd.hfdp.c01tactics;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 上午9:17:45
 * @Title 野蛮人
 * @Discription 
 */
public class Barbarian extends Player {
	public Barbarian(String name) {
		super(name);
	}

	{
		attackable = new AttackWithFist();
		defenceable = new DefenceableWithBody();
	}
}
