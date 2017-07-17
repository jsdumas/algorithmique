package listeChaînéeTableHachage;

import java.util.Scanner;
public class TestTableHachage {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		TableHachage table = new TableHachage();
		int valeur;
		table.insère(20, "20");
		table.insère(50, "50");
		table.insère(70, "70");
		table.insère(90, "90");
		table.affiche();
		do {
			System.out
					.print("Entrez une valeur à insérer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				table.insère(valeur, Integer.toString(valeur));
				table.affiche();
			}
		} while (valeur != -100);
		do {
			System.out
					.print("Entrez une clef à rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnée résultat = table.recherche(valeur);
				if (résultat == null)
					System.out.println("Clef non trouvée");
				else
					System.out.println("valeur : " + résultat.valeur);
			}
		} while (valeur != -100);
	}
}
