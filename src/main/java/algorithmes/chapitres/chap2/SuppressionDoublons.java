package chapitre_22;
public class SuppressionDoublons {

	public static void main(String[] args) {
		final int taille = 20;
		// déclaration et création des tableaux
		int[] tableau = new int[taille];
		int[] tableau2 = new int[taille];
		int taille2; // nombre d'éléments de tableau2
		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 11);
		// dédoublonnage
		taille2 = 0;
		for (int i = 0; i < taille; i++) {
			int j = 0;
			while (tableau[i] != tableau[j])
				j++;
			if (j == i) {
				tableau2[taille2] = tableau[i];
				taille2++;
			}
		}
		for (int i = 0; i < taille; i++)
			System.out.println("tableau initial[" + i + "] = " + tableau[i]);
		for (int i = 0; i < taille2; i++)
			System.out.println("tableau résultat[" + i + "] = " + tableau2[i]);
	}
}
