/**
 * 
 * @author Alex
 *
 */
public class Link {
	public Student data;
	public Link next;
/**
 * uses a string to the link
 * @param string
 */
	public Link(Student string) {
		data = string;
}	
	/**
	 * displays the link
	 */
	public void displayLink()
	{
		System.out.println("{" + data +"}");
	}
}
