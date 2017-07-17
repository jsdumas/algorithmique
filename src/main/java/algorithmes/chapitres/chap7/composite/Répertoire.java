package composite;

public class Répertoire implements Noeud {
	final int nbrMaxNoeuds = 10;
	Noeud[] noeuds = new Noeud[nbrMaxNoeuds];
	int nbrNoeuds = 0;

	public long nombreFichiers() {
		int résultat = 0;
		for (int i = 0; i < nbrNoeuds; i++)
			résultat += noeuds[i].nombreFichiers();
		return résultat;
	}

	public long nombreRépertoires() {
		int résultat = 1; // y compris le répertoire lui-même
		for (int i = 0; i < nbrNoeuds; i++)
			résultat += noeuds[i].nombreRépertoires();
		return résultat;
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
