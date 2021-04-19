interface IWaterBottle
{
	String color = "Green";
	void FillUp();
	void Drink();
}

public class InterfaceMain implements IWaterBottle
{
	//having multiple interfaces might be the best
	public static void main(String[] args) 
	{
		InterfaceMain example = new InterfaceMain();
		
		example.FillUp();
		example.Drink();
		System.out.println(example.color);
	}
	
	@Override
	public void FillUp()
	{
		System.out.println("The water is filled up.");
	}
	
	@Override
	public void Drink()
	{
		System.out.println("You drink from the water bottle.");
	}

}

//Interface expects all methods not to be implemented JUST LISTED