public class thisMain 
{
	int a, b;
	
	public void setData(int a , int b)
	{
		//this is a reference to the PARAMETERS
		this.a = a;
		this.b = b;
	}
	
	String food;
	char size;
	
	public void foodOnSpoon(String food, char size)
	{
		this.food = food;
		this.size = size;
	}

	public static void main(String[] args)
	{
		thisMain thisObject = new thisMain();
		thisObject.setData(10, 100);
		
		System.out.println(thisObject.a);
		System.out.println(thisObject.b);
		
		thisMain newSpoon = new thisMain();
		newSpoon.foodOnSpoon("scraps", 'L');
		
		System.out.println(newSpoon.food);
		System.out.println(newSpoon.size);
	}

}
