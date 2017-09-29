package algorithms.chapitres.chap3;

public class RemplissageTableauAl�atoire {

	public static int g�n�reNombreAl�atoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAl�atoire(int[] t, int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = g�n�reNombreAl�atoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		final int taille = 20;
		// d�claration et cr�ation du tableau
		int tableau[] = new int[taille];

		remplitTableauAl�atoire(tableau, 1, 10);

		for (int i = 0; i < taille; i++)
			System.out.println(tableau[i]);
	}
}
