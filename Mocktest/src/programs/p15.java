package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p15 {
   // l=[4,6,7,8,0]. Use stream map function and add 3 to each value present in l, sort the value using sorted  function
	
	public static void main(String[] args) {
		
		List <Integer> number= Arrays.asList(4,6,7,8,0);
		List <Integer> add=number.stream().map(l -> l+3).collect(Collectors.toList());
		System.out.println(add);
		
		List<Integer> sort=number.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		
		
		
	}
}
