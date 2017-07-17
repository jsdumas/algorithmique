package composite;

public class R�pertoire implements Noeud {
	final int nbrMaxNoeuds = 10;
	Noeud[] noeuds = new Noeud[nbrMaxNoeuds];
	int nbrNoeuds = 0;

	public long nombreFichiers() {
		int r�sultat = 0;
		for (int i = 0; i < nbrNoeuds; i++)
			r�sultat += noeuds[i].nombreFichiers();
		return r�sultat;
	}

	public long nombreR�pertoires() {
		int r�sultat = 1; // y compris le r�pertoire lui-m�me
		for (int i = 0; i < nbrNoeuds; i++)
			r�sultat += noeuds[i].nombreR�pertoires();
		return r�sultat;
	}

	public boolean ajouteNoeud(Noeud noeud) {
		int j = 0;
		while ((j < nbrNoeuds) && (noeuds[j] != noeud))
			j++;
		if (j == nbrNoeuds) {
			if (nbrNoeuds == nbrMaxNoeuds)
				return false;
			noeuds[nbrNoeuds] = noeud;
			nbrNoeuds++;
		}
		return true;
	}
}
