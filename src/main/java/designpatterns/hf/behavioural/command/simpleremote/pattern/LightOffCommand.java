package designpatterns.hf.behavioural.command.simpleremote.pattern;

import designpatterns.hf.behavioural.command.simpleremote.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
