package algorithmes.chapitres.chap4;

import java.util.Scanner;

public class TestComplexe2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double réel, imaginaire;
		System.out.print("Entrez la valeur réelle du nombre complexe : ");
		réel = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe = new Complexe2(réel, imaginaire);
		System.out.println("Le module du nombre complexe est : " + nombreComplexe.module());

		System.out.print("Entrez un réel à ajouter au nombre complexe en cours : ");
		nombreComplexe.ajouteRéel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie réelle : " + nombreComplexe.getRéel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez un réel à multiplier au nombre complexe en cours : ");
		nombreComplexe.multiplieRéel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie réelle : " + nombreComplexe.getRéel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez la partie réelle d'un complexe à ajouter : ");
		réel = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe à ajouter : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe2 = new Complexe2(réel, imaginaire);
		nombreComplexe.ajouteComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie réelle : " + nombreComplexe.getRéel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez la partie réelle d'un complexe à multiplier : ");
		réel = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe à multiplier : ");
		imaginaire = reader.nextDouble();
		nombreComplexe2 = new Complexe2(réel, imaginaire);
		nombreComplexe.multiplieComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie réelle : " + nombreComplexe.getRéel() + " partie imaginaire : " + nombreComplexe.getImaginaire());
	}
}
