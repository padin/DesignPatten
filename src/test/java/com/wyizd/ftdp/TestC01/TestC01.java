package com.wyizd.ftdp.TestC01;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c01tactics.Barbarian;
import com.wyizd.hfdp.c01tactics.BattleField;
import com.wyizd.hfdp.c01tactics.Enchaner;
import com.wyizd.hfdp.c01tactics.Player;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 上午9:31:02
 * @Title 策略模式
 * @Discription
 * 1.	定义多个算法族,让他们之间可以相互替换
 * 2.	不变的继承,易变的组合
 * 
 */
class TestC01 {

	@Test
	void testPlay() {
		
		Player p1 = new Barbarian("拳皇");
		Player p2 =	new Enchaner("黄巾法师"); 
		BattleField battleField = new BattleField();
		battleField.play(p1);
		battleField.play(p2);

	}

}
