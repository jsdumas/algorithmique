package algorithmes.chapitres.chap8.listechaineetablehachage;

public class NoeudListeCha�n�e {
	Donn�e donn�e;
	NoeudListeCha�n�e suivant;

	public NoeudListeCha�n�e(Donn�e donn�e) {
		this.donn�e = donn�e;
	}

	public void ins�re(Donn�e nouvelleDonn�e) {
		if (donn�e.clef == nouvelleDonn�e.clef) {
			donn�e.valeur = nouvelleDonn�e.valeur;
			return;
		}
		if (suivant == null)
			suivant = new NoeudListeCha�n�e(nouvelleDonn�e);
		else
			suivant.ins�re(nouvelleDonn�e);
	}

	public void affiche() {
		System.out.println(donn�e);
		if (suivant != null)
			suivant.affiche();
	}

	public Donn�e recherche(int clef) {
		if (donn�e.clef == clef)
			return donn�e;
		if (suivant != null)
			return suivant.recherche(clef);
		else
			return null;
	}
}
