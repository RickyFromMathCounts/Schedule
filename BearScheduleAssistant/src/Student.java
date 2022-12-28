import java.util.Vector;

public class Student {

	/*------------------------- Fields -------------------------------*/
	Course blank = new Course("----", "----");

	
	//Info about the Student
	protected String name;
	protected int classCount;
	protected String year;
	protected int credits;
	protected String id = "";
	public String major = "";
	public String minor = "";
	
	
	//The classes selected and the resulting schedule
	String[] courses = new String[10]; 

	Vector<Course> schedule = new Vector<Course>();
	
	/*---------------------- Constructors ----------------------*/
	
	
	public Student(String name, String year, String id, int credits, String[] courses) {
		this.name = name;
		this.year = year;
		this.credits = credits;
		this.id = id;
		this.courses = courses;
		
		
		blank.setClassSize(0);
		blank.setDay("---");
		blank.setTime(0);
		
		schedule = convertClasses(courses);
		
		
		
	}
	
	public Student() {
		this.name = null;
		this.classCount = 0;
		this.year = null;
		this.credits = 0;
	}


	/*--------------------- Behavior -------------------------*/
	
	
	
	
	private Vector<Course> convertClasses(String[] courses) {
		
		for(int i = 0; i < 10; i = i + 2) {
				
				schedule.add(new Course(courses[i], courses[i+1]));
				
		}
		
		return schedule;
		
	}
	
	
	//Prints info
	public void printInfo() {
		
		System.out.println("Student Name: "+ name);
		
		System.out.println("Student ID: " + id);

		System.out.println("Student Major: " + major);

		System.out.println("Student Minor:" + minor);

		System.out.println("Student Year:" + year);

		System.out.println("Student Credits:" + credits);

	}
	
	
	
	
	/*
	 * Removes a class from a student
	 */
	public Course removeClass(String code) {
		

		
		for (int i = 0; i < schedule.size(); i = i + 1) {
			if (code.equals(schedule.get(i).getCode())) {
				int k = schedule.indexOf(schedule.get(i));
				schedule.get(k).setClassSize(schedule.get(k).getClassSize() - 1);
				
				Course temp = schedule.get(k);
				
				schedule.remove(i);
				
				return temp;
			}
		}
		
		return null;
	}
	
	
	
	
	/*
	 * Adds a class for student
	 * ADD CODE AFTER RUNNING THAT HAS AN IF STATEMENT CHECKING IF NULL, 
	 * IF NULL SAY THE CLASS HASN'T BEEN MADE YET
	 */
	public Course addClass(String code, Schedule s) {
		
		for (int i = 0; i < s.schedule.size(); i = i + 1) {
			if (code.equals(s.schedule.get(i).getCode())) {
				s.schedule.get(i).setClassSize(s.schedule.get(i).getClassSize() + 1);
				schedule.add(s.schedule.get(i));
				
				return s.schedule.get(i);
			}
		}
		
		
		return null;
		
	}
	
	
	
	
	
	
	public void sortSchedule() {
	
		for (int i = 0; i < schedule.size() - 1; i = i + 1) {
			for (int k = 0; k < schedule.size() - i - 1; k = k + 1) {
			
				if (schedule.get(k).getTime() > schedule.get(k + 1).getTime()) {
					Course temp = schedule.get(k);
					schedule.set(k, schedule.get(k + 1));
					schedule.set(k + 1, temp);
					
				}
			
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	/*------------------ Getters and Setters -----------------*/
	

	
	
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}



	/**
	 * @return the schedule
	 */
	public Vector<Course> getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(Vector<Course> schedule) {
		this.schedule = schedule;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param classCount the classCount to set
	 */
	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the classCount
	 */
	public int getClassCount() {
		return classCount;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the selectedClasses
	 */
	
	
	
	
	
	/*----------------------------------------------------------*/
	
}
