package entier;

import java.util.Scanner;
public class TestEntier2{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		String cha�ne = reader.nextLine();
		Entier nombreEntier = new Entier(0);
		nombreEntier.depuisCha�ne(cha�ne);
		System.out.println(nombreEntier.versCha�ne());
	}
}
