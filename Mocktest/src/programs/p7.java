package programs;

public class p7 {
	
	public static void main(String[] args) {
		
		//Create a static method and display student name, age, and school name (use parameters)
		p7.d("Ghousigan", 25, "Sri Vidhya");
		
		
	}
	public static void d(String s, int age, String sch)
	{
		System.out.println("Name is " +s);
		System.out.println("Age is "+age);
		System.out.println("School Name is " +sch);
	}

}
