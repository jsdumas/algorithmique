public class EnsembleTrié {
	int tailleEnsemble;
	int[] ensemble;
	
	public EnsembleTrié(int tailleMaximaleEnsemble) {
	    tailleEnsemble = 0;
		ensemble = new int[tailleMaximaleEnsemble];
	}

	public boolean insére(int valeur) {
		int borneGauche, borneDroite, milieu;
		boolean trouvé;
		
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
		boolean trouvé;
		
		borneGauche = 0;
		borneDroite = tailleEnsemble - 1;
		trouvé = false;
		milieu = 0;
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
		// suppression de la valeur si elle a été trouvée
		if (trouvé) {
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
