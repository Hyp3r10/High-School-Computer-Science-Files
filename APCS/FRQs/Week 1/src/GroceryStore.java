import java.util.*;

public class GroceryStore
{
	public final int SIZE = 8;

	private GroceryItem[] groceryList;  // array of grocery items
	private int numItems;               // number of items added to list

	public GroceryStore()
	{
		groceryList = new GroceryItem[SIZE];

		groceryList[0]= new GroceryItem("avocado",1.68, 8, "P");
		groceryList[1]= new GroceryItem("milk",1.78, 64, "D");
		groceryList[2]= new GroceryItem("chicken",4.48, 64, "M");
		groceryList[3]= new GroceryItem("broccoli",1.92, 16, "P");
		groceryList[4]= new GroceryItem("yogurt",0.96, 16, "D");
		groceryList[5]= new GroceryItem("spinach",1.76, 16, "P");
		groceryList[6]= new GroceryItem("cornedbeef",6.72, 48, "M");
		groceryList[7]= new GroceryItem("porkchops",2.02, 32, "M");

		numItems = 8;  // number of items added to list
	}

	// returns the price of this item
	public double getPrice(String itemName)
	{
		for(int i=0; i < numItems; i++)
		{
			GroceryItem item = groceryList[i];
			if(item.getItemName().equals(itemName))
				return item.getItemPrice();
		}
		return -1;  // not found
	}

	// returns the size (in ounces) of this item
	public int getSize(String itemName)
	{
		for(int i=0; i < numItems; i++)
		{
			GroceryItem item = groceryList[i];
			if(item.getItemName().equals(itemName))
				return item.getItemSize();
		}
		return -1;  // not found
	}

	// Part (a)
	// changes the price of item associated with itemName
	public void setPrice(String itemName, double price)
	{
		for(int i = 0; i < groceryList.length; i++) {
			if(groceryList[i].getItemName().equals(itemName)) {
				groceryList[i].setItemPrice(price);
			}
		}
	}

	// Part (b)
	// postcondition: returns the name of an item whose unit
	//                price is the lowest in the specified category;
	//                if no items in the specified category,
	//                returns "none".
	public String bargainItem(String category)
	{
		int count = 0;
		int lowestIndex = 0;
		double lowestPrice = Double.MAX_VALUE;
		for(int i = 0; i < groceryList.length; i++) {
			if(groceryList[i].getItemCategory().equals(category)) {
				double price = groceryList[i].getItemPrice()/groceryList[i].getItemSize();
				if(price < lowestPrice) {
					lowestIndex = i;
					lowestPrice = price;
				}
				count++;
			}
		}
		if(count == 0) {
			return "none";
		}
		else {
			return groceryList[lowestIndex].getItemName();
		}
	}

	public String toString()
	{
		String str="";
		for(int i=0; i < numItems; i++)
		{
			str+= groceryList[i].toString() + "\n";
		}
		return str;
	}
}