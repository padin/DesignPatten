package com.wyizd.hfdp.c12mvc.model;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import com.wyizd.hfdp.c12mvc.commons.BPMObserver;
import com.wyizd.hfdp.c12mvc.commons.BeatObserver;

/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月31日 下午11:36:11
 * @Title 
 * @Discription 
 */
public class BeatModel implements BeatModelInterface , MetaEventListener, Runnable{
	/**
	 * 定序器
	 */
	Sequencer sequencer;
	ArrayList<BeatObserver> beatObservers = new ArrayList<>();
	ArrayList<BPMObserver> bPMObservers = new ArrayList<>();
	int bpm = 90;
	/**
	 * 序列
	 */
	Sequence sequence;
	/**
	 * 轨道
	 */
	Track track;
	
	boolean stop = true;
	Thread thread;

	@Override
	public void meta(MetaMessage meta) {
		if (meta.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	public void beatEvent() {
		notifyBeatObservers();
	}

	private void notifyBeatObservers() {
		for (BeatObserver beat : beatObservers) {
			beat.updateBeat();
		}
	}
	private void notifyBPMObservers() {
		for (BPMObserver bpm : bPMObservers) {
			bpm.updateBPM();
		}
	}

	/**
	 * 初始化方法
	 */
	@Override
	public void initialize() {
		
		
		setUpMidi();
		buildTrackAndStart();
	}

	/**
	 * 建立轨道并开始
	 */
	private void buildTrackAndStart() {
		int[] trackList = {35,0,46,0};
		
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		
		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		try {
			sequencer.setSequence(sequence);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}

	private void makeTracks(int[] trackList) {
		for (int i = 0; i < trackList.length; i++) {
			int key = trackList[i];
			if (key != 0) {
				track.add(makeEvent(144,9,key,100,i));
				track.add(makeEvent(128,9,key,100,i+1));
			}
		}
	}

	private MidiEvent makeEvent(int command, int channel, int data1, int data2, int tick) {
		MidiEvent event = null ;
		try {
			ShortMessage a = new ShortMessage(command, channel, data1, data2);
			event = new MidiEvent(a, tick);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		
		return event;
	}

	/**
	 * 设置序列器
	 */
	private void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void on() {
		stop = false;
		thread = new Thread(this);
		thread.run();
	}

	@Override
	public void off() {
		stop = true;
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		return bpm;
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

	@Override
	public void run() {
		initialize();
		sequencer.start();
		try {
			Thread.sleep(60000/getBPM());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (stop) {
			thread.interrupt();
		}
	}

}
