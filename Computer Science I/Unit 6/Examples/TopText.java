import java.awt.*;
import java.applet.*;
public class TopText
{
    private Color textColor1, textColor2, textColor3, textColor4, textColor5, textColor6;
    public TopText(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6)
    {
        textColor1 = tC1;
        textColor2 = tC2;
        textColor3 = tC3;
        textColor4 = tC4;
        textColor5 = tC5;
        textColor6 = tC6;
        drawTopText(g);
    }
    public void drawTopText(Graphics g)
    {
       // Back Ground Black Color
       g.setColor(textColor4);
       g.fillRect(310/2,20/2,70/2,40/2);
       g.fillRect(320/2,40/2,50/2,100/2);
       g.fillRect(370/2,20/2,40/2,120/2);
       g.fillRect(400/2,20/2,50/2,120/2);
       g.fillRect(390/2,60/2,30/2,40/2);
       g.fillRect(440/2,40/2,50/2,120/2);
       g.fillRect(560/2,40/2,60/2,40/2);
       g.fillRect(590/2,30/2,40/2,40/2);
       g.fillRect(560/2,20/2,40/2,70/2);
       g.fillRect(570/2,60/2,50/2,40/2);
       g.fillRect(590/2,70/2,40/2,70/2);
       g.fillRect(570/2,110/2,60/2,30/2);
       g.fillRect(560/2,90/2,40/2,40/2);
       g.fillRect(620/2,20/2,50/2,120/2);
       g.fillRect(660/2,20/2,40/2,120/2);
       g.fillRect(650/2,60/2,30/2,40/2);
       g.fillRect(480/2,20/2,60/2,30/2);
       g.fillRect(470/2,30/2,80/2,30/2);
       g.fillRect(500/2,40/2,50/2,30/2);
       g.fillRect(470/2,40/2,40/2,40/2);
       g.fillRect(480/2,50/2,40/2,40/2);
       g.fillRect(490/2,60/2,40/2,40/2);
       g.fillRect(500/2,70/2,40/2,40/2);
       g.fillRect(510/2,80/2,40/2,50/2);
       g.fillRect(480/2,100/2,60/2,40/2);
       g.fillRect(470/2,90/2,40/2,40/2);
       //
       g.fillRect(700/2,20/2,60/2,30/2);
       g.fillRect(730/2,30/2,40/2,70/2);
       g.fillRect(700/2,100/2,60/2,40/2);
       g.fillRect(690/2,40/2,50/2,90/2);
       //
       g.fillRect(760/2,20/2,40/2,110/2);
       g.fillRect(770/2,100/2,60/2,40/2);
       g.fillRect(790/2,20/2,50/2,110/2);
       g.fillRect(830/2,20/2,50/2,30/2);
       g.fillRect(830/2,20/2,50/2,120/2);
       g.fillRect(830/2,100/2,60/2,40/2);
       g.fillRect(880/2,20/2,70/2,40/2);
       g.fillRect(880/2,20/2,40/2,120/2);
       g.fillRect(880/2,100/2,70/2,40/2);
       g.fillRect(910/2,40/2,50/2,90/2);
       //
       g.fillRect(310/2,150/2,70/2,30/2);
       g.fillRect(310/2,150/2,40/2,120/2);
       g.fillRect(340/2,150/2,40/2,60/2);
       g.fillRect(310/2,190/2,60/2,30/2);
       g.fillRect(340/2,200/2,40/2,70/2);
       //
       g.fillRect(380/2,150/2,60/2,40/2);
       g.fillRect(380/2,150/2,40/2,120/2);
       g.fillRect(380/2,190/2,60/2,30/2);
       g.fillRect(380/2,230/2,60/2,40/2);
       //
       g.fillRect(430/2,150/2,40/2,110/2);
       g.fillRect(440/2,230/2,50/2,40/2);
       g.fillRect(460/2,210/2,30/2,50/2);
       g.fillRect(430/2,150/2,70/2,30/2);
       g.fillRect(460/2,150/2,40/2,60/2);
       //
       g.fillRect(500/2,150/2,60/2,40/2);
       g.fillRect(500/2,150/2,40/2,120/2);
       g.fillRect(500/2,190/2,60/2,30/2);
       g.fillRect(530/2,200/2,30/2,30/2);
       g.fillRect(500/2,230/2,60/2,40/2);
       //
       g.fillRect(550/2,150/2,40/2,120/2);
       //
       g.fillRect(580/2,150/2,40/2,70/2);
       g.fillRect(600/2,190/2,40/2,60/2);
       g.fillRect(590/2,180/2,60/2,90/2);
       g.fillRect(620/2,150/2,40/2,80/2);
       g.fillRect(600/2,170/2,30/2,30/2);
       //
       g.fillRect(650/2,150/2,60/2,40/2);
       g.fillRect(650/2,150/2,40/2,120/2);
       g.fillRect(650/2,190/2,60/2,40/2);
       g.fillRect(650/2,230/2,60/2,40/2);
       //
       g.fillRect(730/2,150/2,60/2,60/2);
       g.fillRect(720/2,190/2,40/2,80/2);
       g.fillRect(750/2,190/2,40/2,60/2);
       g.fillRect(720/2,210/2,80/2,40/2);
       g.fillRect(760/2,210/2,40/2,60/2);
       //
       g.fillRect(830/2,150/2,30/2,30/2);
       g.fillRect(800/2,160/2,60/2,40/2);
       g.fillRect(820/2,160/2,40/2,110/2);
       //
       g.fillRect(870/2,150/2,40/2,120/2);
       g.fillRect(850/2,160/2,60/2,40/2);
       //
       g.fillRect(910/2,150/2,60/2,30/2);
       g.fillRect(920/2,160/2,50/2,90/2);
       g.fillRect(940/2,160/2,40/2,100/2);
       g.fillRect(910/2,230/2,60/2,40/2);
       // Other Fixes 
       g.fillRect(480/2,20/2,50/2,10/2);
       g.fillRect(430/2,20/2,50/2,10/2);
       g.fillRect(560/2,20/2,60/2,10/2);
       g.fillRect(410/2,220/2,20/2,20/2);
       g.fillRect(490/2,190/2,10/2,70/2);
       
       //Main Text 
       g.setColor(textColor1);
       g.fillRect(320/2,30/2,50/2,20/2);
       g.fillRect(330/2,50/2,30/2,80/2);
       g.fillRect(380/2,30/2,20/2,100/2);
       g.fillRect(410/2,30/2,30/2,100/2);
       g.fillRect(400/2,70/2,10/2,20/2);
       g.fillRect(450/2,30/2,20/2,100/2);
       g.fillRect(570/2,30/2,40/2,20/2);
       g.fillRect(600/2,40/2,20/2,20/2);
       g.fillRect(570/2,30/2,20/2,50/2);
       g.fillRect(580/2,70/2,30/2,20/2);
       g.fillRect(600/2,80/2,20/2,50/2);
       g.fillRect(580/2,120/2,40/2,10/2);
       g.fillRect(570/2,100/2,20/2,20/2);
       g.fillRect(630/2,30/2,30/2,100/2);
       g.fillRect(670/2,30/2,20/2,100/2);
       g.fillRect(660/2,70/2,10/2,20/2);
       g.fillRect(490/2,30/2,40/2,10/2);
       g.fillRect(480/2,40/2,60/2,10/2);
       g.fillRect(510/2,50/2,30/2,10/2);
       g.fillRect(480/2,50/2,20/2,20/2);
       g.fillRect(490/2,60/2,20/2,20/2);
       g.fillRect(500/2,70/2,20/2,20/2);
       g.fillRect(510/2,80/2,20/2,20/2);
       g.fillRect(520/2,90/2,20/2,30/2);
       g.fillRect(490/2,110/2,40/2,20/2);
       g.fillRect(480/2,100/2,20/2,20/2);
       //
       g.fillRect(710/2,30/2,40/2,20/2);
       g.fillRect(740/2,40/2,20/2,80/2);
       g.fillRect(710/2,110/2,40/2,20/2);
       g.fillRect(700/2,50/2,30/2,70/2);
       //
       g.fillRect(770/2,30/2,20/2,90/2);
       g.fillRect(780/2,110/2,40/2,20/2);
       g.fillRect(800/2,30/2,30/2,90/2);
       g.fillRect(840/2,30/2,30/2,10/2);
       g.fillRect(840/2,30/2,30/2,100/2);
       g.fillRect(840/2,110/2,40/2,20/2);
       g.fillRect(890/2,30/2,50/2,20/2);
       g.fillRect(890/2,30/2,20/2,100/2);
       g.fillRect(890/2,110/2,50/2,20/2);
       g.fillRect(920/2,50/2,30/2,70/2);
       ////
       g.fillRect(320/2,160/2,50/2,10/2);
       g.fillRect(320/2,160/2,20/2,100/2);
       g.fillRect(350/2,160/2,20/2,40/2);
       g.fillRect(320/2,200/2,40/2,10/2);
       g.fillRect(350/2,210/2,20/2,50/2);
       //
       g.fillRect(390/2,160/2,40/2,20/2);
       g.fillRect(390/2,160/2,20/2,100/2);
       g.fillRect(390/2,200/2,40/2,10/2);
       g.fillRect(390/2,240/2,40/2,20/2);
       //
       g.fillRect(440/2,160/2,20/2,90/2);
       g.fillRect(450/2,240/2,30/2,20/2);
       g.fillRect(470/2,220/2,20/2,30/2);
       g.fillRect(440/2,160/2,50/2,10/2);
       g.fillRect(470/2,160/2,20/2,40/2);
       //
       g.fillRect(510/2,160/2,40/2,20/2);
       g.fillRect(510/2,160/2,20/2,100/2);
       g.fillRect(510/2,200/2,40/2,10/2);
       g.fillRect(540/2,210/2,10/2,10/2);
       g.fillRect(510/2,240/2,40/2,20/2);
       //
       g.fillRect(560/2,160/2,20/2,100/2);
       //
       g.fillRect(590/2,160/2,20/2,50/2);
       g.fillRect(610/2,200/2,20/2,40/2);
       g.fillRect(600/2,190/2,40/2,70/2);
       g.fillRect(630/2,160/2,20/2,60/2);
       g.fillRect(610/2,180/2,10/2,10/2);
       //
       g.fillRect(660/2,160/2,40/2,20/2);
       g.fillRect(660/2,160/2,20/2,100/2);
       g.fillRect(660/2,200/2,40/2,20/2);
       g.fillRect(660/2,240/2,40/2,20/2);
       //
       g.fillRect(740/2,160/2,40/2,40/2);
       g.fillRect(730/2,200/2,20/2,60/2);
       g.fillRect(760/2,200/2,20/2,40/2);
       g.fillRect(730/2,220/2,60/2,20/2);
       g.fillRect(770/2,220/2,20/2,40/2);
       //
       g.fillRect(840/2,160/2,10/2,10/2);
       g.fillRect(810/2,170/2,40/2,20/2);
       g.fillRect(830/2,170/2,20/2,90/2);
       //
       g.fillRect(880/2,160/2,20/2,100/2);
       g.fillRect(860/2,170/2,40/2,20/2);
       //
       g.fillRect(920/2,160/2,40/2,10/2);
       g.fillRect(910/2,170/2,30/2,70/2);
       g.fillRect(950/2,170/2,20/2,80/2);
       g.fillRect(920/2,240/2,40/2,20/2);
       // Other Fixes
       g.fillRect(530/2,210/2,10/2,10/2);
       g.fillRect(410/2,210/2,20/2,10/2);
       Color textColor7 = new Color(0, 91, 161);
       g.setColor(textColor7);
       g.fillRect(430/2,140/2,90/2,10/2);
    }
}