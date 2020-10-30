import java.util.LinkedList;

public class HashTable103 {
	public static void main(String[] args) {
		Table t = new Table(10);
		t.add(3);
		t.add(7);
		t.add(11);
		t.add(31);
		t.add(17);
		t.add(15);
		System.out.println(t);
	}
}
class Table {
	private LinkedList<Integer>[] table;
	@SuppressWarnings("unchecked")
	public Table(int size) {
		this.table = new LinkedList[size];
		for(int i = 0; i < this.table.length; i++) {
			table[i] = new LinkedList<Integer>(); 
		}
	}
	public void add(int val) {
		this.table[this.hashCode(val)].add(val);
	}
	@Override
	public String toString() {
		String output = "";
		int index = 0;
		for(LinkedList<Integer> list : this.table) {
			output += "Index " + index++ + ": ";
			for(int temp : list) {
				output += temp + " -> ";
			}
			output += "\n";
		}
		return output;
	}
	public int hashCode(int val) {
		return val % table.length;
	} 
}
