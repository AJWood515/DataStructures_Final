/**
 * 
 * @author Alex
 *
 */
public class InsertionSort {

	private Student[] a;
	private int nElems; 
	

	public InsertionSort(int max) {
		a = new Student[max]; 
		nElems = 0;     
	}
	public InsertionSort() {
		
	}
	public void insert(Student student){
		a[nElems] = student;
		nElems++;
	}
	public void display()
	{ for(int j=0; j<nElems; j++) {
		a[j].displayStudent();
		//System.out.print(a[j] + " ");  
		System.out.println(""); } 
	}
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
