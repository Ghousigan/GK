package programs;

public class p8 {
	public static void main(String[] args) {
		
		// overload non static method and find  product of two numbers and three numbers
		p8 p=new p8();
		p.pro();
		p.pro(5, 8, 7);
		p.pro(5.2, 4.9, 8);
	}
	public void pro()            //Datatype
	{
		int g=1;
		int k=2;
		int s=6;
		System.out.println("The Product of Three Numbers is "+g*k*s);
	
	}
	public void pro(int a,int b,int c)          //Parameter and Sequence
	{
		System.out.println("The Product of Three Numbers is "+a*b*c);
	
	}
	public void pro(double i, double j, int k)
	{
		System.out.println("The Product of Three Numbers is "+i*j*k);

	}

}
