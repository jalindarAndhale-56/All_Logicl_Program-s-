package Logical_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// the Set.of is a factory method to create immutable sets with a fixed
		// number of elements
		Set<String> set = Set.of("Apple", "Banana", "Cherry");

		System.out.println(set); // Output: [Apple, Banana, Cherry]f

		System.out.println(" =-==================== ");

		// Map<Integer, String> map = new HashMap<>();
		//
		// map.put(1, "A");
		// map.put(2, "B");
		// map.put(3, "C");
		// map.put(4, "D");
		//
		// // null insertion is also possible in the value or keys
		// // map.put(null, null);
		// // map.put(null, null);
		//
		// Set<Entry<Integer, String>> s = map.entrySet();
		//
		// for (Map.Entry<Integer, String> entry : map.entrySet()) {
		// System.out.print(entry + " ");
		// System.out.println();
		// }
		//
		// System.out.println(" ------------------------------------- ");
		//
		// for (Integer string : map.keySet()) {
		// System.out.println(string);
		// }
		//
		// for (String string : map.values()) {
		// System.out.println(string);
		// }

		// Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		//
		// linkedHashMap.put("second", 2); // Order is maintained
		// linkedHashMap.put("first", 1);
		//
		// for (Map.Entry<String, Integer> s : linkedHashMap.entrySet()) {
		// System.out.println(s);
		// }

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

		for (Entry<Integer, String> L : list) {
			System.out.println(L);
		}

		System.out.println(" =============================== ");
		String i = map.get(1);
		System.out.println(i);

	}

}
