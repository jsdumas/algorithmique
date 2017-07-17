package chapitre_8.arbreBinaire;

public class ArbreBinaire {
	NoeudArbreBinaire racine;

	public void ins�re(int nouvelleClef, String donn�e) {
		Donn�e nouvelleDonn�e = new Donn�e(nouvelleClef, donn�e);
		if (racine == null)
			racine = new NoeudArbreBinaire(nouvelleDonn�e);
		else
			racine.ins�re(nouvelleDonn�e);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche(0);
	}

	public Donn�e recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
