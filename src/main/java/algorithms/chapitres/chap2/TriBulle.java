package algorithms.chapitres.chap2;

public class TriBulle {

	public static void main(String[] args) {
		final int taille = 20;
		// déclaration et création du tableau à trier
		int[] t = new int[taille];
		int temp;
		boolean permuté;
		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			t[i] = (int) (Math.random() * 101);
		// tri bulle
		do {
			permuté = false;
			for (int i = 0; i < taille - 1; i++) {
				if (t[i] > t[i + 1]) {
					// échange entre t[i] et t[i+1}
					temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					permuté = true;
				}
			}
		} while (permuté);
		for (int i = 0; i < taille; i++)
			System.out.println("t[" + i + "] = " + t[i]);
	}
}
