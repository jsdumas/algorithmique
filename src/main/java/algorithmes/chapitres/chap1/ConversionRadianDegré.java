package chapitre_1;
import java.util.Scanner;
public class ConversionRadianDegré {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en radians : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en degrés est : "+angle/Math.PI*180);
	}
}
