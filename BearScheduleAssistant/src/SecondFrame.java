import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class SecondFrame {
	
	JFrame secondFrame;
	
	Vector<Student> students2;
	Vector<Course> schedule2;
	Vector<Course> cL2;
	
	public static void main(String[] args) {
		Vector<Course> classList = new Vector<Course>();
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrame windows = new SecondFrame(students.students, sch.schedule, cL.classList);
					windows.secondFrame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	public SecondFrame(Vector<Student> students2, Vector<Course> schedule2, Vector<Course> cL2) {
		this.schedule2 = schedule2;
		this.students2 = students2;
		this.cL2 = cL2;
		
		initialize();
	}

	public void initialize() {
		secondFrame = new JFrame();
		secondFrame.setBounds(100,100,1600,860);
		secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secondFrame.getContentPane().setLayout(null);
	
		
		Label label = new Label("Homepage");
		label.setAlignment(Label.CENTER);
		label.setBounds(79,44,245,34);
		secondFrame.getContentPane().add(label);
		
		Label built = new Label("Schedule Built Successfully");
		built.setAlignment(Label.CENTER);
		built.setBounds(650,200,245,34);
		built.setVisible(false);
		secondFrame.getContentPane().add(built);
		
		
		
		Button button = new Button("log out");
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				MainFrame mf = new MainFrame(students2, schedule2, cL2);
				built.setVisible(false);
				mf.frame.setVisible(true);
				secondFrame.dispose();
			}

			
		});
		
		Button button2 = new Button("View Schedule");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdFrame tf = new ThirdFrame(students2, schedule2, cL2);
				built.setVisible(false);
				tf.thirdFrame.setVisible(true);
				secondFrame.dispose();
			}
		});
		
		Button button3 = new Button("View Students");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				built.setVisible(false);
				FourthFrame ff = new FourthFrame(students2, schedule2, cL2);
				
				ff.fourthFrame.setVisible(true);
				secondFrame.dispose();
			}
			
			
		});		
		
		
		Button button4 = new Button("Build Schedule");
		button4.setVisible(false);
		
		if (schedule2.isEmpty()) {
			button4.setVisible(true);
		}
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ScheduleAlgorithm s = new ScheduleAlgorithm(students2, schedule2);
				
				s.build();
				
				built.setVisible(true);
				
				System.out.println("Builds");
				
				button4.setVisible(false);
				
				  
			}
				
		});
		
		
		
		Button button5 = new Button("Recommend");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SixthFrame ff = new SixthFrame(students2, schedule2, cL2);
				
				ff.sixthFrame.setVisible(true);
				secondFrame.dispose();
			}
			
			
		});	
		
		
		
		
		
		Button button6 = new Button("Manage Students");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FifthFrame ff = new FifthFrame(students2, schedule2, cL2);
				
				ff.fifthFrame.setVisible(true);
				secondFrame.dispose();
			}
			
			
		});	
		
		
		
		
		
		button.setBounds(85,650,175,50);
		secondFrame.getContentPane().add(button);
		
		button2.setBounds(350, 250, 350, 90);
		secondFrame.getContentPane().add(button2);
		
		button3.setBounds(850, 250, 350, 90);
		secondFrame.getContentPane().add(button3);
		
		
		button4.setBounds(600, 100, 350, 90);
		secondFrame.getContentPane().add(button4);
		
		
		button5.setBounds(850, 400, 350, 90);
		secondFrame.getContentPane().add(button5);
		
		
		button6.setBounds(350, 400, 350, 90);
		secondFrame.getContentPane().add(button6);
		
		
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("background.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(0,0, 1600,860);
			secondFrame.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
