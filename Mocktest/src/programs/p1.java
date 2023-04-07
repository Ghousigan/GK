package programs;

import java.util.Scanner;

public class p1 { 
	// Get a number from user and check whether it is odd or even
	public static void main(String[] args) {
		p1.main();
		
	}
	public static void main()
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the number one by one ");
			int a=s.nextInt();
			if(a % 2 ==0)
			{
				System.out.println(a+ " is Even Number");
			}
			else
			{
				System.out.println(a+ " is Odd Number");
			}
		}
		
	}
	
	

}
