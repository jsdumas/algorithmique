package algorithms.chapitres.chap8.pileexpressionpostfixee;

import java.util.Scanner;

public class TestExpressionPostfix�e {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String entr�e;
		ExpressionPostfix�e expression = new ExpressionPostfix�e();
		System.out.print("Entrez une premi�re valeur : ");
		entr�e = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entr�e));
		System.out.print("Entrez une deuxi�me valeur : ");
		entr�e = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entr�e));
		do {
			System.out.print("Entrez une valeur ou un op�rateur ou rien pour terminer : ");
			entr�e = reader.nextLine();
			if (entr�e.equals("+"))
				expression.add();
			else if (entr�e.equals("*"))
				expression.mult();
			else if (entr�e.length() > 0)
				if (!expression.empileValeur(Integer.parseInt(entr�e)))
					System.out.println("D�passement de capacit� !");
		} while (entr�e.length() > 0);
		System.out.println("R�sultat : " + expression.r�sultat());
	}
}
