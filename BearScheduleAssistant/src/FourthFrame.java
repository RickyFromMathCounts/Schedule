import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FourthFrame {
	

	JFrame fourthFrame;
	
	Vector<Student> students4;
	Vector<Course> schedule4;
	Vector<Course> cL4;
	
	public static void main(String[] args) {
		Vector<Course> classList = new Vector<Course>();
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourthFrame windows = new FourthFrame(students.students, sch.schedule, cL.classList);
					windows.fourthFrame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	

	}
	
	public FourthFrame(Vector<Student> students4, Vector<Course> schedule4, Vector<Course> cL4) {
		this.schedule4 = schedule4;
		this.students4 = students4;
		this.cL4 = cL4;
		
		initialize();
	}

	public void initialize() {
		fourthFrame = new JFrame();
		fourthFrame.setBounds(100,100,1600,860);
		fourthFrame.setBackground(Color.red);
		fourthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fourthFrame.getContentPane().setLayout(null);
		
		
		Font f = new Font("serif", Font.PLAIN, 36);
		Label label = new Label("Student Search");
		label.setFont(f);
		label.setAlignment(Label.CENTER);
		label.setBounds(100,44,550,45);
		fourthFrame.getContentPane().add(label);
		
		
		
		Font f2 = new Font("serif", Font.PLAIN, 22);
		Label label2 = new Label();
		label2.setFont(f2);
		label2.setAlignment(Label.CENTER);
		label2.setBounds(100,275,550,45);
		fourthFrame.getContentPane().add(label2);
		label2.setVisible(false);
		
		
		
		String[] columnNames = {"Name", "ID", "Year", "Credits"};
		String[] columnNames2 = {"Course Code", "Course Name", "Time", "Days", "Class Size"};
		
		String[][] stu = new String[students4.size()][4];
		
		for(int i = 0; i < students4.size(); i = i + 1) {
			
			stu[i][0] = students4.get(i).getName();
			stu[i][1] = students4.get(i).getId();
			stu[i][2] = students4.get(i).getYear();
			stu[i][3] = students4.get(i).getCredits() + "";

					
					
		}
		
		
		
		JTable t = new JTable(stu, columnNames);
		
		t.setBounds(450, 860, 1600, 860);
		
		
		JScrollPane p = new JScrollPane(t);	
		
		
		p.setBounds(750, 0, 800, 800);
	    t.setFillsViewportHeight(true);
		
		fourthFrame.add(p);
		
		
		
		
		String[][] fake = {{"","","",""}};
		
		
		JTable individual = new JTable(fake, columnNames);
		
		individual.setBounds(20, 860, 1600, 860);
		
		
		JScrollPane h = new JScrollPane(individual);	
		
		
		h.setBounds(20, 350, 650, 39);
	    individual.setFillsViewportHeight(true);
		
	    individual.setVisible(false); 
	    
	    
	    
		String[][] fake2 = {{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""}};
		
		
		JTable courses = new JTable(fake2, columnNames2);
		
		courses.setBounds(20, 860, 1600, 860);
		
		
		JScrollPane m = new JScrollPane(courses);	
		
		
		m.setBounds(20, 400, 650, 103);
		courses.setFillsViewportHeight(true);
		
		courses.setVisible(false); 
		
		
		
		
		JTextField searchField = new JTextField("Enter Name/ID");
		searchField.setBounds(175,175,200,30);
	
		fourthFrame.add(searchField);
		
		
		Label csv = new Label("CSV Exported Successfully");
		csv.setVisible(false);
		csv.setAlignment(Label.CENTER);
		csv.setBounds(400,620,245,34);
		fourthFrame.getContentPane().add(csv);
		
		
		
		Label notFound = new Label("Sorry, the Student could not be found! Please Try Again!");
		notFound.setVisible(false);
		notFound.setAlignment(Label.CENTER);
		notFound.setBounds(350,210,350,68);
		fourthFrame.getContentPane().add(notFound);
	    
	    
	    
		
		
		//Class Search
				Button search = new Button("Search for Student (Name/ID)");
				search.addActionListener(new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						
						notFound.setVisible(false);
						label2.setVisible(false);
						csv.setVisible(false);
						
						String searched = searchField.getText();
						
						
						
						StudentManage2 s = new StudentManage2();
						s.addVector(students4);
						
						
						Student temp = s.searchStudent(searched);
						
						
						
						//If null, displays error message
						if (temp != null) {
							
							label2.setText(temp.getName() + " (" + temp.getId() + ")");
							label2.setVisible(true);
							
							
			
						
						    
							individual.setValueAt(temp.getName(), 0, 0);
							individual.setValueAt(temp.getId(), 0, 1);
							individual.setValueAt(temp.getYear() + "", 0, 2);
							individual.setValueAt(temp.getCredits() + "", 0, 3);
							

							for (int i = 0; i < temp.getSchedule().size(); i = i + 1) {
								courses.setValueAt(temp.getSchedule().get(i).getCode(), i, 0);
								courses.setValueAt(temp.getSchedule().get(i).getName(), i, 1);
								courses.setValueAt(temp.getSchedule().get(i).getTime() + "", i, 2);
								courses.setValueAt(temp.getSchedule().get(i).getDay(), i, 3);
								courses.setValueAt(temp.getSchedule().get(i).getClassSize() + "", i, 4);
							}
						     
						    
							fourthFrame.add(h);
							fourthFrame.add(m);
						
								
							
							individual.setVisible(true);
							courses.setVisible(true);
							
							
						} else {
							
							notFound.setForeground(Color.red);
							notFound.setVisible(true);
							
						}
						

						
						
					}
				});
	    
		
		
		
		Button button = new Button("Back to home");
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				SecondFrame sf = new SecondFrame(students4, schedule4, cL4);
				
				sf.secondFrame.setVisible(true);
				fourthFrame.dispose();
			}

			
		});
		
		Button button2 = new Button("Log Out");
		button2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame(students4, schedule4, cL4);
				mf.frame.setVisible(true);
				fourthFrame.dispose();
			}
		});
		
		Button button3 = new Button("Export CSV");
		button3.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				notFound.setVisible(false);
				
				StudentManage2 s = new StudentManage2();
				
				s.addVector(students4);
				
				s.convertToCSV();
				
				csv.setVisible(true);
			}
		});
		
		
		button.setBounds(85,650,175,50);
		fourthFrame.getContentPane().add(button);
		
		button2.setBounds(85,750,175,50);
		fourthFrame.getContentPane().add(button2);
		
		button3.setBounds(400,650,245,70);
		fourthFrame.getContentPane().add(button3);
		
		search.setBounds(400,150,245,70);
		fourthFrame.getContentPane().add(search);
		
		
		
		fourthFrame.setVisible(true);
		
		
		
		
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("background.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(0,0, 1600,860);
			fourthFrame.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
