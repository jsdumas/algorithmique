package algorithms.chapitres.chap3;

import java.util.Scanner;

public class ConversionDegr�RadianTest {

	public static double degr�VersRadian(double angle) {
		return angle / 180 * Math.PI;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en degr�s : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en radians est : " + degr�VersRadian(angle));
	}
}
