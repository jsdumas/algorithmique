package algorithmes.sorting;

import java.util.Random;

// pire des cas : O(n2)
public class BubbleSort extends SortingTool {

	private long start = 0;
	private long end = 0;

	public void bubbleSort() {
		Random random = new Random();
		int[] array = new int[30000];
		for (int i = 0; i < 30000; i++)
			array[i] = random.nextInt(100);
		start = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					// swap the elements!
					swap(array, j);
				}
			}
		}
		end = System.currentTimeMillis();
		// O(N*N) N = 10 000 2 -> 2*2 = 4 3 -> 3*3=9
	}

	public String getTimeExec() {
		return "Algorithm takes time to finish: " + (end - start) + "ms";
	}
}
