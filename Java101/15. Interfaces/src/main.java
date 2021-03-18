
public class main {

	public static void main(String[] args)
	{
		//interfaces are implemented by the class
		//if the class implements an interface they must define the methods in the interface
		//interface has methods that will not be defined, but must be implemented by classes
		
		Rabbit rabbitOne = new Rabbit();
		rabbitOne.flee();
		
		Hawk hawkOne = new Hawk();
		hawkOne.hunt();
		
		Fish fishOne = new Fish();
		Fish fishTwo = new Fish();
		
		fishOne.flee();
		fishTwo.hunt();
	}

}
