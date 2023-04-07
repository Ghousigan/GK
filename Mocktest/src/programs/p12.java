package programs;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		//use conditional operator and find smallest of two numbers
		
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=s.nextInt();
		System.out.println("Enter Second Number :");
		b=s.nextInt();
		if(a<b)
		{
			System.out.println(a + " is Smallest ");
		}
		else
		{
			System.out.println(b + " is Smallest ");
		}
	}

}
