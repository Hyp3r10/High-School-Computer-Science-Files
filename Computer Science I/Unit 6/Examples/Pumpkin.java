import java.awt.*;
import java.applet.*;
public class Pumpkin extends Applet
{
    public Pumpkin(Graphics g, Color c)
    {
        g.setColor(c);
        g.fillOval(100,100,600,450);
        g.setColor(new Color(23,122,39));
        g.fillRect(390,30,20,80);
    }
}