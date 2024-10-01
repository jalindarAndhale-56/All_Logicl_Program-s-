package Logical_Programs;

public class TwoDArrayinJava {

	public static void main(String[] args) {

		int[][] a = {{10, 20, 30}, {100, 200, 300}, {23, 43, 2}};
		int[][] b = {{10, 20, 30}, {100, 200, 300}, {23, 43, 2}};

		int[][] c = new int[a.length][a[0].length];

		int i, j, k;

		// Scanner s = new Scanner(System.in);
		//
		// System.out.println(" Enter the two array element quickly..... ");
		// for (i = 0; i < a.length; i++) {
		// for (j = 0; j < a[0].length; j++) {
		// a[i][j] = s.nextInt();
		// }
		// }

		System.out.println(" first array... ");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {

				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println(" second array... ");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {

				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}

		// System.err.println(" Addition off matrix is ...... ");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + a[i][j];
			}
		}

		System.out.println(" Addition off matrix is ...... ");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
