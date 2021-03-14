import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import java.util.Random;
public class main 
{

	public static void main(String[] args) 
	{
		//operators
		/*
		int friends = 10;
		double friends2 = 11;
		
		friends = friends % 3; //remainder 1 so prints 1
		friends++; //adds 1 to friends
		friends--; //takes 1 from a friend
		friends /= 2; //is 5
		friends /= 3; //is 3 because the decimal falls off 
		friends2 = friends2 / 3; //can perform because doubles can have decimals 
		System.out.println(friends);
		*/
		
		//Math. functions and hypotnuse calculator
		//Math.round, ceil, floor abs, max, min
		/*
		int sideA = Integer.parseInt(JOptionPane.showInputDialog("Enter in a side of a triangle."));
		int sideB = Integer.parseInt(JOptionPane.showInputDialog("Enter in the second side of a triangle."));
		double hypotnuse = Math.sqrt(sideA*sideA + sideB*sideB);
		DecimalFormat hypotnuseRounded = new DecimalFormat("#.0000");
		JOptionPane.showMessageDialog(null, "You inputed " + sideA + " and " + sideB + ". The hypotnuse with these values is: " + hypotnuseRounded.format(hypotnuse));
		*/
		
		//Random class
		/*
		Random randomGen = new Random();
		//int x = randomGen.nextInt(6);
		boolean x = randomGen.nextBoolean();
		System.out.println(x);
		*/
	}

}
