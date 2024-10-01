package Logical_Programs;

public class RevisionProgram extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			// try {
			// Thread.sleep(3000);
			// } catch (Exception e) {
			// // TODO: handle exception
			// }
			System.out.println(" child thread." + i);
			System.out.println(" i am daemon thread.. "
					+ Thread.currentThread().isDaemon());

		}
	}

	public static void main(String[] args) {
		// System.out.println(" ins ide the main method... ");
		// RevisionProgram t1 = new RevisionProgram();
		// RevisionProgram t2 = new RevisionProgram();
		// RevisionProgram t3 = new RevisionProgram();
		//
		// t1.start();
		// t1.start();
		// try {
		// t1.join();;
		// } catch (Exception e) {
		// // TODO: handle exception
		// }
		//
		// t2.start();
		// t3.start();

		RevisionProgram t3 = new RevisionProgram();
		// t3.setDaemon(true);
		t3.start();
		t3.setDaemon(true);

		for (int i = 0; i < 1000; i++) {
			System.out.println(" main thread." + i);
		}
	}

}
