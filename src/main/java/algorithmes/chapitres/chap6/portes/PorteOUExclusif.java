package portes;

public class PorteOUExclusif extends PorteImpl {

	public boolean getSortie() {
		return entr�e1 != entr�e2;
	}
}
