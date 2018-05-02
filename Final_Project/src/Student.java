/**
 * 
 * @author Alex
 *
 */
public class Student extends LinkedList{

	private int id;
	private String fName;
	private String lName;
	private int credits;
	private int completed;
	private String major;
	
	public Student() {
		
	}
	/**
	 * 
	 * @param id the students id string variable
	 * @param fName the first name variable
	 * @param lName the last name string variable
	 * @param credits the credits int variable
	 * @param com the credits completed int variable
	 * @param maj the major string variable
	 */
	public Student(int id, String fName, String lName, int credits,int com, String maj) {
		setId(id);
		setfName(fName);
		setlName(lName);
		setCredits(credits);
		setCompleted(com);
		setMajor(maj);		
	}
	/**
	 *  returns id
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * sets id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * returns total credits
	 * @return
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * sets total credits
	 * @param credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * returns completed credits
	 * @return
	 */
	public int getCompleted() {
		return completed;
	}
	/**
	 * sets completed credits
	 * @param completed
	 */
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	 /**
	  * returns string major
	  * @return
	  */
	public String getMajor() {
		return major;
	}
	/**
	 * sets string major
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * returns first name
	 * @return
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * sets first name
	 * @param fName
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * returns last name 
	 * @return
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * sets last name
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * displays students as well as a course list
	 */
	public void displayStudent() {
		System.out.println("Student: "+ id +" "+ fName + " " + lName + " "+ "Credits: " + credits + " Completed: " + completed+ " Major: " + major );
		displayList();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", credits=" + credits + ", completed="
				+ completed + ", major=" + major + "]";
	}

}
