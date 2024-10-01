package Logical_Programs;

public class A {

	public static void main(String[] args) {

		int[] n1 = {1, 3, 4, 5, 3, 4, 5, 6, 7};

		//
		// for(int i=0;i <n.length;i++)
		// {
		// System.out.print(n[i]+" ");
		// }
		//
		// System.out.println(2.0/0.0);
		// System.out.println(0.0/0.0);
		// //System.out.println(2/0);
		// System.out.println(Float.NaN);

		// System.out.println(2.0/0);

		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);

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
			for (j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
