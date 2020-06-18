/**
 * This program demonstrates how to draw lines.
 * Lines are drawn from (X1,Y1) to (X2,Y2) wiht drawLine(X1,Y1,X2,Y2)
 */

import java.awt.*;
import java.applet.*;

public class Lines extends Applet
{
    public void paint (Graphics g) // "g" is the object name of the graphics class
    {
        //g.drawLine(0,0,800,600);
        //g.drawLine(0,600,800,0);
        g.drawLine(100,300,700,300);//Horizontal 
        g.drawLine(400,100,400,500);//Verticle
        g.drawLine(100,100,700,100);
        g.drawLine(100,500,700,500);
        g.drawLine(100,100,100,500);
        g.drawLine(700,100,700,500);
        
    }
}