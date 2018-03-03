package com.wyizd.hfdp.c01tactics;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 上午9:24:17
 * @Title 
 * @Discription 
 */
public class BattleField {
	public void play(Player player) {
		System.out.println("---------------------------------------");
		System.out.println(player.getName());
		player.getAttackable();
		player.getDefenceable();
		System.out.println("---------------------------------------");
	}
}
