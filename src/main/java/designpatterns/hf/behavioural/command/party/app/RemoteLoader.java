package designpatterns.hf.behavioural.command.party.app;

import designpatterns.hf.behavioural.command.party.homeappliance.Hottub;
import designpatterns.hf.behavioural.command.party.homeappliance.Light;
import designpatterns.hf.behavioural.command.party.homeappliance.Stereo;
import designpatterns.hf.behavioural.command.party.homeappliance.TV;
import designpatterns.hf.behavioural.command.party.pattern.Command;
import designpatterns.hf.behavioural.command.party.pattern.HottubOffCommand;
import designpatterns.hf.behavioural.command.party.pattern.HottubOnCommand;
import designpatterns.hf.behavioural.command.party.pattern.LightOffCommand;
import designpatterns.hf.behavioural.command.party.pattern.LightOnCommand;
import designpatterns.hf.behavioural.command.party.pattern.MacroCommand;
import designpatterns.hf.behavioural.command.party.pattern.RemoteControl;
import designpatterns.hf.behavioural.command.party.pattern.StereoOffCommand;
import designpatterns.hf.behavioural.command.party.pattern.StereoOnCommand;
import designpatterns.hf.behavioural.command.party.pattern.TVOffCommand;
import designpatterns.hf.behavioural.command.party.pattern.TVOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
