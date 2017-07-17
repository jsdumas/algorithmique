package interpreterComposite;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    int valeurNoeud();
}
