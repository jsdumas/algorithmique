package arbreBinaire;

public class NoeudArbreBinaire {
	Donnée donnée;
	NoeudArbreBinaire gauche, droite;

	public NoeudArbreBinaire(Donnée donnée) {
		this.donnée = donnée;
	}

	public void insère(Donnée nouvelleDonnée) {
		if (donnée.clef == nouvelleDonnée.clef)
			return;
		if (donnée.clef > nouvelleDonnée.clef)
			if (gauche == null)
				gauche = new NoeudArbreBinaire(nouvelleDonnée);
			else
				gauche.insère(nouvelleDonnée);
		else if (droite == null)
			droite = new NoeudArbreBinaire(nouvelleDonnée);
		else
			droite.insère(nouvelleDonnée);
	}

	public void affiche(int marge) {
		if (gauche != null)
			gauche.affiche(marge + 1);
		for (int k = 0; k < marge; k++)
			System.out.print(" ");
		System.out.println(donnée);
		if (droite != null)
			droite.affiche(marge + 1);
	}

	public Donnée recherche(int clef) {
		if (donnée.clef == clef)
			return donnée;
		else if (donnée.clef > clef)
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
