import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		//exceptions and how to handle them
		Scanner scanner = new Scanner(System.in);

		try 
		{
			
			System.out.print("Enter a number to be divided: ");
			int one = scanner.nextInt();
			
			System.out.print("Enter a number for the divisor: ");
			int two = scanner.nextInt();
			
			int three = one/two;
			System.out.println(three + " is your result");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Always print this block.");
			scanner.close();
		}

	}

}
