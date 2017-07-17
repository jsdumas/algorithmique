package interpreterCompositeVisitor;

public class NoeudAddition extends NoeudOperateur {

    public NoeudAddition(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int accepteVisiteurExpression(
            VisiteurExpression visiteurExpression) {
        return visiteurExpression.visite(this);
    }
}
