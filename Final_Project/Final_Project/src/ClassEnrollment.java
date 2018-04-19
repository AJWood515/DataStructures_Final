/**
 * 
 * @author Alex
 *
 */

public class ClassEnrollment {

	public static void main(String[] args) {
		Student Jeff =new Student("Jeff", "Guy", 18);
		Student Becca = new Student("Rebecca", "Smith", 19);
		Student Tank = new Student("Tank", "Wood", 24);
		
		LinkedList studentsList = new LinkedList();
		
		studentsList.insert(Tank);
		studentsList.insert(Becca);
		studentsList.insert(Jeff);
		studentsList.displayList();
		
		Courses Java = new Courses("Java", "CIS", 152);
		Courses PHP = new Courses("PHP", "WDV", 341);
		Courses SQL = new Courses("SQL", "CIS", 338);
		
		
		LinkedList JavaCourse = new LinkedList();
		

	}

}
