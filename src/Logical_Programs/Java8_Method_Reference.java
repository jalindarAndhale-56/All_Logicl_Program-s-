package Logical_Programs;

public class Java8_Method_Reference {

	static void m1() {
		System.out.println(" inside the m1 method.....");
	}

	public static void main(String[] args) {
		// String s = "jalindar";
		// Optional<String> o = Optional.ofNullable(s);
		//
		// System.out.println(o.isPresent());
		// System.out.println(o.get());
		// System.out.println(o.orElse(" not present value..."));

		// String str = "jalindar";
		// char[] ch = str.toCharArray();
		// System.out.println(Arrays.toString(ch));
		//
		// for (int i = 0; i < ch.length; i++) {
		// if (true) {
		//
		// }
		// }

		int n = 5;
		int arr[] = {1, 2, 3, 4, 5};

		for (int st = 0; st < n; st++) {
			for (int end = 0; end < n; end++) {
				for (int j2 = 0; j2 <= end; j2++) {
					System.out.print(arr[j2]);
				}
				System.out.print(" ");
			}
			System.out.println();

		}

	}

}
