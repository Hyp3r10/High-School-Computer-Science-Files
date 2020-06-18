/**
 * Method drawArc(X,Y,Width,Height,Start,Degreese); uses the first four paramaters just like drawOval();
 * Start is the degree value of the arc-start and Degrees is the number of degrees the arc travels.
 */

import java.awt.*;
import java.applet.*;

public class Arc extends Applet
{
    public void paint (Graphics nate)
    {
        //Top Row
        nate.drawArc(50,50,100,100,0,180);
        nate.fillArc(200,50,100,100,0,90);
        nate.drawArc(350,50,100,100,0,360);
        nate.fillArc(500,50,100,100,0,-180);
        
        //Bottom Row
        nate.drawArc(50,250,100,250,0,180);
        nate.fillArc(200,250,200,100,90,130);
        nate.drawArc(200,250,200,100,0,360);
        nate.fillArc(450,250,100,100,30,300);
        nate.fillArc(600,290,25,25,0,360);
        nate.fillArc(650,290,25,25,0,360);
        nate.fillArc(700,290,25,25,0,360);
    }
}