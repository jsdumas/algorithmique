package chapitre_22;
import java.util.Scanner;

public class AjoutEnsembleTri�Entiers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int tailleMaximaleEnsemble = 10;
		// d�claration et cr�ation de l'ensemble
		int tailleEnsemble = 0;
		int[] ensemble = new int[tailleMaximaleEnsemble];
		// ajout de valeurs
		int valeur;
		int borneGauche, borneDroite, milieu;
		boolean trouv�;
		while (tailleEnsemble < tailleMaximaleEnsemble) {
			System.out.print("Entrez une valeur : ");
			valeur = reader.nextInt();
			// recherche de la valeur dans l'ensemble par dichotomie
			borneGauche = 0;
			borneDroite = tailleEnsemble - 1;
			trouv� = false;
			while ((!trouv�) && (borneGauche <= borneDroite)) {
				milieu = (borneGauche + borneDroite) / 2;
				if (ensemble[milieu] == valeur)
					trouv� = true;
				else {
					if (ensemble[milieu] > valeur)
						borneDroite = milieu - 1;
					else
						borneGauche = milieu + 1;
				}
			}
			// insertion de la valeur si elle n'a pas �t� trouv�e
			if (!trouv�) {
				for (int i = tailleEnsemble; i > borneGauche; i--)
					ensemble[i] = ensemble[i - 1];
				ensemble[borneGauche] = valeur;
				tailleEnsemble++;
			}
		}
		// affichage de l�ensemble
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}