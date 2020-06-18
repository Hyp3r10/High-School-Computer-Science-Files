public class Date
{
    // instance variables
    private int month;
    private int day;
    private int year;
    
    public Date()
    {
        month = 0;
        day = 0;
        year = 0;
    }
    
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }   
    
    public int getMonth()
    {
        return month;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
}