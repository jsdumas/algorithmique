package algorithmes.chapitres.chap2;

public class ConstructionIndex {

	public static void main(String[] args) {
		final int tailleIndex = 26;
		char[][] mots = { { 'i', 'n', 'd', 'e', 'x' }, { 'i', 'n', 'd', 'i', 'c', 'e' }, { 'o', 'r' }, { 'o', 'r', 'd', 'r', 'e' },
				{ 't', 'a', 'b', 'l', 'e' } };
		int[][] indexMots = new int[tailleIndex][tailleIndex];
		int dernièreLettre1, dernièreLettre2;
		// initialisation de l'index
		for (int i = 0; i < tailleIndex; i++)
			for (int j = 0; j < tailleIndex; j++)
				indexMots[i][j] = -1;
		// construction de l'index
		dernièreLettre1 = -1;
		dernièreLettre2 = -1;
		for (int i = 0; i < mots.length; i++) {
			int lettre1 = mots[i][0] - 97;
			int lettre2 = mots[i][1] - 97;
			if ((lettre1 != dernièreLettre1) || (lettre2 != dernièreLettre2)) {
				indexMots[lettre1][lettre2] = i;
				dernièreLettre1 = lettre1;
				dernièreLettre2 = lettre2;
			}
		}
		for (int i = 0; i < tailleIndex; i++)
			for (int j = 0; j < tailleIndex; j++)
				if (indexMots[i][j] != -1)
					System.out.println("indexMots[" + i + "][" + j + "] = " + indexMots[i][j]);
	}
}
