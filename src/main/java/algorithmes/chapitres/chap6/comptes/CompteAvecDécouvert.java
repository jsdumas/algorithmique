package comptes;

public class CompteAvecD�couvert extends Compte {
	long d�couvertAutoris�;

	public CompteAvecD�couvert() {
		d�couvertAutoris� = 0;
	}

	public long getD�couvertAutoris�() {
		return d�couvertAutoris�;
	}

	public void setD�couvertAutoris�(long d�couvertAutoris�) {
		this.d�couvertAutoris� = d�couvertAutoris�;
	}

	public boolean retire(long montant) {
		if (montant <= solde + d�couvertAutoris�) {
			solde -= montant;
			return true;
		} else
			return false;
	}
}
