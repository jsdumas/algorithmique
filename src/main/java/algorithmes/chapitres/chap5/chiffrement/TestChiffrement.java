package chiffrement;

import java.util.Scanner;
public class TestChiffrement {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte � chiffrer : ");
		String texte = reader.nextLine();
		TexteChiffr� texteChiffr� = new TexteChiffr�(texte);
		System.out.println("Texte avant chiffrage : " + texteChiffr�.getTexte());
		texteChiffr�.chiffre();
		System.out.println("Texte apr�s un chiffrage : " + texteChiffr�.getTexte());
		texteChiffr�.chiffre();
		System.out.println("Texte apr�s deux chiffrages : " + texteChiffr�.getTexte());
	}
}
