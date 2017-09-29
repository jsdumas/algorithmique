package algorithms.chapitres.chap5.chiffrement;

import java.util.Scanner;

public class TestChiffrement {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte à chiffrer : ");
		String texte = reader.nextLine();
		TexteChiffré texteChiffré = new TexteChiffré(texte);
		System.out.println("Texte avant chiffrage : " + texteChiffré.getTexte());
		texteChiffré.chiffre();
		System.out.println("Texte après un chiffrage : " + texteChiffré.getTexte());
		texteChiffré.chiffre();
		System.out.println("Texte après deux chiffrages : " + texteChiffré.getTexte());
	}
}
