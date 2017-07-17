package algorithmes.chapitres.chap8.arbreb;

import java.util.Scanner;

public class TestArbreB {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArbreB arbre = new ArbreB(2);
		int valeur;
		arbre.affiche();
		do {
			System.out.print("Entrez une valeur à insérer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				arbre.insère(valeur, Integer.toString(valeur));
				arbre.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef à rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnée résultat = arbre.recherche(valeur);
				if (résultat == null)
					System.out.println("Clef non trouvée");
				else
					System.out.println("valeur : " + résultat.valeur);
			}
		} while (valeur != -100);
	}
}
