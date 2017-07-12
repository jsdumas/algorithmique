package array.binarysearch;

public class BinarySearchE<E extends Comparable<E>> {

	private final E[] tableauE;

	public BinarySearchE(E[] tableauE) {
		this.tableauE = tableauE;
	}

	// une version g�n�rique
	// renvoie la position o� l'�l�ment se trouve / devrait �tre ins�r�
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
			// si le r�sultat de comparaison entre la valeur de l'indice de milieu de tableau et la valeur � chercher est �gale � 0
			// alors on retourne
			if (resultatComparaison == 0)
				return indiceMilieuDuTableau;
			// Si la comparaison de la valeur � chercher est plus petite que la valeur du tableau � l'indice du milieu
			// alors on cherche dans la partie sup�rieur du tableau
			if (resultatComparaison < 0)
				indiceDebutRecherche = indiceMilieuDuTableau + 1;
			// sinon on cherche dans la partie inf�rieure du tableau
			else
				tableauLength = indiceMilieuDuTableau;
		}
		// Si l'indice de d�but de recherche du tableau est sup�rieur � l'indice de fin de recherche du tableau
		// alors on retroune l'indice de d�but de recherche. Il correspond � l'indice d'insertion de la valeur.
		return indiceDebutRecherche;
	}

}
