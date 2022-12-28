import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainFrame {
	
	 JFrame frame;
	 
	Vector<Student> studentsM;
	Vector<Course> scheduleM;
	Vector<Course> cLM;	
	
	
	
	 private static JLabel HeaderLabel;
	 private static JLabel userLabel;
	 private static JTextField userText;
	 private static JLabel passwordLabel;
	 private static JPasswordField passwordText;
	 private static JButton button;
	 private static JLabel success; 
	 private static JLabel incorrectpassword;

	public static void main(String[] args) {
		
		Vector<Course> classList = new Vector<Course>();
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame windows = new MainFrame(students.students, sch.schedule, cL.classList);
					windows.frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	
	
	}
	
	public MainFrame(Vector<Student> studentsM, Vector<Course> scheduleM, Vector<Course> cLM) {
		this.scheduleM = scheduleM;
		this.studentsM = studentsM;
		this.cLM = cLM;
		
		initialize();
	}

	
public void initialize() {
	
	frame = new JFrame();
	frame.setBounds(100,100,1600,860);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	Font f = new Font("Arial", Font.BOLD, 48);
	HeaderLabel = new JLabel("Bear Group Scheduling Assistant");
	
	HeaderLabel.setFont(f);
	HeaderLabel.setBounds(500, 150, 800, 200);
	frame.add(HeaderLabel);
	
	userLabel = new JLabel("User");
	userLabel.setBounds(10, 200, 80, 25);
	frame.add(userLabel);
	
	userText = new JTextField(20);
	userText.setBounds(100, 200, 165, 25);
	frame.add(userText);
	
	passwordLabel = new JLabel("Password");
	passwordLabel.setBounds(10, 250, 80, 25);
	frame.add(passwordLabel);
	
	passwordText = new JPasswordField(20);
	passwordText.setBounds(100, 250, 165, 25);
	frame.add(passwordText);
	
	
	
	
	
	
	incorrectpassword = new JLabel("incorrect password or username");
	incorrectpassword.setVisible(false);
	incorrectpassword.setBounds(10,110,300,25);
	
	frame.add(incorrectpassword);
	
	Button button = new Button("login");
	button.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent e){
			incorrectpassword.setVisible(false);
			
			
			String user = userText.getText();
			String password = passwordText.getText();
			System.out.println(user + "," + password);
			if(user.equalsIgnoreCase("courage")&& password.equals("Beargroup")) {
			
			System.out.println("Succesfully logged in");
			
			SecondFrame sf = new SecondFrame(studentsM, scheduleM, cLM);
			
			sf.secondFrame.setVisible(true);
			frame.dispose();
			}
			else  {
				System.out.print("Incorrect Username or Password");
				incorrectpassword.setVisible(true);
			}
		}

		
	});
	button.setBounds(10,300,80,25);
	frame.getContentPane().add(button);
	
	
	
	BufferedImage myPicture;
	try {
		myPicture = ImageIO.read(new File("background.png"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.setBounds(0,0, 1600,860);
		frame.add(picLabel);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	
	
}

}
