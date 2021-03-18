import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {

	public static void main(String[] args) 
	{
		
		//JPanel sections off JFrame
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.setBounds(0,0, 250, 250); //sets bounds and size of panel
		panel1.setLayout(new BorderLayout());
		
		panel2.setBackground(Color.blue);
		panel2.setBounds(0, 250, 250, 250);
		panel2.setLayout(new BorderLayout());

		
		panel3.setBackground(Color.green);
		panel3.setBounds(250,0, 250, 500);
		panel3.setLayout(new BorderLayout());
		
		//LABELS
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setBounds(100, 100, 75, 75);
		
		//ICON
		ImageIcon icon = new ImageIcon("C:\\Users\\Joe Lee\\Desktop\\mario.png");
		//label.setIcon(icon);
		
		//FRAME
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		//ADD PANEL to FRAME
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
		//ADD ELEMENTS to PANEL
		panel3.add(label);
		

	}

}
