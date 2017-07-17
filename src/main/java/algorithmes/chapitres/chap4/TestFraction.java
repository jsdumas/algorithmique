package algorithmes.chapitres.chap4;

import java.util.Scanner;

public class TestFraction {

	public static void main(String[] args) {
		int a, b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Premi�re fraction :");
		System.out.println("Entrez le num�rateur puis le d�nominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac1 = new Fraction(a, b);
		System.out.println("La valeur r�elle de la premi�re fraction est : " + frac1.r�el());
		System.out.println("Seconde fraction :");
		System.out.println("Entrez le num�rateur puis le d�nominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac2 = new Fraction(a, b);
		Fraction frac3 = frac1.addition(frac2);
		System.out.println("Le r�sultat de l'addition des deux fractions est : ");
		System.out.println("Num�rateur : " + frac3.num�rateur);
		System.out.println("D�nominateur : " + frac3.d�nominateur);
	}
}
