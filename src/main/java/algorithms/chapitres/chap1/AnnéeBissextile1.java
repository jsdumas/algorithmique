package algorithms.chapitres.chap1;

import java.util.Scanner;

public class Ann�eBissextile1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez l'ann�e : ");
		int ann�e;
		ann�e = reader.nextInt();
		if (ann�e % 400 == 0)
			System.out.println("l'ann�e est bissextile");
		else if (ann�e % 100 == 0)
			System.out.println("l'ann�e n'est pas bissextile");
		else if (ann�e % 4 == 0)
			System.out.println("l'ann�e est bissextile");
		else
			System.out.println("l'ann�e n'est pas bissextile");
	}
}
