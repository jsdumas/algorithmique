package array.binarysearch;

// Recherche dichotomique dans un tableau trié
public class BinarySearch {

	private final int[] tableau;

	public BinarySearch(int[] tableau) {
		this.tableau = tableau;
	}

	static boolean binarySearch(int[] tableau, int valeur) {
		int lo = 0, hi = tableau.length; // on cherche dans [lo..hi[
		while (lo < hi) {
			int m = lo + (hi - lo) / 2;
			if (tableau[m] == valeur)
				return true;
			if (tableau[m] < valeur)
				lo = m + 1;
			else
				hi = m - 1;
		}
		return false;
	}

	// une version générique
	// renvoie la position où l'élément se trouve / devrait être inséré

	static <E extends Comparable<E>> int binarySearch(E[] a, E v) {
		return binarySearch(a, v, 0, a.length);
	}

	// le code ci-dessous cherche dans l'intervalle ouvert [lo..hi[

	static <E extends Comparable<E>> int binarySearch(E[] a, E v, int lo, int hi) {
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			int c = a[mid].compareTo(v);
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
