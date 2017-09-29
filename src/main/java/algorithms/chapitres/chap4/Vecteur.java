package algorithms.chapitres.chap4;

import java.util.Scanner;

public class Vecteur {
	int[] tab;
	Scanner reader = new Scanner(System.in);

	public Vecteur(int taille) {
		tab = new int[taille];
	}

	public int get�l�ment(int indice) {
		return tab[indice];
	}

	public void set�l�ment(int indice, int valeur) {
		tab[indice] = valeur;
	}

	public void lis() {
		for (int i = 0; i < tab.length; i++)
			tab[i] = reader.nextInt();
	}

	public void affiche() {
		for (int i = 0; i < tab.length; i++)
			System.out.print(tab[i] + " ");
		System.out.println();
	}

	public void remplisAl�atoirement(int min, int max) {
		for (int i = 0; i < tab.length; i++)
			tab[i] = (int) (Math.random() * (max - min + 1)) + min;
	}
}
