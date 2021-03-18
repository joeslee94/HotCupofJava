import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class main {

	public static void main(String[] args) 
	{
		//ICONS
		ImageIcon image = new ImageIcon("C:\\Users\\Joe Lee\\Desktop\\mario.png");
		
		//BORDER
		Border border = BorderFactory.createLineBorder(Color.CYAN, 4);
		
		
		//LABELS
		//or it can be JLabel label = new JLabel("This is the first label ever.");
		JLabel label = new JLabel("There are images and texts"); //brings in text into the frame
		label.setIcon(image); //brings in image into JFrame
		label.setHorizontalTextPosition(JLabel.CENTER); //set txt left, center, right of image
		label.setVerticalTextPosition(JLabel.TOP); //set txt top, center, bottom of image
		label.setForeground(new Color(0x00FF00)); //color of text
		label.setFont(new Font("MV Boli", Font.BOLD, 30)); //font of text
		label.setIconTextGap(-25); //space between text and image
		label.setBackground(Color.black); //changes the color to label
		label.setOpaque(true); //label likes to take up as much room as possible
		label.setBorder(border); //set borders
		label.setVerticalAlignment(JLabel.CENTER); //centers the label vertically
		label.setHorizontalAlignment(JLabel.CENTER); //centers the label horizontally
		
		//JFRAME
		JFrame frame = new JFrame();
		frame.setTitle("First JFrame"); //Set JFrame Title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit frame when X button is clicked
		//frame.setResizable(false); //cannot resize the screen
		//frame.setSize(600, 600); //sets x and y dimension of the JFrame
		frame.setVisible(true); //set JFrame to be viewable
		
		//MUST ADD LABEL
		frame.add(label);
		//frame.add(label2); //OVERRIDES THE FIRST LABEL interesting
		
		//Resize the frame to resize the frame to fit the components inside of the frame
		frame.pack();

	}

}
