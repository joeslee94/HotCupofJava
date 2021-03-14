import java.util.ArrayList;

public class main 
{

	public static void main(String[] args)
	{
		//simple arrays
		/*
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		System.out.println(cars[0]);
		
		cars[0] = "NewCarInIndex0";
		
		for(int i = 0; i < cars.length; i++)
		{
			System.out.println(cars[i]);
		}
		
		int[] nums = new int[7];
		nums[0] = 1;
		nums[1] = 1;
		nums[2] = 1;
		nums[3] = 1;
		nums[4] = 1;
		nums[5] = 1;
		nums[6] = 1;		
		*/
		
		//2D arrays: array inside of an array
		/*
		String[][] carParkingLot =
		{
			{"Car1", "Car2", "Car3"},
			{"Car4", "Car5", "Car6"},
			{"Car7", "Car8", "Car9"}
		};
		
		for(int i = 0; i < carParkingLot.length; i++)
		{
			System.out.println();
			for(int j = 0; j < carParkingLot[i].length; j++)
			{
				System.out.print(" " + carParkingLot[i][j]);
			}
		}
		*/
		
		//String reference data type and methods of reference data types
		/*
		String name = "Joe";
		boolean equalNames = name.equals("Joe");
		boolean isEmpty = name.isEmpty();
		System.out.println("Are they equal? " + equalNames + "Is my name empty? " + isEmpty);
		
		char nameChar = name.charAt(0);
		System.out.println(nameChar);
		
		int charIndex = name.indexOf('J');
		System.out.println(charIndex);
		*/
		
		//wrapper classes provides a way to use primitive data types as ref data types
		//primitive    //wrapper
		//bool    -->    Bool
		//char    -->    Char
		//int     -->    Int
		//double  -->    Double
		
		//autoboxing = auto conversion from Java compiler makes between primitive to wrapper class
		//unboxing = auto conversion of wrapper class to primitive type
		/*
		Boolean refBool = true;
		Character refChar = 'A';
		Integer refInt = 123;
		Double refDouble = 4.12312;
		String alreadyRef = "yourName";
		
		refBool.compareTo(refBool);
		refChar.compareTo(refChar);
		refInt.byteValue();
		refDouble.describeConstable();
		alreadyRef.charAt(5);
		*/
		
		//ArrayList IF we need to store list of ints we need to use wrapper class so it would be Integer
		/*
		ArrayList<String> foodMenu = new ArrayList<String>();
		foodMenu.add("food1");
		foodMenu.add("food2");
		foodMenu.add("food3");
		foodMenu.add("food4");
		foodMenu.add("food5");
		foodMenu.add("food6");
		foodMenu.add("food7");
		foodMenu.add("food8");
		
		foodMenu.set(0, "food1.1");
		foodMenu.remove(3);
		
		for(int i = 0; i < foodMenu.size(); i++)
		{
			System.out.println(foodMenu.get(i));
		}
		foodMenu.clear();
		*/
		
		//2D ArrayList can change size of list dynamically
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("bread1");
		bakeryList.add("bread2");
		bakeryList.add("bread3");
		
		ArrayList<String> groceryList = new ArrayList<String>();
		groceryList.add("grocery1");
		groceryList.add("grocery2");
		groceryList.add("grocery3");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("drink1");
		drinksList.add("drink2");
		drinksList.add("drink3");
		
		ArrayList<ArrayList<String>> shoppingList = new ArrayList<ArrayList<String>>();
		shoppingList.add(bakeryList);
		shoppingList.add(groceryList);
		shoppingList.add(drinksList);
		
		System.out.println(shoppingList.get(0).get(2));
		
		
	}

}
