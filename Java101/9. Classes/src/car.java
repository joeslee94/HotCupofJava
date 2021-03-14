
public class car 
{
	//fields
	public String color;
	public double price;
	public int year;
	
	//constructors
	public car()
	{
		
	}
	
	public car(String color, double price, int year)
	{
		this.color = color;
		this.price = price;
		this.year = year;
	}

	//methods
	public void drive()
	{
		System.out.println("You are driving");
	}
	
	public void brake()
	{
		System.out.println("You hit the breakes");
	}
	
	public String toString()
	{
		return color + "\n" + price + "\n" + year;
	}

}
