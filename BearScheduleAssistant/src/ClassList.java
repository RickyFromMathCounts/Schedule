import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class ClassList {

	public Vector<Course> classList;

	
	public ClassList(Vector<Course> classList) {
		this.classList = fileReader(classList);
	}
	
	
	public ClassList() {
	}
	
	
	public void printClassList() {
		for (int i = 0; i < classList.size(); i = i + 1) {
			System.out.println(classList.get(i).code + " " + classList.get(i).name);
		}
	}

	
	/*
	 * Reads the classes into the file
	 */
	public Vector<Course> fileReader(Vector<Course> classList) {
		try {
			Scanner s = new Scanner(new File("COSC 325 Class Data.csv"));
			
			s.nextLine(); //Skips the first line
			
			//Scans in and stores each course, all 1436 of them
			for(int i = 0; i < 1436; i = i + 1) {
				String[] sp = s.nextLine().split(",");
				
				String s1 = sp[0];
				String s2 = sp[1];
				
				
				classList.add(new Course(s1, s2));
				
			}
			
			
			
			
			return classList;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
		
		
	}
	
	
	
}
