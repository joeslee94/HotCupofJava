
public class Car 
{
	private String make;
	private String model;
	private int year;
	
	//private can only be used here.
	
	Car(String make, String model, int year)
	{
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(Car car)
	{
		car.copy(car);
	}
	//copy
	public void copy(Car carCopy)
	{
		this.setMake(carCopy.getMake());
		this.setModel(carCopy.getModel());
		this.setYear(carCopy.getYear());
	}
	
	//GET to allow main to get them
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	//SET to allow main to set them
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
}
