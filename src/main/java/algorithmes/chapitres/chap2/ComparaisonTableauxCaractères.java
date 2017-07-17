package algorithmes.chapitres.chap2;

public class ComparaisonTableauxCaract�res {

	public static void main(String[] args) {
		// d�claration et cr�ation des tableaux
		final char tableau1[] = { 'b', 'o', 'n', 'j', 'o', 'u', 'r' };
		final char tableau2[] = { 'b', 'o', 'n', 'j', 'o', 'u', 'a' };
		// comparaison des cha�nes de caract�res
		int i = 0;
		// calcul du nombre de caract�res communs
		while ((i < tableau1.length) && (i < tableau2.length) && (tableau1[i] == tableau2[i]))
			i++;

		if ((i == tableau1.length) || (i == tableau2.length)) {
			if ((i == tableau1.length) && (i == tableau2.length))
				System.out.println("Les deux mots sont identiques");
			else {
				if (i == tableau1.length)
					System.out.println("Le 1er mot pr�c�de le 2e");
				else
					System.out.println("Le 2e mot pr�c�de le 1er");
			}
		} else if (tableau1[i] < tableau2[i])
			System.out.println("Le 1er mot pr�c�de le 2e");
		else
			System.out.println("Le 2e mot pr�c�de le 1er");
	}
}
