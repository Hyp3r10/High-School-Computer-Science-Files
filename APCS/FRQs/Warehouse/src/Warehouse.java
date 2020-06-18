import java.util.*;

public class Warehouse
{
    private ArrayList <InventoryItem> items;
    
    public Warehouse()
    {
        items = new ArrayList <InventoryItem>();
    }
    
    public void addItem(InventoryItem item)
    {
        items.add(item);
    }
    
    // Part (b)
    // returns an ArrayList of all items whose price is between
    // loPrice and hiPrice inclusive
    public ArrayList <InventoryItem> getItems(double loPrice, double hiPrice)
    {
        ArrayList<InventoryItem> list = new ArrayList<InventoryItem>();
        for(int i = 0; i < items.size(); i++) {
        	if(items.get(i).getPrice() >= loPrice && items.get(i).getPrice() <= hiPrice) {
        		list.add(items.get(i));
        	}
        }
        return list;
    }
    
    public void printInventory()
    {
        for(InventoryItem item : items)
        {
           System.out.printf(" %-6d",item.getID());
           System.out.printf("%8.2f",item.getBasePrice());
           System.out.printf("%8.2f\n",item.getPrice());
        }
    }
}