package designpatterns.hf.command.simpleremote.pattern;

import designpatterns.hf.command.simpleremote.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
