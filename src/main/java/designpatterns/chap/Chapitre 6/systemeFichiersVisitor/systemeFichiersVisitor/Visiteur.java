package systemeFichiersVisitor;

public interface Visiteur {
    void visite(Repertoire repertoire);

    void visite(Fichier fichier);
}
