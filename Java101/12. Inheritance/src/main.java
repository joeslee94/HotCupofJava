
public class main {

	public static void main(String[] args) 
	{
		//Vehicle vehicleOne = new Vehicle();
		
		Car carOne = new Car(70, 4, 20.6, 90000.00);
		Truck truckOne = new Truck(80, 8, 16, "big");
		
		//initial go from vehicle we can inherit and print what the vic prints
		//vehicleOne.go();
		
		//overriding the go method
		carOne.go();
		truckOne.go();
		
		System.out.println(truckOne);
		System.out.println(carOne);
		
	}

}
