import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class PhoneBook implements IMap{
	class Entry {
		public Entry next;			// A reference to the next object in the sequence
		public Person person;		// The key of the current object
		public PhoneNumber number;	// The value of the current object
		/**
		 * Constructs an Entry object with the passed values
		 * @param p	The Key of the Entry Object
		 * @param n	The Value of the Entry Object
		 */
		public Entry(Person p, PhoneNumber n) {
			this.person = p;
			this.number = n;
			this.next = null;
		}
		@Override
		public String toString() {return "" + this.person + ": " + this.number; }
	}
	/**
	 * The logical size of the hash table
	 */
	public int size; 
	/**
	 * The backing structure of the hash table that stores the linked list of Entry objects
	 */
	public Entry[] hashTable;
	/**
	 * Constructs a new HashTable of size 12
	 */
	public PhoneBook() {
		this.hashTable = new Entry[12];
	}
	@Override
	public PhoneNumber put(Person key, PhoneNumber val) {
		int hc = key.hashCode();
		Entry curr = new Entry(key, val);
		Entry temp = this.hashTable[hc];
		if(temp != null) {
			while(temp.next != null) {
				if(temp.person.equals(key)) {
					return temp.number;
				}
				temp = temp.next;
			}
			temp.next = curr;
		}
		else {
			this.hashTable[hc] = curr;
		}
		size++;
		return val;
	}
	@Override
	public PhoneNumber get(Person person) {
		int hc = person.hashCode();
		Entry temp = this.hashTable[hc];
		while(temp != null) {
			if(temp.person.equals(person)) {
				return temp.number;
			}
			temp = temp.next;
		}
		return null;
	}
	@Override
	public PhoneNumber remove(Person person) {
		int hc = person.hashCode();
		Entry pred = this.hashTable[hc];
		if(pred.person.equals(person)) {
			this.hashTable[hc] = pred.next;
			return pred.number;
		}
		else {
			Entry succ = pred.next;
			while(succ != null && !succ.person.equals(person)) {
				pred = pred.next;
				succ = succ.next;
			}
			// We've searched the whole LinkedList for the element and it wasn't there
			if(succ == null) {
				// Element wasn't there, so don't decrement the logical size
				return null;
			}
			// We've found the element and therefore we need to remove it
			else {
				pred.next = succ.next;
				this.size--;
				return succ.number;
			}
		}
	}
	@Override
	public int size() {
		return this.size;
	}
	@Override
	public String toString() {
		try {
			PrintWriter out = new PrintWriter(new File("PhoneBook.out"));
			String output = "";
			int count = 0;
			for(Entry tempEntry : this.hashTable) {
				output += "Bucket " + ++count + ": ";
				while(tempEntry != null) {
					output += tempEntry + ", ";
					tempEntry = tempEntry.next;
				}
				output = output.substring(0, output.length()-2);
				output +=  "\n";
			}
			out.append(output);
			out.close();
			return output;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
