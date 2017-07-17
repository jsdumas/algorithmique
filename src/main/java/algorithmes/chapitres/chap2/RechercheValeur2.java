package chapitre_22;
import java.util.Scanner;
public class RechercheValeur2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 10;
		int i,valeur;
		// déclaration et création du tableau
		int[] tableau = new int[taille];
		// remplissage du tableau
		for (i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 10) + 1;
		// impression du tableau
		for (i = 0; i < taille; i++)
			System.out.println(" valeur du tableau à l'indice : "+i+" "+tableau[i]);
		
		System.out.print("Entrez la valeur à rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		i=0;
		while ((i<taille)&&(tableau[i]!=valeur))
			i++;
		if (i<taille)
			System.out.println("Valeur trouvée à l'indice : "+i);
		else
			System.out.println("Valeur non trouvée dans le tableau ");
	}
}
