import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList {
	private LinkedList<Integer> list;
	/**
	 * Default constructor that initializes the list 
	 * object to be a new LinkedList
	 */
	public JavaLinkedList() {
		list = new LinkedList<Integer>();
	}
	/**
	 * Overloaded constructor that instantiates the list
	 * object to be a LinkedList representation of the array
	 * of integers, nums
	 * @param nums	An array of integers used to give the linked list its values
	 */
	public JavaLinkedList(int[] nums) {
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}
	/**
	 * Iterates trough the elements of list and adds up 
	 * the values of the linked list
	 * @return	the sum of the elements
	 */
	public double getSum() {
		double total=0;
		for(Integer temp : list) {
			total += temp;
		}
		return total;
	}
	/**
	 * Calls the getSum method and divides it by the number of size of the list
	 * @return	The average of the elements in the LinkedList
	 */
	public double getAvg() {
		return this.getSum()/list.size();
	}
	/**
	 * Iterates through the LinkedList and keeps track of the largest item
	 * @return	The largest item in the LinkedList
	 */
	public int getLargest() {
		int largest=Integer.MIN_VALUE;
		for(Integer temp : this.list) {
			if(temp > largest) {
				largest = temp;
			}
		}
		return largest;
	}
	/**
	 * Iterates through the LinkedList and keeps track of the smallest item
	 * @return	The smallest item in the LinkedList
	 */
	public int getSmallest() {
		int smallest = Integer.MAX_VALUE;
		for(Integer temp : this.list) {
			if(temp < smallest) {
				smallest = temp;
			}
		}
		return smallest;
	}
	@Override
	public String toString() {
		String output="";
		output += "SUM:: " + this.getSum();
		output += "\nAVERAGE:: " + this.getAvg();
		output += "\nSMALLEST:: " + this.getSmallest();
		output += "\nLARGEST:: " + this.getLargest();
		output += "\n";
		return output;
	}
}