package algorithmes.chapitres.chap6.portes;

import java.util.Scanner;

public class TestPortes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Porte porte = null;
		System.out.println("Quel type de porte désirez-vous utiliser ?");
		System.out.print("1. porte ET 2. porte OU 3. porte OU Exclusif ");
		int réponse = reader.nextInt();
		switch (réponse) {
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
		System.out.print("Entrez la valeur de la première entrée : ");
		int entrée = reader.nextInt();
		porte.setEntrée1(entrée != 0);
		System.out.print("Entrez la valeur de la seconde entrée : ");
		entrée = reader.nextInt();
		porte.setEntrée2(entrée != 0);
		if (porte.getSortie())
			System.out.println("la sortie vaut 1");
		else
			System.out.println("la sortie vaut 0");
	}
}
