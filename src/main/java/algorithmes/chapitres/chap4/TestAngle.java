import java.util.Scanner;

public class TestAngle {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Angle angle = new Angle();
		System.out.print("Voulez-vous introduire l'angle en ");
		System.out.print(" 1. degrés 2. radians 3. grades : ");
		int choix = reader.nextInt();
		System.out.print("Entrez la valeur de l'angle dans l'unité choisie : ");
		double valeur = reader.nextDouble();
		switch (choix) {
		case 1: {
			angle.setValeurDegrés(valeur);
			break;
		}
		case 2: {
			angle.setValeurRadians(valeur);
			break;
		}
		case 3: {
			angle.setValeurGrades(valeur);
			break;
		}
		}
		System.out.println("La valeur de l'angle en degrés est : "
				+ angle.getValeurDegrés());
		System.out.println("La valeur de l'angle en radians est : "
				+ angle.getValeurRadians());
		System.out.println("La valeur de l'angle en grades est : "
				+ angle.getValeurGrades());
	}
}
