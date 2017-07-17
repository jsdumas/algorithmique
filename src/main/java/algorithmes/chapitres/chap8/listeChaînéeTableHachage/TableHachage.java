package listeCha�n�eTableHachage;

public class TableHachage {
	final int tailleTable = 10;

	ListeCha�n�e table[] = new ListeCha�n�e[tailleTable];

	public int fonctionHachage(int nouvelleClef) {
		return nouvelleClef % tailleTable;
	}

	public void ins�re(int nouvelleClef, String donn�e) {
		int i = fonctionHachage(nouvelleClef);
		if (table[i] == null)
			table[i] = new ListeCha�n�e();
		table[i].ins�re(nouvelleClef, donn�e);
	}

	public void affiche() {
		for (int i = 0; i < tailleTable; i++)
			if (table[i] != null)
				table[i].affiche();
	}

	public Donn�e recherche(int clef) {
		int indice = fonctionHachage(clef);
		if (table[indice] != null)
			return table[indice].recherche(clef);
		else
			return null;
	}
}
