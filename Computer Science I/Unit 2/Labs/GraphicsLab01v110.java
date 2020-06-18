import java.awt.*;
import java.applet.*;

public class GraphicsLab01v110 extends Applet
{
    public void paint (Graphics g)
    { 
        //Cube
            
            //Square 1
                g.drawRect(25,25,300,300);    
            //Square 2
                g.drawRect(125,125,300,300);
            //Connections
                g.drawLine(25,25,125,125);
                g.drawLine(25,325,125,425);
                g.drawLine(325,25,425,125);
                g.drawLine(325,325,425,425);
                
        //Triangle
            
            //Base
                g.drawLine(325,625,925,625);
            //Height
                g.drawLine(625,625,625,325);
            //Lines
                g.drawLine(325,625,625,325);
                g.drawLine(625,325,925,625);
                g.drawLine(475,475,925,625);
                g.drawLine(325,625,775,475);
                
        //Sphere(TopLeft)
            
            //Base
                g.drawOval(550,25,300,300);
            //Longitude
                g.drawOval(675,25,50,300);
                g.drawOval(650,25,100,300);
                g.drawOval(625,25,150,300);
                g.drawOval(600,25,200,300);
                g.drawOval(575,25,250,300);
            //Lattitude
                g.drawOval(550,150,300,50);
                g.drawOval(550,125,300,100);
                g.drawOval(550,100,300,150);
                g.drawOval(550,75,300,200);
                g.drawOval(550,50,300,250);
                
        ///Sphere(Cube)
            
            //Base
                g.drawOval(75,75,300,300);
            //Longitude
                g.drawOval(200,75,50,300);
                g.drawOval(175,75,100,300);
                g.drawOval(150,75,150,300);
                g.drawOval(125,75,200,300);
                g.drawOval(100,75,250,300);
            //Lattitude
                g.drawOval(75,200,300,50);
                g.drawOval(75,175,300,100);
                g.drawOval(75,150,300,150);
                g.drawOval(75,125,300,200);
                g.drawOval(75,100,300,250);

    }
}