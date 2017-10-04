package algorithms.hb.problems.quickselect;

import java.util.Random;

public class Quickselect {

	private final Integer[] nums;

	public Quickselect(Integer[] nums) {
		this.nums = nums;
	}

	// Selection of the n largest number in an array [nums]
	public int select(int theNLargestNumber) {
		return select(0, nums.length - 1, theNLargestNumber - 1);
	}

	private int partition(int indexFirst, int indexLast) {
		int pivot = new Random().nextInt(indexLast - indexFirst + 1) + indexFirst;
		swap(indexLast, pivot);
		for (int i = indexFirst; i < indexLast; i++) {
			if (nums[i] > nums[indexLast]) {
				swap(i, indexFirst);
				indexFirst++;
			}
		}
		swap(indexFirst, indexLast);
		return indexFirst;
	}

	private int select(int indexFirst, int indexLast, int k) {
		int pivot = partition(indexFirst, indexLast);
		if (pivot > k) {
			return select(indexFirst, pivot - 1, k);
		} else if (pivot < k) {
			return select(pivot + 1, indexLast, k);
		}
		return nums[k];
	}

	private void swap(int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	public Integer[] getNums() {
		return nums;
	}
}
