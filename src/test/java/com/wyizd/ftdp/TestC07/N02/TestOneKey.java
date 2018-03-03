package com.wyizd.ftdp.TestC07.N02;

import org.junit.jupiter.api.Test;

import com.wyizd.hfdp.c07adapter.n02.OneKeyFinishActivity;
import com.wyizd.hfdp.c07adapter.n02.Player;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 上午10:29:33
 * @Title 
 * @Discription 
 */
class TestOneKey {

	@Test
	void test() {
		Player player = new Player();
		OneKeyFinishActivity ofa = new OneKeyFinishActivity();
		ofa.excute(player);
	}

}
