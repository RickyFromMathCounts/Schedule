import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FifthFrame {
	
	JFrame fifthFrame;
	
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
					FifthFrame windows = new FifthFrame(students.students, sch.schedule, cL.classList);
					windows.fifthFrame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	public FifthFrame(Vector<Student> students5, Vector<Course> schedule5, Vector<Course> cL5) {
		this.schedule5 = schedule5;
		this.students5 = students5;
		this.cL5 = cL5;
		
		initialize();
	}

	public void initialize() {
		fifthFrame = new JFrame();
		fifthFrame.setBounds(100,100,1600,860);
		fifthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fifthFrame.getContentPane().setLayout(null);
	
		
		
		
		Font f = new Font("serif", Font.PLAIN, 36);
		Label label = new Label("Student Manage");
		label.setFont(f);
		label.setAlignment(Label.CENTER);
		label.setBounds(100,44,550,45);
		fifthFrame.getContentPane().add(label);
		
		
		
		Font f2 = new Font("serif", Font.PLAIN, 22);
		Label label2 = new Label();
		label2.setFont(f2);
		label2.setAlignment(Label.CENTER);
		label2.setBounds(100,275,550,45);
		fifthFrame.getContentPane().add(label2);
		label2.setVisible(false);
		
		
		Label tooMany = new Label("Student has the Maximum Number of Classes");
		
		tooMany.setAlignment(Label.CENTER);
		tooMany.setBounds(800,560,270,70);
		tooMany.setVisible(false);
		fifthFrame.getContentPane().add(tooMany);
		
		
		Label notFoundCourse = new Label("Course is not in the Schedule");
		
		notFoundCourse.setAlignment(Label.CENTER);
		notFoundCourse.setBounds(800,560,270,70);
		notFoundCourse.setVisible(false);
		fifthFrame.getContentPane().add(notFoundCourse);
		
		
		
		Label notFoundCourse2 = new Label("Course is not in the Schedule");
		
		notFoundCourse2.setAlignment(Label.CENTER);
		notFoundCourse2.setBounds(800,725,270,70);
		notFoundCourse2.setVisible(false);
		fifthFrame.getContentPane().add(notFoundCourse2);
		
		
		
		
		
		
		String[] columnNames = {"Name", "ID", "Year", "Credits"};
		String[] columnNames2 = {"Course Code", "Course Name", "Time", "Days", "Class Size"};
			
		
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
	
		fifthFrame.add(searchField);
		
		
		
		
		Label notFound = new Label("Sorry, the Student could not be found! Please Try Again!");
		notFound.setVisible(false);
		notFound.setAlignment(Label.CENTER);
		notFound.setBounds(350,210,350,68);
		fifthFrame.getContentPane().add(notFound);
	    
	    
		
		JTextField interestField = new JTextField("Enter Major");
		interestField.setBounds(1100,175,150,30);
	
		fifthFrame.add(interestField);
		
		Button reccomend = new Button("Recommend Classes");
		reccomend.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				tooMany.setVisible(false);
				notFoundCourse.setVisible(false);
				
				String major = interestField.getText();
				
				Recommendations r = new Recommendations(major);
				
				
			}
		});
		
		
		
		
		JTextField addField = new JTextField("Enter Course Code to Add Class");
		addField.setBounds(1100,525,200,30);
		addField.setVisible(false);
	
		fifthFrame.add(addField);
		
		
		JTextField dropField = new JTextField("Enter Course Code to Drop Class");
		dropField.setBounds(1100,675,200,30);
		dropField.setVisible(false);
	
		fifthFrame.add(dropField);
		
		
		
		
		Button addClass = new Button("Add Class");
		Button dropClass = new Button("Drop Class");
		
		
		
		//Class Search
		Button search = new Button("Search for Student (Name/ID)");
		search.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				notFound.setVisible(false);
				label2.setVisible(false);
				tooMany.setVisible(false);
				notFoundCourse.setVisible(false);
				notFoundCourse2.setVisible(false);
				
				individual.setVisible(true);
				courses.setVisible(false);
				
				addClass.setVisible(false);
				dropClass.setVisible(false);
				
				addField.setVisible(false);
				dropField.setVisible(false);
				
				
				String searched = searchField.getText();
				
				
				
				StudentManage2 s = new StudentManage2();
				s.addVector(students5);
				
				//Sets the Active Student to be able to add and drop classes
				main = s.searchStudent(searched);
				
				
				
				//If null, displays error message
				if (main != null) {
					
					label2.setText(main.getName() + " (" + main.getId() + ")");
					label2.setVisible(true);
					
					
	
				
				    
					individual.setValueAt(main.getName(), 0, 0);
					individual.setValueAt(main.getId(), 0, 1);
					individual.setValueAt(main.getYear() + "", 0, 2);
					individual.setValueAt(main.getCredits() + "", 0, 3);
					

					for (int i = 0; i < main.getSchedule().size(); i = i + 1) {
						courses.setValueAt(main.getSchedule().get(i).getCode(), i, 0);
						courses.setValueAt(main.getSchedule().get(i).getName(), i, 1);
						courses.setValueAt(main.getSchedule().get(i).getTime() + "", i, 2);
						courses.setValueAt(main.getSchedule().get(i).getDay(), i, 3);
						courses.setValueAt(main.getSchedule().get(i).getClassSize() + "", i, 4);
					}
				     
				    
					fifthFrame.add(h);
					fifthFrame.add(m);
				
						
					courses.setVisible(true);
					individual.setVisible(true);
					
					addClass.setVisible(true);
					dropClass.setVisible(true);
					
					addField.setVisible(true);
					dropField.setVisible(true);
					
				} else {
					
					notFound.setForeground(Color.red);
					notFound.setVisible(true);
					
				}
				

				
				
			}
		});
		
		
		
		//AddClasses

		addClass.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				tooMany.setVisible(false);
				notFoundCourse.setVisible(false);
				notFoundCourse2.setVisible(false);
				
				String text = addField.getText();
				StudentManage2 manage = new StudentManage2();
				

				
				
				//Makes sure there is space
				if (main.schedule.size() < 5) {
					
					Student temp = main;
					Course c = main.addClass(text, new Schedule(schedule5));
					
					
					
					
					if (c != null) {
						
						individual.setValueAt(main.getName(), 0, 0);
						individual.setValueAt(main.getId(), 0, 1);
						individual.setValueAt(main.getYear() + "", 0, 2);
						individual.setValueAt(main.getCredits() + "", 0, 3);
						

						for (int i = 0; i < main.getSchedule().size(); i = i + 1) {
							courses.setValueAt(main.getSchedule().get(i).getCode(), i, 0);
							courses.setValueAt(main.getSchedule().get(i).getName(), i, 1);
							courses.setValueAt(main.getSchedule().get(i).getTime() + "", i, 2);
							courses.setValueAt(main.getSchedule().get(i).getDay(), i, 3);
							courses.setValueAt(main.getSchedule().get(i).getClassSize() + "", i, 4);
						}
					     
					    
						fifthFrame.add(h);
						fifthFrame.add(m);
					
							
						
						individual.setVisible(true);
						courses.setVisible(true);
						
						addClass.setVisible(true);
						
						
						addField.setVisible(true);
						
						
						
					} else {
						main = temp;
						
						notFoundCourse.setForeground(Color.red);
						notFoundCourse.setVisible(true);
					}
					
					
			} else {
				tooMany.setForeground(Color.red);
				tooMany.setVisible(true);
					
			}
				
		}			
			
	});
		
		
		
		

		
		
		
		
		dropClass.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				tooMany.setVisible(false);
				notFoundCourse.setVisible(false);
				notFoundCourse2.setVisible(false);
				
				String text = dropField.getText();
				

				StudentManage2 manage = new StudentManage2();
				
				Student temp = main;
				Course c = main.removeClass(text);
				
				//Course isn't found
				if (c != null) {
					
					individual.setValueAt(main.getName(), 0, 0);
					individual.setValueAt(main.getId(), 0, 1);
					individual.setValueAt(main.getYear() + "", 0, 2);
					individual.setValueAt(main.getCredits() + "", 0, 3);
					

					for (int i = 0; i < main.getSchedule().size(); i = i + 1) {
						courses.setValueAt(main.getSchedule().get(i).getCode(), i, 0);
						courses.setValueAt(main.getSchedule().get(i).getName(), i, 1);
						courses.setValueAt(main.getSchedule().get(i).getTime() + "", i, 2);
						courses.setValueAt(main.getSchedule().get(i).getDay(), i, 3);
						courses.setValueAt(main.getSchedule().get(i).getClassSize() + "", i, 4);
						
						if (i == main.getSchedule().size() - 1 && i!=4) {
							courses.setValueAt("", i+1, 0);
							courses.setValueAt("", i+1, 1);
							courses.setValueAt("", i+1, 2);
							courses.setValueAt("", i+1, 3);
							courses.setValueAt("", i+1, 4);
						}
					}
					

				     
				    
					fifthFrame.add(h);
					fifthFrame.add(m);
				
						
					
					individual.setVisible(true);
					courses.setVisible(true);
					
					addClass.setVisible(true);
					
					
					addField.setVisible(true);
					
				} else {
					main = temp;
					
					notFoundCourse2.setForeground(Color.red);
					notFoundCourse2.setVisible(true);
				}
				
				
			}
		});
		
		
		
		
		

	    
		
		
		
		Button button = new Button("Back to home");
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e){
				SecondFrame sf = new SecondFrame(students5, schedule5, cL5);
				
				sf.secondFrame.setVisible(true);
				fifthFrame.dispose();
			}

			
		});
		
		Button button2 = new Button("Log Out");
		button2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame(students5, schedule5, cL5);
				mf.frame.setVisible(true);
				fifthFrame.dispose();
			}
		});
		
		
		
		
		
		

		
		
		
		
		
		button.setBounds(85,650,175,50);
		fifthFrame.getContentPane().add(button);
		
		button2.setBounds(85,750,175,50);
		fifthFrame.getContentPane().add(button2);
		
		
		search.setBounds(400,150,245,70);
		fifthFrame.getContentPane().add(search);
		
		
		dropClass.setBounds(800,650,245,70);
		fifthFrame.getContentPane().add(dropClass);
		dropClass.setVisible(false);
		
		addClass.setBounds(800,500,245,70);
		fifthFrame.getContentPane().add(addClass);
		addClass.setVisible(false);
		
		reccomend.setBounds(800,150,245,70);
		fifthFrame.getContentPane().add(reccomend);
		
		

		
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("background.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setBounds(0,0, 1600,860);
			fifthFrame.add(picLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		fifthFrame.setVisible(true);
		
		
		
		
		
		

		
		
		
		
		
	}
	
	
}	
		