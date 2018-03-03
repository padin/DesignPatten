package com.wyizd.hfdp.c12mvc.control;

import com.wyizd.hfdp.c12mvc.model.BeatModelInterface;
import com.wyizd.hfdp.c12mvc.view.DJView;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午12:16:13
 * @Title 
 * @Discription 
 */
public class BeatController implements ControllerInterface{
	
	BeatModelInterface model;
	DJView view;
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		view.createControls();
		view.createView();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
	
	

	@Override
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		
	}

	@Override
	public void increaseBPM() {
		model.setBPM(model.getBPM()+1);
	}

	@Override
	public void decreateBPM() {
		model.setBPM(model.getBPM()-1);
		
	}

	@Override
	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}

}
