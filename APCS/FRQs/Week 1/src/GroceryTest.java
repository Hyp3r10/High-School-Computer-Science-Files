public class GroceryTest
{
	public static void main(String[] args)
	{
		GroceryStore store = new GroceryStore();
		
		System.out.println(store);
		System.out.println();
		
		System.out.println("Test setPrice method");
		System.out.println("====================");
		
		store.setPrice("milk", 1.92);
		store.setPrice("porkchops", 2.24);
		
		System.out.println("milk changed from 1.78 to 1.92");
		System.out.println("porkchops changed from 2.02 to 2.24");
		System.out.println();
		
		System.out.println(store);
		System.out.println();
		
		System.out.println("Test bargainItem method");
		System.out.println("=======================");
		
		System.out.println("Produce = " + store.bargainItem("P"));
		System.out.println("Meat    = " + store.bargainItem("M"));
		System.out.println("Bread   = " + store.bargainItem("B"));
		System.out.println();		
	}
}