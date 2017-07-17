package chapitre_1;

import java.util.Scanner;

public class OrdinateurDevine {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf = 0;
		int borneSup = 100;
		int milieu;
		int réponse, nbrTentatives;

		nbrTentatives = 0;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 4 * 2;
			System.out.println("je propose " + milieu);
			System.out.println("Répondez -1 si le nombre proposé est trop petit");
			System.out.print("1 s'il est trop grand, 0 pour gagné : ");
			réponse = reader.nextInt();
			if (réponse == 1)
				borneSup = milieu - 2;
			else if (réponse == -1)
				borneInf = milieu + 2;
		} while (réponse != 0);
		System.out.println("gagné en " + nbrTentatives + " coups");
	}
}
