package designpatterns.treeptik.initobjet.app;

import designpatterns.treeptik.initobjet.Chevalier;
import designpatterns.treeptik.initobjet.Deplacer;
import designpatterns.treeptik.initobjet.Personnage;
import designpatterns.treeptik.initobjet.Voiture;

public class Runtime {

	private static int size;

	public static void main(String[] args) {

		Personnage perso = new Personnage();
		Deplacer voiture = new Voiture();
		Chevalier chev1 = new Chevalier();

		faireAvancer(perso);
		faireAvancer(voiture);
		faireAvancer(chev1);
		chev1.avancer(5);
		voiture.avancer();
		((Voiture) voiture).setMarque("test");

		if (voiture instanceof Voiture) {
			// voiture = (Voiture)voiture;
			System.out.println(((Voiture) voiture).getMarque());
		}

	}

	public static void faireAvancer(Deplacer deplacer) {
		deplacer.avancer();
	}

}
