package algorithms.chapitres.chap3;

import java.util.Scanner;

public class CalculDivisionEuclidienne {

	public static int[] divisionEuclidienne(int dividende, int diviseur) {
		int[] résultat = new int[2];
		résultat[0] = dividende / diviseur;
		résultat[1] = dividende % diviseur;
		return résultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dividende, diviseur;
		int[] résultat;
		// lecture du dividende et du diviseur
		System.out.print("Entrez le dividende : ");
		dividende = reader.nextInt();
		System.out.print("Entrez le diviseur : ");
		diviseur = reader.nextInt();
		// calcul de la division
		résultat = divisionEuclidienne(dividende, diviseur);
		// affichage du résultat
		System.out.println(" le quotient de la division de " + dividende + " par " + diviseur + " est " + résultat[0]);
		System.out.println(" le reste de la division de " + dividende + " par " + diviseur + " est " + résultat[1]);
	}
}
