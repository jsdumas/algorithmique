package algorithms.chapitres.chap1;

import java.util.Scanner;

public class ImpôtBénéfice3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long bénéfice;
		double impôt;
		System.out.print("Entrez le montant du bénéfice : ");
		bénéfice = reader.nextLong();
		impôt = 0.2 * Math.min(10000, bénéfice);
		impôt += 0.26 * Math.min(5000, Math.max(0, bénéfice - 10000));
		impôt += 0.22 * Math.max(0, bénéfice - 15000);
		System.out.println("Le montant de l'impôt est : " + impôt);
	}
}
