package com.wyizd.hfdp.c06command;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月28日 下午7:00:58
 * @Title 
 * @Discription 
 */
public class PlayerCommand implements Command {
	Player player;
	public PlayerCommand(Player player ) {
		this.player = player ;
	}

	@Override
	public void excuteA() {
		player.moveX(-1);
	}

	@Override
	public void excuteS() {
		player.moveY(-1);
	}

	@Override
	public void excuteD() {
		player.moveX(1);
	}

	@Override
	public void excuteW() {
		player.moveY(1);
	}

}
