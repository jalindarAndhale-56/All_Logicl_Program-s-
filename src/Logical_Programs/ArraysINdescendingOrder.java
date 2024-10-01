package Logical_Programs;

public class ArraysINdescendingOrder {

	public static void main(String[] args) {

		int[] a = {60, 67, 222, 876, 90, 456};

		// ArrayINdescendingOrder(a);

		// BiggestElement(a);

		MinimumElement(a);
	}

	// logic to find minimum number in array

	static void MinimumElement(int[] a) {

		int min = a[0];
		// int[] a = {60, 67, 222, 876, 90, 456};

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];

				// last value will be stored inside the minimum is 60
			}

		}

		System.out.println(" minimum element in array is = " + min);

	}

	// logic to find biggest number in array
	static void BiggestElement(int[] a) {

		int max = a[0];

		// int[] a = {60, 67, 222, 876, 90, 456};

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
				// System.out.println(max);//60, 67,222,876,
				// last value will be stored inside the max is 876
			}

		}

		System.out.println(" maximum element in array is = " + max);

	}

	// logic to print array in ascending order in java
	static void ArrayINdescendingOrder(int[] arr) {

		System.out.println("ARRAYS in descending order are like this....");
		int i, j, k;
		int tem;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}

			}
		}

		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}

	}

}
