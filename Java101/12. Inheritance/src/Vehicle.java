
public class Vehicle
{
	double speed;
	double windows;

	Vehicle()
	{
		
	}
	
	Vehicle(double speed, double windows)
	{
		this.speed = speed;
		this.windows = windows;
	}
	
	void go()
	{
		System.out.println("The vehicle is moving.");
	}
	
	void stop()
	{
		System.out.println("The vehicle has stopped.");
	}
}
