package algorithmes.chapitres.chap7.expression;

import java.util.Scanner;

public class Expression2 {
	Scanner reader = new Scanner(System.in);
	String token;

	public int valeur() {
		int r�sultat;
		System.out.print("Entrez '(' ou un nombre entier : ");
		lireToken();
		if (token.equals("(")) {
			r�sultat = add();
			if (!token.equals(")"))
				System.out.println("parenth�se fermante attendue !!");
		} else
			r�sultat = Integer.parseInt(token);
		return r�sultat;
	}

	public void lireToken() {
		token = reader.next();
	}

	public int mult() {
		int opA, opB;
		String op�rateur;
		opA = valeur();
		System.out.print("Entrez op�rateur, '=' ou ')' : ");
		lireToken();
		op�rateur = token;
		while (op�rateur.equals("*") || op�rateur.equals("/")) {
			opB = valeur();
			if (op�rateur.equals("*"))
				opA = opA * opB;
			else
				opA = opA / opB;
			System.out.print("Entrez op�rateur, '=' ou ')' : ");
			lireToken();
			op�rateur = token;
		}
		return opA;
	}

	public int add() {
		int opA, opB;
		String op�rateur;
		opA = mult();
		op�rateur = token;
		while (op�rateur.equals("+") || op�rateur.equals("-")) {
			opB = mult();
			if (op�rateur.equals("+"))
				opA = opA + opB;
			else
				opA = opA - opB;
			op�rateur = token;
		}
		return opA;
	}

	public int �value() {
		return add();
	}
}
