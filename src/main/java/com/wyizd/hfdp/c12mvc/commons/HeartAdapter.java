package com.wyizd.hfdp.c12mvc.commons;

import com.wyizd.hfdp.c12mvc.model.BeatModelInterface;
import com.wyizd.hfdp.c12mvc.model.HeartModelInterface;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午3:19:46
 * @Title 
 * @Discription 
 */
public class HeartAdapter implements BeatModelInterface{
	HeartModelInterface heart;
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setBPM(int bpm) {}
	@Override
	public int getBPM() {
		return heart.getHeartRate();
	}
	@Override
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
	@Override
	public void removeObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
	@Override
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
	@Override
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
}
