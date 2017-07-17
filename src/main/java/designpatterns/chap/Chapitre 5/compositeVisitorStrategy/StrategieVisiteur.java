package compositeVisitorStrategy;

public interface StrategieVisiteur<T> {
    T getResultat();

    void gere(Fichier fichier);

    void gere(Repertoire repertoire);
}
