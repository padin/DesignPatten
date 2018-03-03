package com.wyizd.hfdp.c08template;

import java.util.Scanner;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月29日 下午2:51:12
 * @Title 
 * @Discription 
 */
public class SubClass extends Template{

	
	@SuppressWarnings("resource")
	@Override
	public boolean E() {
		System.out.println("A:有，B:没有");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			return "A".equals(scanner.nextLine());
		}
		return false;
	}

}
