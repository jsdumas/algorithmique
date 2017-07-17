package AbstractFactory;

public class FabriqueGraphiqueMacintosh implements FabriqueGraphique {

	@Override
	public Fenetre creeFenetre(String titre) {
		return new FenetreMacintosh(titre);
	}

	@Override
	public BarreMenu creeBarreMenu() {
		return new BarreMenuMacintosh();
	}
}
