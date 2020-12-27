package com.company._12_CombinePatterns._2_MVC._1_View;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;
														// Необходимо для MIDI-кода
public class BeatModel implements BeatModelInterface, MetaEventListener {
		// Генератор ритма (того что вы слышите)
	Sequencer sequencer;
		// В Листах хранятся две категории наблюдателей
	List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
		// Частота ритма - по умолчанию 90 BPM
	int bpm = 90;

	//// MIDI-код
	Sequence sequence;
	Track track;
	////

		// Метод настраивает генератор
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}
		// Запускает генератор
	public void on() {
		System.out.println("Starting the sequencer");
		sequencer.start();
		setBPM(90);
	}
		// Останавливает генератор
	public void off() {
		setBPM(0);
		sequencer.stop();
	}
		// Управление ритмом
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());	// Запрос к генератору на изменение частоты
		notifyBPMObservers();	// Оповещение наблюдателей
	}

	public int getBPM() {
		return bpm;
	}

		// Вызывается MIDI-кодом при каждом новом ударе
	void beatEvent() {
		notifyBeatObservers();
	}

	//// Код регистрации и оповещения наблюдателей
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}
	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}
	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}
	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}
	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}
	////

	//// MIDI-код
	public void meta(MetaMessage message) {
		if (message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}
	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void buildTrackAndStart() {
		int[] trackList = {35, 0, 46, 0};

		sequence.deleteTrack(null);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));
		try {
			sequencer.setSequence(sequence);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void makeTracks(int[] list) {

		for (int i = 0; i < list.length; i++) {
			int key = list[i];

			if (key != 0) {
				track.add(makeEvent(144,9,key, 100, i));
				track.add(makeEvent(128,9,key, 100, i+1));
			}
		}
	}
	public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch(Exception e) {
			e.printStackTrace();
		}
		return event;
	}
	////
}
