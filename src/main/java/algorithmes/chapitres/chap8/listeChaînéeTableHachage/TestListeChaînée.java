package listeCha�n�eTableHachage;

import java.util.Scanner;
public class TestListeCha�n�e {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ListeCha�n�e liste = new ListeCha�n�e();
		int valeur;
		liste.ins�re(20, "20");
		liste.ins�re(50, "50");
		liste.ins�re(70, "70");
		liste.ins�re(90, "90");
		liste.affiche();
		do {
			System.out
					.print("Entrez une valeur � ins�rer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				liste.ins�re(valeur, Integer.toString(valeur));
				liste.affiche();
			}
		} while (valeur != -100);
		do {
			System.out
					.print("Entrez une clef � rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donn�e r�sultat = liste.recherche(valeur);
				if (r�sultat == null)
					System.out.println("Clef non trouv�e");
				else
					System.out.println("valeur : " + r�sultat.valeur);
			}
		} while (valeur != -100);
	}
}
