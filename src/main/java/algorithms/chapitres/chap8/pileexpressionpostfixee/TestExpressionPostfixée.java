package algorithms.chapitres.chap8.pileexpressionpostfixee;

import java.util.Scanner;

public class TestExpressionPostfixée {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String entrée;
		ExpressionPostfixée expression = new ExpressionPostfixée();
		System.out.print("Entrez une première valeur : ");
		entrée = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entrée));
		System.out.print("Entrez une deuxième valeur : ");
		entrée = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entrée));
		do {
			System.out.print("Entrez une valeur ou un opérateur ou rien pour terminer : ");
			entrée = reader.nextLine();
			if (entrée.equals("+"))
				expression.add();
			else if (entrée.equals("*"))
				expression.mult();
			else if (entrée.length() > 0)
				if (!expression.empileValeur(Integer.parseInt(entrée)))
					System.out.println("Dépassement de capacité !");
		} while (entrée.length() > 0);
		System.out.println("Résultat : " + expression.résultat());
	}
}
