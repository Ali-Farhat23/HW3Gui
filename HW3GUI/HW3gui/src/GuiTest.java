import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.*;

public class GuiTest{
	public static void main(String args[]){
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		
		frame.getContentPane().setLayout(new FlowLayout()); 
		
		JButton button2 = new JButton("Button 2");
		frame.getContentPane().add(BorderLayout.EAST,button2);
		
		JButton button1 = new JButton("Press");
		frame.getContentPane().add(BorderLayout.WEST,button1);
		button1.setText("Press Me");
		button1.setToolTipText("Press me and watch what happens");
		
		frame.setVisible(true);
	}
}