
public class Student {

	private String fName;
	private String lName;
	private int Age;
	
	public Student(){
		
	}
	
	public Student(String fName, String lName, int age) {
		setfName(fName);
		setlName(lName);
		setAge(age);
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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", Age=" + Age + "]";
	}

}
