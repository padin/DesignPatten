package com.wyizd.hfdp.c12mvc.control;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午11:47:40
 * @Title 
 * @Discription 
 */
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreateBPM();
	void setBPM(int bpm);
}
