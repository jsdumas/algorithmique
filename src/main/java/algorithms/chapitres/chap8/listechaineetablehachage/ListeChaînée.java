package algorithms.chapitres.chap8.listechaineetablehachage;

public class ListeChaînée {
	NoeudListeChaînée racine;

	public void insère(int nouvelleClef, String donnée) {
		Donnée nouvelleDonnée = new Donnée(nouvelleClef, donnée);
		if (racine == null)
			racine = new NoeudListeChaînée(nouvelleDonnée);
		else
			racine.insère(nouvelleDonnée);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche();
	}

	public Donnée recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
