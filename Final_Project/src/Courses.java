
public class Courses {

	private String name;
	private String letterCode;
	private int numberCode;
	
	public Courses() {
		
	}
	public Courses(String name, String letterCode, int numberCode) {
		setName(name);
		setLetterCode(letterCode);
		setNumberCode(numberCode);
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
	@Override
	public String toString() {
		return " [Course: " + name + ", Letter and Number Code: " + letterCode + " " + numberCode + "]";
	}
	
	
}
