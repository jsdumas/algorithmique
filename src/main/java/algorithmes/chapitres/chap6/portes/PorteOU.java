package portes;

public class PorteOU extends PorteImpl {

	public boolean getSortie() {
		return entrée1 || entrée2;
	}
}
