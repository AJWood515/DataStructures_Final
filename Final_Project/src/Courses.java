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
	/**
	 * 
	 * @param name course name string variable
	 * @param letterCode abbreviated department code string variable
	 * @param numberCode course number int variable
	 * @param sems semester term string variable 
	 * @param inst intsructor last name string variable
	 */
	public Courses(String name, String letterCode, int numberCode, String sems, String inst) {
		setName(name);
		setLetterCode(letterCode);
		setNumberCode(numberCode);
		setSemester(sems);
		setInstructor(inst);
	}
	/**
	 *  returns course name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 *  sets course name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *  returns lettercode 
	 * @return
	 */
	public String getLetterCode() {
		return letterCode;
	}
	/**
	 *  sets lettercode
	 * @param letterCode
	 */
	public void setLetterCode(String letterCode) {
		this.letterCode = letterCode;
	}
	/**
	 * returns numbercode
	 * @return
	 */
	public int getNumberCode() {
		return numberCode;
	}
	/**
	 * sets lettercode
	 * @param numberCode
	 */
	public void setNumberCode(int numberCode) {
		this.numberCode = numberCode;
	}
	/**
	 * returns semester
	 * @return
	 */
	public String getSemester() {
		return semester;
	}
	/**
	 * sets semester
	 * @param semester
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}
	/**
	 * returns instructor's name
	 * @return
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * sets instructor's name
	 * @param instructor
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "Course: " + name + ", "+ letterCode + " " + numberCode + ", Semester: "
				+ semester + ", Instructor: " + instructor ;
	}
	
	
}
