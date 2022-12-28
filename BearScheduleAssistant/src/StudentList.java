import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;



public class StudentList {

	/* Fields */
	
	public Vector<Student> students = new Vector<Student>();
	
	public static final String NAME = "Bear Group Scheduling Assistant.csv";
	
	private ClassList cL = new ClassList();
	
	
	/* Constructor */
	
	public StudentList(ClassList cL) {
		this.cL = cL;
		this.students = scanStudents();
		
	}
	
	
	
	
	/* Behavior */
	
	
	/*
	 * Scans In Students
	 */
	private Vector<Student> scanStudents() {
		try {
			Scanner in = new Scanner(new File(NAME));
			
			in.nextLine();
			
			while(in.hasNextLine()) {
			
				String[] s = in.nextLine().split(",");
			
				String name = s[1];
				
				int credits = Integer.parseInt(s[2]);
				
				String id = s[3];
				
				String year = s[4];
				
				String[] cTemp = {s[5], "", s[6], "", s[7], "", s[8], "", s[9], ""};
			
				String[] courses = new String[10];
				
				
				//Finds the corresponding course from the code
				for (int k = 0; k < 9; k = k + 1) {
					for (int i = 0; i < cL.classList.size(); i = i + 1) {
						if (cTemp[k].equals(cL.classList.get(i).getCode())) {
							courses[k] = cTemp[k];
							courses[k + 1] = cL.classList.get(i).getName();
						}
					}
				
				}
				
				
				Student temp = new Student(name, year, id, credits, courses);
				
				
				students.add(temp);
				
			}
			
			return students;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			return null;
		}
		
		
		
		
	}




	/**
	 * @return the students
	 */
	public Vector<Student> getStudents() {
		return students;
	}
	
	
	
	
	
	
	
}
