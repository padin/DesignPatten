package com.wyizd.hfdp.c07adapter.n01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午9:50:26
 * @Title 
 * @Discription 
 */
public class ArmSword implements IArm{
	private String name;
	private int attr;
	@Override
	public int getAttr() {
		// TODO Auto-generated method stub
		return this.attr;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void setAttr(int attr) {
		this.attr = attr;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
