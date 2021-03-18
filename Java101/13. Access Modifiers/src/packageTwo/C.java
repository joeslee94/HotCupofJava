package packageTwo;
import packageOne.A;

public class C extends A
{
	/*
	public static void main(String[] args) 
	{
		//public, protected, private
		D d = new D();
		System.out.println(d.defaultMessage);
		//the print message is seen in C
	}
	*/
	
	public static void main(String[] args) 
	{
		//public, protected, private
		D d = new D();
		System.out.println(d.protectedMessage);
		//the print message is seen in C
	}
}
