package Logical_Programs;

public class Stream_API_Java8 {
	public static void main(String[] args) {
		System.out.println(" ---------------------------- ...");
		String input = "ilovejavalanguage";
		//
		// String[] result = input.split("");
		// // System.out.println(Arrays.toString(result));
		//
		// // FINDING THE EACH CHARACTER OCCURENCE
		// Map<String, Long> map = Arrays.stream(input.split(""))
		// .collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting()));
		//
		// System.out.println(map + "-------------------------");
		//
		// Arrays.stream(input.split(""))
		// .collect(Collectors.groupingBy(Function.identity(),
		// Collectors.counting())).entrySet().stream().filter()

		// USING THE FILLTER METHOD OF STREAM API PRINTING THE VALUE ABOVE FIVE
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		// System.out.println(list);
		// List<Integer> mYIntegers = list.stream().filter(n -> n % 2 == 0)
		// .collect(Collectors.toList());
		// System.out.println(mYIntegers);

		// List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		//
		// List<String> words = list.stream().map(String::toUpperCase)
		// .collect(Collectors.toList());
		// System.out.println(words);

		// combining the two string with help of lambda method flatmap()
		// List<List<String>> list = Arrays.asList(
		// Arrays.asList("a,", "b", "c", "d"),
		// Arrays.asList("e", "f", "g", "h"));
		//
		// List<String> result = list.stream().flatMap(Collection::stream)
		// .collect(Collectors.toList());
		// System.out.println(result);

		// printing the only unique elements with help of distinct() method of
		// lambda expression
		// List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 4, 1, 4, 5);
		// System.out.println(list);
		// System.out.println("---------------------");
		// List<Integer> resultList = list.stream().distinct()
		// .collect(Collectors.toList());
		//
		// System.out.println(resultList);

		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// List<Integer> result = list.stream().limit(6)
		// .collect(Collectors.toList());
		// System.out.println(result);

		// skip() method of lambda expression
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//
		// List<Integer> L = list.stream().skip(5).collect(Collectors.toList());
		// System.out.println(L);

		// foreach() method of lambda expression printing the values...
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// list.stream().forEach(n -> System.out.println(n));

		// collect method to remove the items duplicate

		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 3, 5);
		// System.out.println(list);
		// System.out.println("___________________");
		//
		// Set<Integer> h = list.stream().collect(Collectors.toSet());
		// System.out.println(h);

		// finding the factorial with help of reduce() method of lambda
		// expression
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// System.out.println(list);
		// System.out.println("___________________________");
		//
		// Optional<Integer> l = list.stream().reduce((a, b) -> a * b);
		// System.out.println(" factorial of the number is : " + l);

		// allMatch method
		// List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		// boolean b = l.stream().allMatch(n -> n > 0);
		// System.out.println(b);

		// List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		// boolean b = l.stream().anyMatch(n -> n > 5);
		// System.out.println(b);

		// noneMatch

		// findfirst() is used to find a particular string is containing a word
		// or not
		// List<String> l = Arrays.asList("abc", "def", "ghi", "jkl", "mno");
		// Optional<String> s = l.stream().filter(n -> n.endsWith("o"))
		// .findFirst();
		//
		// System.out.println(s);

		// findAny() method of stream API IN LAMBDA EXPRESSION
		// List<String> l = Arrays.asList("abc", "def", "ghi", "jkl", "mno");
		// Optional<String> s = l.stream().filter(n ->
		// n.endsWith("f")).findAny();
		//
		// System.out.println(s);

		// finding the maximum number in list with max() method of lambda
		// expression
		// List<Integer> l = Arrays.asList(1, 3, 6, 7, 3, 8, 9, 10);
		// Optional<Integer> o = l.stream().max(Integer::compareTo);
		// System.out.println(o);

		// min() function of lambda expression
		// List<Integer> l = Arrays.asList(0, 1, 3, 6, 7, 3, 8, 9, 10);
		// Optional<Integer> o = l.stream().min(Integer::compareTo);
		// System.out.println(o);

		// toArray() method of lambda expression
		// List<String> s = Arrays.asList("jalindar", "andhale", "sonu");
		//
		// String[] a = s.stream().toArray(String[]::new);
		// for (String string : a) {
		// System.out.println(string);
		// }

		// joining() method...
		// List<String> s = Arrays.asList("jalindar", "andhale", "sonu");
		// System.out.println(s);
		// // String a = s.stream().collect(Collectors.joining(", ", "[", "]"));
		// String a = s.stream().collect(Collectors.joining(", "));
		// System.out.println(a);

	}

}
