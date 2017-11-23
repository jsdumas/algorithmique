package designpatterns.reference.app;

import designpatterns.reference.Car;
import designpatterns.reference.Movable;

public class Runtime {

	private static int size;

	public static void main(String[] args) {

		// Character perso = new Character();
		// Knight chev1 = new Knight();
		// reference ----> implementation
		Movable voiture = new Car();

		// faireAvancer(perso);
		// faireAvancer(voiture);
		// faireAvancer(chev1);
		// chev1.avancer(5);
		// voiture.moveForward();
		((Car) voiture).setBrand("test");

		if (voiture instanceof Car) {
			// voiture = (Voiture)voiture;
			System.out.println("Marque de la voiture " + ((Car) voiture).getBrand());
		}

	}

	public static void faireAvancer(Movable movable) {
		movable.moveForward();
	}

}
