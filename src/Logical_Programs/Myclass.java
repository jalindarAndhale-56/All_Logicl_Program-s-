package Logical_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Myclass
{
	public static void main(String[] args) 
	{
		
		//System.out.println(" hiii i am learning the Core Java ");
		// array list is non-synchronized 
		// null insertion is possible	
		
//		ArrayList a=new ArrayList();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		a.add(5);
//		System.out.println(a);
//		System.out.println(a.contains(4));
			
//		Object[] aa=a.toArray();
//		System.out.println(Arrays.toString(aa));
		

//		List<Object> list=Arrays.asList(aa);
//		System.out.println();
		
		
//		Object[] b=a.toArray();
//		
//		System.out.println(Arrays.toString(b));
//		
//		 String[] array = {"A", "B", "C"};
//	        
//	        // Convert array to list
//	        List<String> list1 = Arrays.asList(array);
//	        
//	        // Print the list
//	        System.out.println("List: " + list1);
	    			
//		Map<String, Integer> map=new HashMap<>();
//		map.put("one", 1);
//		map.put("two", 2);
//		map.put("tree", 3);
//		map.put("four", 4);		
//		for(Map.Entry<String, Integer> entry : map.entrySet())
//		{
//			System.out.println(entry.getKey()+"  --  "+entry.getValue());
//		}	
		
//		int[] arr= {1,2,3,4,5,6,7};
//		
//		int l=arr.length;
//		
//		for(int i=l-1;i>=0;i--)
//		{
//			System.out.println(arr[i]);
//		}
		
		
		
		String name=" jalindar andhale";
		
		int[] i=change();	
		
		for(int i1:i)
		{
			System.out.println(i1*3);
		}
		System.out.println(name);
		
	}

	
	 static int[] change() {
		 int[] a= {1,2,3,4,5}; 
		 return a;
	}
}
