package algorithmes.chapitres.chap8.arbreb;

public class ArbreB {
	NoeudArbreB racine;
	int ordre;

	public ArbreB(int ordre) {
		this.ordre = ordre;
		racine = new NoeudArbreB(ordre);
	}

	public void ins�re(int nouvelleClef, String donn�e) {
		Donn�e nouvelleDonn�e = new Donn�e(nouvelleClef, donn�e);
		NoeudArbreB noeudDroitNouvelleDonn�e = new NoeudArbreB(ordre);
		nouvelleDonn�e = racine.ins�re(nouvelleDonn�e, noeudDroitNouvelleDonn�e);
		if (nouvelleDonn�e == null)
			return;
		NoeudArbreB nouvelleRacine = new NoeudArbreB(ordre);
		nouvelleRacine.donn�es[0] = nouvelleDonn�e;
		nouvelleRacine.enfants[0] = racine;
		nouvelleRacine.enfants[1] = noeudDroitNouvelleDonn�e;
		nouvelleRacine.nbrDonn�es = 1;
		racine = nouvelleRacine;
	}

	public void affiche() {
		racine.affiche(0);
	}

	public Donn�e recherche(int clef) {
		return racine.recherche(clef);
	}
}
