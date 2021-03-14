
public class main 
{

	public static void main(String[] args) 
	{
		//passing in values for fields
		/*
		car1.color = "blue";
		car1.price = 70000.99;
		car1.year = 2010;
		
		car2.color = "red";
		car2.price = 70000.01;
		car2.year = 2015;
		*/
		
		//using constructors for the fields
		car car1 = new car("yellow", 80000, 2009);
		car car2 = new car("green", 75000, 2010);
		
		//Printing via toString Method implicitly
		System.out.println(car1);
		System.out.println(car2);
		
		//Printing via HelperMethod
		//printCarDetails(car1);
		//printCarDetails(car2);
		
		//Printing via sysout
		//System.out.println("Car1 Attributes: " + car1.color + " " + car1.price + " " + car1.year);
		//System.out.println("Car2 Attributes: " + car2.color + " " + car2.price + " " + car2.year);
	}
	
	static void printCarDetails(car car)
	{
		System.out.println("Car Attributes: " + car.color + " " + car.price + " " + car.year);
	}
}
