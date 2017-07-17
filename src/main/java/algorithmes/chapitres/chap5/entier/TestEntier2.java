package algorithmes.chapitres.chap5.entier;

import java.util.Scanner;

public class TestEntier2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		String chaîne = reader.nextLine();
		Entier nombreEntier = new Entier(0);
		nombreEntier.depuisChaîne(chaîne);
		System.out.println(nombreEntier.versChaîne());
	}
}
