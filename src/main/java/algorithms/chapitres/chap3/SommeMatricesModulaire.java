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

	public static int[][] ajouteMatriceCarr�e(int[][] matrice1, int[][] matrice2, int taille) {
		int[][] r�sultat = new int[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++)
				r�sultat[i][j] = matrice1[i][j] + matrice2[i][j];
		}
		return r�sultat;
	}

	public static void �crireMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++)
			for (int j = 0; j < matrice[i].length; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
	}

	public static void main(String[] args) {
		final int taille = 3;
		// d�claration et cr�ation des matrices
		int matrice1[][] = new int[taille][taille];
		int matrice2[][] = new int[taille][taille];
		// lecture des matrices
		System.out.println("Saisie de la premi�re matrice");
		lireMatrice(matrice1);
		System.out.println("Saisie de la deuxi�me matrice");
		lireMatrice(matrice2);
		// addition des deux matrices
		int[][] matrice3 = ajouteMatriceCarr�e(matrice1, matrice2, taille);
		// �criture de la matrice r�sultat
		System.out.println("Affichage du r�sultat");
		�crireMatrice(matrice3);
	}
}
