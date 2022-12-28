import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;




public class Schedule {

	Vector<Course> schedule;

	
	
	public Schedule(Vector<Course> schedule) {
		this.schedule = schedule;
	}
	
	
	
	
	
	/**
	 * @return the schedule
	 */
	public Vector<Course> getSchedule() {
		return schedule;
	}


	
	/*
	 * Writes a csv file that contains each course in the schedule
	 */
	public void convertToCSV() {
		
		String[] arr = {"Course Code,", "Course Name,", "Time,", "Days,", "Class Size"};
		
		File csvFile = new File("schedule.csv");
		
		try {
			FileWriter fileWriter = new FileWriter(csvFile);
			
			
			fileWriter.write(arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + "\n");
			
			//Loops through each course to write into the csv
			for (int i = 0; i < schedule.size(); i = i + 1) {
				
				String[] s = new String[6];
				
				
				s[0] = schedule.get(i).getCode() + ",";
				s[1] = schedule.get(i).getName() + ",";
				s[2] = schedule.get(i).getTime() + ",";
				s[3] = schedule.get(i).getDay() + ",";
				s[4] = schedule.get(i).getClassSize() + "";
				s[5] = "\n";
				
				String q = "";
				
				for (int k = 0; k < 6; k = k + 1) {
					q = q + s[k];
				}
				
				fileWriter.write(q);
				
			}
			
			fileWriter.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	/*
	 * Searches for a course from the schedule through the course code
	 */
	public Course getCourse(String s) {
		
		for (int i = 0; i < schedule.size(); i = i + 1) {
			
			if (s.equals(schedule.get(i).getCode())) {
				return schedule.get(i);
			}
			
		}
		
		
		return null;
	}
	
	
	
	
}
