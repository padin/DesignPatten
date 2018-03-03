package com.wyizd.hfdp.c12mvc.model;

import com.wyizd.hfdp.c12mvc.commons.BPMObserver;
import com.wyizd.hfdp.c12mvc.commons.BeatObserver;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午11:32:40
 * @Title 
 * @Discription 
 */
public interface BeatModelInterface {
	void initialize();
	void on();
	void off();
	void setBPM(int bpm);
	int getBPM();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
