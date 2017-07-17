package chapitre_22;
public class TriBulle {

	public static void main(String[] args) {
		final int taille = 20;
		// d�claration et cr�ation du tableau � trier
		int[] t = new int[taille];
		int temp;
		boolean permut�;
		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			t[i] = (int) (Math.random() * 101);
		// tri bulle
		do {
			permut� = false;
			for (int i = 0; i < taille - 1; i++) {
				if (t[i] > t[i + 1]) {
					// �change entre t[i] et t[i+1}
					temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					permut� = true;
				}
			}
		} while (permut�);
		for (int i = 0; i < taille; i++)
			System.out.println("t[" + i + "] = " + t[i]);
	}
}
