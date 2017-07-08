package array.binarysearch;

class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 10 };
		assert !BinarySearch.binarySearch(a, 0);
		assert BinarySearch.binarySearch(a, 1);
		assert BinarySearch.binarySearch(a, 3);
		assert !BinarySearch.binarySearch(a, 4);
		assert BinarySearch.binarySearch(a, 10);
		assert !BinarySearch.binarySearch(a, 11);
		Integer[] b = { 1, 2, 3, 5, 10 };
		assert BinarySearch.binarySearch(b, 0) == 0;
		assert BinarySearch.binarySearch(b, 1) == 0;
		assert BinarySearch.binarySearch(b, 3) == 2;
		assert BinarySearch.binarySearch(b, 4) == 3;
		assert BinarySearch.binarySearch(b, 10) == 4;
		assert BinarySearch.binarySearch(b, 11) == 5;
		// System.out.println(BinarySearch.binarySearch(new Integer[] { 1,1,3 } , 1));
	}
}
