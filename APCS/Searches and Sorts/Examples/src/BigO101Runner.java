import java.util.Arrays;

public class BigO101Runner
{
	public static void main(String[] args)
	{
		BigO101 test1 = new BigO101(42);
		
		//O(1) Test
		//est1.addItemToArray(10);
		
		//System.out.println(Arrays.toString(test1.getList()));
		
		BigO101 test2 = new BigO101(100000);
		test2.generateRandomArray();
		
		BigO101 test3 = new BigO101(500000);
		test3.generateRandomArray();
		
		BigO101 test4 = new BigO101(10000000);
		test4.generateRandomArray();
		
		BigO101 test5 = new BigO101(15000000);
		test5.generateRandomArray();
		
		
		//O(N) Test
		test2.linearSearch(20);
		test3.linearSearch(20);
		test4.linearSearch(20);
		test5.linearSearch(20);
		
		
		
	}

}
