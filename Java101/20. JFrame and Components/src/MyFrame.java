import java.awt.Color;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame()
	{	
		this.setTitle("First MyFrame"); //Set JFrame Title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit frame when X button is clicked
		this.setResizable(false); //cannot resize the screen
		this.setSize(300, 300); //sets x and y dimension of the JFrame
		this.setVisible(true); //set JFrame to be viewable
		
		//to change the logo in the windows bring in an image to the project
		Image img;
		try 
		{
			img = ImageIO.read(getClass().getResource("logo.png"));
			this.setIconImage(img);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ImageIcon image = new ImageIcon("logo.png");
		//this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(200, 200, 20));
	}
}
