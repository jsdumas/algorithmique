package algorithmes.chapitres.chap6.comptes;

public class CompteAvecDécouvert extends Compte {
	long découvertAutorisé;

	public CompteAvecDécouvert() {
		découvertAutorisé = 0;
	}

	public long getDécouvertAutorisé() {
		return découvertAutorisé;
	}

	public void setDécouvertAutorisé(long découvertAutorisé) {
		this.découvertAutorisé = découvertAutorisé;
	}

	@Override
	public boolean retire(long montant) {
		if (montant <= solde + découvertAutorisé) {
			solde -= montant;
			return true;
		} else
			return false;
	}
}
