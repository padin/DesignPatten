package com.wyizd.hfdp.c07adapter.n01;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午9:31:06
 * @Title 
 * @Discription 
 */
public class ArmAdapter implements IArm{
	Fist fist ;
	public ArmAdapter(Fist fist) {
		this.fist = fist;
	}
	@Override
	public int getAttr() {
		// TODO Auto-generated method stub
		return fist.attr;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return fist.name;
	}

	@Override
	public void setAttr(int attr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

}
