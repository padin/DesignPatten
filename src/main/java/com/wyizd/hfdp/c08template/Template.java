package com.wyizd.hfdp.c08template;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午2:44:47
 * @Title 
 * @Discription 
 */
public abstract class Template {
	public Template() {
		A();
		if (E()) {
			B();
			D();
		}else {
			C();
		}
	}

	public boolean E() {
		return true;
	}

	private void A() {
		System.out.println("小姐请问下有没有卖半岛铁盒?");
	}

	private void B() {
		System.out.println("有啊 , 你从前面右转的第二排架子上就有了");
		
	}

	void C() {
		System.out.println("没有！！！！");
	};


	private void D() {
		System.out.println("噢，好，谢谢。。。走廊灯关上，书包放，走到房间窗外望...");
	}
}
