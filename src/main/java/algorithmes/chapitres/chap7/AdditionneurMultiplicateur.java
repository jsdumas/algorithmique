package algorithmes.chapitres.chap7;

import java.util.Scanner;

public class AdditionneurMultiplicateur {
	static Scanner reader = new Scanner(System.in);
	static String op�rateur;

	public static int addMult(int dernValeur) {
		System.out.print("Entrez un nombre ou '*' ou '+' : ");
		String ligne = reader.next();
		if ((ligne.equals("*")) || (ligne.equals("+"))) {
			op�rateur = ligne;
			return dernValeur;
		}
		int r�sultat = addMult(Integer.parseInt(ligne));
		if (op�rateur.equals("*"))
			return r�sultat * dernValeur;
		else
			return r�sultat + dernValeur;
	}

	public static void main(String[] args) {
		System.out.print("Entrez un premier nombre : ");
		int nombre = reader.nextInt();
		System.out.println("Total : " + addMult(nombre));
	}
}
