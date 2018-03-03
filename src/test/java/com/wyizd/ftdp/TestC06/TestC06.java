package com.wyizd.ftdp.TestC06;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c06command.KeyboradCommandControl;
import com.wyizd.hfdp.c06command.Player;
import com.wyizd.hfdp.c06command.PlayerCommand;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月28日 下午7:10:58
 * @Title 
 * @Discription 
 */
class TestC06 {

	@Test
	void test() {
		KeyboradCommandControl kcc = new KeyboradCommandControl();
		Player player  = new Player();
		PlayerCommand playerCommand = new PlayerCommand(player);
		kcc.setCommand(playerCommand);
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int x = random.nextInt(4);
			switch (x) {
				case 0: kcc.pressA();break;
				case 1: kcc.pressS();break;
				case 2: kcc.pressD();break;
				case 3: kcc.pressW();break;
			}
		}
	}

}
