import java.util.Scanner;
public class TestComplexe {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double r�el, imaginaire;
		System.out.print("Entrez la valeur r�elle du nombre complexe : ");
		r�el = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe nombreComplexe = new Complexe(r�el, imaginaire);
		System.out.println("Le module du nombre complexe est : "+nombreComplexe.module());
		System.out.print("Entrez un nombre r�el � ajouter au nombre complexe : ");
		nombreComplexe.ajouteR�el(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
		System.out.print("Entrez un nombre r�el � multiplier au nombre complexe : ");
		nombreComplexe.multiplieR�el(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
	}
}
