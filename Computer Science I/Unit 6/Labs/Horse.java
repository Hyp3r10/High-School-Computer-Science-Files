public class Horse
{
    // instance variables
    private String owner;  // owner of horse
    private int age;       // age of horse
    private double value;  // value of horse
    public Horse()
    {
        owner = "";
        age = 0;
        value = 0;
    }
    public Horse(String o, int a, double v)
    {
        owner = o;
        age = a;
        value = v;
    }
    public String toString()
    {
        String str;
        str = "Owner = " + owner + "\n" +
              "Age   = " + age   + "\n" +
              "Value = $" + value;
        return str;
    }
}