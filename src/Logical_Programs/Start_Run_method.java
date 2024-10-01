package Logical_Programs;

class A21 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	// @Override
	// public void start() {
	//
	// // i have override the start method because of this it will not create
	// // go to thread class or will not create the new thread and also it will
	// // not call the run() method of thread class
	// System.out.println(" this is overriden start method");
	// }

}
public class Start_Run_method {

	public static void main(String[] args) throws InterruptedException {

		A21 a = new A21();
		a.start();
		a.start();

		for (int i = 0; i < 5; i++) {
			System.out.println(" main thread");
			// Thread.sleep(5000);
		}

	}
	/// we can overload the run method in our class by passing the parameters we
	/// can call many times
	// but start() method wil call the no arg run() method from thread class
}
