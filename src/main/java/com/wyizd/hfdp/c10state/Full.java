package com.wyizd.hfdp.c10state;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 上午11:00:48
 * @Title 
 * @Discription 
 */
public class Full implements PlayerState {
	
	Player player;
	
	public Full(Player player) {
		this.player = player;
	}

	@Override
	public void hit() {
		System.out.println("很饱,打斗加成");
		check();
	}

	@Override
	public void work() {
		System.out.println("很饱，干活加成");
		check();
	}

	@Override
	public void travel() {
		System.out.println("很饱，旅行加成");
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
