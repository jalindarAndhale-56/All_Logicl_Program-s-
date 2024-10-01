package Logical_Programs;

public class CoreJavaQuestions {

	public static void main(String[] args) {

		// 1.. break- ---break statement is used to stop the loop or any other
		// execution
		// we can use break statement in loop or switch statement
		// break cannot be used outside the loop or switch

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
		}

		// 2. continue --- > continue statement is used to skip the current
		// iteration or go with next iteration
		// continue statement we can use only within the loop outside the loop
		// we cannot use
		System.out.println(" ------------------------- ");

		for (int i = 1; i <= 2; i++) {

			if (i == 2) {

				for (int j = 0; j < 50; j += 2) {
					System.out.println(j);
				}
			}
		}

	}

}
