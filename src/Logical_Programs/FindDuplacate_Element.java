package Logical_Programs;

public class FindDuplacate_Element {

	public static void main(String[] args) {

		String[] s1 = {"A", "B", "C", "D", "A", "B"};

		// * therre are different ways to find duplicate element from an array
		// 1. brute force
		// 2. hashset
		// 3. hashMap<K,V>
		// 4. Streams

		int i, j, k;

		System.out.println(
				" duplicate element are found by using the brute force ..... ");
		for (int k2 = 0; k2 < s1.length; k2++) {

			for (int l = k2 + 1; l < s1.length; l++) {
				if (s1[k2].equals(s1[l])) {
					System.out.println(s1[k2]);
				}
			}
		}

		// System.out.println(" original array is ..... ");
		// Set<String> dataSet = new HashSet<>();
		//
		// for (String string : s1) {
		//
		// if (dataSet.add(string) == false) {
		// System.out.println(string);
		// }
		// }

		// String s = " i am good person and also professional hacker in my
		// career i am also good ";
		//
		// // firstly i have split the string on the basis of spaces
		// String[] s2 = s.split(" ");
		//
		// System.out.println(" ================================ ");
		// for (String string : s2) {
		// // condition to filter the string less than 5
		// if (string.length() < 5) {
		// System.out.println(string);
		// }
		// }

		String s = "  i am good person and also professional hacker in my career i am also good in ";

		System.out.println(
				"  quetion is to find the duplicate words in given string and print them..... ");

		String[] a = s.split(" ");
		System.out.println(" ------------------------------------------- ");

		// for (String string : a) {
		// if (string.length() < 5) {
		// System.out.println(string);
		// }
		// }

		for (String string : a) {
			System.out.println(string);
		}

		System.out.println(" ===================================== ");
		System.out
				.println(" duplicate words found in string above string.....");

		for (int l = 0; l < a.length; l++) {
			for (int l2 = l + 1; l2 < a.length; l2++) {
				if (a[l].equals(a[l2])) {
					System.out.println(a[l]);
				}
			}
		}

		System.out.println(" ===================================== ");

	}

}
