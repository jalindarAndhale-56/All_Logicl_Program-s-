package Logical_Programs;

public class Threading1 {

	public static void main(String[] args) {

		System.out.println(" main class....... ");

		// Vector<Integer> v = new Vector<>();
		// v.add(111);
		// v.add(222);
		// v.add(333);
		// v.remove(0);
		//
		// System.out.println(v);
		//
		// Stack<Integer> s = new Stack<>();
		// s.push(22);
		// s.push(88);
		// s.push(90);
		// s.peek();
		// System.out.println(s);
		// s.pop();
		// System.out.println(s);

		// System.out.println(s.search(1));

		// TreeSet<String> t = new TreeSet<>();
		// t.add("A");
		// t.add("B");
		// t.add("C");
		// t.add("D");
		// System.out.println(t);
		// t.headSet("A");
		// t.tailSet("A");
		// System.out.println(t);

		// HashMap<Integer, String> hashMap = new HashMap<>();
		// hashMap.put(1, "a");
		// hashMap.put(9, null);
		// hashMap.put(6, null);
		// hashMap.put(4, "b");
		//
		// Set<Entry<Integer, String>> set = hashMap.entrySet();
		//
		// for (Entry<Integer, String> entry : set) {
		// System.out.println(entry.getKey() + " " + entry.getValue());
		// }

		// TreeMap<Integer, Double> t = new TreeMap<>();
		//
		// t.put(1, 55.4);
		// t.put(2, null);
		// t.put(4, null);
		// t.put(3, 5.0);
		//
		// for (Map.Entry<Integer, Double> entry : t.entrySet()) {
		// System.out.println(entry.getKey() + "-" + entry.getValue());
		// }

		// System.out.println(" ------------------------------------- ");
		//
		// t.forEach((key, value) -> System.out.println(key + " " + value));

		// List<Integer> list = new ArrayList();
		// list.add(111);
		// list.add(222);
		// list.add(333);
		// list.add(444);
		//
		// // System.out.println(list);
		// int[] a = list.stream().mapToInt(i -> i).toArray();
		//
		// for (int j : a) {
		// System.out.println(j);
		// }
		//
		// List<String> s = new ArrayList<>();
		// s.add("a");
		// s.add("b");
		// s.add("c");
		// System.out.println(s);
		//
		// String[] s1 = s.toArray(new String[0]);
		// for (String string : s1) {
		// System.out.println(string);
		// }

		// System.out.println(" ------------------- ");
		//
		// String[] aa = {"q", "e", "t", "i"};
		//
		// List<String> ll = Arrays.asList(aa);
		//
		// System.out.println(ll);
		// System.out.println(" ======================== ");
		// ll.stream().forEach((i) -> System.out.println(i));
		// System.out.println(" +++++++++++++++++++++++++++ ");

		// List<Integer> list = new ArrayList();
		// list.add(111);
		// list.add(2);
		// list.add(33);
		// list.add(4);
		// System.out.println(list);
		// list.stream().filter((i) -> i % 2 == 0)
		// .forEach(i -> System.out.println(i));
		// System.out.println(
		// " sorted list using the stream API with Lambda expression.... ");
		//
		// list.stream().sorted().forEach(i -> System.out.println(i));
		//
		// System.out.println(" --------------------------- ");
		//
		// TreeMap<Integer, Double> t = new TreeMap<>();
		//
		// t.put(1, 55.4);
		// t.put(2, null);
		// t.put(4, null);
		// t.put(3, 5.0);
		//
		// for (Map.Entry<Integer, Double> entry : t.entrySet()) {
		// System.out.println(entry.getKey() + "-" + entry.getValue());
		// }
		//
		// List<Integer> i = new ArrayList<>(t.keySet());
		// System.out.println(i);
		// System.out.println(
		// " ------------8888888888888888888888888888888888------------- ");
		// List<Double> d = new ArrayList<>(t.values());
		// System.out.println(d);

		// Hashtable<Integer, String> h = new Hashtable<>();
		// h.put(1, "A");
		// h.put(2, "B");
		// h.put(3, "C");
		// // h.clear();
		//
		// for (Map.Entry<Integer, String> entry : h.entrySet()) {
		// System.out.println(entry.getKey() + " " + entry.getValue());
		// }

		// int i, j, k;
		// int n1 = 10, n2 = 100;
		// for (i = n1; i <= n2; i++) {
		// for (j = 2; j <= i; j++) {
		// if (i % j == 0) {
		// break;
		// }
		// }
		// if (i == j) {
		// System.out.println("prime numbers= " + i);
		// }
		// }

		// int n = 6;
		// int sum = 0;
		// int tem = n;
		// for (i = 1; i < 6; i++) {
		// if (n % i == 0) {
		// sum += i;
		// }
		// }
		// if (tem == sum) {
		// System.out.println(" this is perfect number.... ");
		// } else {
		// System.out.println(" not perfect number.... ");
		// }

		// int num = 121, r, sum = 0;
		// int tem = num;
		// while (num > 0) {
		// r = num % 10;
		// sum = (sum * 10) + r;
		// num = num / 10;
		// }
		// if (tem == sum) {
		// System.out.println(" the number is palindrome......");
		// } else {
		// System.out.println(" the number is not palindrome.....");
		// }

		// there are lot ways to check the string is palindrome or not 1. using
		// charAt() method of string 2. converting string to array toCharArray()
		// method 3. using the reverse() method of stringBuffer

		// String name = "jalindar";
		// String tem = name;
		// StringBuffer s = new StringBuffer(name);
		// System.out.println(s);
		// s.reverse();
		// System.out.println(s);
		// String s1 = s.toString();
		//
		// if (tem.equals(s1)) {
		// System.out.println(" palindrome string....");
		// } else {
		// System.out.println("not palindrome string...");
		// }

		// char[] s = name.toCharArray();
		// int l1 = s.length;
		// String tem = name;
		// int l = name.length();
		//
		// for (i = l1 - 1; i >= 0; i--) {
		// System.out.print(s[i]);
		// }
		// System.out.println();
		// if (tem == name) {
		// System.out.println(" the given string is palindrome string....");
		// } else {
		// System.out.println(" not palindrome string.... ");
		// }

		// int a[] = {5, 2, 3, 6, 7, 1, 9};
		//
		// for (int l : a) {
		// System.out.print(l + " ");
		// }
		// System.out.println(" after sorting the array...");
		// int tem;
		// for (i = 0; i < a.length; i++) {
		// for (j = i + 1; j < a.length; j++) {
		// if (a[i] > a[j]) {
		// tem = a[i];
		// a[i] = a[j];
		// a[j] = tem;
		// }
		// }
		// }
		// for (int l : a) {
		// System.out.print(l);
		// }
		// System.out.println();
		// System.out.println(" array in descending order....");
		//
		// for (i = 0; i < a.length; i++) {
		// for (j = i + 1; j < a.length; j++) {
		// if (a[i] < a[j]) {
		// tem = a[i];
		// a[i] = a[j];
		// a[j] = tem;
		// }
		// }
		// }
		// for (int l : a) {
		// System.out.print(l);
		// }

		// int a[] = {1, 2, 3, 4, 5};
		//
		// int element = 100;
		// int position = 1;
		//
		// int[] a1 = new int[a.length + 1];
		//
		// for (int l = 0; l < position; l++) {
		// a1[l] = a[l];
		// }
		//
		// a1[position] = element;
		//
		// for (int l = position; l < a.length; l++) {
		// a1[l + 1] = a[l];
		// }
		//
		// System.out.println(Arrays.toString(a1));
		//
		// String s1 = "abc";
		// char[] c1 = {'a', 'b', 'c'};
		// String s2 = new String(c1);
		// System.out.println(s1.equals(s2));
		// System.out.println(s1 == s2);

		// String input = "jalindarandhale";
		// String[] result = input.split(" ");
		// System.out.println(Arrays.toString(result));

		int i, j, n = 11, count = 0;
		int tem = n;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("prime number..");
		}

	}

}
