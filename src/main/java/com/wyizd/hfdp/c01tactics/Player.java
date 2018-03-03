package com.wyizd.hfdp.c01tactics;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 上午8:54:20
 * @Title 玩家类 
 * @Discription 
 */
public class Player {
	Attackable	attackable ;
	Defenceable	defenceable;
	String name;
	public Player(String name) {
		this.name = name ;
	}
	public String getName() {
		return this.name;
	}
	public void getAttackable() {
		attackable.attack();
	}
	public void setAttackable(Attackable attackable) {
		this.attackable = attackable;
	}
	public void getDefenceable() {
		defenceable.defence();
	}
	public void setDefenceable(Defenceable defenceable) {
		this.defenceable = defenceable;
	}
	
}
