import java.awt.*;
import java.applet.*;
public class NeckRing
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public NeckRing(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
    {
        greenColor1 = gC1;
        greenColor2 = gC2;
        greenColor3 = gC3;
        greenColor4 = gC4;
        greenColor5 = gC5;
        greenColor6 = gC6;
        greenColor7 = gC7;
        drawNeckRing(g);
    }
    public void drawNeckRing(Graphics g)
    {
        g.setColor(greenColor7);
        g.fillRect(870/2,840/2,10/2,20/2);
        g.fillRect(870/2,870/2,10/2,10/2);
        g.fillRect(860/2,880/2,10/2,10/2);
        g.fillRect(860/2,890/2,30/2,10/2);
        g.fillRect(850/2,900/2,40/2,10/2);
        g.fillRect(900/2,900/2,10/2,10/2);
        g.fillRect(840/2,910/2,70/2,10/2);
        g.fillRect(830/2,920/2,100/2,10/2);
        g.fillRect(820/2,930/2,110/2,10/2);
        g.fillRect(810/2,940/2,130/2,10/2);
        g.fillRect(800/2,950/2,20/2,10/2);
        g.fillRect(800/2,960/2,10/2,10/2);
        g.fillRect(780/2,970/2,20/2,10/2);
        g.fillRect(770/2,980/2,20/2,10/2);
        g.fillRect(770/2,990/2,10/2,10/2);
        g.fillRect(830/2,950/2,120/2,20/2);
        g.fillRect(820/2,970/2,60/2,20/2);
        g.fillRect(880/2,970/2,10/2,10/2);
        g.fillRect(910/2,970/2,20/2,20/2);
        g.setColor(greenColor2);
        g.fillRect(880/2,850/2,10/2,30/2);
        g.fillRect(890/2,880/2,10/2,30/2);
        g.fillRect(910/2,900/2,10/2,10/2);
        g.fillRect(910/2,910/2,20/2,10/2);
        g.fillRect(930/2,920/2,50/2,10/2);
        g.fillRect(1030/2,920/2,10/2,10/2);
        g.fillRect(930/2,930/2,230/2,10/2);
        g.fillRect(1180/2,930/2,10/2,10/2);
        g.fillRect(1180/2,910/2,10/2,10/2);
        g.fillRect(940/2,940/2,260/2,10/2);
        g.fillRect(950/2,950/2,260/2,20/2);
        g.fillRect(930/2,970/2,280/2,20/2);
        g.fillRect(1050/2,990/2,10/2,120/2);
        g.fillRect(1060/2,990/2,10/2,160/2);
        g.fillRect(1070/2,990/2,10/2,180/2);
        g.fillRect(1080/2,990/2,10/2,150/2);
        g.fillRect(1090/2,990/2,10/2,120/2);
        g.fillRect(1100/2,990/2,10/2,90/2);
        g.fillRect(1110/2,990/2,10/2,60/2);
        g.fillRect(1120/2,990/2,10/2,30/2);
        g.fillRect(1130/2,990/2,10/2,10/2);
        g.fillRect(1150/2,990/2,10/2,20/2);
        g.fillRect(1160/2,990/2,10/2,30/2);
        g.fillRect(1170/2,990/2,10/2,50/2);
        g.fillRect(1180/2,990/2,10/2,70/2);
        g.fillRect(1190/2,990/2,10/2,100/2);
        g.fillRect(1200/2,990/2,10/2,120/2);
        g.fillRect(1210/2,950/2,10/2,170/2);
        g.fillRect(1220/2,970/2,10/2,160/2);
        g.fillRect(1230/2,980/2,10/2,20/2);
        g.fillRect(1240/2,990/2,10/2,20/2);
        g.fillRect(1250/2,1000/2,10/2,30/2);
        g.fillRect(1230/2,1020/2,10/2,120/2);
        g.fillRect(1240/2,1050/2,10/2,70/2);
        g.fillRect(1240/2,1130/2,10/2,30/2);
        g.fillRect(1250/2,1140/2,10/2,30/2);
        g.fillRect(770/2,1000/2,10/2,10/2);
        g.fillRect(790/2,980/2,10/2,10/2);
        g.fillRect(800/2,970/2,10/2,10/2);
        g.fillRect(810/2,980/2,10/2,10/2);
        g.fillRect(810/2,960/2,20/2,10/2);
        g.fillRect(820/2,950/2,10/2,10/2);
        g.fillRect(850/2,990/2,20/2,10/2);
        g.fillRect(880/2,980/2,10/2,10/2);
        g.fillRect(890/2,970/2,10/2,10/2);
        g.fillRect(920/2,990/2,10/2,10/2);
        //fix the green heart dot that color 2 goes over
        g.setColor(greenColor4);
        g.fillRect(910/2,880/2,10/2,10/2);
        g.fillRect(910/2,890/2,50/2,10/2);
        g.fillRect(920/2,900/2,20/2,10/2);
        g.fillRect(960/2,900/2,30/2,10/2);
        g.fillRect(930/2,910/2,20/2,10/2);
        g.fillRect(960/2,910/2,10/2,10/2);
        g.fillRect(980/2,910/2,130/2,10/2);
        g.fillRect(990/2,920/2,40/2,10/2);
        g.fillRect(1110/2,920/2,70/2,10/2);
        g.fillRect(1130/2,910/2,50/2,10/2);
    }
}