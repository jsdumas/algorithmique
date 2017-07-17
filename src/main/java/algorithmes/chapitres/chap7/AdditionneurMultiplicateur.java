package algorithmes.chapitres.chap7;

import java.util.Scanner;

public class AdditionneurMultiplicateur {
	static Scanner reader = new Scanner(System.in);
	static String opérateur;

	public static int addMult(int dernValeur) {
		System.out.print("Entrez un nombre ou '*' ou '+' : ");
		String ligne = reader.next();
		if ((ligne.equals("*")) || (ligne.equals("+"))) {
			opérateur = ligne;
			return dernValeur;
		}
		int résultat = addMult(Integer.parseInt(ligne));
		if (opérateur.equals("*"))
			return résultat * dernValeur;
		else
			return résultat + dernValeur;
	}

	public static void main(String[] args) {
		System.out.print("Entrez un premier nombre : ");
		int nombre = reader.nextInt();
		System.out.println("Total : " + addMult(nombre));
	}
}
