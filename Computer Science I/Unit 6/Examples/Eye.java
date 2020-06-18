import java.awt.*;
import java.applet.*;
public class Eye
{
    private Color whiteColor1, whiteColor2, whiteColor3, whiteColor4, whiteColor5, whiteColor6, whiteColor7, whiteColor8, whiteColor9, whiteColor10, whiteColor11, whiteColor12;
    public Eye(Graphics g, Color wC1, Color wC2, Color wC3, Color wC4, Color wC5)
    {
        whiteColor1 = wC1;
        whiteColor2 = wC2;
        whiteColor3 = wC3;
        whiteColor4 = wC4;
        whiteColor5 = wC5;
        whiteColor6 = new Color(162,155,134);
        whiteColor7 = new Color(0,0,0);
        whiteColor8 = new Color(54,34,14);
        whiteColor9 = new Color(57,57,61);
        whiteColor10 = new Color(29,54,42);
        whiteColor11 = new Color(91,101,51);
        whiteColor12 = new Color(139,123,78);
        drawEye(g);
    }
    public void drawEye(Graphics g)
    {
        g.setColor(whiteColor1);
        g.fillRect(930/2,310/2,60/2,10/2);
        g.fillRect(940/2,320/2,50/2,10/2);
        g.fillRect(960/2,300/2,40/2,10/2);
        g.fillRect(1010/2,310/2,10/2,10/2);
        g.setColor(whiteColor2);
        g.fillRect(1040/2,340/2,10/2,10/2);
        g.fillRect(1030/2,330/2,10/2,30/2);
        g.fillRect(1020/2,320/2,10/2,50/2);
        g.fillRect(1010/2,320/2,10/2,60/2);
        g.fillRect(1000/2,310/2,10/2,20/2);
        g.fillRect(1000/2,340/2,10/2,50/2);
        g.fillRect(990/2,350/2,10/2,40/2);
        g.fillRect(970/2,340/2,20/2,60/2);
        g.fillRect(950/2,350/2,20/2,60/2);
        g.fillRect(940/2,360/2,10/2,50/2);
        g.fillRect(940/2,330/2,10/2,10/2);
        g.fillRect(930/2,340/2,10/2,60/2);
        g.fillRect(920/2,380/2,10/2,10/2);
        g.fillRect(910/2,360/2,10/2,30/2);
        g.fillRect(900/2,370/2,10/2,10/2);
        g.setColor(whiteColor3);
        g.fillRect(910/2,390/2,20/2,10/2);
        g.fillRect(930/2,400/2,10/2,10/2);
        g.fillRect(940/2,410/2,30/2,10/2);
        g.fillRect(970/2,400/2,10/2,20/2);
        g.fillRect(980/2,400/2,10/2,30/2);
        g.fillRect(990/2,390/2,20/2,30/2);
        g.fillRect(1010/2,380/2,10/2,40/2);
        g.fillRect(1020/2,370/2,10/2,40/2);
        g.fillRect(1030/2,360/2,10/2,40/2);
        g.fillRect(1040/2,350/2,10/2,40/2);
        g.fillRect(1050/2,370/2,10/2,10/2);
        g.setColor(whiteColor4);
        g.fillRect(970/2,420/2,10/2,10/2);
        g.fillRect(990/2,420/2,20/2,10/2);
        g.fillRect(1020/2,410/2,10/2,10/2);
        g.fillRect(1030/2,400/2,10/2,10/2);
        g.fillRect(1040/2,390/2,10/2,10/2);
        g.setColor(whiteColor5);
        g.fillRect(1040/2,400/2,10/2,10/2);
        g.setColor(whiteColor6);
        g.fillRect(900/2,350/2,10/2,20/2);
        g.fillRect(940/2,340/2,10/2,20/2);
        g.fillRect(950/2,330/2,20/2,20/2);
        g.fillRect(950/2,330/2,60/2,10/2);
        g.fillRect(990/2,310/2,10/2,40/2);
        g.setColor(whiteColor7);
        g.fillRect(920/2,350/2,10/2,20/2);
        g.fillRect(920/2,320/2,10/2,20/2);
        g.fillRect(910/2,340/2,10/2,10/2);
        g.setColor(whiteColor8);
        g.fillRect(920/2,370/2,10/2,10/2);
        g.fillRect(920/2,340/2,10/2,10/2);
        g.fillRect(910/2,330/2,10/2,10/2);
        g.fillRect(930/2,320/2,10/2,10/2);
        g.setColor(whiteColor9);
        g.fillRect(910/2,350/2,10/2,10/2);
        g.setColor(whiteColor10);
        g.fillRect(930/2,330/2,10/2,10/2);
        g.setColor(whiteColor11);
        g.fillRect(910/2,320/2,10/2,10/2);
        g.fillRect(920/2,400/2,10/2,10/2);
        g.fillRect(960/2,420/2,10/2,10/2);
        g.fillRect(1010/2,420/2,10/2,10/2);
        g.fillRect(1030/2,410/2,10/2,10/2);
        g.fillRect(1050/2,380/2,20/2,10/2);
        g.fillRect(1050/2,380/2,10/2,20/2);
        g.setColor(whiteColor12);
        g.fillRect(890/2,320/2,20/2,10/2);
        g.fillRect(900/2,340/2,10/2,10/2);
    }
}