import java.util.*;

public abstract	class InventoryItem
{
	public static int idCounter = 1000;
	// instance variables
	private int id;
	private Date entry;
	private double basePrice;
	
	public InventoryItem(Date entryDate, double price)
	{
		id = makeId();
		entry = entryDate;
		basePrice = price;
	}
	
	// returns the date this item entered the warehouse
	public Date getEntryDate()
	{
		return entry;
	}
	
	// returns the base price of this item
	public double getBasePrice()
	{
		return basePrice;
	}
	
	// return id of this item
	public int getID()
	{
		return id;
	}
	
	// returns the price of this item
	abstract public double getPrice();
	
	// returns a unique id
	private static int makeId()
	{
	   return idCounter++;	
	}
	
}