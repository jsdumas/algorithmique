package designpatterns.hf.structural.facade.app;

import designpatterns.hf.structural.facade.hometheater.Amplifier;
import designpatterns.hf.structural.facade.hometheater.CdPlayer;
import designpatterns.hf.structural.facade.hometheater.DvdPlayer;
import designpatterns.hf.structural.facade.hometheater.PopcornPopper;
import designpatterns.hf.structural.facade.hometheater.Projector;
import designpatterns.hf.structural.facade.hometheater.Screen;
import designpatterns.hf.structural.facade.hometheater.TheaterLights;
import designpatterns.hf.structural.facade.hometheater.Tuner;
import designpatterns.hf.structural.facade.pattern.HomeTheaterFacade;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {

		// Init Objects
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		// Design Pattern
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

		System.out.println("### Watching Movie ###");
		homeTheater.watchMovie("Raiders of the Lost Ark");
		System.out.println();
		System.out.println("################################################");
		System.out.println();
		System.out.println("### The end of Movie ###");
		homeTheater.endMovie();
	}
}
