package com.wyizd.hfdp.c12mvc.model;

import java.util.ArrayList;
import java.util.Random;

import com.wyizd.hfdp.c12mvc.commons.BPMObserver;
import com.wyizd.hfdp.c12mvc.commons.BeatObserver;



/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午3:07:28
 * @Title
 * @Discription
 */
public class HeartModel implements HeartModelInterface, Runnable {
	ArrayList<BeatObserver> beatObservers = new ArrayList<>();
	ArrayList<BPMObserver> bPMObservers = new ArrayList<>();
	int time = 1000;
	int bpm = 90;
	Random random = new Random();
	Thread thread;

	public HeartModel() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		int lastrate = -1;
		for (;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate ;
					notifyBPMObserver();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	private void notifyBPMObserver() {
		for (BPMObserver bpmObserver : bPMObservers) {
			bpmObserver.updateBPM();
		}
	}

	private void notifyBeatObservers() {
		for (BeatObserver beatObserver : beatObservers) {
			beatObserver.updateBeat();
		}
		
	}

	@Override
	public int getHeartRate() {
		return 60000/time;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bPMObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		bPMObservers.remove(o);
	}

}
