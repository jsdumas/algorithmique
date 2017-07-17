package factoryMethod;

public class CourrierHtml extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuHtml();
    }

}
