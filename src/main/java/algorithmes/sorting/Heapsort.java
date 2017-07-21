package algorithmes.sorting;

// tri par tas

public class Heapsort {

	// recursive version of moveDown
	public void moveDownRec(int[] array, int k, int v, int n) {
		int r = 2 * k + 1;
		if (r >= n)
			array[k] = v;
		else {
			if (r + 1 < n && array[r] < array[r + 1])
				r++;
			if (array[r] <= v)
				array[k] = v;
			else {
				array[k] = array[r];
				moveDownRec(array, r, v, n);
			}
		}
	}

	public void moveDown(int[] array, int i, int x, int n) {
		while (true) {
			int j = 2 * i + 1;
			if (j >= n)
				break;
			if (j + 1 < n && array[j] < array[j + 1])
				j++;
			if (array[j] <= x)
				break;
			array[i] = array[j];
			i = j;
		}
		array[i] = x;
	}

	public void heapsort(int[] array) {
		int n = array.length;
		for (int k = n / 2 - 1; k >= 0; k--)
			moveDown(array, k, array[k], n);
		for (int k = n - 1; k >= 1; k--) {
			int v = array[k];
			array[k] = array[0];
			moveDown(array, 0, v, k);
		}
	}

}