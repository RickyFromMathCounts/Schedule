
public class Course {

	public String code;
	public String name;
	public boolean isFull = false;
	
	
	//Schedule Slot 
	int time = 50;
	String day = "MWF";
	int classSize = 0;
	
	
	
	
	
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}




	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}




	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}




	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}




	/**
	 * @return the classSize
	 */
	public int getClassSize() {
		return classSize;
	}




	/**
	 * @param classSize the classSize to set
	 */
	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}




	public Course(String code, String name) {
		this.code = code;
		this.name = name;		
	}




	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}




	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public void addStudent() {
		classSize = classSize + 1;
		if (classSize >= 25) {
			isFull = true;
		}
	}
	
	public void removeStudent() {
		classSize = classSize - 1;
		if (classSize < 25) {
			isFull = false;
		}
	}
	
	
	public boolean isFull() {
		return isFull;
	}
	
	
}

