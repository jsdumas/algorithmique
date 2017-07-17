package algorithmes.chapitres.chap8.arbreb;

public class NoeudArbreB {
	Donnée données[];
	NoeudArbreB enfants[];
	int ordre;
	int nbrDonnées;

	public NoeudArbreB(int ordre) {
		this.ordre = ordre;
		données = new Donnée[2 * ordre];
		enfants = new NoeudArbreB[2 * ordre + 1];
		nbrDonnées = 0;
	}

	public Donnée insère(Donnée nouvelleDonnée, NoeudArbreB noeudDroitRetourné) {
		int i;
		NoeudArbreB noeudDroitNouvelleDonnée;
		// insertion de la nouvelle donnée dans un enfant si le noeud en possède
		noeudDroitNouvelleDonnée = null;
		i = 0;
		while ((i < nbrDonnées) && (données[i].clef < nouvelleDonnée.clef))
			i++;
		if (i == nbrDonnées) {
			if (enfants[nbrDonnées] != null) {
				noeudDroitNouvelleDonnée = new NoeudArbreB(ordre);
				nouvelleDonnée = enfants[nbrDonnées].insère(nouvelleDonnée, noeudDroitNouvelleDonnée);
			}
		} else {
			if (données[i].clef == nouvelleDonnée.clef) {
				// donnée déjà présente
				données[i] = nouvelleDonnée;
				return null;
			} else if (enfants[i] != null) {
				noeudDroitNouvelleDonnée = new NoeudArbreB(ordre);
				nouvelleDonnée = enfants[i].insère(nouvelleDonnée, noeudDroitNouvelleDonnée);
			}
		}
		if (nouvelleDonnée == null)
			return null;
		// insertion de la nouvelle donnée
		i = 0;
		while ((i < nbrDonnées) && (données[i].clef < nouvelleDonnée.clef))
			i++;
		if ((i < nbrDonnées) && (données[i].clef == nouvelleDonnée.clef)) {
			// donnée déjà présente
			données[i] = nouvelleDonnée;
			return null;
		}
		if (i < nbrDonnées) {
			// i est le plus petit indice tel que
			// données[i].clef > nouvelleDonnée.clef
			Donnée tempNouvelleDonnée = données[nbrDonnées - 1];
			NoeudArbreB tempNoeudDroitNouvelleClef = enfants[nbrDonnées];
			for (int j = nbrDonnées - 1; j > i; j--) {
				données[j] = données[j - 1];
				enfants[j + 1] = enfants[j];
			}
			données[i] = nouvelleDonnée;
			enfants[i + 1] = noeudDroitNouvelleDonnée;
			nouvelleDonnée = tempNouvelleDonnée;
			noeudDroitNouvelleDonnée = tempNoeudDroitNouvelleClef;
		}
		// il faut maintenant insérer au niveau de nbrDonnées
		// premier cas : le noeud n'est pas complet
		if (nbrDonnées < 2 * ordre) {
			données[nbrDonnées] = nouvelleDonnée;
			enfants[nbrDonnées + 1] = noeudDroitNouvelleDonnée;
			nbrDonnées++;
			return null;
		}
		// second cas, le noeud est complet, il faut le scinder et créer un
		// nouveau noeud, la donnée[ordre] ne va plus y figurer mais va être
		// insérée dans le noeud père
		else {
			// le nouveau noeud va contenir toutes les valeurs allant de ordre+1
			// jusqu'à nbrDonnées-1 ainsi que la nouvelle donnée
			for (int j = 0; j < ordre - 1; j++) {
				noeudDroitRetourné.données[j] = données[ordre + j + 1];
				noeudDroitRetourné.enfants[j + 1] = enfants[ordre + j + 2];
			}
			// le premier enfant du nouveau noeud est l'enfant droit de la
			// donnée[ordre]
			noeudDroitRetourné.enfants[0] = enfants[ordre + 1];
			// insertion de la nouvelle donnée dans le nouveau noeud en ordre-1
			noeudDroitRetourné.données[ordre - 1] = nouvelleDonnée;
			noeudDroitRetourné.enfants[ordre] = noeudDroitNouvelleDonnée;
			// fixation du nombre de données des deux noeuds
			noeudDroitRetourné.nbrDonnées = ordre;
			nbrDonnées = ordre;
			return données[ordre];
		}
	}

	public void affiche(int marge) {
		if (enfants[0] != null)
			enfants[0].affiche(marge + 1);
		for (int j = 0; j < nbrDonnées; j++) {
			for (int k = 0; k < marge; k++)
				System.out.print(" ");
			System.out.println(données[j]);
			if (enfants[j + 1] != null)
				enfants[j + 1].affiche(marge + 1);
		}
	}

	public Donnée recherche(int clef) {
		int i;
		i = 0;
		while ((i < nbrDonnées) && (données[i].clef < clef))
			i++;
		if (i == nbrDonnées)
			if (enfants[nbrDonnées] != null)
				return enfants[nbrDonnées].recherche(clef);
			else
				return null;
		else if (données[i].clef == clef)
			return données[i];
		else if (enfants[i] != null)
			return enfants[i].recherche(clef);
		else
			return null;
	}
}
