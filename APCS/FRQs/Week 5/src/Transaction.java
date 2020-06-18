public class Transaction
{
    public static final double TAX_RATE = 0.0825;
    // instance variables
    private String myDescription;  // description of item being sold
    private int myNumItems;        // quanitity of item being sold
    private double myItemCost;     // unit cost of item being sold
    
    // constructor
    public Transaction(String description, int numItems, double itemCost)
    {
        myDescription = description;
        myNumItems = numItems;
        myItemCost = itemCost;
    }
    
    // accessor methods
    public String getDescription()
    {
        return myDescription;
    }
    
    public int getNumItems()
    {
        return myNumItems;
    }
    
    public double getItemCost()
    {
        return myItemCost;
    }
    
    // postcondition: calculates the total sale price of an item
    //                including tax.
    public double getTotal()
    {
        double cost = myNumItems * myItemCost;
        double tax = cost * TAX_RATE;
        return cost + tax;
    }
    
    public String toString()
    {
        String str = "";
        str = "Description      : " + myDescription + "\n" +
              "Quantity         : " + myNumItems  + "\n" +
              "Cost             : " + myItemCost  + "\n" +
              "Total Cost       : " + getTotal();
        return str;
    }
}