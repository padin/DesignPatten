package com.wyizd.hfdp.c03adornment;

import java.util.Random;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午4:39:06
 * @Title
 * @Discription
 */
public class Player extends Fighter {
	Random random = new Random();

	public Player() {
		int r = random.nextInt(3) + 1;
		switch (r) {
		case 1:
			description = "这位少侠 气韵不凡 ";
			break;
		case 2:
			description = "这位少侠 武功高强";
			break;
		case 3:
			description = "这位少侠 盛气凌人";
			break;
		}
	}

	@Override
	public double cost() {
		return 8000;
	}

}
