package AbstractFactory;

public class FabriqueGraphiqueWindows implements FabriqueGraphique {

	@Override
	public Fenetre creeFenetre(String titre) {
		return new FenetreWindows(titre);
	}

	@Override
	public BarreMenu creeBarreMenu() {
		return new BarreMenuWindows();
	}
}
