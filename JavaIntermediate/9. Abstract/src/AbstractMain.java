
public class AbstractMain
{

	public static void main(String[] args)
	{
		ToyPoodle toy = new ToyPoodle();
		toy.Bark();
		toy.Whine();
		toy.color = "Toasted Brown";
		toy.breed = "Toy Poodle";
		
		System.out.println("Toy Poodle Color is " + toy.color + "." + " The Dog is a " + toy.breed + ".");
	}

}

class ToyPoodle extends Dog
{
	@Override
	void Bark()
	{
		System.out.println("bark! bark! bark!");
	}
	
	@Override
	void Whine()
	{
		System.out.println("I'm not going to stop until I get treats.");
	}
}

abstract class Dog
{
	String breed;
	String color;
	
	void Bark() 
	{
		System.out.println("Bark, Bark");
	}
	
	void Whine()
	{
		System.out.println(":[");
	}
	
	void Sleep() {};
}

//ABSTRACT class is extended
//Also, the methods can be implemented