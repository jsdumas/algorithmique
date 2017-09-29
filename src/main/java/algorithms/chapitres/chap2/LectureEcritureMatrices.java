package algorithms.chapitres.chap2;

import java.util.Scanner;

public class LectureEcritureMatrices {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 3;
		// déclaration et création de la matrice
		int[][] matrice = new int[taille][taille];
		// lecture de la matrice
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++) {
				System.out.print("Entrez matrice[" + i + "][" + j + "] : ");
				matrice[i][j] = reader.nextInt();
			}
		// écriture de la matrice
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
	}
}
