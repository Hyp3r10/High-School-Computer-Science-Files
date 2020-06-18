
public class BigO101
{
	private int[] list;
	private int itemsInArray; //Logical size of array
	private static long startTime;
	private static long endTime;

	public BigO101(int size)
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

	/* O(N) An algorithm thats time to complete will grow
	 * in direct proportion to the amount of data
	 * 
	 * The linear search is an example of this
	 * To find all values that match what we 
	 * are searching for we will have to look in 
	 * exactly each item in the array
	 * 
	 * If we just wanted find one match and used
	 * 'break' the Big O is the same because it 
	 * describes the worst case scenario in which
	 * the whole array must be searched.
	 */

	public void linearSearch(int key)
	{
		startTime = System.currentTimeMillis();

		int count = 0;
		String indexMatches = ""; //The compiler is "smart" and will exit early after it matches a key. This forces it to not exit early.

		for(int i = 0; i < list.length; i++)
		{
			if(list[i] == key)
			{
				indexMatches += key + " ";
				count++;				
			}
		}


		endTime = System.currentTimeMillis();

		System.out.println("Linear Search found "+ count + " matches in "+ (endTime - startTime) + " milliseconds.\n");

	}



}
