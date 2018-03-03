package com.wyizd.ftdp.TestC11.n02virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.wyizd.hfdp.c11proxy.n02virtual.ImageComponent;
import com.wyizd.hfdp.c11proxy.n02virtual.ImageProxy;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午5:43:09
 * @Title
 * @Discription
 */
public class Client {
	public static void main(String[] args) throws MalformedURLException {
		// 建立框架和菜单
		URL initialURL = new URL("http://scimg.jb51.net/allimg/150706/11-150F61006001L.jpg");
		Icon icon = new ImageProxy(initialURL);
		ImageComponent imageComponent = new ImageComponent(icon);
		JFrame frame = new JFrame("虚拟代理");
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("菜单1");
		menubar.add(menu);
		
		frame.setJMenuBar(menubar);	
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		JMenuItem menuItem = new JMenuItem("ShowSpringIcon");
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imageComponent.setIcon(new ImageProxy(initialURL));
				frame.repaint();
			}
		});
	}
}
