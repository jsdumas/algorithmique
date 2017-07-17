package algorithmes.chapitres.chap8.arbreb;

import java.util.Scanner;

public class TestArbreB {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArbreB arbre = new ArbreB(2);
		int valeur;
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
