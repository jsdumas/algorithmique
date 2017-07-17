package complexe2;

import java.util.Scanner;
public class TestComplexe2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double r�el, imaginaire;
		System.out.print("Entrez la valeur r�elle du nombre complexe : ");
		r�el = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe = new Complexe2(r�el, imaginaire);
		System.out.println("Le module du nombre complexe est : "+nombreComplexe.module());
		
		System.out.print("Entrez un r�el � ajouter au nombre complexe en cours : ");
		nombreComplexe.ajouteR�el(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
		
		System.out.print("Entrez un r�el � multiplier au nombre complexe en cours : ");
		nombreComplexe.multiplieR�el(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
		
		System.out.print("Entrez la partie r�elle d'un complexe � ajouter : ");
		r�el = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe � ajouter : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe2 = new Complexe2(r�el, imaginaire);
		nombreComplexe.ajouteComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
		
		System.out.print("Entrez la partie r�elle d'un complexe � multiplier : ");
		r�el = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe � multiplier : ");
		imaginaire = reader.nextDouble();
		nombreComplexe2 = new Complexe2(r�el, imaginaire);
		nombreComplexe.multiplieComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie r�elle : "+nombreComplexe.getR�el()+" partie imaginaire : "+nombreComplexe.getImaginaire());
	}
}
