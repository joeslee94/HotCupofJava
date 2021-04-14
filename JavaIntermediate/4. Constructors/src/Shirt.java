
public class Shirt
{
	private String color;
	private char size;
	private String brand;
	
	Shirt() {}
	
	Shirt(String aColor, char aSize, String aBrand)
	{
		color = SetColor(aColor);
		size = aSize;
		brand = aBrand;
	}
	
	public void GetColor()
	{
		System.out.println(this.color);
	}
	
	public String SetColor(String aColor)
	{
		color = aColor;
		return color;
	}
	
	public static void wear()
	{
		System.out.println("You are wearing the shirt");
	}
	
	public static void takeOff()
	{
		System.out.println("Take off the shirt");
	}
}
