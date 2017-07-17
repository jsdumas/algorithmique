package algorithmes.chapitres.chap6.portes;

public class PorteOUExclusif extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entrée1 != entrée2;
	}
}
