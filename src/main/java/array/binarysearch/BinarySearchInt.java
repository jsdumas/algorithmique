package main.java.array.binarysearch;

// Recherche dichotomique dans un tableau trié
public class BinarySearchInt {

	private final int[] tableauInt;

	public BinarySearchInt(int[] tableauInt) {
		this.tableauInt = tableauInt;
	}

	public boolean isValueFinded(int valeur) {
		int indiceDebutRecherche = 0;
		int tableauLength = tableauInt.length; // on cherche dans [lo..hi[
		while (indiceDebutRecherche < tableauLength) {
			int milieu = indiceDebutRecherche + (tableauLength - indiceDebutRecherche) / 2;
			if (tableauInt[milieu] == valeur)
				return true;
			if (tableauInt[milieu] < valeur)
				indiceDebutRecherche = milieu + 1;
			else
				tableauLength = milieu - 1;
		}
		return false;
	}

}
