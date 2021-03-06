package designpatterns.hf.behavioural.command.remote.pattern;

import designpatterns.hf.behavioural.command.remote.homeappliance.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
