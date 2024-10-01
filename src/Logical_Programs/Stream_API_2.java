package Logical_Programs;

import java.util.Arrays;
import java.util.List;

public class Stream_API_2 {

	public static void main(String[] args) {

		System.out.println("--------------------");

		List<Integer> l = List.of(11, 22, 33, 4, 5, 6, 7, 8, 9, 10);
		List<String> s = Arrays.asList("ankit", "balu", "amol", "dada", "esha",
				"father");
		// List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

		// System.out.println(l);
		// l.stream().filter(n -> n % 2 == 0).forEach(n ->
		// System.out.println(n));
		// stream api coolection process
		// collection / group of object

		// l.stream().filter(i -> i > 5 && i % 2 == 0)
		// .forEach(i -> System.out.println(i));

		// Stream<Integer> s = Stream.empty();
		//
		// String[] s1 = {"ankit", "balu", "amol", "dada", "esha", "father"};
		// Stream<Object> ss = Stream.of(s1);
		// ss.forEach(n -> System.out.println(n));

		// s.stream().filter(n -> n.startsWith("a"))
		// .forEach(n -> System.out.println(n));
		// System.out.println("----------------------");
		// l.stream().map(i -> i * i).forEach(i -> System.out.println(i));
		// l.stream().sorted().forEach(n -> System.out.println(n));

		Integer i = l.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(i);

	}

}
