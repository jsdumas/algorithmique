package algorithms.chapitres.chap8.listechaineetablehachage;

public class ListeCha�n�e {
	NoeudListeCha�n�e racine;

	public void ins�re(int nouvelleClef, String donn�e) {
		Donn�e nouvelleDonn�e = new Donn�e(nouvelleClef, donn�e);
		if (racine == null)
			racine = new NoeudListeCha�n�e(nouvelleDonn�e);
		else
			racine.ins�re(nouvelleDonn�e);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche();
	}

	public Donn�e recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
