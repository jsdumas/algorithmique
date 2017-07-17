package arbreB;

public class NoeudArbreB {
	Donn�e donn�es[];
	NoeudArbreB enfants[];
	int ordre;
	int nbrDonn�es;

	public NoeudArbreB(int ordre) {
		this.ordre = ordre;
		donn�es = new Donn�e[2 * ordre];
		enfants = new NoeudArbreB[2 * ordre + 1];
		nbrDonn�es = 0;
	}

	public Donn�e ins�re(Donn�e nouvelleDonn�e, NoeudArbreB noeudDroitRetourn�) {
		int i;
		NoeudArbreB noeudDroitNouvelleDonn�e;
		// insertion de la nouvelle donn�e dans un enfant si le noeud en poss�de
		noeudDroitNouvelleDonn�e = null;
		i = 0;
		while ((i < nbrDonn�es) && (donn�es[i].clef < nouvelleDonn�e.clef))
			i++;
		if (i == nbrDonn�es) {
			if (enfants[nbrDonn�es] != null) {
				noeudDroitNouvelleDonn�e = new NoeudArbreB(ordre);
				nouvelleDonn�e = enfants[nbrDonn�es].ins�re(nouvelleDonn�e,
						noeudDroitNouvelleDonn�e);
			}
		} else {
			if (donn�es[i].clef == nouvelleDonn�e.clef) {
				// donn�e d�j� pr�sente
				donn�es[i] = nouvelleDonn�e;
				return null;
			} else if (enfants[i] != null) {
				noeudDroitNouvelleDonn�e = new NoeudArbreB(ordre);
				nouvelleDonn�e = enfants[i].ins�re(nouvelleDonn�e,
						noeudDroitNouvelleDonn�e);
			}
		}
		if (nouvelleDonn�e == null)
			return null;
		// insertion de la nouvelle donn�e
		i = 0;
		while ((i < nbrDonn�es) && (donn�es[i].clef < nouvelleDonn�e.clef))
			i++;
		if ((i < nbrDonn�es) && (donn�es[i].clef == nouvelleDonn�e.clef)) {
			// donn�e d�j� pr�sente
			donn�es[i] = nouvelleDonn�e;
			return null;
		}
		if (i < nbrDonn�es) {
			// i est le plus petit indice tel que
			// donn�es[i].clef > nouvelleDonn�e.clef
			Donn�e tempNouvelleDonn�e = donn�es[nbrDonn�es - 1];
			NoeudArbreB tempNoeudDroitNouvelleClef = enfants[nbrDonn�es];
			for (int j = nbrDonn�es - 1; j > i; j--) {
				donn�es[j] = donn�es[j - 1];
				enfants[j + 1] = enfants[j];
			}
			donn�es[i] = nouvelleDonn�e;
			enfants[i + 1] = noeudDroitNouvelleDonn�e;
			nouvelleDonn�e = tempNouvelleDonn�e;
			noeudDroitNouvelleDonn�e = tempNoeudDroitNouvelleClef;
		}
		// il faut maintenant ins�rer au niveau de nbrDonn�es
		// premier cas : le noeud n'est pas complet
		if (nbrDonn�es < 2 * ordre) {
			donn�es[nbrDonn�es] = nouvelleDonn�e;
			enfants[nbrDonn�es + 1] = noeudDroitNouvelleDonn�e;
			nbrDonn�es++;
			return null;
		}
		// second cas, le noeud est complet, il faut le scinder et cr�er un
		// nouveau noeud, la donn�e[ordre] ne va plus y figurer mais va �tre
		// ins�r�e dans le noeud p�re
		else {
			// le nouveau noeud va contenir toutes les valeurs allant de ordre+1
			// jusqu'� nbrDonn�es-1 ainsi que la nouvelle donn�e
			for (int j = 0; j < ordre - 1; j++) {
				noeudDroitRetourn�.donn�es[j] = donn�es[ordre + j + 1];
				noeudDroitRetourn�.enfants[j + 1] = enfants[ordre + j + 2];
			}
			// le premier enfant du nouveau noeud est l'enfant droit de la
			// donn�e[ordre]
			noeudDroitRetourn�.enfants[0] = enfants[ordre + 1];
			// insertion de la nouvelle donn�e dans le nouveau noeud en ordre-1
			noeudDroitRetourn�.donn�es[ordre - 1] = nouvelleDonn�e;
			noeudDroitRetourn�.enfants[ordre] = noeudDroitNouvelleDonn�e;
			// fixation du nombre de donn�es des deux noeuds
			noeudDroitRetourn�.nbrDonn�es = ordre;
			nbrDonn�es = ordre;
			return donn�es[ordre];
		}
	}

	public void affiche(int marge) {
		if (enfants[0] != null)
			enfants[0].affiche(marge + 1);
		for (int j = 0; j < nbrDonn�es; j++) {
			for (int k = 0; k < marge; k++)
				System.out.print(" ");
			System.out.println(donn�es[j]);
			if (enfants[j + 1] != null)
				enfants[j + 1].affiche(marge + 1);
		}
	}

	public Donn�e recherche(int clef) {
		int i;
		i = 0;
		while ((i < nbrDonn�es) && (donn�es[i].clef < clef))
			i++;
		if (i == nbrDonn�es)
			if (enfants[nbrDonn�es] != null)
				return enfants[nbrDonn�es].recherche(clef);
			else
				return null;
		else if (donn�es[i].clef == clef)
			return donn�es[i];
		else if (enfants[i] != null)
			return enfants[i].recherche(clef);
		else
			return null;
	}
}
