import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ThirdFrame {
	
	JFrame thirdFrame;
	
	
	Vector<Student> students3;
	Vector<Course> schedule3;
	Vector<Course> cL3;
	
	public static void main(String[] args) {
		Vector<Course> classList = new Vector<Course>();
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdFrame windows = new ThirdFrame(students.students, sch.schedule, cL.classList);
					windows.thirdFrame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	
		
	
	}
	public ThirdFrame(Vector<Student> students3, Vector<Course> schedule3, Vector<Course> cL3) {
		this.schedule3 = schedule3;
		this.students3 = students3;
		this.cL3 = cL3;
		
		initialize();
		
	}
	public void initialize() {
		thirdFrame = new JFrame();
		thirdFrame.setBounds(100,100,1600,860);
		thirdFrame.setBackground(Color.red);
		thirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thirdFrame.getContentPane().setLayout(null);
		
		
		Font f = new Font("serif", Font.PLAIN, 36);
		Label label = new Label("Course Search and Schedule Viewer");
		label.setFont(f);
		label.setAlignment(Label.CENTER);
		label.setBounds(100,44,550,45);
		thirdFrame.getContentPane().add(label);
		
		
		Font f2 = new Font("serif", Font.PLAIN, 22);
		Label label2 = new Label();
		label2.setFont(f2);
		label2.setAlignment(Label.CENTER);
		label2.setBounds(100,325,550,45);
		thirdFrame.getContentPane().add(label2);
		label2.setVisible(false);
		
		
		String[] columnNames = {"Course Code", "Course Name", "Time", "Days", "Class Size"};
		
		String[][] sch = new String[schedule3.size()][5];
		
		for(int i = 0; i < schedule3.size(); i = i + 1) {
			
			sch[i][0] = schedule3.get(i).getCode();
			sch[i][1] = schedule3.get(i).getName();
			sch[i][2] = schedule3.get(i).getTime() + "";
			sch[i][3] = schedule3.get(i).getDay();
			sch[i][4] = schedule3.get(i).getClassSize() + "";
					
					
		}
		

		
		
		
		JTable t = new JTable(sch, columnNames);
		
		t.setBounds(450, 860, 1600, 860);
		
		
		JScrollPane p = new JScrollPane(t);	
		
		
		p.setBounds(750, 0, 800, 800);
	    t.setFillsViewportHeight(true);
		
		thirdFrame.add(p);
		
		
		
		
		String[][] fake = {{"","","","",""}};
		
		
		JTable individual = new JTable(fake, columnNames);
		
		individual.setBounds(20, 860, 1600, 860);
		
		
		JScrollPane h = new JScrollPane(individual);	
		
		
		h.setBounds(20, 400, 650, 39);
	    individual.setFillsViewportHeight(true);
		
	    individual.setVisible(false); 
		
		
		
	    
	    
	    
		
		JTextField searchField = new JTextField("Enter Course Code");
		searchField.setBounds(175,175,200,30);
	
		thirdFrame.add(searchField);
		
		
		Label csv = new Label("CSV Exported Successfully");
		csv.setVisible(false);
		csv.setAlignment(Label.CENTER);
		csv.setBounds(400,620,245,34);
		thirdFrame.getContentPane().add(csv);
		
		
		
		Label notFound = new Label("Sorry, that course is not in the Schedule! Please Try Again!");
		notFound.setVisible(false);
		notFound.setAlignment(Label.CENTER);
		notFound.setBounds(350,210,350,68);
		thirdFrame.getContentPane().add(notFound);
		
		//Home
		Button button = new Button("Back to home");
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				notFound.setVisible(false);
				csv.setVisible(false);
				
				SecondFrame sf = new SecondFrame(students3, schedule3, cL3);
				
				sf.secondFrame.setVisible(true);
				thirdFrame.dispose();
			}

			
		});
		
		//Log Out
		Button button2 = new Button("Log out");
		button2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				notFound.setVisible(false);
				csv.setVisible(false);
				MainFrame mf = new MainFrame(students3, schedule3, cL3);
				mf.frame.setVisible(true);
				thirdFrame.dispose();
			}
		});
		
		//CSV Export
		Button button3 = new Button("Export as CSV");
		button3.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				notFound.setVisible(false);
				
				Schedule s = new Schedule(schedule3);
				
				s.convertToCSV();
				
				csv.setVisible(true);
				
				
			}
		});
		
		
		
		
		//Class Search
		Button search = new Button("Search for Class (Code Only)");
		search.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				
				notFound.setVisible(false);
				label2.setVisible(false);
				csv.setVisible(false);
				
				String searched = searchField.getText();
				
				
				
				Schedule s = new Schedule(schedule3);
				
				Course c = s.getCourse(searched);
				
				
				
				//If null, displays error message
				if (c != null) {
					
					label2.setText(c.getName() + " (" + c.getCode() + ")");
					label2.setVisible(true);
					
					
	
				
				    
					individual.setValueAt(c.getCode(), 0, 0);
					individual.setValueAt(c.getName(), 0, 1);
					individual.setValueAt(c.getTime() + "", 0, 2);
					individual.setValueAt(c.getDay(), 0, 3);
					individual.setValueAt(c.getClassSize() + "", 0, 4);
					

					
				     
				    
					thirdFrame.add(h);
					
				
						
					
					individual.setVisible(true);
					
				} else {
					
					notFound.setForeground(Color.red);
					notFound.setVisible(true);
					
				}
				

				
				
			}
		});

		
		
		
		
		button.setBounds(85,650,175,50);
		thirdFrame.getContentPane().add(button);
		
		button2.setBounds(85,750,175,50);
		thirdFrame.getContentPane().add(button2);
		
		
		button3.setBounds(400,650,245,70);
		thirdFrame.getContentPane().add(button3);
		

		search.setBounds(400,150,245,70);
		thirdFrame.getContentPane().add(search);
		
		
		
		thirdFrame.setVisible(true);
		
		
		
		
		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("background.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(0,0, 1600,860);
			thirdFrame.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
