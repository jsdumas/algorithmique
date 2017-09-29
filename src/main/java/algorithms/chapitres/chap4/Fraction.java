package algorithms.chapitres.chap4;

public class Fraction {
	int numérateur, dénominateur;

	public Fraction(int num, int dén) {
		if ((num >= 0) && (dén > 0)) {
			numérateur = num;
			dénominateur = dén;
		} else {
			numérateur = 0;
			dénominateur = 1;
		}
	}

	public double réel() {
		return (double) numérateur / (double) dénominateur;
	}

	public int pgcd(int a, int b) {
		int reste = a % b;
		while (reste != 0) {
			a = b;
			b = reste;
			reste = a % b;
		}
		return b;
	}

	public void réduit() {
		if (numérateur == 0)
			return;
		int pgcdNumDén = pgcd(numérateur, dénominateur);
		numérateur = numérateur / pgcdNumDén;
		dénominateur = dénominateur / pgcdNumDén;
	}

	public Fraction addition(Fraction uneFraction) {
		Fraction résultat = new Fraction(numérateur * uneFraction.dénominateur + uneFraction.numérateur * dénominateur, dénominateur
				* uneFraction.dénominateur);
		résultat.réduit();
		return résultat;
	}
}
