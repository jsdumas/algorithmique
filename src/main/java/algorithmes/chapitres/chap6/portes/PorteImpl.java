package portes;

public abstract class PorteImpl implements Porte {
	boolean entr�e1, entr�e2;
	
	public boolean getEntr�e1() {
		return entr�e1;
	}

	public boolean getEntr�e2() {
		return entr�e2;
	}

	public void setEntr�e1(boolean valeur) {
		entr�e1 = valeur;
	}

	public void setEntr�e2(boolean valeur) {
		entr�e2 = valeur;
	}
}
