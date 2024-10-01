package Logical_Programs;

public class multi extends Thread {

	@Override
	public void run() {
		System.out.println(" inside run method");
	}
	static void main(String[] args) {

		Thread t = new Thread();
		t.start();
		System.out.println(" -------------------- ");
		multi m = new multi();
		m.start();

	}

}
