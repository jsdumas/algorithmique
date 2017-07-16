package sorting;

// tri par tas

public class Heapsort {

	// recursive version of moveDown
	static void moveDownRec(int[] a, int k, int v, int n) {
		int r = 2 * k + 1;
		if (r >= n)
			a[k] = v;
		else {
			if (r + 1 < n && a[r] < a[r + 1])
				r++;
			if (a[r] <= v)
				a[k] = v;
			else {
				a[k] = a[r];
				moveDownRec(a, r, v, n);
			}
		}
	}

	static void moveDown(int[] a, int i, int x, int n) {
		while (true) {
			int j = 2 * i + 1;
			if (j >= n)
				break;
			if (j + 1 < n && a[j] < a[j + 1])
				j++;
			if (a[j] <= x)
				break;
			a[i] = a[j];
			i = j;
		}
		a[i] = x;
	}

	static void heapsort(int[] a) {
		int n = a.length;
		for (int k = n / 2 - 1; k >= 0; k--)
			moveDown(a, k, a[k], n);
		for (int k = n - 1; k >= 1; k--) {
			int v = a[k];
			a[k] = a[0];
			moveDown(a, 0, v, k);
		}
	}

}