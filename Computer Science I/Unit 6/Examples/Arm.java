import java.awt.*;
import java.applet.*;
public class Arm
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public Arm(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
    {
        greenColor1 = gC1;
        greenColor2 = gC2;
        greenColor3 = gC3;
        greenColor4 = gC4;
        greenColor5 = gC5;
        greenColor6 = gC6;
        greenColor7 = gC7;
        drawArm(g);
    }
    public void drawArm(Graphics g)
    {
        g.setColor(greenColor2);
        g.fillRect(410/2,730/2,10/2,40/2);
        g.fillRect(390/2,740/2,20/2,70/2);
        g.fillRect(380/2,770/2,20/2,60/2);
        g.fillRect(370/2,780/2,20/2,90/2);
        g.fillRect(360/2,800/2,30/2,70/2);
        g.fillRect(350/2,850/2,40/2,20/2);
        g.fillRect(350/2,850/2,30/2,50/2);
        g.fillRect(340/2,880/2,10/2,10/2);
        g.fillRect(340/2,910/2,10/2,20/2);
        g.fillRect(350/2,850/2,20/2,90/2);
        g.fillRect(350/2,930/2,10/2,40/2);
        g.fillRect(360/2,950/2,10/2,10/2);
        g.fillRect(360/2,980/2,10/2,10/2);
        g.fillRect(430/2,940/2,10/2,10/2);
        g.fillRect(450/2,960/2,10/2,10/2);
        g.fillRect(470/2,970/2,20/2,10/2);
        g.fillRect(450/2,960/2,10/2,10/2);
        g.fillRect(470/2,970/2,20/2,10/2);
        g.fillRect(530/2,980/2,10/2,10/2);
        //
        g.setColor(greenColor7);
        g.fillRect(360/2,720/2,30/2,10/2);
        g.fillRect(360/2,720/2,20/2,60/2);
        g.fillRect(350/2,770/2,20/2,60/2);
        g.fillRect(350/2,800/2,10/2,50/2);
        g.fillRect(340/2,830/2,10/2,50/2);
        g.fillRect(340/2,940/2,10/2,20/2);
        g.fillRect(350/2,970/2,10/2,20/2);
        //
        g.setColor(greenColor4);
        g.fillRect(430/2,730/2,10/2,20/2);
        g.fillRect(420/2,740/2,10/2,50/2);
        g.fillRect(410/2,770/2,10/2,60/2);
        g.fillRect(400/2,820/2,10/2,30/2);
        g.fillRect(390/2,950/2,40/2,20/2);
        g.fillRect(390/2,980/2,20/2,10/2);
        g.fillRect(420/2,1000/2,10/2,20/2);
        g.fillRect(410/2,1020/2,10/2,10/2);
        g.fillRect(430/2,1020/2,10/2,10/2);
        g.fillRect(390/2,970/2,30/2,10/2);
        //
        g.setColor(greenColor3);
        g.fillRect(430/2,750/2,10/2,10/2);
        g.fillRect(420/2,790/2,10/2,30/2);
        g.fillRect(400/2,810/2,10/2,10/2);
        g.fillRect(390/2,830/2,10/2,20/2);
        g.fillRect(410/2,830/2,10/2,20/2);
        g.fillRect(390/2,840/2,30/2,20/2);
        g.fillRect(380/2,870/2,40/2,40/2);
        g.fillRect(370/2,910/2,50/2,30/2);
        g.fillRect(370/2,910/2,10/2,10/2);
        g.fillRect(360/2,940/2,70/2,10/2);
        g.fillRect(370/2,950/2,20/2,40/2);
        g.fillRect(360/2,960/2,10/2,20/2);
        g.fillRect(410/2,980/2,110/2,10/2);
        g.fillRect(420/2,990/2,10/2,10/2);
        g.fillRect(420/2,970/2,50/2,10/2);
        g.fillRect(430/2,960/2,20/2,10/2);
        g.fillRect(430/2,950/2,10/2,10/2);
        g.fillRect(420/2,1020/2,10/2,20/2);
        g.fillRect(430/2,1030/2,10/2,20/2);
        g.fillRect(390/2,860/2,30/2,10/2);
        g.fillRect(370/2,910/2,20/2,20/2);
        g.fillRect(370/2,900/2,10/2,10/2);
        // Mix-Up fixes
        Color armColor1 = new Color(109,90,75);
        g.setColor(armColor1);
        g.fillRect(380/2,730/2,30/2,10/2);
        
        Color armColor2 = new Color(148,114,93);
        g.setColor(armColor2);
        g.fillRect(390/2,720/2,20/2,10/2);
        g.fillRect(380/2,730/2,10/2,40/2);
        
        Color armColor3 = new Color(157,136,104);
        g.setColor(armColor3);
        g.fillRect(360/2,710/2,30/2,10/2);
        g.fillRect(370/2,700/2,10/2,10/2);
        g.fillRect(380/2,690/2,10/2,10/2);
        
        g.setColor(greenColor1);
        g.fillRect(340/2,890/2,10/2,20/2);
        g.fillRect(340/2,930/2,10/2,10/2);
        g.fillRect(440/2,950/2,10/2,10/2);
        g.fillRect(460/2,960/2,20/2,10/2);
        g.fillRect(490/2,970/2,30/2,10/2);
        g.fillRect(520/2,980/2,10/2,10/2);
        g.fillRect(540/2,980/2,20/2,10/2);
    }
}