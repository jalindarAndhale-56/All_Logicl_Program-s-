package Logical_Programs;

import java.util.Arrays;

public class FirstMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {100, 22, 30, 400, 512, 56};

		System.out.println(Arrays.toString(a));

		int largest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(" largest element is: " + largest);

		System.out.println("---------------------------------");
		int secondLargest = a[0];
		int thirdMax = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}
		}

		System.out.println(" second largest element is--: " + secondLargest);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != largest) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] > secondLargest) {
						secondLargest = a[i];
					}
				}
			}
		}
		System.out.println(" second largest element: " + secondLargest);
		System.out.println(" ------------------------------------------");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != largest) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] > thirdMax && a[i] != secondLargest) {
						thirdMax = a[i];
					}
				}
			}
		}
		System.out.println(" third largest element: " + thirdMax);

	}

}
