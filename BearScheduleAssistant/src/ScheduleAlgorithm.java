
import java.util.Vector;

public class ScheduleAlgorithm {

	
	/* Fields */
	
	Vector<Student> students = new Vector<Student>();
	Vector<Course> classList = new Vector<Course>();
	Vector<Course> schedule = new Vector<Course>();
	
	
	
	/* Constructor */
	
	
	public ScheduleAlgorithm(Vector<Student> students, Vector<Course> schedule) {
		this.students = students;
		this.schedule = schedule;		
	}
	
	
	
	/* Behavior */
	
	
	
	
	
	/**
	 * @return the students
	 */
	public Vector<Student> getStudents() {
		return students;
	}



	/**
	 * @return the classList
	 */
	public Vector<Course> getClassList() {
		return classList;
	}



	/**
	 * @return the schedule
	 */
	public Vector<Course> getSchedule() {
		return schedule;
	}


	
	
	
	
	
	
	/*
	 * Runs the algorithm
	 */
	public void build() {
		
		sortStudents(students);
		
		buildSchedule(students, classList, schedule);
		
		

	}
	
	
	/*
	 * Sorts the students by their credits
	 */
	private static Vector<Student> sortStudents(Vector<Student> students) {
		
		
		//Checks if the student vector is empty
		for (int k = 0; k < students.size(); k = k + 1) {

			
			//Loops through the student vector
			for(int i = 0; i < students.size() - k - 1; i = i + 1) {
				
				//Sorts 
				if (students.get(i).credits < students.get(i + 1).credits) {
					
                    Student temp = students.get(i);
                    students.set(i, students.get(i + 1));
                    students.set(i + 1, temp);
					
				}
				
			}
				
		}
		
		
		
		return students;
		
		
	}

	
	
	
	
	
	
	
	
	
	
	/*
	 * Builds the schedule through student data
	 */
	private void buildSchedule(Vector<Student> students, Vector<Course> classList, Vector<Course> schedule) {
		
		//Loops through all Students
		for(int i = 0; i < students.size(); i = i + 1) {
			
			//Used to manipulate the student
			Student tempStudent = students.get(i);
			
			
			

			
			//Goes through each student's picked classes
			for(int k = 0; k < tempStudent.schedule.size(); k = k + 1) {
				
				
				for (int l = 0; l < schedule.size(); l = l + 1) {
					
					//Searches for the class in 
					if(schedule.get(l).getCode().equals(tempStudent.schedule.get(k).getCode())) {
					
									
						//sets tempStudent 
						tempStudent.schedule.set(k, schedule.get(l));
					}
				}
			
			}
			
			
			//Goes through each student's picked classes
			for(int k = 0; k < tempStudent.schedule.size(); k = k + 1) {
				
				

				
				
				//Sorts the schedule
				tempStudent.sortSchedule();
				
				
				
				//For comparison
				String s = tempStudent.schedule.get(k).getCode();
				
				
				

				
				boolean b = false;
				
				//Searches for a matching course code
				for (int q = 0; q < schedule.size(); q = q + 1) {
					String a = schedule.get(q).getCode();
					if (s.equals(a)) {
						b = true;
					}	
				}
				
				
				
				//Sets Up the first class in the schedule
				if (schedule.size() == 0) {
					//gets index of the class
						

					
					buildNewSlot(tempStudent, 0, 0);
					
					
					
					tempStudent.schedule.set(k, schedule.elementAt(0));
					
					
					
					//If a class does not already exist
				} else if(b) {
					
					for (int l = 0; l < schedule.size(); l = l + 1) {
						
						//Searches for the class in 
						if(schedule.get(l).getCode().equals(tempStudent.schedule.get(k).getCode())) {
						
								
								//Just adds student to that class

								
							if (!(schedule.elementAt(l).isFull())) {
								
								if (matchTime(tempStudent, k)) {
									buildNewSlot(tempStudent, k, l);
								} else {
								
									tempStudent.schedule.set(k, schedule.get(l));
									schedule.elementAt(l).addStudent();
								}
							} else {
								buildNewSlot(tempStudent, k, l);
								schedule.elementAt(schedule.size()-1).addStudent();
								
							}
								
							
								
						}

					}
				
					
				} else {	
					
					//Builds new timeslot
					buildNewSlot(tempStudent, k, schedule.size());
					

				}	

			}
					
			//Sets the student back to pointing towards tempStudent, just in case something goes wrong
			students.set(i, tempStudent);
			
		}
				
	}
	
	
	
	
	/*
	 * Find an optimal timeslot
	 */
	private boolean matchFull(Student tempStudent, int k, int l) {
		boolean matched = matchTime(tempStudent, k);
		
		
		//Checks and fixes a time conflict
		if (matched) {
			
			while (matched) {
				
				
				tempStudent.schedule.elementAt(k).setTime(tempStudent.schedule.elementAt(k).getTime() + 1);
						
 				if (tempStudent.schedule.get(k).getTime() >= 17) {
					
					tempStudent.schedule.elementAt(k).setTime(9);
					tempStudent.schedule.elementAt(k).setDay("TuTh");
					

					
				}
				
				
				matched = matchTime(tempStudent, k);
				
			}
			
		}
		
		return matched;
		
	}
	
	
	
	
	
	
	/*
	 * Checks if a student has a time conflict
	 */
	private boolean matchTime (Student tempStudent, int k) {
		
		boolean matchTime = false;

		//Loops up to k, checks if both the day and time conflict
		for (int j = 0; j < k; j = j + 1) {
		
		if (tempStudent.schedule.get(j).getClassSize() == 1) {	
			if (tempStudent.schedule.get(k).getTime() == tempStudent.schedule.get(j).getTime()) {
			
				if (tempStudent.schedule.get(k).getDay().equals(tempStudent.schedule.get(j).getDay())) {
					
					matchTime = true;
					return matchTime;
				}
				
				
			}	
			
		} else if (tempStudent.schedule.get(k).getTime() == tempStudent.schedule.get(j).getTime()) {
			
			Course temp = new Course(tempStudent.schedule.get(k).getCode(), tempStudent.schedule.get(k).getName());
			
			int l = tempStudent.schedule.get(k).getTime();
			
			
			
			tempStudent.schedule.remove(k);
			
			tempStudent.schedule.add(k, temp);
			
			
			schedule.add(tempStudent.schedule.get(k));
			
			schedule.elementAt(schedule.size() - 1).setDay("MWF");
			schedule.elementAt(schedule.size() - 1).setClassSize(1);
			schedule.elementAt(schedule.size() - 1).setTime(l + 1);
			
			
			return true;
		}
								
			
		}
		//If there is a conflict, returns true
		return matchTime;
		
		
	}
	
	
	
	/*
	 * Makes a new class with a timeslot
	 */
	private void buildNewSlot(Student tempStudent, int k, int l) {
		//Essentially repeats the steps if b is true
		
		schedule.add(tempStudent.schedule.get(k));
		
		schedule.elementAt(l).setDay("MWF");
		schedule.elementAt(l).setClassSize(1);
		schedule.elementAt(l).setTime(8);
		
		
		
		//Checks runs through the matching algorithm
		matchFull(tempStudent, k, l);
		
		
		
	}
	
	

	
	
	
	
}
