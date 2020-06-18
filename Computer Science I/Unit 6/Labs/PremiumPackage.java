public class PremiumPackage extends StandardPackage
{
    public PremiumPackage(int nights)
    {
        super(nights);
    }
    public String getResort()
    {
        return "Carribean Resort";
    }
    public double getCostPerNight()
    {
       return 150.00;
    }
    public String getMealPlan()
    {
        return "Breakfast";
    }
    public String toString()
    {
        return super.toString() + "\nMeal Plan = " + getMealPlan();
    }
}