package weekone.day2.Assignment;

import java.util.Arrays;

public class MissingElement {

	public static int getMissingNumber(int[] arr) {

		int n = arr.length;

		Arrays.sort(arr);

		System.out.println("Array Values" + Arrays.toString(arr));
		int m = n + 1;

		int total = m * (m + 1) / 2;

		int sum = Arrays.stream(arr).sum();

		return total - sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };

		System.out.println("The missing number is " + getMissingNumber(arr));
	}
}