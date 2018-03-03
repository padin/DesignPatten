package com.wyizd.hfdp.c12mvc.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.wyizd.hfdp.c12mvc.commons.BPMObserver;
import com.wyizd.hfdp.c12mvc.commons.BeatBar;
import com.wyizd.hfdp.c12mvc.commons.BeatObserver;
import com.wyizd.hfdp.c12mvc.control.ControllerInterface;
import com.wyizd.hfdp.c12mvc.model.BeatModelInterface;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午11:45:19
 * @Title
 * @Discription
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {
	BeatModelInterface model;
	ControllerInterface controller;

	JFrame viewFrame;
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmLabel;
	JPanel bpmPanel;
	JLabel bpmOutputLabel;
	JFrame controlFrame;
	JPanel controlPanel;
	JTextField bpmTextField;
	JButton setBPMButton;
	JButton increaseBPMButton;
	JButton decreaseBPMButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;
	JMenuItem exitMenuItem;

	public DJView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver) this);
		model.registerObserver((BPMObserver) this);
	}

	public void createControls() {
		viewFrame = new JFrame("View");
		viewPanel = new JPanel(new GridLayout(1, 2));
		beatBar = new BeatBar();
		beatBar.setValue(0);
		bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
		bpmPanel.add(bpmOutputLabel);
		viewPanel.add(bpmPanel);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(100, 80);
		viewFrame.setVisible(true);
		viewFrame.pack();

	}

	public void createView() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("control");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setSize(100, 80);

		controlPanel = new JPanel(new GridLayout(1, 2));

		menuBar = new JMenuBar();
		menu = new JMenu("DJ Control");

		startMenuItem = new JMenuItem("start");
		menu.add(startMenuItem);
		startMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.start();
			}
		});

		stopMenuItem = new JMenuItem("stop");
		menu.add(stopMenuItem);
		stopMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.stop();
				bpmOutputLabel.setText("offline");
			}
		});
		
		exitMenuItem = new JMenuItem("quit");
		menu.add(exitMenuItem);
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menuBar.add(menu);
		controlFrame.setJMenuBar(menuBar);
		
		
		bpmTextField = new JTextField(2);
		bpmLabel = new JLabel("Enter BPM:",SwingConstants.RIGHT);
		setBPMButton = new JButton("Set");
		setBPMButton.setSize(new Dimension(10, 40));
		increaseBPMButton = new JButton("+");
		decreaseBPMButton = new JButton("-");
		setBPMButton.addActionListener(this);
		increaseBPMButton.addActionListener(this);
		decreaseBPMButton.addActionListener(this);
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		buttonPanel.add(decreaseBPMButton);
		buttonPanel.add(increaseBPMButton);
		
		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		enterPanel.add(bpmLabel);
		enterPanel.add(bpmTextField);
		
		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(setBPMButton);
		insideControlPanel.add(buttonPanel);
		controlPanel.add(insideControlPanel);
		
		bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		controlFrame.getRootPane().setDefaultButton(setBPMButton);
		controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
		
		controlFrame.pack();
		controlFrame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("====");
		if (e.getSource() == setBPMButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
			controller.setBPM(bpm);
		} else if (e.getSource() == increaseBPMButton) {
			controller.increaseBPM();
		} else if (e.getSource() == decreaseBPMButton) {
			controller.decreateBPM();
		}
	}

	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}

	@Override
	public void updateBeat() {
		beatBar.setValue(100);
	}

	@Override
	public void updateBPM() {
		int bpm = model.getBPM();
		if (bpm == 0) {
			bpmOutputLabel.setText("offline");
		} else {
			bpmOutputLabel.setText("Current BPM : " + bpm);
		}
	}

}
