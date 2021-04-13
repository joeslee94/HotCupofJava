
public class OOP
{

	public static void main(String[] args)
	{
		Pen GelPen = new Pen("Blue", "BIC", "Gel", 1);
		System.out.println(GelPen.InkColor);
		System.out.println(GelPen.GelOrInk);
		System.out.println(GelPen.Brand);
		System.out.println(GelPen.Size);
		
		GelPen.Write(GelPen.Click());
		GelPen.Write(GelPen.ClickAgain());
		
		System.out.println("-------------------------------------------");
		
		HeadPhones Logitech = new HeadPhones("Logitech", "Black", true);
		System.out.println(Logitech.brand);
		System.out.println(Logitech.color);
		System.out.println(Logitech.wireless);
		
		Logitech.Play(Logitech.TurnOn());
		Logitech.Play(Logitech.TurnOff());
	}

}
