package algorithms.chapitres.chap6.portes;

import java.util.Scanner;

public class TestPortes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Porte porte = null;
		System.out.println("Quel type de porte d�sirez-vous utiliser ?");
		System.out.print("1. porte ET 2. porte OU 3. porte OU Exclusif ");
		int r�ponse = reader.nextInt();
		switch (r�ponse) {
			case 1:
				porte = new PorteET();
				break;
			case 2:
				porte = new PorteOU();
				break;
			case 3:
				porte = new PorteOUExclusif();
				break;
		}
		System.out.print("Entrez la valeur de la premi�re entr�e : ");
		int entr�e = reader.nextInt();
		porte.setEntr�e1(entr�e != 0);
		System.out.print("Entrez la valeur de la seconde entr�e : ");
		entr�e = reader.nextInt();
		porte.setEntr�e2(entr�e != 0);
		if (porte.getSortie())
			System.out.println("la sortie vaut 1");
		else
			System.out.println("la sortie vaut 0");
	}
}
