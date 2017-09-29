package algorithms.chapitres.chap4;

public class EnsembleTri� {
	int tailleEnsemble;
	int[] ensemble;

	public EnsembleTri�(int tailleMaximaleEnsemble) {
		tailleEnsemble = 0;
		ensemble = new int[tailleMaximaleEnsemble];
	}

	public boolean ins�re(int valeur) {
		int borneGauche, borneDroite, milieu;
		boolean trouv�;

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
			if (tailleEnsemble == ensemble.length)
				return false;
			for (int i = tailleEnsemble; i > borneGauche; i--)
				ensemble[i] = ensemble[i - 1];
			ensemble[borneGauche] = valeur;
			tailleEnsemble++;
		}
		return true;
	}

	public boolean supprime(int valeur) {
		int borneGauche, borneDroite, milieu;
		boolean trouv�;

		borneGauche = 0;
		borneDroite = tailleEnsemble - 1;
		trouv� = false;
		milieu = 0;
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
		// suppression de la valeur si elle a �t� trouv�e
		if (trouv�) {
			tailleEnsemble--;
			for (int j = milieu; j < tailleEnsemble; j++)
				ensemble[j] = ensemble[j + 1];
			return true;
		}
		return false;
	}

	public void affiche() {
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}
