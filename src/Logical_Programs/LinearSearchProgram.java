package Logical_Programs;

public class LinearSearchProgram {

	public static void main(String[] args) {

		System.out.println(" I am doing leanear search program.... ");
		System.out.println(
				" i can solve any logical quetion.... i so intelligent person..");

		int[] a = {64, 54, 63, 26, 734};

		int target = 734;

		leanearSearch(a, target);

	}

	static void leanearSearch(int[] a, int target) {

		for (int i = 0; i <= a.length; i++) {

			if (a[i] == target) {
				target = a[i];
				System.out.println(" element is found on this index " + i + " "
						+ "and my searched element is " + target);
				break;
			}
		}

	}

}
