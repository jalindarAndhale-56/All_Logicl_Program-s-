package Logical_Programs;

public class deleteElementFromArray {

	public static void main(String[] args) {

		int[] a = {10, 20, 30, 40, 50};
		int size = a.length;

		int i, j, k;

		int element = 40;
		int count = 0;

		for (i = 0; i < a.length; i++) {

			if (a[i] != element) {
				count++;// 1,2,3,4
			}
		}

		// after performing the above operation count will be ---> int count =4

		int[] arr = new int[count];

		int index = 0;

		// value of array a is---> a = {10, 20, 30, 40, 50};

		for (int i1 : a) {

			if (i1 != element) {
				arr[index++] = i1;// 1,2,3,4
			}
		}

		for (int l : arr) {
			System.out.println(l);
		}

	}

}
