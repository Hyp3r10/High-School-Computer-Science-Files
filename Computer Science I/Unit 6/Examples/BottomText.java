import java.awt.*;
import java.applet.*;
public class BottomText
{
    private Color textColor1, textColor2, textColor3, textColor4, textColor5, textColor6;
    public BottomText(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6)
    {
        textColor1 = tC1;
        textColor2 = tC2;
        textColor3 = tC3;
        textColor4 = tC4;
        textColor5 = tC5;
        textColor6 = tC6;
        drawBottomText(g);
    }
    public void drawBottomText(Graphics g)
    {
        g.setColor(textColor4);
        g.fillRect(220/2,990/2,70/2,0/2);
        g.fillRect(250/2,990/2,40/2,60/2);
        g.fillRect(220/2,1030/2,60/2,30/2);
        g.fillRect(220/2,990/2,40/2,120/2);
        g.fillRect(250/2,1040/2,40/2,60/2);
        g.fillRect(220/2,1070/2,60/2,40/2);
        //
        g.fillRect(290/2,990/2,40/2,110/2);
        g.fillRect(300/2,1070/2,50/2,40/2);
        g.fillRect(320/2,990/2,40/2,110/2);
        //
        g.fillRect(350/2,990/2,70/2,40/2);
        g.fillRect(360/2,990/2,50/2,120/2);
        //
        g.fillRect(430/2,990/2,70/2,40/2);
        g.fillRect(440/2,990/2,50/2,120/2);
        g.fillRect(490/2,990/2,40/2,120/2);
        g.fillRect(520/2,990/2,50/2,120/2);
        g.fillRect(510/2,1020/2,30/2,50/2);
        //
        g.fillRect(560/2,1010/2,40/2,100/2);
        g.fillRect(580/2,1050/2,30/2,40/2);
        g.fillRect(590/2,1000/2,40/2,110/2);
        g.fillRect(570/2,990/2,50/2,40/2);
        g.fillRect(610/2,1070/2,30/2,40/2);
        //
        g.fillRect(610/2,990/2,80/2,40/2);
        g.fillRect(630/2,990/2,40/2,120/2);
        //
        g.fillRect(670/2,990/2,40/2,40/2);
        g.fillRect(680/2,1010/2,30/2,30/2);
        //
        g.fillRect(730/2,990/2,40/2,50/2);
        g.fillRect(700/2,990/2,60/2,30/2);
        g.fillRect(700/2,990/2,40/2,70/2);
        g.fillRect(720/2,1020/2,30/2,50/2);
        g.fillRect(730/2,1030/2,30/2,80/2);
        g.fillRect(740/2,1040/2,30/2,60/2);
        g.fillRect(710/2,1070/2,50/2,40/2);
        g.fillRect(700/2,1050/2,30/2,50/2);
        //
        g.fillRect(780/2,990/2,40/2,120/2);
        g.fillRect(800/2,990/2,30/2,80/2);
        g.fillRect(810/2,1030/2,30/2,70/2);
        g.fillRect(820/2,990/2,40/2,120/2);
        //
        g.fillRect(860/2,990/2,60/2,30/2);
        g.fillRect(890/2,1000/2,40/2,100/2);
        g.fillRect(850/2,1000/2,50/2,100/2);
        g.fillRect(870/2,1080/2,50/2,30/2);
        g.fillRect(860/2,1070/2,70/2,30/2);
        //
        g.fillRect(920/2,990/2,40/2,120/2);
        g.fillRect(940/2,1000/2,30/2,70/2);
        g.fillRect(950/2,1030/2,30/2,70/2);
        g.fillRect(960/2,990/2,40/2,120/2);
        //
        g.fillRect(990/2,990/2,40/2,120/2);
        g.fillRect(990/2,990/2,60/2,40/2);
        g.fillRect(990/2,1030/2,60/2,40/2);
        g.fillRect(990/2,1070/2,60/2,40/2);
        // 
        g.fillRect(250/2,1120/2,60/2,30/2);
        g.fillRect(270/2,1130/2,50/2,90/2);
        g.fillRect(240/2,1200/2,70/2,30/2);
        g.fillRect(260/2,1210/2,40/2,30/2);
        g.fillRect(240/2,1130/2,40/2,100/2);
        // F
        g.fillRect(310/2,1120/2,60/2,40/2);
        g.fillRect(310/2,1120/2,40/2,110/2);
        g.fillRect(310/2,1160/2,60/2,30/2);
        // M
        g.fillRect(380/2,1120/2,40/2,110/2);
        g.fillRect(400/2,1120/2,30/2,60/2);
        g.fillRect(410/2,1130/2,40/2,100/2);
        g.fillRect(440/2,1120/2,40/2,110/2);
        g.fillRect(430/2,1120/2,30/2,60/2);
        // Y
        g.fillRect(470/2,1120/2,40/2,50/2);
        g.fillRect(500/2,1120/2,40/2,50/2);
        g.fillRect(480/2,1150/2,50/2,80/2);
        // B
        g.fillRect(550/2,1120/2,40/2,110/2);
        g.fillRect(550/2,1120/2,70/2,30/2);
        g.fillRect(550/2,1150/2,70/2,40/2);
        g.fillRect(550/2,1200/2,80/2,30/2);
        g.fillRect(580/2,1190/2,50/2,30/2);
        g.fillRect(590/2,1180/2,40/2,30/2);
        g.fillRect(580/2,1170/2,50/2,30/2);
        g.fillRect(590/2,1130/2,40/2,40/2);
        g.fillRect(580/2,1120/2,40/2,40/2);
        // U
        g.fillRect(620/2,1120/2,40/2,110/2);
        g.fillRect(640/2,1200/2,40/2,40/2);
        g.fillRect(620/2,1200/2,70/2,30/2);
        g.fillRect(650/2,1120/2,50/2,110/2);
        // S
        g.fillRect(720/2,1120/2,40/2,50/2);
        g.fillRect(690/2,1120/2,70/2,30/2);
        g.fillRect(690/2,1120/2,40/2,60/2);
        g.fillRect(700/2,1150/2,40/2,40/2);
        g.fillRect(710/2,1160/2,40/2,40/2);
        g.fillRect(720/2,1160/2,40/2,70/2);
        g.fillRect(710/2,1200/2,40/2,40/2);
        g.fillRect(690/2,1180/2,40/2,50/2);
        // I
        g.fillRect(750/2,1120/2,50/2,110/2);
        // N
        g.fillRect(790/2,1120/2,40/2,110/2);
        g.fillRect(810/2,1140/2,30/2,70/2);
        g.fillRect(820/2,1120/2,40/2,110/2);
        // E
        g.fillRect(860/2,1120/2,40/2,110/2);
        g.fillRect(860/2,1120/2,60/2,30/2);
        g.fillRect(890/2,1130/2,30/2,30/2);
        g.fillRect(860/2,1160/2,60/2,30/2);
        g.fillRect(860/2,1200/2,60/2,30/2);
        // S
        g.fillRect(910/2,1120/2,70/2,30/2);
        g.fillRect(910/2,1120/2,40/2,60/2);
        g.fillRect(940/2,1120/2,40/2,50/2);
        g.fillRect(920/2,1150/2,40/2,40/2);
        g.fillRect(930/2,1160/2,50/2,40/2);
        g.fillRect(940/2,1160/2,40/2,70/2);
        g.fillRect(930/2,1200/2,40/2,40/2);
        g.fillRect(910/2,1180/2,40/2,50/2);
        // S
        g.fillRect(970/2,1120/2,70/2,30/2);
        g.fillRect(1000/2,1120/2,40/2,40/2);
        g.fillRect(1000/2,1120/2,40/2,40/2);
        g.fillRect(970/2,1120/2,40/2,60/2);
        g.fillRect(980/2,1150/2,50/2,40/2);
        g.fillRect(1000/2,1170/2,40/2,40/2);
        g.fillRect(1010/2,1180/2,40/2,60/2);
        g.fillRect(990/2,1200/2,40/2,40/2);
        g.fillRect(980/2,1200/2,30/2,30/2);
        g.fillRect(970/2,1180/2,20/2,40/2);
        
        
        
        // Main Text
        g.setColor(textColor1);
        g.fillRect(230/2,1000/2,50/2,10/2);
        g.fillRect(260/2,1000/2,20/2,40/2);
        g.fillRect(230/2,1040/2,40/2,10/2);
        g.fillRect(230/2,1000/2,20/2,100/2);
        g.fillRect(260/2,1050/2,20/2,40/2);
        g.fillRect(230/2,1080/2,40/2,20/2);
        //
        g.fillRect(300/2,1000/2,20/2,90/2);
        g.fillRect(310/2,1080/2,30/2,20/2);
        g.fillRect(330/2,1000/2,20/2,90/2);
        //
        g.fillRect(360/2,1000/2,50/2,20/2);
        g.fillRect(370/2,1000/2,30/2,100/2);
        //
        g.fillRect(440/2,1000/2,50/2,20/2);
        g.fillRect(450/2,1000/2,30/2,100/2);
        g.fillRect(500/2,1000/2,20/2,100/2);
        g.fillRect(530/2,1000/2,30/2,100/2);
        g.fillRect(520/2,1030/2,10/2,30/2);
        //
        g.fillRect(570/2,1020/2,20/2,80/2);
        g.fillRect(590/2,1060/2,10/2,20/2);
        g.fillRect(600/2,1010/2,20/2,90/2);
        g.fillRect(580/2,1000/2,30/2,20/2);
        g.fillRect(620/2,1080/2,10/2,20/2);
        //
        g.fillRect(620/2,1000/2,60/2,20/2);
        g.fillRect(640/2,1000/2,20/2,100/2);
        //
        g.fillRect(680/2,1000/2,20/2,20/2);
        g.fillRect(690/2,1020/2,10/2,10/2);
        //
        g.fillRect(740/2,1000/2,20/2,30/2);
        g.fillRect(710/2,1000/2,40/2,10/2);
        g.fillRect(710/2,1000/2,20/2,50/2);
        g.fillRect(730/2,1030/2,10/2,30/2);
        g.fillRect(740/2,1040/2,10/2,60/2);
        g.fillRect(750/2,1050/2,10/2,40/2);
        g.fillRect(720/2,1080/2,30/2,20/2);
        g.fillRect(710/2,1060/2,20/2,30/2);
        //
        g.fillRect(790/2,1000/2,20/2,100/2);
        g.fillRect(810/2,1000/2,10/2,60/2);
        g.fillRect(820/2,1040/2,10/2,50/2);
        g.fillRect(830/2,1000/2,20/2,100/2);
        //
        g.fillRect(870/2,1000/2,40/2,10/2);
        g.fillRect(900/2,1010/2,20/2,80/2);
        g.fillRect(860/2,1010/2,30/2,80/2);
        g.fillRect(880/2,1090/2,30/2,10/2);
        g.fillRect(870/2,1080/2,50/2,10/2);
        //
        g.fillRect(930/2,1000/2,20/2,100/2);
        g.fillRect(950/2,1010/2,10/2,50/2);
        g.fillRect(960/2,1040/2,10/2,50/2);
        g.fillRect(970/2,1000/2,20/2,100/2);
        //
        g.fillRect(1000/2,1000/2,20/2,100/2);
        g.fillRect(1000/2,1000/2,40/2,20/2);
        g.fillRect(1000/2,1040/2,40/2,20/2);
        g.fillRect(1000/2,1080/2,40/2,20/2);
        // 
        g.fillRect(260/2,1130/2,40/2,10/2);
        g.fillRect(280/2,1140/2,30/2,70/2);
        g.fillRect(250/2,1210/2,50/2,10/2);
        g.fillRect(270/2,1220/2,20/2,10/2);
        g.fillRect(250/2,1140/2,20/2,80/2);
        // F
        g.fillRect(320/2,1130/2,40/2,20/2);
        g.fillRect(320/2,1130/2,20/2,90/2);
        g.fillRect(320/2,1170/2,40/2,10/2);
        // M
        g.fillRect(390/2,1130/2,20/2,90/2);
        g.fillRect(410/2,1130/2,10/2,40/2);
        g.fillRect(420/2,1140/2,20/2,80/2);
        g.fillRect(450/2,1130/2,20/2,90/2);
        g.fillRect(440/2,1130/2,10/2,40/2);
        // Y
        g.fillRect(480/2,1130/2,20/2,30/2);
        g.fillRect(510/2,1130/2,20/2,30/2);
        g.fillRect(490/2,1160/2,30/2,60/2);
        // B
        g.fillRect(560/2,1130/2,20/2,90/2);
        g.fillRect(560/2,1130/2,50/2,10/2);
        g.fillRect(560/2,1160/2,50/2,20/2);
        g.fillRect(560/2,1210/2,60/2,10/2);
        g.fillRect(590/2,1200/2,30/2,10/2);
        g.fillRect(600/2,1190/2,20/2,10/2);
        g.fillRect(590/2,1180/2,30/2,10/2);
        g.fillRect(600/2,1140/2,20/2,20/2);
        g.fillRect(590/2,1130/2,20/2,20/2);
        // U
        g.fillRect(630/2,1130/2,20/2,90/2);
        g.fillRect(650/2,1210/2,20/2,20/2);
        g.fillRect(630/2,1210/2,50/2,10/2);
        g.fillRect(660/2,1130/2,30/2,90/2);
        // S
        g.fillRect(730/2,1130/2,20/2,30/2);
        g.fillRect(700/2,1130/2,50/2,10/2);
        g.fillRect(700/2,1130/2,20/2,40/2);
        g.fillRect(710/2,1160/2,20/2,20/2);
        g.fillRect(720/2,1170/2,20/2,20/2);
        g.fillRect(730/2,1170/2,20/2,50/2);
        g.fillRect(720/2,1210/2,20/2,20/2);
        g.fillRect(700/2,1190/2,20/2,30/2);
        // I
        g.fillRect(760/2,1130/2,30/2,90/2);
        // N
        g.fillRect(800/2,1130/2,20/2,90/2);
        g.fillRect(820/2,1150/2,10/2,50/2);
        g.fillRect(830/2,1130/2,20/2,90/2);
        // E
        g.fillRect(870/2,1130/2,20/2,90/2);
        g.fillRect(870/2,1130/2,40/2,10/2);
        g.fillRect(900/2,1140/2,10/2,10/2);
        g.fillRect(870/2,1170/2,40/2,10/2);
        g.fillRect(870/2,1210/2,40/2,10/2);
        // S
        g.fillRect(920/2,1130/2,50/2,10/2);
        g.fillRect(920/2,1130/2,20/2,40/2);
        g.fillRect(950/2,1130/2,20/2,30/2);
        g.fillRect(930/2,1160/2,20/2,20/2);
        g.fillRect(940/2,1170/2,30/2,20/2);
        g.fillRect(950/2,1170/2,20/2,50/2);
        g.fillRect(940/2,1210/2,20/2,20/2);
        g.fillRect(920/2,1190/2,20/2,30/2);
        // S
        g.fillRect(980/2,1130/2,50/2,10/2);
        g.fillRect(1010/2,1130/2,20/2,20/2);
        g.fillRect(1010/2,1130/2,20/2,20/2);
        g.fillRect(980/2,1130/2,20/2,40/2);
        g.fillRect(990/2,1160/2,30/2,20/2);
        g.fillRect(1010/2,1170/2,20/2,20/2);
        g.fillRect(1020/2,1180/2,20/2,40/2);
        g.fillRect(1000/2,1210/2,20/2,20/2);
        g.fillRect(990/2,1210/2,50/2,10/2);
        g.fillRect(980/2,1190/2,20/2,20/2);
        // Fixes 
        g.fillRect(890/2,1140/2,20/2,10/2);
        g.fillRect(890/2,1160/2,20/2,10/2);
        g.fillRect(890/2,1200/2,20/2,10/2);
        g.setColor(textColor4);
        g.fillRect(260/2,1220/2,50/2,10/2);
        g.fillRect(640/2,1220/2,40/2,10/2);
        g.fillRect(700/2,1220/2,50/2,10/2);
        g.fillRect(920/2,1220/2,50/2,10/2);
        g.fillRect(990/2,1220/2,40/2,10/2);
        g.fillRect(890/2,1190/2,20/2,10/2);
        Color textColor7 = new Color(0,91,161);
        g.setColor(textColor7);
        g.fillRect(260/2,1230/2,50/2,10/2);
        g.fillRect(640/2,1230/2,40/2,10/2);
        g.fillRect(700/2,1230/2,50/2,10/2);
        g.fillRect(920/2,1230/2,50/2,10/2);
        g.fillRect(990/2,1230/2,80/2,10/2);
    }
}