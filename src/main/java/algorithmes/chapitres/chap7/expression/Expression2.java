package algorithmes.chapitres.chap7.expression;

import java.util.Scanner;

public class Expression2 {
	Scanner reader = new Scanner(System.in);
	String token;

	public int valeur() {
		int résultat;
		System.out.print("Entrez '(' ou un nombre entier : ");
		lireToken();
		if (token.equals("(")) {
			résultat = add();
			if (!token.equals(")"))
				System.out.println("parenthèse fermante attendue !!");
		} else
			résultat = Integer.parseInt(token);
		return résultat;
	}

	public void lireToken() {
		token = reader.next();
	}

	public int mult() {
		int opA, opB;
		String opérateur;
		opA = valeur();
		System.out.print("Entrez opérateur, '=' ou ')' : ");
		lireToken();
		opérateur = token;
		while (opérateur.equals("*") || opérateur.equals("/")) {
			opB = valeur();
			if (opérateur.equals("*"))
				opA = opA * opB;
			else
				opA = opA / opB;
			System.out.print("Entrez opérateur, '=' ou ')' : ");
			lireToken();
			opérateur = token;
		}
		return opA;
	}

	public int add() {
		int opA, opB;
		String opérateur;
		opA = mult();
		opérateur = token;
		while (opérateur.equals("+") || opérateur.equals("-")) {
			opB = mult();
			if (opérateur.equals("+"))
				opA = opA + opB;
			else
				opA = opA - opB;
			opérateur = token;
		}
		return opA;
	}

	public int évalue() {
		return add();
	}
}
