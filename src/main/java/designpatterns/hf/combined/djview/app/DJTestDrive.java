package designpatterns.hf.combined.djview.app;

import designpatterns.hf.combined.djview.pattern.controller.BeatController;
import designpatterns.hf.combined.djview.pattern.controller.ControllerInterface;
import designpatterns.hf.combined.djview.pattern.model.BeatModel;
import designpatterns.hf.combined.djview.pattern.model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
