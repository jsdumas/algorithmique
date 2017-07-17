package systemeFichiersVisitor;

import java.util.List;

public interface Noeud {
    List<Noeud> noeuds();

    void ajouteNoeud(Noeud noeud);

    void supprimeNoeud(Noeud noeud);

    void accepte(Visiteur v);

}
