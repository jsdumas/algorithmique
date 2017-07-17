package listeCha�n�eTableHachage;

import java.util.Scanner;
public class TestTableHachage {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		TableHachage table = new TableHachage();
		int valeur;
		table.ins�re(20, "20");
		table.ins�re(50, "50");
		table.ins�re(70, "70");
		table.ins�re(90, "90");
		table.affiche();
		do {
			System.out
					.print("Entrez une valeur � ins�rer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				table.ins�re(valeur, Integer.toString(valeur));
				table.affiche();
			}
		} while (valeur != -100);
		do {
			System.out
					.print("Entrez une clef � rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donn�e r�sultat = table.recherche(valeur);
				if (r�sultat == null)
					System.out.println("Clef non trouv�e");
				else
					System.out.println("valeur : " + r�sultat.valeur);
			}
		} while (valeur != -100);
	}
}
