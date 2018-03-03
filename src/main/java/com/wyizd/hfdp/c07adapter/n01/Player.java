package com.wyizd.hfdp.c07adapter.n01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午9:44:34
 * @Title 
 * @Discription 
 */
public class Player {
	IArm arm ;
	public void setArm(IArm arm ) {
		this.arm = arm ;
	}
	
	public void attack() {
		System.out.println("use "+arm.getName()+ "cause " + arm.getAttr());
	}
	
}
