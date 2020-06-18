public class Bank101
{
    private double checking;
    private double savings;
    private String name;
    public Bank101() // Default constructor
    {
        checking = 0;
        savings = 0;
        name = "";
    }
    public Bank101(String n)
    {
        checking = 0;
        savings = 0;
        name = n;
    }
    public Bank101(String n, double c, double s)
    {
        checking = c;
        savings = s;
        name = n;
    }
    //Accessor Methods (AKA Getters)
    public String getName()
    {
        return name;
    }
    public double getChecking()
    {
        return checking;
    }
    public double getSavings()
    {
        return savings;
    }
    public double getCombined()
    {
        return savings + checking;
    }
    //Mutator Methods (AKA Setters)
    public void setName(String n)
    {
        name = n;
    }
    public void depositChecking(double amount)
    {
        checking += amount;
    }
    public void depositSavings(double amount)
    {
        savings += amount;
    }
    public void withdrawChecking(double amount)
    {
        checking -= amount;
    }
    public void withdrawSavings(double amount)
    {
        savings -= amount;
    }
    public void transferToChecking(double amount)
    {
        savings -= amount;
        checking += amount;
    }
    public void transferToSavings(double amount)
    {
        savings += amount;
        checking -= amount;
    }
    public void closeChecking()
    {
        checking = 0;
    }
    public void closeSavings()
    {
        savings = 0;
    }
}