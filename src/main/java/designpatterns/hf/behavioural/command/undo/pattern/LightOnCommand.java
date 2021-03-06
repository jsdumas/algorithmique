package designpatterns.hf.behavioural.command.undo.pattern;

import designpatterns.hf.behavioural.command.undo.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;
	int level;
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.on();
	}
 
	public void undo() {
		light.dim(level);
	}
}
