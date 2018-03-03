package com.wyizd.hfdp.c03adornment;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午4:31:10
 * @Title 
 * @Discription 
 */
public class ArmFthj extends EquipmentArm{
	
	Fighter fighter;
	
	public ArmFthj(Fighter fighter) {
		this.fighter = fighter;
	}
	
	@Override
	public String getDescription() {
		return fighter.getDescription() +",手拿 方天画戟 ";
	}

	@Override
	public
	double cost() {
		return 10000 + fighter.cost();
	}
	
}
