public class HeadPhones
{
	public String brand;
	public String color;
	public boolean wireless = true;
	
	HeadPhones(String aBrand, String aColor, boolean aWireless)
	{
		brand = aBrand;
		color = aColor;
		wireless = aWireless;
	}
	
	boolean TurnOn()
	{
		return true;
	}
	
	boolean TurnOff()
	{
		return false;
	}
	
	void Play(boolean turnedOn)
	{
		if(turnedOn == true)
		{
			System.out.println("The headphones can now play audio.");
		}
		else
			System.out.println("The headphones are off! They cannot play music.");
	}
}
