package algorithmes.chapitres.chap1;

import java.util.Scanner;

public class AnnéeBissextile2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez l'année : ");
		int année;
		année = reader.nextInt();
		if ((année % 400 == 0) || (année % 100 != 0) && (année % 4 == 0))
			System.out.println("l'année est bissextile");
		else
			System.out.println("l'année n'est pas bissextile");
	}
}
