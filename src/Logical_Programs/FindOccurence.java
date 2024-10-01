package Logical_Programs;

public class FindOccurence {

	public static void main(String[] args) {

		System.out.println(" ------------------------- ");

		String s = " i love to solve the DSA quetions and Logic";

		Long long1 = s.chars().filter(e -> (char) e == 't').count();
		System.out.println(
				" the occurence of given character is in string= " + long1);
	}

}
