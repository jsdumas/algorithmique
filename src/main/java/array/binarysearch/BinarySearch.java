package array.binarysearch;

// Recherche dichotomique dans un tableau trié
public class BinarySearch<E> {

	private int[] tableauInt;
	private E[] tableauE;

	public BinarySearch(int[] tableauInt) {
		this.tableauInt = tableauInt;
	}

	public BinarySearch(E[] tableauE) {
		this.tableauE = tableauE;
	}

	public boolean isValueFinded(int valeur) {
		int lo = 0, tableauLength = tableauInt.length; // on cherche dans [lo..hi[
		while (lo < tableauLength) {
			int m = lo + (tableauLength - lo) / 2;
			if (tableauInt[m] == valeur)
				return true;
			if (tableauInt[m] < valeur)
				lo = m + 1;
			else
				tableauLength = m - 1;
		}
		return false;
	}

	// une version générique
	// renvoie la position où l'élément se trouve / devrait être inséré

	public <E extends Comparable<E>> int findNumberOccurence(E v) {
		return findNumberOccurence(v, 0, tableauE.length);
	}

	// le code ci-dessous cherche dans l'intervalle ouvert [lo..hi[

	private <E extends Comparable<E>> int findNumberOccurence(E v, int lo, int hi) {
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			int c = ((Comparable<E>) tableauE[mid]).compareTo(v);
			if (c == 0)
				return mid;
			if (c < 0)
				lo = mid + 1;
			else
				hi = mid;
		}
		return lo;
	}

}
