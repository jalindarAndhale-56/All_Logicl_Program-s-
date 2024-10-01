package Logical_Programs;

import java.util.Arrays;

public class InsertNewElement {

	public static void main(String[] args) {

		int[] a = {55, 35, 86, 85};

		int element = 200;
		int i, j, k;
		int l = a.length;

		int index = 2;

		for (i = 0; i < l; i++) {
			if (i == index) {
				a[i] = element;
			}

		}

		System.out.println(" after inserting the element in array..... ");

		for (i = 0; i < l; i++) {
			System.out.println(a[i]);
		}

		System.out.println(Arrays.toString(a));

	}
}
