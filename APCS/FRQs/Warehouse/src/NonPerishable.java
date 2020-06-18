import java.util.*;

public class NonPerishable extends InventoryItem
{
    public NonPerishable(Date entry, double price)
    {
        super(entry, price);
    }
    
    public double getPrice()
    {
        return super.getBasePrice();
    }
}