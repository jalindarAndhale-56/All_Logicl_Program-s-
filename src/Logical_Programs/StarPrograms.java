package Logical_Programs;

public class StarPrograms {

	public static void main(String[] args) {

		int i, j, k, n = 5, count = 0;

		// for (i = 1; i <= n; i++) {
		//
		// for (j = i; j < n; j++) {
		// System.out.print(" ");
		// }
		//
		// for (j = 1; j <= i * 2 - 1; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		System.out.println(" this is star pattern using java language....");
		int a = 1;
		for (i = n; i >= 1; i--) {

			for (j = 1; j < a; j++) {
				System.out.print(" ");
			}

			a++;

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (i = 1; i <= n; i++) {

			for (j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
