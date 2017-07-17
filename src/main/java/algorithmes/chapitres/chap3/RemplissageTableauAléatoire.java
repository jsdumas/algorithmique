package algorithmes.chapitres.chap3;

public class RemplissageTableauAléatoire {

	public static int généreNombreAléatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAléatoire(int[] t, int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = généreNombreAléatoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		final int taille = 20;
		// déclaration et création du tableau
		int tableau[] = new int[taille];

		remplitTableauAléatoire(tableau, 1, 10);

		for (int i = 0; i < taille; i++)
			System.out.println(tableau[i]);
	}
}
