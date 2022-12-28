
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;

public class StudentManage2 {

	Vector<Student> students;
	
	
	Scanner in = new Scanner(System.in);

	// Creates a hash map of student objects
	HashMap<String, Student> studentList = new HashMap<String, Student>();

	// Search and print students by name
	public Student namePrint(String search) {

		ArrayList<Student> studentArray = new ArrayList<Student>(studentList.values());


		System.out.print("Enter student name for search: ");
		System.out.println();

		Student student = null;

		for (int i = 0; i < studentArray.size(); i += 1) {

			student = studentArray.get(i);

			if (student.name.equals(search)) {

				return student;

			} 
				
		}
		
		System.out.println("There are no students with that name currently stored.");
		return null;
	}

	// Search and print by id
	public Student idPrint(String search) {

		 
		Student i = null;

		System.out.print("Enter student ID for search: ");
		
		

		i = studentList.get(search);

		if (i != null) {
			i.printInfo();
		} else
			System.out.println("That student ID is not currently stored.");

		//System.out.println();
		
		return i;

	}

	public void printAll() {

		ArrayList<Student> studentArray = new ArrayList<Student>(studentList.values());
		
		Student student = null;
		
		for (int i = 0; i < studentArray.size(); i += 1) {

			student = studentArray.get(i);

			student.printInfo();

			} 

		}
		

	// add student
	public void addStudent() {

		String name = "";
		String id = "";
		String major = "";
		String minor = "";
		String year = "";
		int credits = -1;

		System.out.print("Enter student name: ");
		name = in.nextLine();
		System.out.println();

		System.out.print("Enter student ID: ");
		id = in.nextLine();
		System.out.println();

		System.out.print("Enter student major: ");
		major = in.nextLine();
		System.out.println();

		System.out.print("Enter student minor: ");
		minor = in.nextLine();
		System.out.println();

		System.out.print("Enter student year: ");
		year = in.nextLine();
		System.out.println();

		System.out.print("Enter student credits: ");
		credits = in.nextInt();
		System.out.println();
		
		
		

		Student i = new Student(name, year, id, credits, null);
		Student s = new Student(name, year, id, credits, null);

		studentList.put(s.getId(), s);
	}

	// delete student using id number
	public void deleteStudent() {

		String search = "";

		System.out.print("Enter student ID for Deletetion: ");
		search = in.nextLine();
		System.out.println();

		studentList.remove(search);

	}

	/*
	 * Adds the student vector to the hash map
	 */
	public void addVector(Vector<Student> students) {
		
		for (int i = 0; i < students.size(); i = i + 1) {
			
			studentList.put(students.get(i).getId(), students.get(i));
			
		}
		
		this.students = students;
		
	}
	
	
	/*
	 * Searches for a student by name or ID
	 * Returns desired student or null if student isn't found
	 * 
	 */
	public Student searchStudent(String search) {
		for (int i = 48; i < 58; i = i + 1) {
			if(search.charAt(0) == i) {
				
				return idPrint(search);
			}
		}
			
		return namePrint(search);
	}
	
	
	
	
	/*
	 * Writes a csv file that contains each Student
	 */
	public void convertToCSV() {
		
		String[] arr = {"Name,", "ID,", "Year,", "Credits,"};
		
		File csvFile = new File("Students.csv");
		
		try {
			FileWriter fileWriter = new FileWriter(csvFile);
			
			
			fileWriter.write(arr[0] + arr[1] + arr[2] + arr[3] + "\n");
			
			//Loops through each course to write into the csv
			for (int i = 0; i < studentList.size(); i = i + 1) {
				
				String[] s = new String[6];
				
				
				s[0] = students.get(i).getName() + ",";
				s[1] = students.get(i).getId() + ",";
				s[2] = students.get(i).getYear() + ",";
				s[3] = students.get(i).getCredits() + ",";
				s[4] = "\n";
				
				String q = "";
				
				for (int k = 0; k < 5; k = k + 1) {
					q = q + s[k];
				}
				
				fileWriter.write(q);
				
			}
			
			fileWriter.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
