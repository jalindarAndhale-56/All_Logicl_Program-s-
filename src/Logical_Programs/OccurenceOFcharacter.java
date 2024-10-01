package Logical_Programs;

public class OccurenceOFcharacter {

	public static void main(String[] args) {

		String ss = "ababaccdddaa";

		char ch[] = ss.toCharArray();
		int count = 0;
		char c = 'a';
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				count++;
			}
		}

		System.out.println(
				" the given character occurence founde " + c + "=" + count);
	}

}
