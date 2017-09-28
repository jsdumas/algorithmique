package designpatterns.hf.command.party.pattern;

import designpatterns.hf.command.party.homeappliance.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
	public void undo() {
		light.on();
	}
}
