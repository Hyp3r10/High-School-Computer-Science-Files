
import java.util.LinkedList;
import java.util.Scanner;

public class HashTable {
	@SuppressWarnings("rawtypes")
	private LinkedList[] table;	// Array of LinkedLists used to store the data
	/**
	 * Default constructor that instantiates the hash table
	 */
	public HashTable() {
		table = new LinkedList[10];
		for(int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Word>();
		}
	}
	/**
	 * Adds the passed object into the hash table
	 * @param obj	The object being added
	 */
	@SuppressWarnings("unchecked")
	public void add(Object obj) {
		int index = obj.hashCode();
		if(!this.table[index].contains(obj)) {
			this.table[index].add(obj);
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		String output="HASHTABLE\n";
		int index = 0;
		for(LinkedList<Word> list : this.table) {
			output += "bucket " + index++ + ": ";
			for(Word temp : list) {
				output += temp + " ";
			}
			output += "\n";
		}
		return output;
	}
}