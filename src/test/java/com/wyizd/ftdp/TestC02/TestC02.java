package com.wyizd.ftdp.TestC02;

import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c02observer.Boss;
import com.wyizd.hfdp.c02observer.Map;
import com.wyizd.hfdp.c02observer.Player;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午1:22:53
 * @Title
 * @Discription
 */
class TestC02 {

	@SuppressWarnings("unused")
	@Test
	void testCreateBoss() throws InterruptedException, IOException {
		Boss boss = new Boss();
		Player p1 = new Player(boss);
		Player p2 = new Player(boss);
		Player p3 = new Player(boss);
		Player p4 = new Player(boss);
		Map map = new Map(boss);

		Random random = new Random();

		boss.createBoss("无敌大魔王", 25,10 );
		while (true) {
			int moveX = random.nextInt(2) * 10 > 1 ? 1 : -1;
			int moveY = random.nextInt(2) * 10 > 1 ? 1 : -1;
			boss.move(moveX, moveY);
			Thread.sleep(1000);
			for (int i = 0; i < 50; i++) {
				System.out.println();
			}
		}

	}

}
