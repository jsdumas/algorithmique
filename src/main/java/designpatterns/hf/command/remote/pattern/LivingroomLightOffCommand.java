package designpatterns.hf.command.remote.pattern;

import designpatterns.hf.command.remote.homeappliance.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
