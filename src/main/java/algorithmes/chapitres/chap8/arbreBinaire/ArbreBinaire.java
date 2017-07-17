package chapitre_8.arbreBinaire;

public class ArbreBinaire {
	NoeudArbreBinaire racine;

	public void insère(int nouvelleClef, String donnée) {
		Donnée nouvelleDonnée = new Donnée(nouvelleClef, donnée);
		if (racine == null)
			racine = new NoeudArbreBinaire(nouvelleDonnée);
		else
			racine.insère(nouvelleDonnée);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche(0);
	}

	public Donnée recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
