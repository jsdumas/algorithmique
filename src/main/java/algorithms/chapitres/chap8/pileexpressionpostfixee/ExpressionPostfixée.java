package algorithms.chapitres.chap8.pileexpressionpostfixee;

public class ExpressionPostfixée {
	final int taille = 5;
	Pile pile = new Pile(taille);

	public boolean empileValeur(int valeur) {
		return pile.empile(Integer.toString(valeur));
	}

	public void add() {
		int a, b;
		String valeur = pile.dépile();
		if (valeur != null)
			a = Integer.parseInt(valeur);
		else
			a = 0;
		valeur = pile.dépile();
		if (valeur != null)
			b = Integer.parseInt(valeur);
		else
			b = 0;
		pile.empile(Integer.toString(a + b));
	}

	public void mult() {
		int a, b;
		String valeur = pile.dépile();
		if (valeur != null)
			a = Integer.parseInt(valeur);
		else
			a = 0;
		valeur = pile.dépile();
		if (valeur != null)
			b = Integer.parseInt(valeur);
		else
			b = 0;
		pile.empile(Integer.toString(a * b));
	}

	public int résultat() {
		String valeur = pile.dépile();
		if (valeur != null)
			return Integer.parseInt(valeur);
		else
			return 0;
	}
}
