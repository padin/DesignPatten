package com.wyizd.ftdp.TestC12;

import com.wyizd.hfdp.c12mvc.control.BeatController;
import com.wyizd.hfdp.c12mvc.control.ControllerInterface;
import com.wyizd.hfdp.c12mvc.model.BeatModel;
import com.wyizd.hfdp.c12mvc.model.BeatModelInterface;
import com.wyizd.hfdp.c12mvc.model.HeartModel;
import com.wyizd.hfdp.c12mvc.model.HeartModelInterface;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年2月1日 上午12:24:22
 * @Title 
 * @Discription 
 *  win10下运行发生该错误：
 *  WARNING: Could not open/create prefs root node Software\JavaSoft\Prefs at root 0 
	x80000002. Windows RegCreateKeyEx(...) returned error code 5. 
	解决方案：
 *  Step1：  搜索并运行regedit.exe
	Step2: 进入HKEY_LOCAL_MACHINE\SOFTWARE\JavaSoft，右击JavaSoft目录，选择新建->项（key），命名为Prefs
	Step3: 重新编译即可。
 * 
 */
public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		HeartModelInterface heart = new HeartModel();
		ControllerInterface beatController = new BeatController(model);
//		ControllerInterface heartController = new HeartController(heart);
	}

}
