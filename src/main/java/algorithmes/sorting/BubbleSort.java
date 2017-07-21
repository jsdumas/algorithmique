package algorithmes.sorting;


// pire des cas : O(n2)
public class BubbleSort extends SortingTool {

	private long start = 0;
	private long end = 0;

	public void bubbleSort(int[] array) {
		start = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int currentIndice = 1; currentIndice < (array.length - i); currentIndice++) {
				if (array[currentIndice - 1] > array[currentIndice]) {
					// swap the elements!
					swap(array, currentIndice);
				}
			}
		}
		end = System.currentTimeMillis();
	}

	public String getTimeExec() {
		return "Algorithm takes time to finish: " + (end - start) + "ms";
	}
}
