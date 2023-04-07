package programs;

import java.util.HashMap;

public class p4 {
	public static void main(String[] args) {
		
		//Create a hashmap, key should be of integer datatype and element should be of String data type, add elements, remove elements and display key alone
		
		HashMap<Integer,String> i=new HashMap<>();
		i.put(5, "Inba");
		i.put(4, "Ghousi");
		i.put(3, "Kowsi");
		i.put(2, "Kumar");
		i.put(1, "Sumathi");
		System.out.println(i);
		
		i.remove(1);
		System.out.println(i);
		
		System.out.println(i.values());
		
		System.out.println(i.keySet());
		
		
		
	}

}
