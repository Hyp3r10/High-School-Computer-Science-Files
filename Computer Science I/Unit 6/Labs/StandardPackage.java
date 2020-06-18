public class StandardPackage
{
    // Instance Variables
    private int nights; 
    public StandardPackage(int n)
    {
        nights = n;
    }
    public String getResort()
    {
       return "Wilderness Resort";  
    }
    public double getCostPerNight()
    {
       return 100.00;
    }
    public double getTotalCost()
    {
        return nights * getCostPerNight();
    }
    public String toString()
    {
        String str = "Resort           = " + getResort() + "\n" +
                     "Cost per night   = " + getCostPerNight() + "\n" +
                     "Number of nights = " + nights + "\n" +
                     "Total cost       = " + getTotalCost();
        return str;
    }
}