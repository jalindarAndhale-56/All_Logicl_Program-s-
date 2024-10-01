package Logical_Programs;

public class Static_Programs {

	int a = 11111;
	static {
		System.out.println(" inside the static block 1");
		mai();
	}

	static {
		System.out.println(" inside the static block 1");
	}

	{

		System.out.println(" inside the instance block....... ");
	}
	static public void mai() {
		System.out.println(" inside the static block 2");
	}

	public static void main(String[] args) {

		System.out.println(" inside the main method ");

	}

}

/// the total length for the non- static and also for static methods in java
/// inside parameters is allowed 254

// class myclass {
//
// private myclass() {
//
// }
//
// public static myclass name() {
// return new myclass();
// }
// }
