package Logical_Programs;

public class FindDuplicateString {

	public static void main(String[] args) {

		int count = 0, i, k, j;

		String s = "i love coding and program solving ";

		char ch[] = s.toCharArray();

		for (int l = 0; l < ch.length; l++) {
			if (s.charAt(l) == 'a') {
				count++;
			}
		}
		System.out
				.println(" first occurrence of character in string= " + count);

		count = 0;
		for (int l = 0; l < ch.length; l++) {
			if (ch[l] == 'o') {
				count++;
			}
		}

		System.out.println(" the occurence of the o character is= " + count);
	}

}
