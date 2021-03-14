import java.util.Scanner;

public class main 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hello "+ name);
		
		System.out.println("What is your age?");
		int age = scanner.nextInt(); //exception handling
		scanner.nextLine();
		System.out.println("You are "+ age + " years old.");
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		System.out.println("Your favorite food is "+ food);	
		//does not allow us to input because there is already a new line from nextInt and nextLine reads the \n
		//to resolve this we add a scanner.nextLine to clear it out
	}

}
