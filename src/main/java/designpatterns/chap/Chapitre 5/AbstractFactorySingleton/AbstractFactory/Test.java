package AbstractFactory;

public class Test {

    public static void main(String[] args) {
        FabriqueGraphique fabriqueGraphiqueWindows = new FabriqueGraphiqueWindows();
        Fenetre fenetre = fabriqueGraphiqueWindows
                .creeFenetre("Nouvelle fenêtre");
        fenetre.affiche();
        FabriqueGraphique fabriqueGraphiqueMac = new FabriqueGraphiqueMacintosh();
        fenetre = fabriqueGraphiqueMac
                .creeFenetre("Nouvelle fenêtre");
        fenetre.affiche();
    }

}
