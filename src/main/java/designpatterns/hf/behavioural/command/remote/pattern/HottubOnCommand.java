package designpatterns.hf.behavioural.command.remote.pattern;

import designpatterns.hf.behavioural.command.remote.homeappliance.Hottub;

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
