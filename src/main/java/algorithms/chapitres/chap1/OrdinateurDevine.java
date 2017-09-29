package algorithms.chapitres.chap1;

import java.util.Scanner;

public class OrdinateurDevine {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf = 0;
		int borneSup = 100;
		int milieu;
		int r�ponse, nbrTentatives;

		nbrTentatives = 0;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 4 * 2;
			System.out.println("je propose " + milieu);
			System.out.println("R�pondez -1 si le nombre propos� est trop petit");
			System.out.print("1 s'il est trop grand, 0 pour gagn� : ");
			r�ponse = reader.nextInt();
			if (r�ponse == 1)
				borneSup = milieu - 2;
			else if (r�ponse == -1)
				borneInf = milieu + 2;
		} while (r�ponse != 0);
		System.out.println("gagn� en " + nbrTentatives + " coups");
	}
}
