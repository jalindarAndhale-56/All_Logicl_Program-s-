package Logical_Programs;

import javax.swing.JFrame;

@FunctionalInterface
interface my {
	void method1();
}

interface my1 {
	int sum(int a, int b);
}

interface length {
	int length(String name);
}

public class Java8_Lambda_Expression {

	public static void main(String[] args) {
		JFrame j = new JFrame("my window");

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);

		// System.out.println(" thread is started...");
		// Runnable r = () -> {
		// for (int i = 0; i < 5; i++) {
		// System.out.println(" thread one...");
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// };
		//
		// Thread t = new Thread(r);
		// t.start();

		// length i = name -> name.length();
		//
		// System.out.println(i.length("jalindar andhale"));

		// my1 iMy1 = (a, b) -> {
		// return a + b;
		// };
		//
		// System.out.println(iMy1.sum(111, 333));

		// my nMy = new my() {
		// @Override
		// public void method1() {
		// System.out.println(" inside the method of interface...");
		// }
		// };
		// nMy.method1();
		// System.out.println(" ------------------------ hello world...");

		// using the interface with help of lambda

		// my i = () -> System.out.println(" inside the my interface
		// method.....");
		// i.method1();

	}

}
