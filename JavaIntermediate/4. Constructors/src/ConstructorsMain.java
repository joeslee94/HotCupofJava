
public class ConstructorsMain
{

	public static void main(String[] args)
	{
		Shirt firstShirt = new Shirt("Black", 'M', "BrandyBrand");
		firstShirt.wear();
		firstShirt.takeOff();
		
		firstShirt.GetColor();
		firstShirt.SetColor("Grey");
		System.out.println("Changing Colors");
		firstShirt.GetColor();

	}

}
