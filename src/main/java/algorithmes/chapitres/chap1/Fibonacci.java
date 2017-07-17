package algorithmes.chapitres.chap1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		long somme, terme, termePrécédent;
		int n, i;
		Scanner reader = new Scanner(System.in);
		do {
			System.out.println("Entrez la valeur de n (minimum 1) :");
			n = reader.nextInt();
		} while (n < 1);
		switch (n) {
			case 1:
			case 2: {
				System.out.println("Le résultat vaut 1");
				break;
			}
			default: {
				termePrécédent = 1;
				terme = 1;
				for (i = 3; i <= n; i++) {
					somme = terme + termePrécédent;
					termePrécédent = terme;
					terme = somme;
				}
				System.out.println("Le résultat de la suite de Fibonacci pour" + n + " vaut : " + terme);
			}
		}
	}
}
