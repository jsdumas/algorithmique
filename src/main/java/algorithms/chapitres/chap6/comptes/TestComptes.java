package algorithms.chapitres.chap6.comptes;

import java.util.Scanner;

public class TestComptes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Compte monCompte;
		System.out.print("Désirez-vous un compte avec découvert (O/N) ");
		String choix = reader.next();
		if (choix.equals("O") || choix.equals("o")) {
			System.out.print("Saisissez la valeur du découvert autorisé : ");
			long découvertAutorisé = reader.nextLong();
			CompteAvecDécouvert monCompteAvecDécouvert = new CompteAvecDécouvert();
			monCompteAvecDécouvert.setDécouvertAutorisé(découvertAutorisé);
			monCompte = monCompteAvecDécouvert;
		} else {
			monCompte = new CompteClassique();
		}
		System.out.print("Saisissez la valeur du dépôt : ");
		long montant = reader.nextLong();
		monCompte.ajoute(montant);
		System.out.print("Saisissez la valeur du retrait : ");
		montant = reader.nextLong();
		if (monCompte.retire(montant))
			System.out.println("Retrait autorisé");
		else
			System.out.println("Retrait non autorisé");
		System.out.println("Nouvelle valeur du solde : " + monCompte.getSolde());
	}
}
