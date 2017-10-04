package designpatterns.initobjet.app;

import designpatterns.initobjet.Chevalier;
import designpatterns.initobjet.Deplacer;
import designpatterns.initobjet.Personnage;
import designpatterns.initobjet.Voiture;

public class Runtime {

	private static int size;

	public static void main(String[] args) {

		Personnage perso = new Personnage();
		Chevalier chev1 = new Chevalier();
		// reference ----> implementation
		Deplacer voiture = new Voiture();

		faireAvancer(perso);
		faireAvancer(voiture);
		faireAvancer(chev1);
		chev1.avancer(5);
		voiture.avancer();
		((Voiture) voiture).setMarque("test");

		if (voiture instanceof Voiture) {
			// voiture = (Voiture)voiture;
			System.out.println("Marque de la voiture " + ((Voiture) voiture).getMarque());
		}

	}

	public static void faireAvancer(Deplacer deplacer) {
		deplacer.avancer();
	}

}
