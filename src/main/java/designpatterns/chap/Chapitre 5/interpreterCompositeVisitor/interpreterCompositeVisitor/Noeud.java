package interpreterCompositeVisitor;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    Noeud getSousNoeudGauche();

    Noeud getSousNoeudDroit();

    int accepteVisiteurExpression(
            VisiteurExpression visiteurExpression);
}
