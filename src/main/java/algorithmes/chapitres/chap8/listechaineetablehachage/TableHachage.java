package algorithmes.chapitres.chap8.listechaineetablehachage;

public class TableHachage {
	final int tailleTable = 10;

	ListeChaînée table[] = new ListeChaînée[tailleTable];

	public int fonctionHachage(int nouvelleClef) {
		return nouvelleClef % tailleTable;
	}

	public void insère(int nouvelleClef, String donnée) {
		int i = fonctionHachage(nouvelleClef);
		if (table[i] == null)
			table[i] = new ListeChaînée();
		table[i].insère(nouvelleClef, donnée);
	}

	public void affiche() {
		for (int i = 0; i < tailleTable; i++)
			if (table[i] != null)
				table[i].affiche();
	}

	public Donnée recherche(int clef) {
		int indice = fonctionHachage(clef);
		if (table[indice] != null)
			return table[indice].recherche(clef);
		else
			return null;
	}
}
