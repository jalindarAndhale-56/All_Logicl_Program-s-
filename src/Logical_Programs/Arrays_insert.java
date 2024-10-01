package Logical_Programs;

import java.util.Arrays;

public class Arrays_insert {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4};

		int count = 0;
		int index = 2;
		int element = 5;
		System.out.println(Arrays.toString(a));
		System.out.println(" ------------------------------------------");

		System.out.println(" inserted element over the existing element..... ");
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				a[i] = element;
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		// System.out.println(a.length);

		// for (int i : a) {
		// System.out.println(i);
		// }

		// int a[] = {20, 3, 6, 77, 4, 7, 10, 1};
		//
		// int a1[] = {1, 4, 6, 44, 675, 457, 99, 75};
		//
		// // for (int i = 0; i < a.length; i++) {
		// // System.out.print(a[i] + " ");
		// // }
		//
		// System.out.println(
		// " the arrays are in descending order: " + Arrays.toString(a));
		//
		// int tem;
		//
		// for (int i = 0; i < a.length; i++) {
		// for (int j = i + 1; j < a.length; j++) {
		// if (a[i] > a[j]) {
		// tem = a[i];
		// a[i] = a[j];
		// a[j] = tem;
		// }
		// }
		// }
		//
		// System.out.println(" arrays are sorted : " + Arrays.toString(a));
		// System.out.println(
		// "
		// ------------------------------------------------------------------");

		// for (int i = 0; i < a1.length; i++) {
		// for (int j = i + 1; j < a1.length; j++) {
		// if (a1[i] < a1[j]) {
		// tem = a1[i];
		// a1[i] = a1[j];
		// a1[j] = tem;
		// }
		// }
		// }
		//
		// System.out.println(
		// " arrays are in descending order: " + Arrays.toString(a1));

		// int a[] = {10, 20, 30, 40, 50};
		// System.out.println(" delete the 30 element from above array ......");
		// System.out.println();
		//
		// int element = 40;
		//
		// System.out.println(Arrays.toString(a));
		//
		// System.out.println(
		// " ----------------------------------------------------- ");
		// int count = 0;
		// // int aa[] = new int[a.length];
		//
		// for (int i : a) {
		// if (i != element) {
		// count++;// 1,2,3,4
		// }
		// }
		//
		// int aa[] = new int[count];
		// int index = 0;

		// for (int i : a) {
		// if (i != element) {
		// aa[index++] = i;
		// }
		// }
		//
		// for (int i = 0; i < aa.length; i++) {
		//
		// System.out.println(aa[i]);
		//
		// }

		// System.out.println(Arrays.toString(aa));

		//
		// for (int i : a) {
		// if (i != 30) {
		// aa[count] = i;
		// count++;
		// }
		// }
		//
		// System.out.println(" element is deleted: " + Arrays.toString(aa));
		// int l = aa.length - 1;
		// for (int i = 0; i < l; i++) {
		// System.out.println(aa[i]);
		// }

	}

}
