package designpatterns.hf.combined.djview.app;

import designpatterns.hf.combined.djview.pattern.BeatController;
import designpatterns.hf.combined.djview.pattern.BeatModel;
import designpatterns.hf.combined.djview.pattern.BeatModelInterface;
import designpatterns.hf.combined.djview.pattern.ControllerInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
