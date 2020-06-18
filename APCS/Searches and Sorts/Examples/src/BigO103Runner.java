public class BigO103Runner
{
	public static void main(String[] args)
	{
		BigO103 test1 = new BigO103(42);
		
		//O(1) Test
		//est1.addItemToArray(10);
		
		//System.out.println(Arrays.toString(test1.getList()));
		
		BigO103 test2 = new BigO103(10000);
		test2.generateRandomArray();
		
		BigO103 test3 = new BigO103(20000);
		test3.generateRandomArray();
		
		BigO103 test4 = new BigO103(300000);
		test4.generateRandomArray();
		
		BigO103 test5 = new BigO103(60000);
		test5.generateRandomArray();
		
		
		//O(log n) Test
		test2.binarySearch(23);
		test3.binarySearch(23);
		test4.binarySearch(23);
		test5.binarySearch(23);
		
		
		
	}

}
