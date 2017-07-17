package chapitre_1;

import java.util.Scanner;

public class MoyenneQuatre {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n1, n2, n3, n4;
		double moyenne;
		System.out.print("Entrez la valeur du premier nombre : ");
		n1 = reader.nextInt();
		System.out.print("Entrez la valeur du deuxième nombre : ");
		n2 = reader.nextInt();
		System.out.print("Entrez la valeur du troisième nombre : ");
		n3 = reader.nextInt();
		System.out.print("Entrez la valeur du quatrième nombre : ");
		n4 = reader.nextInt();
		// calcul de la moyenne
		moyenne = (n1 + n2 + n3 + n4) / 4.0;
		// affichage du résultat
		System.out.println("La moyenne vaut : " + moyenne);
	}
}
