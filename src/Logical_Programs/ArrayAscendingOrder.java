package Logical_Programs;

public class ArrayAscendingOrder {

	public static void main(String[] args) {

		int[] a = {60, 54, 34, 6, 3, 2};
		// 2,3,6,34,54,60
		ArraysINAscendingOrder(a);

	}

	static public void ArraysINAscendingOrder(int[] arr) {

		int tem;
		int i, j, k;
		System.out.println(" before swapping arrays array are like this.... ");

		for (int k2 = 0; k2 < arr.length; k2++) {
			System.out.println(arr[k2]);
		}

		System.out
				.println(" after swapping the Arrays are printed like this...");

		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}

			}

		}

		for (int k2 = 0; k2 < arr.length; k2++) {
			System.out.println(arr[k2]);
		}

	}

}
