package algorithmes.chapitres.chap5.complexe;

import java.util.Scanner;

public class TestComplexe {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double réel, imaginaire;
		System.out.print("Entrez la valeur réelle du nombre complexe : ");
		réel = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe nombreComplexe = new Complexe(réel, imaginaire);
		System.out.println("Le module du nombre complexe est : " + nombreComplexe.module());
		System.out.print("Entrez un nombre réel à ajouter au nombre complexe : ");
		nombreComplexe.ajouteRéel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : " + nombreComplexe);
		System.out.print("Entrez un nombre réel à multiplier au nombre complexe : ");
		nombreComplexe.multiplieRéel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : " + nombreComplexe);
	}
}
