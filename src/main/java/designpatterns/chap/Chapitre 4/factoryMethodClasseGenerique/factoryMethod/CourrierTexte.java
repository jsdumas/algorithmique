package factoryMethod;

public class CourrierTexte extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuTexte();
    }

}