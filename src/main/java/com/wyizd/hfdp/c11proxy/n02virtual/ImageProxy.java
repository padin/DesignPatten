package com.wyizd.hfdp.c11proxy.n02virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午4:45:36
 * @Title 
 * @Discription 
 */
public class ImageProxy implements Icon{
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving;

	public ImageProxy(URL imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		}else {
			g.drawString("拼命加载中", x+100, y+100);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					@Override
					public void run() {
						imageIcon = new ImageIcon(imageURL,"");
						c.repaint();
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}else {
			return 600;
		}
	}

}
