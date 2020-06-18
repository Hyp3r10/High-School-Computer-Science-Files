import java.awt.*;
import java.applet.*;

public class PacMan extends Applet
{
    public void paint (Graphics nate)
    {
        nate.setColor(Color.YELLOW);
        nate.fillArc(450,250,100,100,30,300);
       
        
        nate.setColor(Color.ORANGE);
        nate.fillArc(600,290,25,25,0,360);
        nate.fillArc(650,290,25,25,0,360);
        nate.fillArc(700,290,25,25,0,360);
    }
}