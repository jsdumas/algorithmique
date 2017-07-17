package algorithmes.chapitres.chap2;

public class ConstructionIndex {

	public static void main(String[] args) {
		final int tailleIndex = 26;
		char[][] mots = { { 'i', 'n', 'd', 'e', 'x' }, { 'i', 'n', 'd', 'i', 'c', 'e' }, { 'o', 'r' }, { 'o', 'r', 'd', 'r', 'e' },
				{ 't', 'a', 'b', 'l', 'e' } };
		int[][] indexMots = new int[tailleIndex][tailleIndex];
		int derni�reLettre1, derni�reLettre2;
		// initialisation de l'index
		for (int i = 0; i < tailleIndex; i++)
			for (int j = 0; j < tailleIndex; j++)
				indexMots[i][j] = -1;
		// construction de l'index
		derni�reLettre1 = -1;
		derni�reLettre2 = -1;
		for (int i = 0; i < mots.length; i++) {
			int lettre1 = mots[i][0] - 97;
			int lettre2 = mots[i][1] - 97;
			if ((lettre1 != derni�reLettre1) || (lettre2 != derni�reLettre2)) {
				indexMots[lettre1][lettre2] = i;
				derni�reLettre1 = lettre1;
				derni�reLettre2 = lettre2;
			}
		}
		for (int i = 0; i < tailleIndex; i++)
			for (int j = 0; j < tailleIndex; j++)
				if (indexMots[i][j] != -1)
					System.out.println("indexMots[" + i + "][" + j + "] = " + indexMots[i][j]);
	}
}
