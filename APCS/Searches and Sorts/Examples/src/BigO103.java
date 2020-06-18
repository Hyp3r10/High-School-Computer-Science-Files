import java.util.Arrays;

public class BigO103 {
	private int[] list;
	private int itemsInArray; //Logical size of array
	private static long startTime;
	private static long endTime;

	public BigO103(int size)
	{
		itemsInArray = 0;
		list = new int[size];
	}

	public int[] getList()
	{
		return list;
	}

	/*(O)1 An algorithm that executes in the same
	 * time regardless of the amount of data
	 */

	public void addItemToArray(int newItem)
	{
		list[itemsInArray++] = newItem;
		//itemsInArray++;
	}

	public void generateRandomArray()
	{
		for(int i = 0 ; i < list.length; i++)
			list[i] = (int) (Math.random() * 1000) + 10;
		
		Arrays.sort(list);
	}
	/*
	 * O(log N) Occurs when the data being used is decreased
	 * by roughly 50% each time through the algorithm. The 
	 * Binary search is a perfect example of this.
	 * 
	 * Pretty fast because log N increases dramatically
	 * at a slower rate as N increases.
	 */
	public void binarySearch(int key) {
		startTime = System.currentTimeMillis();
		
		int index = -1;
		int timesThrough = 0;
		int min = 0;
		int max = list.length-1;
		while(min <= max) {
			int middle = (min + max) / 2;
			if(list[middle] == key) {
				index = middle;
				break;
			}
			else {
				if(key < list[middle]) {
					max = middle-1;
				}
				else {
					min = middle+1;
				}
			}
			timesThrough++;
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("\nBinary Search found a match for " + key
				+ " in " + (endTime - startTime)
				+ " with " + timesThrough + " passes. \n");
	}

	public void swap(int[] nums, int pos1, int pos2) {
		int temp = nums[pos2];
		nums[pos2] = nums[pos1];
		nums[pos1] = temp;
	}
}
