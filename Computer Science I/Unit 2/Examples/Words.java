/**
 * This program demonstrates the drawString method.
 * With the drawString("String",X,Y); the string
 * will be sisplayed starting at the (X,Y) pixle cordinate.
 */

import java.awt.*;
import java.applet.*;

public class Words extends Applet
{
    public void paint (Graphics g)
    {
        Font myFont = new Font("papyrus", Font.BOLD, 22); //Font("font name", style, size)
        
        g.setColor(Color.RED);
        g.drawString("This string will siplay at cordinate (5,50)",5,50);
        
        g.setColor(Color.BLUE);
        g.setFont(myFont);
        g.drawString("This string will siplay in blue at cordinate (400,500)",400,500);
    }
}