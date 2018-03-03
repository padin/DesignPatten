package com.wyizd.hfdp.c07adapter.n02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午10:22:57
 * @Title 
 * @Discription 
 */

import java.util.Random;

public class OneKeyFinishActivity {
	IActivity activity ;
	Random random = new Random();
	Player player ;

	public void excute(Player player) {
		Travel travel = new Travel();
		Work work = new Work();
		
		while (player.enerty >= 20) {
			int r = random.nextInt(2);
			activity = r > 0 ? travel : work;
			player.setActivity(activity);
			player.execute();
		}
	}
}
