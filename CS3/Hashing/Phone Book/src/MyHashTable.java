import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyHashTable<T, E> implements IMapGeneric<T, E> {
	@SuppressWarnings("hiding")
	class Entry<T, E> {
		public Entry<T, E> next;	// A reference to the next object in the sequence
		public T key;				// The key of the current object
		public E val;				// The value of the current object
		/**
		 * Constructs an Entry object with the passed values
		 * @param k	The Key of the Entry Object
		 * @param v	The Value of the Entry Object
		 */
		public Entry(T k, E v) {
			this.key = k;
			this.val = v;
			this.next = null;
		}
		@Override
		public String toString() {return "" + this.key.toString() + ": " + this.val.toString(); }
	}
	/**
	 * The logical size of the hash table
	 */
	public int size; 
	/**
	 * The backing structure of the hash table that stores the linked list of Entry objects
	 */
	public Entry<T, E>[] hashTable;
	/**
	 * Constructs a new HashTable of size 20
	 */
	@SuppressWarnings("unchecked")
	public MyHashTable() {
		this.hashTable = new Entry[12];
	}
	/**
	 * Constructs a new HashTable of passed size
	 * @param size	The size of the hashTable
	 */
	@SuppressWarnings("unchecked")
	public MyHashTable(int size) {
		this.hashTable = new Entry[size];
	}
	@Override
	public E put(T key, E val) {
		int hc = key.hashCode();
		Entry<T, E> curr = new Entry<T, E>(key, val);
		Entry<T, E> temp = this.hashTable[hc];
		if(temp != null) {
			while(temp.next != null) {
				if(temp.key.equals(key)) {
					return temp.val;
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
	public E get(T key) {
		int hc = key.hashCode();
		Entry<T, E> temp = this.hashTable[hc];
		while(temp != null) {
			if(temp.key.equals(key)) {
				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}
	@Override
	public E remove(T key) {
		int hc = key.hashCode();
		Entry<T, E> pred = this.hashTable[hc];
		if(pred.key.equals(key)) {
			this.hashTable[hc] = pred.next;
			return pred.val;
		}
		else {
			Entry<T, E> succ = pred.next;
			while(succ != null && !succ.key.equals(key)) {
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
				return succ.val;
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
			PrintWriter out = new PrintWriter(new File("MyHashTable.out"));
			String output = "";
			int count = 0;
			for(Entry<T, E> tempEntry : this.hashTable) {
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
