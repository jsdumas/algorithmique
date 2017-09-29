package algorithms.chapitres.chap8.listechaineetablehachage;

import java.util.Scanner;

public class TestListeChaînée {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ListeChaînée liste = new ListeChaînée();
		int valeur;
		liste.insère(20, "20");
		liste.insère(50, "50");
		liste.insère(70, "70");
		liste.insère(90, "90");
		liste.affiche();
		do {
			System.out.print("Entrez une valeur à insérer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				liste.insère(valeur, Integer.toString(valeur));
				liste.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef à rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnée résultat = liste.recherche(valeur);
				if (résultat == null)
					System.out.println("Clef non trouvée");
				else
					System.out.println("valeur : " + résultat.valeur);
			}
		} while (valeur != -100);
	}
}
