package com.wyizd.hfdp.c03adornment;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午4:31:10
 * @Title 
 * @Discription 
 */
public class BodyJsj extends EquipmentArm{
	
	Fighter fighter;
	
	public BodyJsj(Fighter fighter) {
		this.fighter = fighter;
	}
	
	@Override
	public String getDescription() {
		return fighter.getDescription()+",身披 金丝甲";
	}

	@Override
	public
	double cost() {
		return 5000 + fighter.cost();
	}
	
}
