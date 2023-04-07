package programs;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		
		p2.num();
	}
	
	//Find smallest of three numbers
	
       public static void num()
     
       {
	int a,b,c,num,small;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First Number : ");
	a=s.nextInt();
	System.out.println("Enter the Second Number :");
	b=s.nextInt();
	System.out.println("Enter the Third Number :");
	c=s.nextInt();
	num=a<b ? a:b;
	small=c<num ? c:num;
	System.out.println(small + " is Smallest Number");
	
}
}
