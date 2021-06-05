package firstProject;

public class SwitchCase {
	public static void main(String[] args)
	{
		int n = 2;
		
		// String can be use in switch for version 1.7 and letter
		// double can't switch 
		switch(n)
		{
		case 1:
			System.out.print("one");
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("four");
			break;
		default:
			System.out.print("nothing");
			break;
		}
	}

}
