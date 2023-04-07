package programs;

public class p9 extends pp9{
	public static void main(String[] args) {
		
		//override non static method and find average of two numbers and three numbers
		p9 p=new p9();
		p.d();
		p.d1();
		
		//child class
		p.inba();
		
	}
	
	public void inba()
	{
		int l=3;
		int b=4;
		System.out.println(+l*b);
	}

}
