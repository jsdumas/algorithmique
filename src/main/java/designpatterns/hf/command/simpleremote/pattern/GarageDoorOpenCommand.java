package designpatterns.hf.command.simpleremote.pattern;

import designpatterns.hf.command.simpleremote.homeappliance.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
