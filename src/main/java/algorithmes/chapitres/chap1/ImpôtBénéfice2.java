package algorithmes.chapitres.chap1;

import java.util.Scanner;

public class ImpôtBénéfice2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long bénéfice;
		double impôt;
		System.out.print("Entrez le montant du bénéfice : ");
		bénéfice = reader.nextLong();
		if (bénéfice <= 10000)
			impôt = 0.2 * bénéfice;
		else if (bénéfice < 15000)
			impôt = 2000 + 0.26 * (bénéfice - 10000);
		else
			impôt = 0.22 * bénéfice;
		System.out.println("Le montant de l'impôt est : " + impôt);
	}
}
