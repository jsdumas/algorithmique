package algorithms.chapitres.chap6.portes;

public class PorteOU extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entr�e1 || entr�e2;
	}
}
