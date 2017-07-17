package AbstractFactorySingleton;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);
	BarreMenu creeBarreMenu();
}
