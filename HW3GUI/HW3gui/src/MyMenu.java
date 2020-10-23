import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyMenu implements JMenuBar, JMenu, JMenuItem, ActionListener {
	public static void main(String args[]) {
		MyMenu firstMyMenu = new MyMenu("Chat Frame");
		createPanel();
		
	}

	public MyMenu(String title) throws HeadlessException {
			super();
			JMenuBar mb = new JMenuBar();
			JMenu m1 = new JMenu("FILE");
			mb.add(m1);
			JMenuItem m11 = new JMenuItem("Open");
			m1.add(m11);
			this.setJMenuBar(mb);
		}
	
		private void setJMenuBar(JMenuBar mb) {
			
		
	}

		private static void createPanel() {
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout());
			panel.setBackground(Color.WHITE);
			panel.add(panel, "Enter Text ");
			panel.add(panel, "Send");
			panel.add(panel, "Reset");
			panel.add(BorderLayout.SOUTH, panel);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (e.getSource() instanceof JMenuBar)
			{
				JMenuBar m = (JMenuBar) e.getSource();
			} else if (e.getSource() instanceof JMenu) {
				JMenu m = (JMenu) e.getSource();
					
			} else if (e.getSource() instanceof JMenuItem) {
			JMenuItem m = (JMenuItem) e.getSource();
				if (m==m11) {
					
				}
			
			}

		}
			
}
