
public class main 
{

	public static void main(String[] args) 
	{
		//static a single copy of a variable, method, is created and shared
		//the class owns the static member
		
		Friend friend1 = new Friend("friendOne");
		Friend friend2 = new Friend("friendTwo");
		Friend friend3 = new Friend("friendThree");
		Friend friend4 = new Friend("friendFour");
		
		//System.out.println(Friend.numberOfFriends);
		Friend.numOfFriends();

	}

}

class Friend
{
	String name;
	static int numberOfFriends;
	//IF static is removed can't access via Friend.numberOfFriends
	//CAN only access this int by the friends created
	//However, since it isn't tied to the method, the numberOfFriends will only be 1 because only 1 friend was made in each instance of the class
	
	Friend(String name)
	{
		this.name = name;
		numberOfFriends++;
	}
	
	static void numOfFriends()
	{
		System.out.println("You have " + numberOfFriends + " friends");
	}
}