package algorithmes.chapitres.chap6.portes;

public class PorteOUExclusif extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entr�e1 != entr�e2;
	}
}
