//� A+ Computer Science  -  www.apluscompsci.com
//Name - Matthew Sheldon
//Date - 11/14/17
//Class - Comp. Sci. I
//Lab  - OOP / Return – MILES PER HOUR
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class MilesPerHour
{
    private double distance, hours, minutes, time;
    private double mph;
    public MilesPerHour()
    {
        setNums(0,0,0);
        mph=0.0;
    }
    public MilesPerHour(int dist, int hrs, int mins)
    {
        setNums(dist,hrs,mins);
    }
    public void setNums(int dist, int hrs, int mins)
    {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }
    public void calcMPH()
    {
        time = (minutes / 60) + hours;
        mph = distance / time;
    }
    public void print()
    {
        System.out.println("\n" + (int)distance + " miles in " + (int)hours + " hour and " + (int)minutes + " minutes = " + Math.round(mph) + " MPH." );
    }
}