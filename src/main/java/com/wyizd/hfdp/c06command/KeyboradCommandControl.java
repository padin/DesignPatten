package com.wyizd.hfdp.c06command;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月28日 下午6:37:23
 * @Title 
 * @Discription 
 */
public class KeyboradCommandControl {
	Command command ;
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressA() {
		command.excuteA();
	};
	public void pressS() {
		command.excuteS();
	};
	public void pressD() {
		command.excuteD();
	};
	public void pressW() {
		command.excuteW();
	};
}
