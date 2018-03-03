package com.wyizd.hfdp.c10state;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 上午11:00:48
 * @Title 
 * @Discription 
 */
public class Normal implements PlayerState {
	
	Player player;
	
	public Normal(Player player) {
		this.player = player;
	}

	@Override
	public void hit() {
		System.out.println("正常打斗");
		check();
	}

	@Override
	public void work() {
		System.out.println("正常干活");
		check();
	}

	@Override
	public void travel() {
		System.out.println("正常旅行");
		check();
	}
	@Override
	public void check() {
		if (player.h > 70) {
			player.setHungry(player.full);
		}else if(player.h > 40) {
			player.setHungry(player.normal);
		}else {
			player.setHungry(player.hungry);
		}
	}
}
