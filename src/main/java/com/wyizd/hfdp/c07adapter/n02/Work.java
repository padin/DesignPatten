package com.wyizd.hfdp.c07adapter.n02;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午10:17:08
 * @Title 
 * @Discription 
 */
public class Work implements IActivity {

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "打工，增加100铜板";
	}

	@Override
	public int useEnergy() {
		// TODO Auto-generated method stub
		return 15;
	}

}
