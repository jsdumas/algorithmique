package algorithmes.sorting;

public abstract class SortingTool {

	protected void swap(int[] array, int currentIndice) {
		int tmp = array[currentIndice - 1];
		array[currentIndice - 1] = array[currentIndice];
		array[currentIndice] = tmp;
	}

	protected void swap(int[] array, int currentIndice, int nextIndice) {
		int tmp = array[currentIndice];
		array[currentIndice] = array[nextIndice];
		array[nextIndice] = tmp;
	}

}
