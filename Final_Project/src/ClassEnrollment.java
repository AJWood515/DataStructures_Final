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
		
		Courses Java = new Courses("Java", "CIS", 152);
		Courses PHP = new Courses("PHP", "WDV", 341);
		Courses SQL = new Courses("SQL", "CIS", 338);
		
		LinkedList TanksSchedule = new LinkedList();
		TanksSchedule.insert(Java);
		TanksSchedule.insert(PHP);
		TanksSchedule.insert(SQL);
		Tank.displayStudent();
		TanksSchedule.displayList();
		
		LinkedList BeccaSchedule = new LinkedList();
		BeccaSchedule.insert(PHP);
		BeccaSchedule.insert(SQL);
		Becca.displayStudent();
		BeccaSchedule.displayList();
		Becca.insert(SQL);
		Becca.displayList();
		Becca.displayStudent();
		
	}

}
