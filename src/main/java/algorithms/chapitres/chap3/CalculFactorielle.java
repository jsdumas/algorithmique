package algorithms.chapitres.chap3;

import java.util.Scanner;

public class CalculFactorielle {

	public static long factorielle(int n) {
		long r�sultat;
		r�sultat = 1;
		for (int i = 2; i <= n; i++)
			r�sultat = r�sultat * i;
		return r�sultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		System.out.print("Entrez le nombre dont vous voulez la factorielle : ");
		n = reader.nextInt();
		System.out.println("La factorielle de " + n + " est : " + factorielle(n));
	}
}
