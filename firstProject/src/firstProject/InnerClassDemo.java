package firstProject;

/*
 * Inner class
 * member class
 * static class
 * 
 */

class Outer
{
	int a;
	public void show()
	{
		
	}
//	class Inner           //Inner class
//	{
//		public void display()
//		{
//			System.out.println("Inner class");
//		}
//	}
	static class Inner           //Inner class Outer$Inner.class
	{
		public void display()
		{
			System.out.println("Inner class");
		}
	}
}

public class InnerClassDemo {
	// class contains  Variable, method and also class
	
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		
		// Creating Inner classs Object 
//		Outer.Inner obj1 = obj.new Inner();
//		obj1.display();
		
		// for static inner class refrence class name same as member class 
		//but object create using refrence class name
		Outer.Inner staticObj = new Outer.Inner();
		staticObj.display();
		
	}

}
