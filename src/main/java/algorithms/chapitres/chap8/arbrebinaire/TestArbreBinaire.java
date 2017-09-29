package algorithms.chapitres.chap8.arbrebinaire;

import java.util.Scanner;

public class TestArbreBinaire {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArbreBinaire arbre = new ArbreBinaire();
		int valeur;
		/*
		 * arbre.ins�re(20,"20"); arbre.ins�re(50,"50"); arbre.ins�re(70,"70"); arbre.ins�re(90,"90");
		 */
		arbre.affiche();
		do {
			System.out.print("Entrez une valeur � ins�rer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				arbre.ins�re(valeur, Integer.toString(valeur));
				arbre.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef � rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donn�e r�sultat = arbre.recherche(valeur);
				if (r�sultat == null)
					System.out.println("Clef non trouv�e");
				else
					System.out.println("valeur : " + r�sultat.valeur);
			}
		} while (valeur != -100);
	}
}
