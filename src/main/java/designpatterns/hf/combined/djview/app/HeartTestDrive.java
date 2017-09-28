package designpatterns.hf.combined.djview.app;

import designpatterns.hf.combined.djview.pattern.ControllerInterface;
import designpatterns.hf.combined.djview.pattern.HeartController;
import designpatterns.hf.combined.djview.pattern.HeartModel;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
}
