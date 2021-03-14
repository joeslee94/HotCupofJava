
public class Car extends Vehicle
{
	double fuelEfficiency;
	double price;
	
	Car(double speed, double windows, double fuelEfficiency, double price)
	{
		super(speed, windows);
		this.fuelEfficiency = fuelEfficiency;
		this.price = price;
	}

	//overriding
	@Override
	void go()
	{
		System.out.println("The CAR is moving.");
	}
	
	public String toString()
	{
		return speed + "\n" + windows + "\n"  + fuelEfficiency + "\n"  + price;
	}
}
