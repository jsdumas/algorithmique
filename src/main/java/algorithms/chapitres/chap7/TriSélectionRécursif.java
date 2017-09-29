package algorithms.chapitres.chap7;

public class TriS�lectionR�cursif {

	public static void triS�lection(int[] tableau, int position) {
		if (position >= tableau.length)
			return; // le tableau est tri�
		int indiceValeurMin = position;
		// recherche de la plus petite valeur
		for (int j = position + 1; j < tableau.length; j++)
			if (tableau[j] < tableau[indiceValeurMin])
				indiceValeurMin = j;
		// �change entre tableau[position]
		// et la plus petite valeur
		int temp = tableau[position];
		tableau[position] = tableau[indiceValeurMin];
		tableau[indiceValeurMin] = temp;
		triS�lection(tableau, position + 1);
	}

	public static void main(String[] args) {
		final int taille = 20;
		int[] t = new int[taille];
		for (int i = 0; i < taille; i++)
			t[i] = (int) (Math.random() * 101);
		triS�lection(t, 0);
		for (int i = 0; i < taille; i++)
			System.out.println("t[" + i + "] = " + t[i]);
	}
}
