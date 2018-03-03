package com.wyizd.hfdp.c11proxy.n02virtual;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午4:55:45
 * @Title 
 * @Discription 
 */
public class ImageComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}
	
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w) / 2;
		int y = (600 - h) / 2;
		icon.paintIcon(this, g, x, y);
	}
	
	
	
}
