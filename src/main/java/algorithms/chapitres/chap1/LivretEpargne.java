package algorithms.chapitres.chap1;

import java.util.Scanner;

public class LivretEpargne {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double montantInitial, intérêt, montantEpargné;
		int nombreAnnées, i;
		System.out.print("Entrez le montant initial : ");
		montantInitial = reader.nextDouble();
		System.out.print("Entrez le taux d'intérêt en pour cent : ");
		intérêt = reader.nextDouble();
		System.out.print("Entrez le nombre d'années : ");
		nombreAnnées = reader.nextInt();
		// calcul et affichage du montant épargné
		montantEpargné = montantInitial;
		for (i = 1; i <= nombreAnnées; i++) {
			montantEpargné = montantEpargné * (1.0 + intérêt / 100);
			System.out.println("Après la " + i + " année, le montant épargné est de : " + montantEpargné);
		}
	}
}
