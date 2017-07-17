package algorithme.sorting;

// tri rapide

public class Quicksort {

	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	static int partition(int[] a, int l, int r) {
		// on suppose l < r i.e. au moins un élément
		int p = a[l], m = l;
		for (int i = l + 1; i < r; i++)
			if (a[i] < p)
				swap(a, i, ++m);
		swap(a, l, m);
		return m;
	}

	static void quickrec(int[] a, int l, int r) {
		if (l >= r - 1)
			return;
		int m = partition(a, l, r);
		quickrec(a, l, m);
		quickrec(a, m + 1, r);
	}

	static void quicksort(int[] a) {
		quickrec(a, 0, a.length);
	}

	/*
	 * améliorations (en exercices) - un des deux appels récursifs remplacé par une boucle - un mélange avant de commencer
	 */

	static void quickrec2(int[] a, int l, int r) {
		while (l < r - 1) {
			int m = partition(a, l, r);
			if (m - l < r - m - 1) {
				quickrec2(a, l, m);
				l = m + 1;
			} else {
				quickrec2(a, m + 1, r);
				r = m;
			}
		}
	}

	static void quicksort2(int[] a) {
		KnuthShuffle.shuffle(a);
		quickrec2(a, 0, a.length);
	}

	// deux améliorations de plus (en exercices)
	// - 3-way partition

	/*
	 * l lo i hi r +------+-------+-------+-----+ | < v | = v | ????? | > v | +------+-------+-------+-----+
	 */

	static void quickrec3(int[] a, int l, int r) {
		if (l >= r - 1)
			return;
		int p = a[l], lo = l, hi = r;
		// on partitionne a[l..r[ en trois
		for (int i = l + 1; i < hi;) {
			if (a[i] == p)
				i++;
			else if (a[i] < p)
				swap(a, i++, lo++);
			else
				// p < a[i]
				swap(a, i, --hi);
		}
		quickrec3(a, l, lo);
		quickrec3(a, hi, r);
	}

	static void quicksort3(int[] a) {
		KnuthShuffle.shuffle(a);
		quickrec3(a, 0, a.length);
	}

	// - tri par insertion sur les petits tableaux

	private static final int cutoff = 5;

	static void quickrec4(int[] a, int l, int r) {
		while (l < r - 1) {
			if (r - l < cutoff) {
				InsertionSort.insertionSort(a, l, r);
				return;
			}
			// on partitionne a[l..r[ en trois
			// (c'est le drapeau hollandais)
			int p = a[l], lo = l, hi = r;
			// lo i hi
			// ..<p.. ..=p.. ..?.. ..>p..
			for (int i = l + 1; i < hi;) {
				if (a[i] == p)
					i++;
				else if (a[i] < p)
					swap(a, i++, lo++);
				else
					// p < a[i]
					swap(a, i, --hi);
			}
			// il faut maintenant trier a[l..lo[ et a[hi..r[
			if (lo - l < r - hi) {
				quickrec4(a, l, lo);
				l = hi;
			} else {
				quickrec4(a, hi, r);
				r = lo;
			}
		}
	}

	static void quicksort4(int[] a) {
		KnuthShuffle.shuffle(a);
		quickrec4(a, 0, a.length);
	}

}
