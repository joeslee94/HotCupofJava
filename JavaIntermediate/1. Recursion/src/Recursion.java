
public class Recursion {

	public static void main(String[] args)
	{
		sayHi(5);
		countBackwards(14);
	}
	
	//we need a basecase for sayHi to stop
	static void sayHi(int n)
	{
		//base case to tell when sayHi to step
		if (n==0)
		{
			System.out.println("n is 0!");
		}
		else
		{
			System.out.println("Hello.");
			n--;
			sayHi(n);
		}
	}
	
	static int count = 0; //count outside so when recursion strikes it doesnt reset it
	static void countBackwards(int x)
	{
		if(x==0)
		{
			System.out.println("You have reached 0");
			System.out.println("It took you " + count + " steps to reach 0");
		}
		else
		{
			count++;
			System.out.print(x + " ");
			x--;
			countBackwards(x);
		}
	}

}
