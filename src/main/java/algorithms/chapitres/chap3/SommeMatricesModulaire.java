package algorithms.chapitres.chap3;

import java.util.Scanner;

public class SommeMatricesModulaire {
	static Scanner reader = new Scanner(System.in);

	public static void lireMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++)
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print("Entrez matrice[" + i + "][" + j + "] : ");
				matrice[i][j] = reader.nextInt();
			}
	}

	public static int[][] ajouteMatriceCarrée(int[][] matrice1, int[][] matrice2, int taille) {
		int[][] résultat = new int[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++)
				résultat[i][j] = matrice1[i][j] + matrice2[i][j];
		}
		return résultat;
	}

	public static void écrireMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++)
			for (int j = 0; j < matrice[i].length; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
	}

	public static void main(String[] args) {
		final int taille = 3;
		// déclaration et création des matrices
		int matrice1[][] = new int[taille][taille];
		int matrice2[][] = new int[taille][taille];
		// lecture des matrices
		System.out.println("Saisie de la première matrice");
		lireMatrice(matrice1);
		System.out.println("Saisie de la deuxième matrice");
		lireMatrice(matrice2);
		// addition des deux matrices
		int[][] matrice3 = ajouteMatriceCarrée(matrice1, matrice2, taille);
		// écriture de la matrice résultat
		System.out.println("Affichage du résultat");
		écrireMatrice(matrice3);
	}
}
