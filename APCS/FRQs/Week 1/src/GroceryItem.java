public class GroceryItem
{
	// instance variables
	private String itemName;
	private double itemPrice;
	private int itemSize;
	private String itemCategory;

	public GroceryItem(String n, double p, int s, String c)
	{
	   itemName = n;
	   itemPrice = p;
	   itemSize = s;
	   itemCategory = c;
	}

	public void setItemName(String n)
	{
		itemName = n;
    }

    public void setItemPrice(double p)
	{
	   itemPrice = p;
	}

	public void setItemSize(int s)
	{
	   itemSize = s;
	}

	public void setItemCategory(String c)
	{
	   itemCategory = c;
	}

	public String getItemName()
	{
	   return itemName;
	}

	public double getItemPrice()
	{
	   return itemPrice;
	}

    public int getItemSize()
	{
	   return itemSize;
	}

	public String getItemCategory()
	{
		return itemCategory;
	}

	public String toString()
	{
		return itemName + "   " + itemPrice + "   " +
		       itemSize + "   " + itemCategory;
	}
}