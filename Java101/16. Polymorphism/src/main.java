import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		//polymorphism ability of an object to identify as more than one type
		/*
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bicycle, boat};
		
		//so since all these objects are Vehicles they can be put into an array of that type
		
		for(Vehicle vic : racers) 
		{
			vic.go();
		}
		
		for(int i = 0; i < racers.length; i++)
		{
			racers[i].go();
		}
		*/
		
		//dynamic polymorphism = polymorphism during runtime
		//declare an object, but I do not know what I want just yet.
		//so during run time we choose what we want to be.
		//example is the male/female choice in pokemon
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.print("1 is a dog | 2 is a cat: ");
		int choice = scanner.nextInt();
		
		if(choice == 1)
		{
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2)
		{
			animal = new Cat();
			animal.speak();
		}
		else
		{
			animal = new Animal();
			animal.speak();
			System.out.println("You gave a invalid choice.");
		}
	}

}
