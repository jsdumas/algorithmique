package pileExpressionPostfix�e;

import java.util.Scanner;
public class TestPile {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taillePile = 10;
		String valeur;
		Pile pile = new Pile(taillePile);
		do {
			System.out.print("Entrez une cha�ne ou rien pour terminer : ");
			valeur = reader.nextLine();
		} while ((valeur.length() > 0) && (pile.empile(valeur)));
		while ((valeur = pile.d�pile()) != null)
			System.out.println("Cha�ne d�pil�e : "+valeur);
	}
}
