import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorReplacer
{
	private ArrayList<Integer> list;
	private int toRemove, replaceWith;

	/**
	 * This constructor will instantiate the global variables 
	 * list, toRemove, and replaceWith by calling the setEmAll method
	 * @param line	A String containing all of the characters to put into the list
	 * @param rem	A String indicating which String to remove from the list
	 * @param rep	A String indicating which String to replace from the list
	 */
	public IteratorReplacer(String line, String rem, String rep) {
		setEmAll(line, rem, rep);
	}
	/**
	 * This method will allow us to reuse the same IteratorReplacer object by just resetting
	 * the values of the global variables, list, toRemove, and replaceWith, to their new values
	 * @param line	A String containing all of the characters to put into the list
	 * @param rem	A String indicating which String to remove from the list
	 * @param rep	A String indicating which String to replace from the list
	 */
	public void setEmAll(String line, String rem, String rep) {
		list = new ArrayList<Integer>();
		String[] characters = line.split(" ");
		for(String temp : characters) {
			list.add(Integer.parseInt(temp));
		}
		this.toRemove = Integer.parseInt(rem);
		this.replaceWith = Integer.parseInt(rep);
	}
	/**
	 * This uses a ListIterator to remove all occurrences of toRemove
	 * from the ArrayList list and replace them with the replaceWith value
	 */
	public void replace() {
		ListIterator<Integer> here = list.listIterator();
		list = new ArrayList<Integer>();
		while(here.hasNext()) {
			Integer curr = here.next();
			if(curr.equals(this.toRemove)) {
				here.set(this.replaceWith);
				curr = this.replaceWith;
			}
			list.add(curr);
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}