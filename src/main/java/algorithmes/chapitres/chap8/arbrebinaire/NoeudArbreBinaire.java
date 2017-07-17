package algorithmes.chapitres.chap8.arbrebinaire;

public class NoeudArbreBinaire {
	Donn�e donn�e;
	NoeudArbreBinaire gauche, droite;

	public NoeudArbreBinaire(Donn�e donn�e) {
		this.donn�e = donn�e;
	}

	public void ins�re(Donn�e nouvelleDonn�e) {
		if (donn�e.clef == nouvelleDonn�e.clef)
			return;
		if (donn�e.clef > nouvelleDonn�e.clef)
			if (gauche == null)
				gauche = new NoeudArbreBinaire(nouvelleDonn�e);
			else
				gauche.ins�re(nouvelleDonn�e);
		else if (droite == null)
			droite = new NoeudArbreBinaire(nouvelleDonn�e);
		else
			droite.ins�re(nouvelleDonn�e);
	}

	public void affiche(int marge) {
		if (gauche != null)
			gauche.affiche(marge + 1);
		for (int k = 0; k < marge; k++)
			System.out.print(" ");
		System.out.println(donn�e);
		if (droite != null)
			droite.affiche(marge + 1);
	}

	public Donn�e recherche(int clef) {
		if (donn�e.clef == clef)
			return donn�e;
		else if (donn�e.clef > clef)
			if (gauche == null)
				return null;
			else
				return gauche.recherche(clef);
		else if (droite == null)
			return null;
		else
			return droite.recherche(clef);
	}
}
