public class EnumMain
{

	enum FLAVOR
	{
		CHOCOLATE,
		VANILLA,
		STRAWBERRY;
		
		public static void GetVanilla()
		{
			System.out.println("Can't believe it's " + FLAVOR.VANILLA);
		}
	}

	public static void main(String[] args)
	{
		//class + array have a baby
//		String[] levels = {"Low", "Medium", "High"};
//		System.out.println(levels[0]);
//		System.out.println(levels[1]);
//		System.out.println(levels[2]);
		
//		System.out.println(LEVELS.LOW);
//		System.out.println(LEVELS.MEDIUM);
//		System.out.println(LEVELS.HIGH);
		
//		LEVELS L = LEVELS.LOW;
//		
//		switch(L)
//		{
//			case LOW:
//				System.out.println("Low level");
//				break;
//			case MEDIUM:
//				System.out.println("Medium level");
//				break;
//			case HIGH:
//				System.out.println("High level");
//				break;
//		}
		
		FLAVOR AFLAVOR = FLAVOR.CHOCOLATE;
//		FLAVOR AFLAVOR = FLAVOR.VANILLA;
//		FLAVOR AFLAVOR = FLAVOR.STRAWBERRY;
		
		switch(AFLAVOR)
		{
			case CHOCOLATE:
				System.out.println("It's CHOCOLATE");
				break;
			case VANILLA:
				System.out.println("It'sVANILLA");
				break;
			case STRAWBERRY:
				System.out.println("It'sSTRAWBERRY");
				break;
		}
		
		FLAVOR.GetVanilla();
		AFLAVOR.GetVanilla();

	}

}

//enum LEVELS
//{
//	LOW, MEDIUM, HIGH;
//}
