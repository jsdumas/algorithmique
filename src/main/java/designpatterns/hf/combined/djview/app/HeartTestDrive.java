package designpatterns.hf.combined.djview.app;

import designpatterns.hf.combined.djview.pattern.controller.ControllerInterface;
import designpatterns.hf.combined.djview.pattern.controller.HeartController;
import designpatterns.hf.combined.djview.pattern.model.HeartModel;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
}
