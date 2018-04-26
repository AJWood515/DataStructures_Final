/**
 * 
 * @author Alex
 *
 */
public class Link {
	public Student data;
	public Courses info;
	public Link next;
	/**
	 * uses a string to the link
	 * @param string
	 */
	public Link(Student string) {
		data = string;
	}	
	public Link(Courses key) {
		info = key;
	}
	/**
	 * displays the link
	 */
	public void displayLink()
	{
		if(data != null)
			System.out.println("{" + data +"}");
		if(info != null) {
			System.out.println("{" + info +"}");
		}

	}
}
