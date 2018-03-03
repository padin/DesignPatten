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
public class ArmMenu implements Menu {
	List<Equipment> arms = new ArrayList<Equipment>();

	public ArmMenu() {
		arms.add(new Arm("大保健", 12));
		arms.add(new Arm("大保健", 12));
		arms.add(new Arm("大保健", 12));
		arms.add(new Arm("大保健", 12));
	}

	@Override
	public Iterator<Equipment> createIterator() {
		return arms.iterator();
	}

}
