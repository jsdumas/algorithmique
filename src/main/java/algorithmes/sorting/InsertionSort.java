package algorithme.sorting;

// tri par insertion

public class InsertionSort {

	static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int v = a[i], j = i;
			for (; 0 < j && v < a[j - 1]; j--)
				a[j] = a[j - 1];
			a[j] = v;
		}
	}

	// trie a[l..r[
	static void insertionSort(int[] a, int l, int r) {
		for (int i = l + 1; i < r; i++) {
			int v = a[i], j = i;
			for (; l < j && v < a[j - 1]; j--)
				a[j] = a[j - 1];
			a[j] = v;
		}
	}

}