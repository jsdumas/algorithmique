package algorithmes.chapitres.chap2;

import java.util.Scanner;

public class Variance {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 20;
		int i;
		int somme;
		double moyenne;
		// déclaration pour le calcul de la variance et de l'écart type
		int sommeDifférencesCarré;
		double variance, écartType;
		// déclaration du tableau
		int[] tableau;
		// création du tableau
		tableau = new int[taille];
		// lecture du tableau
		for (i = 0; i < taille; i++) {
			System.out.print("Entrez la " + (i + 1) + "e valeur du tableau : ");
			tableau[i] = reader.nextInt();
		}
		// calcul et affichage de la moyenne
		somme = 0;
		for (i = 0; i < taille; i++)
			somme += tableau[i];
		moyenne = (double) somme / taille;
		System.out.println("La moyenne vaut : " + moyenne);
		// calcul et affichage de la variance et de l'écart type
		sommeDifférencesCarré = 0;
		for (i = 0; i < taille; i++)
			sommeDifférencesCarré += (tableau[i] - moyenne) * (tableau[i] - moyenne);
		variance = (double) sommeDifférencesCarré / taille;
		écartType = Math.sqrt(variance);
		System.out.println("La variance vaut : " + variance);
		System.out.println("L'écart type vaut : " + écartType);
	}
}
