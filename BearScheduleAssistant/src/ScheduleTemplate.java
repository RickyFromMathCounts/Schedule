import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScheduleTemplate {

	public static void main(String[] args) {
	
		Vector<Course> classList = new Vector<Course>();
		
		ClassList cL = new ClassList(classList);
		
		
		StudentList students = new StudentList(cL);
		
		
		
		
		Vector<Course> schedule = new Vector<Course>();
		Schedule sch = new Schedule(schedule);
	
		

		
		
		
		/*
		 * Schedule Algorithm initialized
		 */
		ScheduleAlgorithm s = new ScheduleAlgorithm(students.students, sch.schedule);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		//This is for debugging. As far as i can tell, everything is working and the debugger just
		//Doesnt like the action listener
		StudentManage2 manage = new StudentManage2();
		
		s.build();
		manage.addVector(students.students);
		
		sch.convertToCSV();

	
		//      b1.addActionListener(new ActionListener() {
		  //        public void actionPerformed(ActionEvent e) {
		 //       	 s.build();
		  //      	 manage.addVector(students.students);
		  //      	  System.out.println("it built");
		   //       }          
		  //     });

		      

		
		
		

	}
 
	
	

	
	
	

	
			
			
		
		
		
		
}
	
	
	
	

	
	
	
	

