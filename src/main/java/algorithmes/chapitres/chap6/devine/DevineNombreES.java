package algorithmes.chapitres.chap6.devine;

import java.util.Scanner;

public class DevineNombreES {
	Scanner reader = new Scanner(System.in);

	public int propose(int tentative) {
		System.out.println("je propose " + tentative);
		System.out.println("Répondez -1 si le nombre proposé est trop petit");
		System.out.print("1 s'il est trop grand, 0 pour gagné : ");
		int réponse = reader.nextInt();
		return réponse;
	}
}
