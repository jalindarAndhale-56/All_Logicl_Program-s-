package Logical_Programs;

public class myProgram {

	public static void main(String[] args) {

		System.out.println(" hii java i am here... ");

		// int[] a = { 10, 20, 30, 40, 50 };
		// int l = a.length;
		//
		// for (int i = l - 1; i >= 0; i--) {
		// System.out.println(a[i]);
		// }
		//
		// int n = 6;
		//
		// int tem = n, sum = 0;
		//
		// for (int i = 1; i < n; i++) {
		// if (n % i == 0) {
		// sum = sum + i;
		// }
		// }
		//
		// System.out.println(sum);

		// if (tem == sum) {
		// System.out.println(" number is perfect... ");
		// } else {
		// System.out.println(" number is not perfect ");
		// }

		int n1 = 10, n2 = 50, i, j, k;

		for (i = n1; i <= n2; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i);
			}

		}

	}
}
