import java.awt.*;
import java.applet.*;

public class SmileyFace extends Applet
{
    public void paint (Graphics g)
    { 
        //Base
        g.setColor(Color.YELLOW);
        g.fillOval(200,200,300,300);
        
        //Eye(s) Base
        g.setColor(Color.WHITE);
        g.fillOval(250,250,75,75);
        g.fillOval(375,250,75,75);
        
        //Eye Pupil
        g.setColor(Color.BLACK);
        g.fillOval(270,280,25,25);
        g.fillOval(395,280,25,25);
        
        //Tounge Base
        g.setColor(Color.RED);
        g.fillArc(325,400,50,100,0,-180);
        
        //Tounge Detail
        g.setColor(Color.BLACK);
        g.fillArc(345,425,10,50,0,-180);
        
        //Smile Base
        g.setColor(Color.BLACK);
        g.drawArc(275,350,150,100,0,-180);
        
        //Hat Base
        g.setColor(Color.BLACK);
        g.fillRect(250,175,200,50);
        g.fillRect(300,50,100,150);
        
        //Hat Stripe
        g.setColor(Color.RED);
        g.fillRect(300,150,100,25);
        
        //Have a nice day!
        Font myFont = new Font("papyrus", Font.BOLD, 22);
        g.setColor(Color.BLACK);
        g.setFont(myFont);
        g.drawString("Have a nice day!",275,550);
    }
}