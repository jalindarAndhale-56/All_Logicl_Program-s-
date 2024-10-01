package Logical_Programs;

public class NumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k, l;
		int n = 5, a = 4;

		System.out.println(" -------------------------------- ");

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= a; i++) {
				System.out.print(" ");
			}
			a--;
			for (k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			for (k = 2; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
