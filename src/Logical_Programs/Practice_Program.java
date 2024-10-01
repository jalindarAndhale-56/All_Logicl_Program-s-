package Logical_Programs;

class a1 {
	public void m1() {
		System.out.println(" inside the m1 a class");
	}
}

class a2 extends a1 {

	static void m2() {
		System.out.println(" jalindar...");
		// m3();
		System.out.println("1111");
	}
	void m3() {
		System.out.println(" inside the m3 a2 class");
	}
}
public class Practice_Program {
	public static void main(String[] args) {

		System.out.println(" inside the main method... of class practice...");
	}

}
