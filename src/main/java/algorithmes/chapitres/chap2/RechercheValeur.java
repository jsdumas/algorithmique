package chapitre_22;
import java.util.Scanner;
public class RechercheValeur {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 10;
		int i, valeur;
		int nbrValeursTrouv�es;
		// d�claration et cr�ation du tableau
		int[] tableau = new int[taille];
		// remplissage du tableau
		for (i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 10) + 1;
		// impression du tableau
		for (i = 0; i < taille; i++)
			System.out.println(" valeur du tableau � l'indice : " + i + " "
					+ tableau[i]);

		System.out.print("Entrez la valeur � rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		nbrValeursTrouv�es = 0;
		for (i = 0; i < taille; i++)
			if (tableau[i] == valeur) {
				nbrValeursTrouv�es += 1;
				System.out.println("Valeur trouv�e � l'indice : " + i);
			}
		if (nbrValeursTrouv�es == 0)
			System.out.println("Valeur non trouv�e dans le tableau ");
		else
			System.out.println("Nombre d�occurrences : "+ nbrValeursTrouv�es);
	}
}
