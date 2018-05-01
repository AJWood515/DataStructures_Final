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
	public Student(int id, String fName, String lName, int credits,int com, String maj) {
		setId(id);
		setfName(fName);
		setlName(lName);
		setCredits(credits);
		setCompleted(com);
		setMajor(maj);		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	
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
