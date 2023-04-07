package programs;

public class p14 {
	
	public static void main(String[] args) {
		//use default non static method and find area of semicircle
		
		//0.5*3.14*r*r;
		p14 p=new p14();
		p.semi();
		
		
	}
	public void semi()
	{
		double  r=5.145;
		System.out.println("Area of semi circle " +0.5*3.14*r*r);
	}

}
