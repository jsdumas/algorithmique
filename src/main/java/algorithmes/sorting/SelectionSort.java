package algorithmes.sorting;

// complexity : O(n2)
public class SelectionSort extends SortingTool {

	public void triSelection(int[] array) {
		super.start = System.currentTimeMillis();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int startIndice = i;
			for (int currentIndice = startIndice; currentIndice < length; currentIndice++) {
				if (array[currentIndice] < array[startIndice])
					startIndice = currentIndice;
			}
			swap(array, startIndice, i);
		}
		super.end = System.currentTimeMillis();
	}

}
