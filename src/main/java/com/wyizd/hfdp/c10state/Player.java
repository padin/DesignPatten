package com.wyizd.hfdp.c10state;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月30日 上午10:57:20
 * @Title
 * @Discription
 */
public class Player {
	public int h = 100;
	PlayerState hungry;
	PlayerState full;
	PlayerState normal;
	PlayerState state;

	public Player() {
		hungry = new Hungry(this);
		full = new Full(this);
		normal = new Normal(this);
		state = full;
	}

	public void setHungry(PlayerState hungry) {
		this.state= hungry;
	}

	public void hit() {
		state.hit();
		h -= 10;
	}
	public void work() {
		state.work();
		h -= 10;
	}
	public void travel() {
		state.travel();
		h -= 10;
	}

}
