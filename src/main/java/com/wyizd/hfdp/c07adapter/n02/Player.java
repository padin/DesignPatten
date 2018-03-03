package com.wyizd.hfdp.c07adapter.n02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午10:14:09
 * @Title 
 * @Discription 
 */

public class Player {
	int enerty = 100;
	IActivity activity ;
	public void setActivity(IActivity activity) {
		this.activity = activity;
	}
	public void execute() {
		if (activity.useEnergy() < enerty) {
		enerty -= activity.useEnergy();
			System.out.println(activity.description());
		}else {
			System.out.println("活力值不足");
		}
	}
}
