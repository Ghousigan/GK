package programs;

import java.util.TreeSet;

public class p5 {
public static void main(String[] args) {
	//Create a tree set of boolean data type, add elements, iterate through it 
	TreeSet<Integer> b=new TreeSet<>();
	b.add(5);
	b.add(8);
	System.out.println(b);
	
	boolean val=b.add(5);
	System.out.println(val);
	
	for(Integer x: b)
	{
		System.out.println(x);
	}
	
	
     
	
	
}

}
