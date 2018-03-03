package com.wyizd.hfdp.c12mvc.control;

import com.wyizd.hfdp.c12mvc.commons.HeartAdapter;
import com.wyizd.hfdp.c12mvc.model.HeartModelInterface;
import com.wyizd.hfdp.c12mvc.view.DJView;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午3:33:06
 * @Title 
 * @Discription 
 */
public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;
	
	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
		view.createControls();
		view.createView();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseBPM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreateBPM() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
	}

}
