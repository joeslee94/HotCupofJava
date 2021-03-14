
public class main 
{

	public static void main(String[] args) 
	{
		/*
		String name = "Joe";
		int age = 27;
		methodsInJava(name, age);
		
		int twoMoreYears = 2;
		System.out.println(returnANumber(age, twoMoreYears));
		*/
		
		System.out.println(overLoadedMethod());
		System.out.println(overLoadedMethod(2, 4));
		System.out.println(overLoadedMethod(4, 5, 6));

	}
	
	//Methods
	/*
	static void methodsInJava(String name, int age)
	{
		System.out.println("Hello " + name + " You are " + age + " years old");
	}
	
	static int returnANumber(int one, int two)
	{
		return one + two;
	}
	*/
	
	//Overloaded Methods
	static int overLoadedMethod()
	{
		return 0;
	}
	
	static int overLoadedMethod(int a, int b)
	{
		return a + b;
	}
	
	static int overLoadedMethod(int a, int b, int c)
	{
		return a + b + c;
	}
}
