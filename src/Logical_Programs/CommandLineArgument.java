package Logical_Programs;

import java.util.Scanner;

public class CommandLineArgument {

	public static void main(String[] args) {

		args = new String[5];

		Scanner scanner = new Scanner(System.in);

		System.out.println(" enter the command line argument... ");
		for (int i = 0; i < args.length; i++) {
			args[i] = scanner.nextLine();
		}
		System.out.println("---------------------------------");
		System.out.println(args.length);
		System.out.println("---------------------------------");
		for (String string : args) {
			System.out.println(string);
		}

	}

}
