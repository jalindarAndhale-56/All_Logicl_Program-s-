package Logical_Programs;

public class Alphabetic_Pattern {

	public static void main(String[] args) {
		System.out.println(" -------------------- ");

		int i, j, k;

		char ch = 'A';
		char c = 'Z';

		for (i = 65; i <= 7; i++) {
			for (j = 65; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}
	}

}
