//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
    private int xOne,yOne,xTwo,yTwo;
    private double distance;
    //Constructors
    public Distance()
    {
       int x1 = 0;
       int x2 = 0;
       int y1 = 0;
       int y2 = 0;
    }
    public Distance(int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
    }
    //Mutators
    public void setCoordinates(int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
        calcDistance();
    }
    public void calcDistance()
    {
        double x = Math.pow((xTwo - xOne),2);
        double y = Math.pow((yTwo - yOne),2);
        distance = Math.sqrt(x + y);
    }
    // toString (basically)
    public void print( )
    {
        System.out.println("Distance == " + distance);
    }
}