package com.wyizd.ftdp.TestC10;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c10state.Player;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 上午11:23:17
 * @Title 
 * @Discription 
 */
class TestC10 {

	@Test
	void test() {
		Player player = new Player();
		Random random = new Random();
		while (player.h > 0) {
			int r = random.nextInt(3);
			switch (r) {
			case 0: player.hit();break;
			case 1: player.work();break;
			case 2: player.travel();break;
				
				

			default:
				break;
			}
		}
	}

}
