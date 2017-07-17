public class AffichageAllemand implements Affichage {

    public void affiche(Facture facture) {
        System.out.println("Der Rechnungsbetrag ist: € "
                + facture.getMontant());
    }
}
