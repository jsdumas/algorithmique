package algorithmes.chapitres.chap3;

import java.util.Scanner;

public class ConversionRadianDegr�Test {

	public static double radianVersDegr�(double angle) {
		return angle / Math.PI * 180;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en radians : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en degr�s est : " + radianVersDegr�(angle));
	}
}
