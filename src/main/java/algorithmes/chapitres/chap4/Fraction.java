public class Fraction {
	int num�rateur, d�nominateur;

	public Fraction(int num, int d�n) {
		if ((num >= 0) && (d�n > 0)) {
			num�rateur = num;
			d�nominateur = d�n;
		} else {
			num�rateur = 0;
			d�nominateur = 1;
		}
	}

	public double r�el() {
		return (double) num�rateur / (double) d�nominateur;
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

	public void r�duit() {
		if (num�rateur == 0)
			return;
		int pgcdNumD�n = pgcd(num�rateur, d�nominateur);
		num�rateur = num�rateur / pgcdNumD�n;
		d�nominateur = d�nominateur / pgcdNumD�n;
	}

	public Fraction addition(Fraction uneFraction) {
		Fraction r�sultat = new Fraction(num�rateur * uneFraction.d�nominateur
				+ uneFraction.num�rateur * d�nominateur, d�nominateur
				* uneFraction.d�nominateur);
		r�sultat.r�duit();
		return r�sultat;
	}
}
