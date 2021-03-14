import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
		
		//If statements
		/*
		int age = 15;
		
		if(age >= 18)
		{
			System.out.println("You are an adult.");
		}
		else if(17 >= age && age >=13)
		{
			System.out.println("You are a teenager.");
		}
		else
		{
			System.out.println("You are not an adult.");
		}
		*/
		
		//Switch statements
		/*
		String day = "Friday";
		
		switch(day)
		{
			case "Sunday": System.out.println("It is sunday");
			break;
			case "Monday": System.out.println("It is monday");
			break;
			case "Tuesday": System.out.println("It is tuesday");
			break;
			case "Wednesday": System.out.println("It is Wednesday");
			break;
			case "Thursday": System.out.println("It is Thursday");
			break;
			case "Friday": System.out.println("It is friday");
			break;
			case "Saturday": System.out.println("It is saturday");
			break;
			default: System.out.println("You did not enter in a day of the week.");
		}
		*/
		
		//Logical Operators
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are in game. Type q or Q to quit.");
		String response = scanner.next();
		
		if(response.equals("Q") || response.equals("q"))
		{
			System.out.println("You have quit the game.");
		}
		else
		{
			System.out.println("Continue playing.");
		}
		*/
		
		//while loops
		/*
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) 
		{
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		*/
		
		//for loops
		/*
		for(int i = 10; i >= 0; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("Happy New Year!");
		*/
		
		//nested loops
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol: ");
		symbol = scanner.next();
		
		for(int i = 1; i <= rows; i++)
		{
			System.out.println();
			for(int j = 1; j <= columns; j++)
			{
				System.out.print(symbol);
			}
		}
	}

}
