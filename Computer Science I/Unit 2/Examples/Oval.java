/**
 * The four paramater of the drawOval(); Methos are identicle of those
 * of the drawRect(); method. drawOval(X,Y,Width,Height);
 */

import java.awt.*;
import java.applet.*;

public class Oval extends Applet
{
    public void paint (Graphics tim)
    {
       //Top Row 
       tim.drawOval(50,50,100,100);
       tim.drawOval(250,50,200,70);
       tim.drawOval(500,50,70,200);
       
       //Botom Row
       tim.fillOval(50,400,100,100);
       tim.fillOval(250,400,70,200);
       tim.fillOval(500,400,200,70);
    }
}