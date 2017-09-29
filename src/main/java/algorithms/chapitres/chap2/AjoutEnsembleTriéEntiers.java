package algorithms.chapitres.chap2;

import java.util.Scanner;

public class AjoutEnsembleTriéEntiers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int tailleMaximaleEnsemble = 10;
		// déclaration et création de l'ensemble
		int tailleEnsemble = 0;
		int[] ensemble = new int[tailleMaximaleEnsemble];
		// ajout de valeurs
		int valeur;
		int borneGauche, borneDroite, milieu;
		boolean trouvé;
		while (tailleEnsemble < tailleMaximaleEnsemble) {
			System.out.print("Entrez une valeur : ");
			valeur = reader.nextInt();
			// recherche de la valeur dans l'ensemble par dichotomie
			borneGauche = 0;
			borneDroite = tailleEnsemble - 1;
			trouvé = false;
			while ((!trouvé) && (borneGauche <= borneDroite)) {
				milieu = (borneGauche + borneDroite) / 2;
				if (ensemble[milieu] == valeur)
					trouvé = true;
				else {
					if (ensemble[milieu] > valeur)
						borneDroite = milieu - 1;
					else
						borneGauche = milieu + 1;
				}
			}
			// insertion de la valeur si elle n'a pas été trouvée
			if (!trouvé) {
				for (int i = tailleEnsemble; i > borneGauche; i--)
					ensemble[i] = ensemble[i - 1];
				ensemble[borneGauche] = valeur;
				tailleEnsemble++;
			}
		}
		// affichage de l’ensemble
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}