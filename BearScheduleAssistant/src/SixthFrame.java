import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class SixthFrame {
	
	JFrame sixthFrame;
	
	Vector<Student> students5;
	Vector<Course> schedule5;
	Vector<Course> cL5;
	
	Student main;
	
	public static void main(String[] args) {
		Vector<Course> classList = new Vector<Course>();
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SixthFrame windows = new SixthFrame(students.students, sch.schedule, cL.classList);
					windows.sixthFrame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	public SixthFrame(Vector<Student> students5, Vector<Course> schedule5, Vector<Course> cL5) {
		this.schedule5 = schedule5;
		this.students5 = students5;
		this.cL5 = cL5;
		
		initialize();
	}

	public void initialize() {
		sixthFrame = new JFrame();
		sixthFrame.setBounds(100,100,1600,860);
		sixthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sixthFrame.getContentPane().setLayout(null);
	
		
		
		
		Font f = new Font("serif", Font.PLAIN, 36);
		Label label = new Label("Recommend Courses");
		label.setFont(f);
		label.setAlignment(Label.CENTER);
		label.setBounds(450,44,550,45);
		sixthFrame.getContentPane().add(label);
		
		
		

		
		
		
		
		

	    
		
		
		
		Button button = new Button("Back to home");
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				SecondFrame sf = new SecondFrame(students5, schedule5, cL5);
				
				sf.secondFrame.setVisible(true);
				sixthFrame.dispose();
			}

			
		});
		
		Button button2 = new Button("Log Out");
		button2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame(students5, schedule5, cL5);
				mf.frame.setVisible(true);
				sixthFrame.dispose();
			}
		});
		
		
		
		
		
		JTextField interestField = new JTextField("Enter Subject");
		interestField.setBounds(650,240,150,30);
	
		sixthFrame.add(interestField);
		
		Button reccomend = new Button("Recommend Classes");
		reccomend.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {

				
				String interest = interestField.getText();
				
				
				String major = interestField.getText();
				
				Recommendations r = new Recommendations(major);

				
			}
		});

		
		
		
		
		
		button.setBounds(85,650,175,50);
		sixthFrame.getContentPane().add(button);
		
		button2.setBounds(85,750,175,50);
		sixthFrame.getContentPane().add(button2);
		
		

		
		reccomend.setBounds(600,150,245,70);
		sixthFrame.getContentPane().add(reccomend);
		
		

		
		
		
		sixthFrame.setVisible(true);
		
		
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("background.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(0,0, 1600,860);
			sixthFrame.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
	
	
}	
