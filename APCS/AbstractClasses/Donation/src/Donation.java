public abstract class Donation
{
    private String donorName;
    
    public Donation(String name) {
       donorName = name;    
    }
    
    public abstract String getClub();
    public abstract double getAmount();
    
    public String toString() {
        String str;
        str = "Donor Name      = " + donorName + "\n" +
              "Donation Club   = " + getClub() + "\n" +
              "Donation Amount = " + getAmount();
        return str;
    }
}