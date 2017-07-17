package comptes;

public class CompteClassique extends Compte {

	public boolean retire(long montant) {
		if (montant <= solde) {
			solde -= montant;
			return true;
		} else
			return false;
	}
}
