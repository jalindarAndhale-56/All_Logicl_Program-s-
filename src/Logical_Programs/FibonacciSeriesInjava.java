package Logical_Programs;

import java.util.Scanner;

public class FibonacciSeriesInjava {

	public static void main(String[] args) {

		int a = 0, b = 1, c, i, j, k;

		Scanner s = new Scanner(System.in);
		System.out.println(" enter the number to pring the fibonacci... .");
		int n = s.nextInt();

		System.out.println(" series....... ");
		for (i = 0; i <= n; i++) {

			System.out.println(a);// 0,1,1,2,
			c = a + b;// 1,2,3,
			a = b;// 1,1,2,
			b = c;// 1,2,3,

		}

		System.out.println(" =================================== ");

		TribonnacciSeries(n);
	}

	static void TribonnacciSeries(int n) {

		int a = 0, b = 1, c = 2, i, j, k, d;

		for (i = 0; i <= n; i++) {

			System.out.println(a);
			d = a + b + c;
			a = b;
			b = c;
			c = d;

		}

	}
}
