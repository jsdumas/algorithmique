import java.util.Scanner;
public class RechercheValeurTableauDeuxDim {

	public static int[] rechercheValeurTableauDeuxDim(int valeur, int[][] tab) {
		int[] r�sultat = new int[2];
		int i, j;
		boolean trouv�;
		i = 0;
		j = 0; // valeur par d�faut pour le compilateur Java
		trouv� = false;
		while ((i < tab.length) && (!trouv�)) {
			j = 0;
			while ((j < tab[i].length) && (!trouv�)) {
				if (tab[i][j] == valeur)
					trouv� = true;
				else
					j++;
			}
			if (!trouv�)
				i++;
		}
		if (trouv�) {
			r�sultat[0] = i;
			r�sultat[1] = j;
		} else {
			r�sultat[0] = -1;
			r�sultat[1] = -1;
		}
		return r�sultat;
	}

	public static int g�n�reNombreAl�atoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAl�atoire(int t[], int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = g�n�reNombreAl�atoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille1 = 5;
		final int taille2 = 3;
		int valeur;
		int[] r�sultatRecherche;
		// d�claration et initialisation du tableau
		int[][] tableau = new int[taille1][taille2];
		for (int i = 0; i < taille1; i++)
			remplitTableauAl�atoire(tableau[i], 1, 10);
		for (int i = 0; i < taille1; i++) {
			for (int j = 0; j < taille2; j++)
				System.out.print(tableau[i][j] + " ");
			System.out.println();
		}
		System.out.print("Entrez la valeur � rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		r�sultatRecherche = rechercheValeurTableauDeuxDim(valeur, tableau);
		if (r�sultatRecherche[0] != -1)
			System.out.println("Valeur trouv�e aux indices : "
					+ r�sultatRecherche[0] + ", " + r�sultatRecherche[1]);
		else
			System.out.println("Valeur non trouv�e dans le tableau ");
	}
}
