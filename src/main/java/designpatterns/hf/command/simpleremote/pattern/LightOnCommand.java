package designpatterns.hf.command.simpleremote.pattern;

import designpatterns.hf.command.simpleremote.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
