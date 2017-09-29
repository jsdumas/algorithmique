package algorithms.chapitres.chap8.listechaineetablehachage;

public class NoeudListeChaînée {
	Donnée donnée;
	NoeudListeChaînée suivant;

	public NoeudListeChaînée(Donnée donnée) {
		this.donnée = donnée;
	}

	public void insère(Donnée nouvelleDonnée) {
		if (donnée.clef == nouvelleDonnée.clef) {
			donnée.valeur = nouvelleDonnée.valeur;
			return;
		}
		if (suivant == null)
			suivant = new NoeudListeChaînée(nouvelleDonnée);
		else
			suivant.insère(nouvelleDonnée);
	}

	public void affiche() {
		System.out.println(donnée);
		if (suivant != null)
			suivant.affiche();
	}

	public Donnée recherche(int clef) {
		if (donnée.clef == clef)
			return donnée;
		if (suivant != null)
			return suivant.recherche(clef);
		else
			return null;
	}
}
