package designpatterns.hf.command.remote.pattern;

import designpatterns.hf.command.remote.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
