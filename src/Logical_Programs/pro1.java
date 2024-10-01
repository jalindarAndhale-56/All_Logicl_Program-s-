package Logical_Programs;

public class pro1 {
	public static void main(String[] args) {
		// System.out.println(" hi i am using the eclipes ");
		// Scanner s = new Scanner(System.in);
		// float F = s.nextFloat();
		// String s1 = s.next();
		//
		// System.out.println(F);
		// System.out.println(s1);
		// String ss = " i am writing the contend ";
		// Scanner sc = new Scanner(ss);
		//
		// while (sc.hasNext()) {
		// System.out.println(sc.next());
		// }

		// int a[] = {1, 2, 3, 4, 5};
		// System.out.println(Arrays.toString(a));
		//
		// int element = a[0];
		// // shifting the first element in the last index
		// int moveIndex = element;
		//
		// for (int i = 0; i < a.length - 1; i++) {
		// a[i] = a[i + 1];
		// }
		//
		// a[a.length - 1] = moveIndex;
		//
		// System.out.println(" -----------------------------------------");
		// System.out.println(Arrays.toString(a));
		// System.out.println(" ------------------------------------------ ");

		// int arr[] = {1, 2, 3, 4, 5};
		// System.out.println(" shifting the any element to last index......");
		//
		// int Element = arr[2];
		//
		// int moveElement = arr[Element];
		//
		// for (int i = Element; i < arr.length - 1; i++) {
		// arr[i] = arr[i + 1];
		// }
		//
		// arr[arr.length - 1] = moveElement;
		//
		// System.out.println(Arrays.toString(arr));

		int arr[] = {1, 2, 3, 4, 5};

		int tem[] = {1, 2, 3};

		int element = arr[3];

		for (int i = 3; i < arr.length - 1; i++) {
			arr[i] = arr[i];
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
