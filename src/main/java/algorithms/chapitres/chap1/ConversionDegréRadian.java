package algorithms.chapitres.chap1;

import java.util.Scanner;

public class ConversionDegréRadian {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en degrés : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en radians est : " + angle / 180 * Math.PI);
	}
}
