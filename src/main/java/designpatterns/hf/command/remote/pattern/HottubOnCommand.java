package designpatterns.hf.command.remote.pattern;

import designpatterns.hf.command.remote.homeappliance.Hottub;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
