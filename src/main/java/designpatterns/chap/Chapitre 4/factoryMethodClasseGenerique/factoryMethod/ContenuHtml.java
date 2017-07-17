package factoryMethod;

public class ContenuHtml implements Contenu {

    protected String codeHtml;

    @Override
    public void encode(String texte) {
        codeHtml = "<HTML>" + texte + "</HTML>";
    }

    @Override
    public void affiche() {
        System.out.println(codeHtml);
    }
    
}
