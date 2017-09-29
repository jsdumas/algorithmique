package algorithms.chapitres.chap4;

import java.util.Scanner;

public class TestFraction {

	public static void main(String[] args) {
		int a, b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Première fraction :");
		System.out.println("Entrez le numérateur puis le dénominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac1 = new Fraction(a, b);
		System.out.println("La valeur réelle de la première fraction est : " + frac1.réel());
		System.out.println("Seconde fraction :");
		System.out.println("Entrez le numérateur puis le dénominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac2 = new Fraction(a, b);
		Fraction frac3 = frac1.addition(frac2);
		System.out.println("Le résultat de l'addition des deux fractions est : ");
		System.out.println("Numérateur : " + frac3.numérateur);
		System.out.println("Dénominateur : " + frac3.dénominateur);
	}
}
