package com.wyizd.ftdp.TestC03;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c03adornment.ArmFthj;
import com.wyizd.hfdp.c03adornment.BodyJsj;
import com.wyizd.hfdp.c03adornment.Fighter;
import com.wyizd.hfdp.c03adornment.Player;


/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月26日 下午16:22:53
 * @Title
 * @Discription
 */
class TestC03 {

	@Test
	void testCountFight() {

			Fighter fighter = new Player();
			System.out.println(fighter.getDescription() + ",战斗力:" +fighter.cost() );
			
			fighter = new ArmFthj(fighter);
			fighter = new BodyJsj(fighter);
			System.out.println(fighter.getDescription() + ",战斗力:" +fighter.cost() );
			
	}

}
