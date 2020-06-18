/**
 * A rectangle is drawn from the top left vertex(X,Y) cordinate followed by
 * width and heght using drawRect(X,Y,Width,Height).
 * fillRect() shades the inside pixles of the rectangle.
 */

import java.awt.*;
import java.applet.*;

public class Rectangle extends Applet
{
    public void paint (Graphics g)
    {
       //Top Row 
       g.drawRect(50,50,100,100);
       g.drawRect(250,50,200,80);
       g.drawRect(500,50,80,200);
       
       //Botom Row
       g.fillRect(50,400,100,100);
       g.fillRect(250,400,80,200);
       g.fillRect(500,400,200,80);
    }
}