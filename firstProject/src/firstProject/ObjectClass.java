package firstProject;

class Calc
{
	int num1; // instance variable
	int num2;
	int result;
	
	public Calc(int num1, int num2) // constructor
	{
		this.num1 = num1;  //current object
		this.num2 = num2;
	}
	
	// Java initialize the value of variable bydefult 0.
	int add(int x, int y) // x, y  are local variable
	{
		result = num1 + num2;
		return x + y;
	}
	
	
}

class Emp
{
	int eid;
	int salary;
	static String ceo = "Kundan"; // static variable is same for all the object
	// If don't want variable as object specific then use static variable
	// for access static variable we can use object name or class name both will work
	// for access static variable don't need object
	// non static variable can't be access in 
	static {
		
		System.out.println("static");// when load a class
	}

	public Emp()
	{
		System.out.println("constructor");// Call when create object
	}
	
}

class Casio
{
	int num1 = 0;
	int num2 = 0;
	String op; 
	
	// constructor overloading  same in constructor name but different in parameter
	public Casio()
	{
		
	}
	public Casio(int x)
	{
		
	}
	public Casio(int x, int y)
	{
		
	}
	// method overloading same method name but have different Parameter
	
	void add(int i, int j)
	{
		
	}
	void add(int i, int j, int k)
	{
		
	}
	void add(double i, double j0)
	{
		
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calc obj; // obj is refrence of class
		//obj = new Calc(); // new Calc is object and their refrence store in obj
		// new keyword create object by using class constructor
		
		Calc obj = new Calc(10, 15);
//		obj.num1 = 3;
//		obj.num2 = 2;
		int sum = obj.add(6,10);
		System.out.println(obj.result);
		System.out.println(sum);
//		Emp.ceo = "Kavi";
		System.out.println(Emp.ceo);
		Emp e1 = new Emp();
		Emp e2 = new Emp();
	}

}
