
public class Truck extends Vehicle
{
	int wheels;
	String size;
	
	Truck(double speed, double windows, int wheels, String size)
	{
		super(speed, windows);
		this.wheels = wheels;
		this.size = size;
	}
	//overriding
	@Override
	void go()
	{
		System.out.println("The TRUCK is moving.");
	}
	
	public String toString()
	{
		return speed + "\n" + windows + "\n"  + wheels + "\n"  + size;
	}
}
