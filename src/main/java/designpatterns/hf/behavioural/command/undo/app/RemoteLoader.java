package designpatterns.hf.behavioural.command.undo.app;

import designpatterns.hf.behavioural.command.undo.homeappliance.CeilingFan;
import designpatterns.hf.behavioural.command.undo.homeappliance.Light;
import designpatterns.hf.behavioural.command.undo.pattern.CeilingFanHighCommand;
import designpatterns.hf.behavioural.command.undo.pattern.CeilingFanMediumCommand;
import designpatterns.hf.behavioural.command.undo.pattern.CeilingFanOffCommand;
import designpatterns.hf.behavioural.command.undo.pattern.LightOffCommand;
import designpatterns.hf.behavioural.command.undo.pattern.LightOnCommand;
import designpatterns.hf.behavioural.command.undo.pattern.RemoteControlWithUndo;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
