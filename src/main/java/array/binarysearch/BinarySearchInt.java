package main.java.array.binarysearch;

// Recherche dichotomique dans un tableau tri�
public class BinarySearchInt {

	private final int[] tableauInt;

	public BinarySearchInt(int[] tableauInt) {
		this.tableauInt = tableauInt;
	}

	public boolean isValueFinded(int valeur) {
		int indiceDebutRecherche = 0;
		int tableauLength = tableauInt.length; // on cherche dans [indiceDebutRecherche..tableauLength[
		while (indiceDebutRecherche < tableauLength) {
			int indiceMilieuDuTableau = indiceDebutRecherche + (tableauLength - indiceDebutRecherche) / 2;
			if (tableauInt[indiceMilieuDuTableau] == valeur)
				return true;
			// Si la valeur est plus petite que la valeur du tableau � l'indice du milieu
			// alors on continue � chercher dans la partie sup�rieure du tableau
			if (tableauInt[indiceMilieuDuTableau] < valeur)
				indiceDebutRecherche = indiceMilieuDuTableau + 1;
			// sinon on cherche dans la partie du tableau inf�rieur � l'indice du milieu
			else
				tableauLength = indiceMilieuDuTableau - 1;
		}
		return false;
	}

}
