package designpatterns.hf.combined.djview.pattern.model;

import designpatterns.hf.combined.djview.pattern.observer.BPMObserver;
import designpatterns.hf.combined.djview.pattern.observer.BeatObserver;

public interface BeatModelInterface {
	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	int getBPM();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);
}
