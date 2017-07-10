package main.java.array.binarysearch;

public class BinarySearchE<E> {

	private final E[] tableauE;

	public BinarySearchE(E[] tableauE) {
		this.tableauE = tableauE;
	}

	// une version générique
	// renvoie la position où l'élément se trouve / devrait être inséré

	public <E extends Comparable<E>> int findNumberOccurence(E valeurAChercher) {
		return findNumberOccurence(valeurAChercher, 0, tableauE.length);
	}

	// le code ci-dessous cherche dans l'intervalle ouvert [lo..hi[

	private <E extends Comparable<E>> int findNumberOccurence(E valeurAChercher, int indiceDebutRecherche, int tableauLength) {
		while (indiceDebutRecherche < tableauLength) {
			int mid = indiceDebutRecherche + (tableauLength - indiceDebutRecherche) / 2;
			int resultatComparaison = ((Comparable<E>) tableauE[mid]).compareTo(valeurAChercher);
			if (resultatComparaison == 0)
				return mid;
			if (resultatComparaison < 0)
				indiceDebutRecherche = mid + 1;
			else
				tableauLength = mid;
		}
		return indiceDebutRecherche;
	}

}
