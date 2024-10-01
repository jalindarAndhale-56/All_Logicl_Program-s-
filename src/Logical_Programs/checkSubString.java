package Logical_Programs;

public class checkSubString {

	public static void main(String[] args) {
		System.out.println(" program started...... ");

		// String string = "this is good to know about the languages";
		// System.out.println(string.matches("to"));
		// System.out.println(string.substring(1, 10));
		// System.out.println(string.contentEquals("is"));
		// System.out.println(string.equals("to"));

		String ss = "jalindar ";

		System.out.println(ss.matches("jalindar "));

		System.out.println(" ----------------------------------- ");
		System.out.println(isWordPrsent(" i am so intelligent person 11", "i"));

	}

	static String isWordPrsent(String s1, String sub) {

		String[] s = s1.split(" ");

		char[] ch = s1.toCharArray();

		for (String string : s) {
			if (string.matches(sub)) {
				System.out.println(" world is  macthed..... " + string);
				break;
			}
		}
		return "";
	}

}
