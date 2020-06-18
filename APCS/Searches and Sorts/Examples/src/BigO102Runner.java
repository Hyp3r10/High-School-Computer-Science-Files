public class BigO102Runner
{
	public static void main(String[] args)
	{
		BigO102 test1 = new BigO102(42);
		
		//O(1) Test
		//est1.addItemToArray(10);
		
		//System.out.println(Arrays.toString(test1.getList()));
		
		BigO102 test2 = new BigO102(10000);
		test2.generateRandomArray();
		
		BigO102 test3 = new BigO102(20000);
		test3.generateRandomArray();
		
		BigO102 test4 = new BigO102(300000);
		test4.generateRandomArray();
		
		BigO102 test5 = new BigO102(60000);
		test5.generateRandomArray();
		
		
		//O(N) Test
		test2.bubbleSort();
		test3.bubbleSort();
		test4.bubbleSort();
		test5.bubbleSort();
		
		
		
	}

}
