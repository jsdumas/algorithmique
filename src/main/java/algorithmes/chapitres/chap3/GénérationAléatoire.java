package algorithmes.chapitres.chap3;

import java.util.Scanner;

public class GénérationAléatoire {

	public static int généreNombreAléatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf, borneSup;
		int nombreAléatoire;
		System.out.print("Entrez la borne inférieure : ");
		borneInf = reader.nextInt();
		System.out.print("Entrez la borne supérieure : ");
		borneSup = reader.nextInt();
		nombreAléatoire = généreNombreAléatoire(borneInf, borneSup);
		System.out.println("Le nombre aléatoire généré est : " + nombreAléatoire);
	}
}
