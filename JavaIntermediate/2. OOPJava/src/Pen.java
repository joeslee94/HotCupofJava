
public class Pen
{
	public String InkColor;
	public String Brand;
	public String GelOrInk;
	public int Size;
	
	Pen(String aInkColor, String aBrand, String aGelOrInk, int aSize)
	{
		InkColor = aInkColor;
		Brand = aBrand;
		GelOrInk = aGelOrInk;
		Size = aSize;
	};
	
	boolean Click()
	{
		return true;
	}
	
	boolean ClickAgain()
	{
		return false;
	}
	
	void Write(boolean clicked)
	{
		if(clicked == true)
		{
			System.out.println("The pen is writing.");
		}
		else
			System.out.println("The pen cannot write because it is not clicked.");
	}
}
