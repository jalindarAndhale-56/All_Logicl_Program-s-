package Logical_Programs;

public class ShiftLeftElement {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};

		int firstElement = a[0];

		// best optimized way to shift element is below
		System.out.println(" length: " + a.length);

		System.out.println(" ---------------");
		// shifting the element in the left side of an array
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}

		// inserted first element in the last position....
		a[a.length - 1] = firstElement;

		System.out.println(" --------------------------------------- ");
		for (int i : a) {
			System.out.print(i + "  ");
		}

	}

}
