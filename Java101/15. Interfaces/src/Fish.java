
public class Fish implements Prey, Predator
{
	public void hunt()
	{
		System.out.println("The bigger fish is hunting smaller fish.");
	}
	
	public void flee()
	{
		System.out.println("This fish is smaller and is running away.");
	}
}
