package algorithmes.array.binarysearch;

// Recherche dichotomique dans un tableau trié
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
			// Si la valeur est plus petite que la valeur du tableau à l'indice du milieu
			// alors on continue à chercher dans la partie supérieure du tableau
			if (tableauInt[indiceMilieuDuTableau] < valeur)
				indiceDebutRecherche = indiceMilieuDuTableau + 1;
			// sinon on cherche dans la partie du tableau inférieur à l'indice du milieu
			else
				tableauLength = indiceMilieuDuTableau - 1;
		}
		return false;
	}

}
