package algorithms.chapitres.chap1;

import java.util.Scanner;

public class Imp�tB�n�fice3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long b�n�fice;
		double imp�t;
		System.out.print("Entrez le montant du b�n�fice : ");
		b�n�fice = reader.nextLong();
		imp�t = 0.2 * Math.min(10000, b�n�fice);
		imp�t += 0.26 * Math.min(5000, Math.max(0, b�n�fice - 10000));
		imp�t += 0.22 * Math.max(0, b�n�fice - 15000);
		System.out.println("Le montant de l'imp�t est : " + imp�t);
	}
}
