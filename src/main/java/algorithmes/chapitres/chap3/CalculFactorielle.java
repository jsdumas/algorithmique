package chapitre_3;

import java.util.Scanner;

public class CalculFactorielle {

	public static long factorielle(int n) {
		long résultat;
		résultat = 1;
		for (int i = 2; i <= n; i++)
			résultat = résultat * i;
		return résultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		System.out.print("Entrez le nombre dont vous voulez la factorielle : ");
		n = reader.nextInt();
		System.out.println("La factorielle de " + n + " est : " + factorielle(n));
	}
}
