
public class main {

	public static void main(String[] args)
	{
		Car carOne = new Car("Subaru", "Crosstrek", 2019);
		Car carTwo = new Car("SecondBrand", "BrandModel", 2022);
		
		//carTwo.copy(carOne);
		Car carThree = new Car(carOne);
		
		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println(carThree);
		
		//carTwo = carOne; //DO NOT DO THIS this will give both instances of a class the SAME memory address.
		
		//System.out.println(carOne);
		//System.out.println(carTwo);
		
		
		//GET
		System.out.println(carOne.getMake());
		System.out.println(carOne.getModel());
		System.out.println(carOne.getYear());
		
		//SET
		carOne.setMake("Subie");
		carOne.setModel("Crosstreky");
		carOne.setYear(2021);
		
		//GET Again
		System.out.println(carOne.getMake());
		System.out.println(carOne.getModel());
		System.out.println(carOne.getYear());

	}

}
