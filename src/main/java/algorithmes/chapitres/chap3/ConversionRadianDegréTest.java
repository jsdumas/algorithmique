import java.util.Scanner;
public class ConversionRadianDegréTest {

	public static double radianVersDegré(double angle) {
		return angle/Math.PI*180;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en radians : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en degrés est : "+radianVersDegré(angle));
	}
}
