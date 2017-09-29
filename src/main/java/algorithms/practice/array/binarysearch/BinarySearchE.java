package algorithms.practice.array.binarysearch;

public class BinarySearchE<E extends Comparable<E>> {

	private final E[] tableauE;

	public BinarySearchE(E[] tableauE) {
		this.tableauE = tableauE;
	}

	// une version générique
	// renvoie la position où l'élément se trouve / devrait être inséré
	public int getValueSearchedIndice(E valeurAChercher) {
		return getValueSearchedIndice(valeurAChercher, 0, tableauE.length);
	}

	// le code ci-dessous cherche dans l'intervalle ouvert [indiceDebutRecherche..tableauLength[
	private int getValueSearchedIndice(E valeurAChercher, int indDebRech, int tabL) {
		int indiceDebutRecherche = indDebRech;
		int tableauLength = tabL;
		while (indiceDebutRecherche < tableauLength) {
			int indiceMilieuDuTableau = indiceDebutRecherche + (tableauLength - indiceDebutRecherche) / 2;
			int resultatComparaison = ((Comparable<E>) tableauE[indiceMilieuDuTableau]).compareTo(valeurAChercher);
			// si le résultat de comparaison entre la valeur de l'indice de milieu de tableau et la valeur à chercher est égale à 0
			// alors on retourne
			if (resultatComparaison == 0)
				return indiceMilieuDuTableau;
			// Si la comparaison de la valeur à chercher est plus petite que la valeur du tableau à l'indice du milieu
			// alors on cherche dans la partie supérieur du tableau
			if (resultatComparaison < 0)
				indiceDebutRecherche = indiceMilieuDuTableau + 1;
			// sinon on cherche dans la partie inférieure du tableau
			else
				tableauLength = indiceMilieuDuTableau;
		}
		// Si l'indice de début de recherche du tableau est supérieur à l'indice de fin de recherche du tableau
		// alors on retroune l'indice de début de recherche. Il correspond à l'indice d'insertion de la valeur.
		return indiceDebutRecherche;
	}

}
