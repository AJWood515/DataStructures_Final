/**
 * 
 * @author Alex
 *
 */
public class Courses {

	private String name;
	private String letterCode;
	private int numberCode;
	private String semester;
	private String instructor;
	
	
	public Courses() {
		
	}
	public Courses(String name, String letterCode, int numberCode, String sems, String inst) {
		setName(name);
		setLetterCode(letterCode);
		setNumberCode(numberCode);
		setSemester(sems);
		setInstructor(inst);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLetterCode() {
		return letterCode;
	}

	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}

	public int getNumberCode() {
		return numberCode;
	}

	public void setNumberCode(int numberCode) {
		this.numberCode = numberCode;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Course: " + name + ", "+ letterCode + " " + numberCode + ", Semester: "
				+ semester + ", Instructor: " + instructor ;
	}
	
	
}
