package algorithms.chapitres.chap3;

import java.util.Scanner;

public class CalculDivisionEuclidienne {

	public static int[] divisionEuclidienne(int dividende, int diviseur) {
		int[] r�sultat = new int[2];
		r�sultat[0] = dividende / diviseur;
		r�sultat[1] = dividende % diviseur;
		return r�sultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dividende, diviseur;
		int[] r�sultat;
		// lecture du dividende et du diviseur
		System.out.print("Entrez le dividende : ");
		dividende = reader.nextInt();
		System.out.print("Entrez le diviseur : ");
		diviseur = reader.nextInt();
		// calcul de la division
		r�sultat = divisionEuclidienne(dividende, diviseur);
		// affichage du r�sultat
		System.out.println(" le quotient de la division de " + dividende + " par " + diviseur + " est " + r�sultat[0]);
		System.out.println(" le reste de la division de " + dividende + " par " + diviseur + " est " + r�sultat[1]);
	}
}
