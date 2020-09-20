import java.util.ArrayList;
import java.util.ListIterator;


public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	/**
	 * This Constructor will instantiate the global variables list and toRemove
	 * @param line	A String containing all of the characters to put into the list
	 * @param rem	A String indicating which String to remove from the list
	 */
	public IteratorRemover(String line, String rem) {
		setTest(line, rem);
	}
	/**
	 * This method will allow us to reuse the same IteratorRemover object by just resetting
	 * the values of the global variables, list and toRemove, to their new values
	 * @param line	A String containing all of the characters to put into the list
	 * @param rem	A String indicating which String to remove from the list	
	 */
	public void setTest(String line, String rem) {
		list = new ArrayList<String>();
		String[] characters = line.split(" ");
		for(String temp : characters) {
			list.add(temp);
		}
		this.toRemove = rem;
	}
	/**
	 * This uses a ListIterator to remove all occurrences of toRemove
	 * from the ArrayList list.
	 */
	public void remove() {
		ListIterator<String> here = list.listIterator();
		list = new ArrayList<String>();
		while(here.hasNext()) {
			String curr = here.next();
			if(curr.equals(this.toRemove)) {
				here.remove();
			}
			else {
				list.add(curr);
			}
		}
	}
	/**
	 * Returns the list after the remove method has been called 
	 * as a String representation of the ArrayList.
	 */
	public String toString() {
		return list.toString();
	}
}