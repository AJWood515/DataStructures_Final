/**
 * 
 * @author Alex
 *
 */
public class InsertionSort {

	private Student[] a;
	private int nElems; 
	
/**
 * creates how big the array is 
 * @param max
 */
	public InsertionSort(int max) {
		a = new Student[max]; 
		nElems = 0;     
	}
	public InsertionSort() {
		
	}
	/**
	 * able to insert sudent from the Student class.
	 * @param student
	 */
	public void insert(Student student){
		a[nElems] = student;
		nElems++;
	}
	/**
	 * displays student using the displayStudent() from the student class
	 */
	public void display()
	{ for(int j=0; j<nElems; j++) {
		a[j].displayStudent();
		//System.out.print(a[j] + " ");  
		System.out.println(""); } 
	}
	/**
	 * the insertion sort
	 */
	public void insertionSort() 
	{
		int in, out;	
		for(out=1; out<nElems; out++)
		{
			Student temp = a[out]; 
			in = out;
			while(in>0 && a[in-1].getlName().compareTo(temp.getlName())>0)
 
			{ 
				a[in] = a[in-1];
				--in; 
			}
			a[in] = temp;  
		}
		
	}
	
		
	
}
