package portes;

public abstract class PorteImpl implements Porte {
	boolean entrée1, entrée2;
	
	public boolean getEntrée1() {
		return entrée1;
	}

	public boolean getEntrée2() {
		return entrée2;
	}

	public void setEntrée1(boolean valeur) {
		entrée1 = valeur;
	}

	public void setEntrée2(boolean valeur) {
		entrée2 = valeur;
	}
}
