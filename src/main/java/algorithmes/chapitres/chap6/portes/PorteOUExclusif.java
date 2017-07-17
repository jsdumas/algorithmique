package portes;

public class PorteOUExclusif extends PorteImpl {

	public boolean getSortie() {
		return entrée1 != entrée2;
	}
}
