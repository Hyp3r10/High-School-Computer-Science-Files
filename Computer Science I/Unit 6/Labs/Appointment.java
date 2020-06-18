public class Appointment extends Date
{
    // instance variables
    private String text;
    // default constructor
    // use super to initialize variables inherited from Date
    public Appointment()
    {
        super();
    }
    // second constructor
    // use super to initialize variables inherited from Date
    public Appointment(int m, int d, int y, String t)
    {
        super(m,d,y);
        text = t;
    }
    // accessor method
    public String getText()
    {
        return text;
    }
    // toString method
    // use super to include the toString method from Date
    public String toString()
    {
        return super.toString() + " " + getText();
    }
}