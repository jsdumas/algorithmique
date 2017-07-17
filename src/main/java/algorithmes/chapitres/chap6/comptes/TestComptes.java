package comptes;

import java.util.Scanner;
public class TestComptes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Compte monCompte;
		System.out.print("D�sirez-vous un compte avec d�couvert (O/N) ");
		String choix = reader.next();
		if (choix.equals("O") || choix.equals("o")) {
			System.out.print("Saisissez la valeur du d�couvert autoris� : ");
			long d�couvertAutoris� = reader.nextLong();
			CompteAvecD�couvert monCompteAvecD�couvert = new CompteAvecD�couvert();
			monCompteAvecD�couvert.setD�couvertAutoris�(d�couvertAutoris�);
			monCompte = monCompteAvecD�couvert;
		} else {
			monCompte = new CompteClassique();
		}
		System.out.print("Saisissez la valeur du d�p�t : ");
		long montant = reader.nextLong();
		monCompte.ajoute(montant);
		System.out.print("Saisissez la valeur du retrait : ");
		montant = reader.nextLong();
		if (monCompte.retire(montant))
			System.out.println("Retrait autoris�");
		else
			System.out.println("Retrait non autoris�");
		System.out
				.println("Nouvelle valeur du solde : " + monCompte.getSolde());
	}
}
