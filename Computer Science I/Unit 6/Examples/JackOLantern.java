import java.awt.*;
import java.applet.*;
public class JackOLantern extends Pumpkin
{
    public JackOLantern(Graphics g, Color c)
    {
        super(g,c);
        caption(g);
        Face face = new Face(g);
    }
    //Helper Methods
    /**
     * Caption
     */
    private void caption(Graphics g)
    {
        Font myFont = new Font("ravie", Font.BOLD, 48);
        g.setColor(Color.black);
        g.setFont(myFont);
        g.drawString("Boo!",600,100);
    }
}