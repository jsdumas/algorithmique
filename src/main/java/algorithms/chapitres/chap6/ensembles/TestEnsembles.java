package algorithms.chapitres.chap6.ensembles;

import java.util.Scanner;

public class TestEnsembles {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int valeur;
		InterfaceEnsemble ensemble;
		System.out.print("Désirez-vous utiliser un ensemble normal(N) ou trié (T)");
		String réponse = reader.next();
		if (réponse.equals("T") || réponse.equals("t"))
			ensemble = new EnsembleTrié(10);
		else
			ensemble = new Ensemble(10);

		do {
			System.out.print("Entrez une valeur : ");
			valeur = reader.nextInt();
		} while (ensemble.insére(valeur));
		System.out.print("Entrez la valeur à supprimer : ");
		valeur = reader.nextInt();
		if (ensemble.supprime(valeur))
			System.out.println("La valeur faisait bien partie de l'ensemble.");
		else
			System.out.println("La valeur ne fait pas partie de l'ensemble.");
		System.out.println("Affichage de l'ensemble");
		ensemble.affiche();
	}
}
