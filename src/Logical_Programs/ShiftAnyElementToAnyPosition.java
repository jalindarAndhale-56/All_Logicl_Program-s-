package Logical_Programs;

public class ShiftAnyElementToAnyPosition {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};

		int Element = a[0];

		// best optimized way to shift element is below
		System.out.println(" length: " + a.length);

		System.out.println(" ---------------");

		// Save the element to be moved
		int elementToMove = a[Element];

		// Shift elements to the left
		for (int i = Element; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}

		// Place the saved element at the last position
		a[a.length - 1] = elementToMove;

		for (int i : a) {
			System.out.println(i);
		}

		// // shifting the element in the left side of an array
		// for (int i = Element; i < a.length - 1; i++)// 3
		// {
		// a[i] = a[i + 1];// 4//
		// }
		//
		// a[a.length - 1] = Element;
		// // inserted first element in the last position....
		// for (int i : a) {
		// System.out.println(i);
		// }

	}

}
