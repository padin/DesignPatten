package com.wyizd.hfdp.c12mvc.commons;

import javax.swing.JProgressBar;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午11:55:46
 * @Title 
 * @Discription 
 */
public class BeatBar extends JProgressBar implements Runnable {
	private static final long serialVersionUID = 4754371222243481033L;
	JProgressBar progressBar;
	Thread thread;
	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}


	@Override
	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * 0.75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
