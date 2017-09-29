package designpatterns.hf.behavioural.command.simpleremote.pattern;

import designpatterns.hf.behavioural.command.simpleremote.homeappliance.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
