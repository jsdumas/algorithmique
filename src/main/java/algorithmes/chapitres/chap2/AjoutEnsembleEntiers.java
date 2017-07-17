package algorithmes.chapitres.chap2;

import java.util.Scanner;

public class AjoutEnsembleEntiers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int tailleMaximaleEnsemble = 10;
		// déclaration et création de l'ensemble
		int tailleEnsemble = 0;
		int[] ensemble = new int[tailleMaximaleEnsemble];
		// ajout de valeurs
		int valeur;
		while (tailleEnsemble < tailleMaximaleEnsemble) {
			System.out.print("Entrez une valeur : ");
			valeur = reader.nextInt();
			// recherche de la valeur dans l’ensemble
			int j = 0;
			while ((j < tailleEnsemble) && (ensemble[j] != valeur))
				j++;
			// insertion de la valeur si elle n'a pas été trouvée
			if (j == tailleEnsemble) {
				ensemble[tailleEnsemble] = valeur;
				tailleEnsemble++;
			}
		}
		// affichage de l’ensemble
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}
