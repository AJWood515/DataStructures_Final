/**
 * 
 * @author Alex
 *
 */
public class LinkedList {
	private Link first;
	public LinkedList() {
		first = null;
	}
	/**
	 * 
	 * @return - returns true or false if list is empty
	 */
	public boolean isEmpty(){
		return (first==null); 
	}
	/**
	 * 
	 * @param name name of can you wish to find
	 * @return returns null if can't find the can you want
	 */
	public Student find(Student name) {
		Link newLink = first;
		while(newLink != null) {
			if (newLink.data.equals(name)) {
				System.out.println(newLink.data);
				break;
			}
			else
				newLink = newLink.next;
		}
		return null;
	}
	/**
	 * inserts in alphabetical order
	 * @param key used to insert a new can 
	 */
	public void insert(Student key){ 
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current != null && key.getlName().compareTo(current.data.getlName())>0)
		{
			previous = current; 
			current = current.next;
		}
		if(previous==null)
			first = newLink; 
		else
			previous.next = newLink;
		newLink.next = current;
	}
	/**
	 * 
	 * @return returned removed link
	 */
	public Link remove(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	public void displayList(){
		System.out.print("Schedule: " + "\n");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		} 
		System.out.println("");
	}
	public void insert(Courses key) {
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		while(current != null && key.getName().compareTo(current.info.getName())>0)
		{
			previous = current; 
			current = current.next;
		}
		if(previous==null)
			first = newLink; 
		else
			previous.next = newLink;
		newLink.next = current;
		
	}
}