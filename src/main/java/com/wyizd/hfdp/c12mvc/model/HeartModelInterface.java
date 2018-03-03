package com.wyizd.hfdp.c12mvc.model;

import com.wyizd.hfdp.c12mvc.commons.BPMObserver;
import com.wyizd.hfdp.c12mvc.commons.BeatObserver;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午3:05:54
 * @Title 
 * @Discription 
 */
public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
