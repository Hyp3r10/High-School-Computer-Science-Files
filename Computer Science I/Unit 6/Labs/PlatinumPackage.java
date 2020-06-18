public class PlatinumPackage extends PremiumPackage
{
    public PlatinumPackage(int nights)
    {
        super(nights);
    }
    public String getResort()
    {
        return "Spa Spectacular Resort";
    }
    public double getCostPerNight()
    {
        return 200.00;
    }
    public String getMealPlan()
    {
        return "Breakfast, Lunch, and Dinner";
    }
}