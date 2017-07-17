package voter;

public interface Electeur {
    boolean metsAJour(String attributModifie,
            Object nouvelleValeur);
}
