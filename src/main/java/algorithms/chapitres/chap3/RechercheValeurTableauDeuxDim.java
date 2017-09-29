package algorithms.chapitres.chap3;

import java.util.Scanner;

public class RechercheValeurTableauDeuxDim {

	public static int[] rechercheValeurTableauDeuxDim(int valeur, int[][] tab) {
		int[] résultat = new int[2];
		int i, j;
		boolean trouvé;
		i = 0;
		j = 0; // valeur par défaut pour le compilateur Java
		trouvé = false;
		while ((i < tab.length) && (!trouvé)) {
			j = 0;
			while ((j < tab[i].length) && (!trouvé)) {
				if (tab[i][j] == valeur)
					trouvé = true;
				else
					j++;
			}
			if (!trouvé)
				i++;
		}
		if (trouvé) {
			résultat[0] = i;
			résultat[1] = j;
		} else {
			résultat[0] = -1;
			résultat[1] = -1;
		}
		return résultat;
	}

	public static int généreNombreAléatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAléatoire(int t[], int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = généreNombreAléatoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille1 = 5;
		final int taille2 = 3;
		int valeur;
		int[] résultatRecherche;
		// déclaration et initialisation du tableau
		int[][] tableau = new int[taille1][taille2];
		for (int i = 0; i < taille1; i++)
			remplitTableauAléatoire(tableau[i], 1, 10);
		for (int i = 0; i < taille1; i++) {
			for (int j = 0; j < taille2; j++)
				System.out.print(tableau[i][j] + " ");
			System.out.println();
		}
		System.out.print("Entrez la valeur à rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		résultatRecherche = rechercheValeurTableauDeuxDim(valeur, tableau);
		if (résultatRecherche[0] != -1)
			System.out.println("Valeur trouvée aux indices : " + résultatRecherche[0] + ", " + résultatRecherche[1]);
		else
			System.out.println("Valeur non trouvée dans le tableau ");
	}
}
