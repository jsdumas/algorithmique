package algorithms.chapitres.chap1;

import java.util.Scanner;

public class ImpôtBénéfice {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long bénéfice;
		double impôt;
		System.out.print("Entrez le montant du bénéfice : ");
		bénéfice = reader.nextLong();
		if (bénéfice <= 10000)
			impôt = 0.2 * bénéfice;
		else if (bénéfice < 15000)
			impôt = 0.2 * 10000 + 0.26 * (bénéfice - 10000);
		else
			impôt = 0.2 * 10000 + 0.26 * 5000 + 0.22 * (bénéfice - 15000);
		System.out.println("Le montant de l'impôt est : " + impôt);
	}
}
