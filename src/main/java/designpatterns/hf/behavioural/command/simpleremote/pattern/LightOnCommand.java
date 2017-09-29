package designpatterns.hf.behavioural.command.simpleremote.pattern;

import designpatterns.hf.behavioural.command.simpleremote.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
