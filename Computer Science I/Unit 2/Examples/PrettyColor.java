/**
 * This program demonstrates  how to output colors with
 * the Color class and the setColor() method.
 */

import java.awt.*;
import java.applet.*;

public class PrettyColor extends Applet
{
    public void paint (Graphics g)
    {
        //Top Row
        g.setColor(Color.BLACK);
        g.fillOval(50,50,100,100);
        g.setColor(Color.BLUE);
        g.fillOval(200,50,100,100);
        g.setColor(Color.CYAN);
        g.fillOval(350,50,100,100);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(500,50,100,100);
        
        //Middle Row
        g.setColor(Color.GRAY);
        g.fillOval(50,200,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(200,200,100,100);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(350,200,100,100);
        g.setColor(Color.MAGENTA);
        g.fillOval(500,200,100,100);
        
        //Bottom Row
        g.setColor(Color.ORANGE);
        g.fillOval(50,350,100,100);
        g.setColor(Color.PINK);
        g.fillOval(200,350,100,100);
        g.setColor(Color.RED);
        g.fillOval(350,350,100,100);
        g.setColor(Color.YELLOW);
        g.fillOval(500,350,100,100);
        
    }
}