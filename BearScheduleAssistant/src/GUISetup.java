import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUISetup {

	public static void main(String[] args) {


		setJframe();		
		
		
		
	}

	
	
	public static JFrame setJframe() {
		JFrame f = new JFrame("User Form");
		
		f.setVisible(true);
		
		f.setSize(800, 400);
		
		f.setLayout(new FlowLayout());
		
		
		JLabel l1 = new JLabel("Build Schedule");
		f.add(l1);
		
		
		JButton b1 = new JButton();
		f.add(b1);
		
		
		
		
		return f;
		
	}
	
	
}
