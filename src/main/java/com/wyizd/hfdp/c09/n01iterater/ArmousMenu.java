package com.wyizd.hfdp.c09.n01iterater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午5:27:12
 * @Title
 * @Discription
 */
public class ArmousMenu implements Menu {
	List<Equipment> armous = new ArrayList<Equipment>();

	public ArmousMenu() {
		armous.add(new Armous("重装铠甲", 12));
		armous.add(new Armous("重装铠甲",12));
		armous.add(new Armous("重装铠甲",12));
		armous.add(new Armous("重装铠甲",12));
	}

	@Override
	public Iterator<Equipment> createIterator() {
		return armous.iterator();
	}

}
