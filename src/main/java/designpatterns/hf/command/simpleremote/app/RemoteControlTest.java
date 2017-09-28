package designpatterns.hf.command.simpleremote.app;

import designpatterns.hf.command.simpleremote.homeappliance.GarageDoor;
import designpatterns.hf.command.simpleremote.homeappliance.Light;
import designpatterns.hf.command.simpleremote.pattern.GarageDoorOpenCommand;
import designpatterns.hf.command.simpleremote.pattern.LightOnCommand;
import designpatterns.hf.command.simpleremote.pattern.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
}
