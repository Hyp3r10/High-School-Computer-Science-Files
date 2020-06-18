
public class BigO102 {
	private int[] list;
	private int itemsInArray; //Logical size of array
	private static long startTime;
	private static long endTime;

	public BigO102(int size)
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
	}
	/*
	 * O(n^2) Time to complete will be proportional to
	 * the square of the amount of data (Bubble sort, 
	 * Selection sort, Insertion sort). Algorithms with more
	 * nested iterations will result in O(n^2), etc. performance.
	 * 
	 * Each pass through the outer loop O(N) requires us to go through
	 * the entire data structure again so N multiplies against itself or
	 * it is squared
	 */
	public void bubbleSort() {
		startTime = System.currentTimeMillis();
		
		int count = 0;
		do {
			count = 0;
			for(int i = 0; i < list.length-1; i++) {
				if(list[i] > list[i+1]) {
					swap(list, i, i+1);
					count++;
				}
			}
		} while(count > 0);
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Bubble Sort finish sorting in " + (endTime - startTime) + " milliseconds. \n");
	}
	public static void swap(int[] nums, int pos1, int pos2) {
		int temp = nums[pos2];
		nums[pos2] = nums[pos1];
		nums[pos1] = temp;
	}
}
