package Logical_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Element_fromArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 2, 2, 3, 3, 4, 4, 5};

		System.out.println(Arrays.toString(a));
		System.out.println(" length= " + a.length);

		// create the hashset to remove duplicate element from array

		Set<Integer> uniqeElements = new HashSet<>();

		for (int i : a) {
			uniqeElements.add(i);
		}

		// original elements are this

		for (Integer integer : uniqeElements) {
			System.out.println(integer);
		}

		// int i = 0;
		//
		// for (int j = i + 1; j < a.length; j++) {
		// if (a[i] != a[j]) {
		// a[i++] = a[j];
		// // i++;
		// }
		// }
		//
		// for (int i1 : a) {
		// System.out.println(i1);
		// }

		// int index = 0;
		// int arr[] = new int[a.length - 1];
		// for (int i = 0; i < a.length; i++) {
		// for (int j = i + 1; j < a.length - 1; j++) {
		// if (a[i] != a[j]) {
		// arr[index++] = a[i];
		// index++;
		// }
		// }
		//
		// }
		//
		// for (int i2 : a) {
		// System.out.println(i2);
		// }

	}

}
