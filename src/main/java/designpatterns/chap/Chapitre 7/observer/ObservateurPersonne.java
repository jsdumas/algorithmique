package observer;

public class ObservateurPersonne implements Observateur {

    @Override
    public void metsAJour(String attributModifie,
            Object nouvelleValeur) {
        System.out.println(attributModifie + ": "
                + nouvelleValeur);
    }

}
