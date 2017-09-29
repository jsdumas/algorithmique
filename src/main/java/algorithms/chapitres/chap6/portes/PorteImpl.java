package algorithms.chapitres.chap6.portes;

public abstract class PorteImpl implements Porte {
	boolean entrée1, entrée2;

	@Override
	public boolean getEntrée1() {
		return entrée1;
	}

	@Override
	public boolean getEntrée2() {
		return entrée2;
	}

	@Override
	public void setEntrée1(boolean valeur) {
		entrée1 = valeur;
	}

	@Override
	public void setEntrée2(boolean valeur) {
		entrée2 = valeur;
	}
}
