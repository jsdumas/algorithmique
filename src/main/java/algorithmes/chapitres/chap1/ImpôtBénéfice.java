package chapitre_1;

import java.util.Scanner;

public class Imp�tB�n�fice {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long b�n�fice;
		double imp�t;
		System.out.print("Entrez le montant du b�n�fice : ");
		b�n�fice = reader.nextLong();
		if (b�n�fice <= 10000)
			imp�t = 0.2 * b�n�fice;
		else if (b�n�fice < 15000)
			imp�t = 0.2 * 10000 + 0.26 * (b�n�fice - 10000);
		else
			imp�t = 0.2 * 10000 + 0.26 * 5000 + 0.22 * (b�n�fice - 15000);
		System.out.println("Le montant de l'imp�t est : " + imp�t);
	}
}
