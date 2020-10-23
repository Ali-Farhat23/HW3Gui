import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
	public static void main(String args[]) {
		MyFrame firstMyFrame = new MyFrame("My First MyFrame GUI");
		
	}

	JButton button1 = new JButton("Press");
	JButton button2 = new JButton("Button 2");
	
	public MyFrame(String title) throws HeadlessException {
			super(title);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(300,300);
			
			this.getContentPane().setLayout(new FlowLayout()); 
			
			this.getContentPane().add(BorderLayout.EAST,button1);
			
			this.getContentPane().add(BorderLayout.WEST,button2);
			
			button1.setText("Press Me");
			button1.setToolTipText("Press me and watch what happens");
			
			button1.addActionListener(this);
			button2.addActionListener(this);

			this.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			
			if (b==button1)
			{
				JOptionPane.showConfirmDialog(this, "You clicked Button1","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
				}else if (b==this.button2)
				{
					JOptionPane.showConfirmDialog(this, "You clicked Button2","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
				}
		}
}
