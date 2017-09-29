package algorithms.chapitres.chap6.portes;

public class PorteET extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entrée1 && entrée2;
	}
}
