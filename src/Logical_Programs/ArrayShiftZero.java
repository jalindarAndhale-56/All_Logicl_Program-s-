package Logical_Programs;

import java.util.Arrays;

public class ArrayShiftZero {

	public static void main(String[] args) {

		int[] i = {1, 0, 2, 0, 3, 0, 4, 0, 0, 0};
		shiftZero(i);

	}

	public static void shiftZero(int[] arr) {

		int count = 0;
		int length = arr.length;
		int[] a = new int[length];

		System.out.println(" before was this= " + Arrays.toString(arr));

		for (int i : arr) {
			if (i != 0) {
				a[count] = i;
				count++;
			}
		}
		System.out.println(
				"  --------------------------------------------------------------  ");
		System.out.println(
				" after all zero shifted to the right= " + Arrays.toString(a));

	}

}
