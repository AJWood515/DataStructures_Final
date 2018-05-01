

/**
 * 
 * @author Alex
 *
 */

public class ClassEnrollment {

	public static void main(String[] args) {
	
		Courses JavaII = new Courses("Java 2", "CIS", 175, "Spring ", "Kleindorfer");
		Courses Data = new Courses("DataStructures", "CIS", 152, "Spring ", "Ruse");
		Courses PHP = new Courses("Intro to PHP", "WDV", 341, "Spring ", "Gullion");
		Courses Java = new Courses("Java", "CIS", 171, "Summer ", "Ruse");
		Courses CSharp = new Courses("Advanced C#", "CIS", 174, "Fall ", "Daniels");
		Courses Comp = new Courses("Composition I", "ENG", 105, "Fall","Zhang");
		Courses Mobile = new Courses("Survey of Mobile Technology", "MDT", 101, "Summer", "Sanders");
		
		
		Student Becca = new Student();
		Becca.setMajor("Business Info Systems");
		Becca.setId(123456);
		Becca.setfName("Rebecca");
		Becca.setlName("Smith");
		Becca.setCompleted(12);
		Becca.setCredits(64);
		Becca.insert(Mobile);
		Becca.insert(Comp);
		Becca.insert(PHP);
		Becca.displayStudent();
		System.out.println("*********************************");
		Student Tank = new Student(987456, "Tank", "Wilson", 64, 38,"Liberal Arts");
		Tank.insert(Java);
		Tank.insert(PHP);
		Tank.insert(Comp);
		Tank.insert(Data);
		Tank.displayStudent();
		System.out.println("*********************************");
		Student Bob = new Student(456123,"Robert","Fox", 32, 30,"Web Development Certificate");
		Bob.insert(CSharp);
		Bob.insert(PHP);
		Bob.insert(Mobile);
		Bob.insert(JavaII);
		Bob.displayStudent();
		System.out.println("*********************************");
		int maxSize = 100;
		InsertionSort list = new InsertionSort(maxSize);
		list.insert(Bob);
		list.insert(Tank);
		list.insert(Becca);
		System.out.println("Before sort:");
		list.display();
		list.insertionSort();
		System.out.println("After sort:");
		list.display();
	}

}
