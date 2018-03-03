package com.wyizd.hfdp.c09.n01iterater;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午5:29:51
 * @Title 
 * @Discription 
 */
public class Equipment {

	public String discription;
	public int count;
	
	
	
	public Equipment(String discription, int count) {
		super();
		this.discription = discription;
		this.count = count;
	}

	public Equipment() {
		// TODO Auto-generated constructor stub
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
