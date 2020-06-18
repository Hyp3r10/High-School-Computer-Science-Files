import java.awt.*;
import java.applet.*;
public class MasterMemeRunner extends Applet
{
   public void paint(Graphics g)
    {
        // Create Color Objects
            //Head + Body + Arm
                Color greenColor1 = new Color(108, 158, 41);
                Color greenColor2 = new Color(91, 101, 51);
                Color greenColor3 = new Color(56, 99, 36);
                Color greenColor4 = new Color(56, 69, 38);
                Color greenColor5 = new Color(29, 54, 42);
                Color greenColor6 = new Color(54, 34, 14);
                Color greenColor7 = new Color(139, 123, 78);
            //Eye
                Color whiteColor1 = new Color(153, 155, 157);
                Color whiteColor2 = new Color(149, 141, 121);
                Color whiteColor3 = new Color(129, 120, 104);
                Color whiteColor4 = new Color(109, 90, 75);
                Color whiteColor5 = new Color(98, 82, 76);
            //Drink Color
                Color drinkLiquidColor1 = new Color(170, 82, 55);
                Color drinkLiquidColor2 = new Color(108, 49, 22);
                Color drinkLiquidColor3 = new Color(244, 100, 64);
                Color drinkLiquidColor4 = new Color(239, 129, 37);
                Color drinkLiquidColor5 = new Color(229, 172, 141);
                Color drinkLiquidColor6 = new Color(242, 220, 159);
                Color drinkLiquidColor7 = new Color(172, 133, 131);
            //Text Color
                Color textColor1 = new Color(210, 210, 202);
                Color textColor2 = new Color(29, 54, 42);
                Color textColor3 = new Color(57, 57, 61);
                Color textColor4 = new Color(0, 0, 0);
                Color textColor5 = new Color(54, 34, 14);
                Color textColor6 = new Color(129, 120, 104);
            //Background Color
                Color backColor1 = new Color(129, 120, 104);
                Color backColor2 = new Color(109, 90, 75);
                Color backColor3 = new Color(98, 82, 76);
                Color backColor4 = new Color(149, 141, 121);
                Color backColor5 = new Color(162, 155, 134);
                Color backColor6 = new Color(182, 157, 128);
                Color backColor7 = new Color(157, 136, 104);
                Color backColor8 = new Color(148, 114, 93);
                Color backColor9 = new Color(172, 133, 131);
                Color backColor10 = new Color(229, 171, 141);
                Color backColor11 = new Color(196, 190, 166);
                Color backColor12 = new Color(210, 210, 202);
                Color backColor13 = new Color(190, 184, 172);
                Color backColor14 = new Color(184, 185, 189);
                Color backColor15 = new Color(153, 155, 157);
                Color backColor16 = new Color(139, 123, 78);
                Color backColor17 = new Color(56, 69, 38);
                Color backColor18 = new Color(108, 49, 22);
                Color backColor19 = new Color(57, 57, 61);
                Color backColor20 = new Color(29, 54, 42);
                Color backColor21 = new Color(54, 34, 14);
                Color backColor22 = new Color(56, 69, 38);
        // Start of chain
        MasterGreenFrog frog = new MasterGreenFrog(g, greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7,
                                          whiteColor1, whiteColor2, whiteColor3, whiteColor4, whiteColor5,
                                          drinkLiquidColor1, drinkLiquidColor2, drinkLiquidColor3, drinkLiquidColor4, drinkLiquidColor5, drinkLiquidColor6, drinkLiquidColor7, 
                                          textColor1, textColor2, textColor3, textColor4, textColor5, textColor6, 
                                          backColor1, backColor2, backColor3, backColor4, backColor5, backColor6, backColor7, backColor8, backColor9, backColor10, 
                                          backColor11, backColor12, backColor13, backColor14, backColor15, backColor16, backColor17, 
                                          backColor18, backColor19, backColor20, backColor21, backColor22);
    }
}
class MasterGreenFrog extends MasterKermitTheFrog
{
    public MasterGreenFrog(Graphics g, Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7, 
                                 Color wC1, Color wC2, Color wC3, Color wC4, Color wC5, 
                                 Color dlC1, Color dlC2, Color dlC3, Color dlC4, Color dlC5, Color dlC6, Color dlC7,
                                 Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6,
                                 Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
                                 Color bC11, Color bC12, Color bC13, Color bC14, Color bC15, Color bC16, Color bC17, Color bC18, Color bC19, Color bC20, 
                                 Color bC21, Color bC22)
    {
        //Super Colors
        super(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7, wC1, wC2, wC3, wC4, wC5, 
                 dlC1, dlC2, dlC3, dlC4, dlC5, dlC6, dlC7, tC1, tC2, tC3, tC4, tC5, tC6, 
                 bC1, bC2, bC3, bC4, bC5, bC6, bC7, bC8, bC9, bC10, 
                 bC11, bC12, bC13, bC14, bC15, bC16, bC17, bC18, bC19, bC20, 
                 bC21, bC22);
        MasterArm arm = new MasterArm(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7);
        MasterNeck neck = new MasterNeck(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7);
        MasterBody body = new MasterBody(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7);
    }
}
class MasterArm
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public MasterArm(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
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
class MasterNeck
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public MasterNeck(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
    {
        greenColor1 = gC1;
        greenColor2 = gC2;
        greenColor3 = gC3;
        greenColor4 = gC4;
        greenColor5 = gC5;
        greenColor6 = gC6;
        greenColor7 = gC7;
        drawNeck(g);
    }
    public void drawNeck(Graphics g)
    {
        //
        g.setColor(greenColor4);
        g.fillRect(880/2,540/2,290/2,330/2);
        //Head
        g.setColor(greenColor1);
        g.fillRect(640/2,420/2,100/2,10/2);
        g.fillRect(650/2,430/2,10/2,10/2);
        g.fillRect(680/2,430/2,30/2,10/2);
        g.fillRect(680/2,410/2,50/2,10/2);
        g.fillRect(700/2,400/2,50/2,10/2);
        g.fillRect(720/2,390/2,30/2,20/2);
        g.fillRect(740/2,380/2,20/2,20/2);
        g.fillRect(750/2,370/2,30/2,20/2);
        g.fillRect(780/2,360/2,10/2,20/2);
        g.fillRect(780/2,360/2,40/2,10/2);
        g.fillRect(800/2,350/2,20/2,20/2);
        g.fillRect(810/2,340/2,20/2,20/2);
        g.fillRect(810/2,340/2,50/2,10/2);
        g.fillRect(840/2,330/2,70/2,10/2);
        g.fillRect(870/2,340/2,20/2,10/2);
        //
        g.setColor(greenColor3);
        g.fillRect(640/2,440/2,20/2,10/2);
        g.fillRect(660/2,450/2,30/2,10/2);
        g.fillRect(670/2,470/2,10/2,10/2);
        g.fillRect(670/2,460/2,70/2,10/2);
        g.fillRect(720/2,450/2,30/2,10/2);
        g.fillRect(730/2,440/2,60/2,10/2);
        g.fillRect(740/2,430/2,10/2,10/2);
        g.fillRect(760/2,450/2,30/2,10/2);
        g.fillRect(770/2,460/2,10/2,10/2);
        g.fillRect(770/2,430/2,20/2,10/2);
        g.fillRect(770/2,420/2,10/2,10/2);
        g.fillRect(760/2,410/2,30/2,10/2);
        g.fillRect(780/2,400/2,30/2,10/2);
        g.fillRect(780/2,390/2,60/2,10/2);
        g.fillRect(790/2,380/2,30/2,10/2);
        g.fillRect(830/2,380/2,10/2,10/2);
        g.fillRect(840/2,370/2,10/2,10/2);
        g.fillRect(850/2,350/2,10/2,20/2);
        g.fillRect(850/2,410/2,20/2,10/2);
        g.fillRect(820/2,400/2,10/2,10/2);
        g.fillRect(800/2,410/2,60/2,10/2);
        g.fillRect(800/2,420/2,20/2,10/2);
        g.fillRect(800/2,430/2,10/2,10/2);
        g.fillRect(800/2,440/2,30/2,10/2);
        g.fillRect(800/2,450/2,10/2,10/2);
        g.fillRect(850/2,390/2,20/2,10/2);
        g.fillRect(890/2,390/2,20/2,10/2);
        g.fillRect(900/2,400/2,20/2,10/2);
        g.fillRect(900/2,410/2,40/2,10/2);
        g.fillRect(880/2,410/2,10/2,10/2);
        g.fillRect(860/2,420/2,80/2,10/2);
        g.fillRect(840/2,430/2,120/2,10/2);
        g.fillRect(840/2,440/2,260/2,10/2);
        g.fillRect(830/2,450/2,280/2,10/2);
        g.fillRect(790/2,460/2,110/2,10/2);
        g.fillRect(910/2,460/2,210/2,10/2);
        g.fillRect(700/2,470/2,220/2,10/2);
        g.fillRect(940/2,470/2,190/2,10/2);
        g.fillRect(710/2,480/2,430/2,10/2);
        g.fillRect(740/2,490/2,240/2,10/2);
        g.fillRect(990/2,490/2,160/2,10/2);
        g.fillRect(780/2,500/2,370/2,10/2);
        g.fillRect(1010/2,430/2,90/2,10/2);
        g.fillRect(1030/2,420/2,60/2,10/2);
        g.fillRect(1040/2,410/2,40/2,10/2);
        g.fillRect(1050/2,400/2,30/2,10/2);
        g.fillRect(1060/2,390/2,10/2,10/2);
        g.fillRect(820/2,510/2,340/2,10/2);
        g.fillRect(870/2,520/2,300/2,10/2);
        g.fillRect(940/2,530/2,10/2,10/2);
        g.fillRect(960/2,530/2,30/2,10/2);
        g.fillRect(1000/2,530/2,10/2,10/2);
        g.fillRect(1020/2,530/2,150/2,10/2);
        g.fillRect(1040/2,540/2,110/2,10/2);
        g.fillRect(1040/2,550/2,80/2,10/2);
        g.fillRect(1030/2,560/2,60/2,10/2);
        g.fillRect(1020/2,570/2,50/2,10/2);
        g.fillRect(960/2,580/2,100/2,10/2);
        g.fillRect(930/2,590/2,100/2,10/2);
        g.fillRect(910/2,590/2,10/2,10/2);
        g.fillRect(840/2,590/2,10/2,10/2);
        g.fillRect(710/2,590/2,120/2,10/2);
        g.fillRect(700/2,580/2,80/2,10/2);
        g.fillRect(710/2,570/2,60/2,10/2);
        g.fillRect(780/2,570/2,10/2,10/2);
        g.fillRect(800/2,570/2,10/2,10/2);
        g.fillRect(880/2,570/2,70/2,10/2);
        g.fillRect(700/2,560/2,30/2,10/2);
        g.fillRect(740/2,560/2,20/2,10/2);
        g.fillRect(810/2,560/2,10/2,10/2);
        g.fillRect(830/2,560/2,110/2,10/2);
        g.fillRect(730/2,550/2,60/2,10/2);
        g.fillRect(810/2,550/2,110/2,10/2);
        g.fillRect(710/2,540/2,10/2,10/2);
        g.fillRect(730/2,540/2,140/2,10/2);
        g.fillRect(690/2,530/2,150/2,10/2);
        g.fillRect(680/2,520/2,120/2,10/2);
        g.fillRect(670/2,510/2,100/2,10/2);
        g.fillRect(660/2,500/2,60/2,10/2);
        g.fillRect(670/2,490/2,20/2,10/2);
        g.fillRect(680/2,480/2,10/2,10/2);
        g.fillRect(710/2,600/2,310/2,10/2);
        g.fillRect(720/2,610/2,290/2,10/2);
        g.fillRect(730/2,620/2,260/2,10/2);
        g.fillRect(730/2,630/2,240/2,10/2);
        g.fillRect(740/2,640/2,200/2,10/2);
        g.fillRect(750/2,650/2,170/2,10/2);
        g.fillRect(750/2,660/2,130/2,10/2);
        g.fillRect(770/2,670/2,70/2,10/2);
        g.fillRect(770/2,680/2,80/2,10/2);
        g.fillRect(780/2,690/2,60/2,10/2);
        g.fillRect(790/2,700/2,90/2,10/2);
        g.fillRect(800/2,710/2,120/2,10/2);
        g.fillRect(810/2,720/2,40/2,10/2);
        g.fillRect(860/2,720/2,90/2,10/2);
        g.fillRect(820/2,730/2,40/2,10/2);
        g.fillRect(870/2,730/2,30/2,10/2);
        g.fillRect(910/2,730/2,40/2,10/2);
        g.fillRect(820/2,740/2,160/2,10/2);
        g.fillRect(1000/2,740/2,10/2,10/2);
        g.fillRect(830/2,750/2,10/2,10/2);
        g.fillRect(890/2,750/2,10/2,20/2);
        g.fillRect(910/2,750/2,60/2,10/2);
        g.fillRect(980/2,750/2,30/2,10/2);
        g.fillRect(840/2,760/2,20/2,20/2);
        g.fillRect(890/2,760/2,10/2,10/2);
        g.fillRect(940/2,760/2,50/2,10/2);
        g.fillRect(1010/2,760/2,10/2,10/2);
        g.fillRect(960/2,770/2,20/2,10/2);
        g.fillRect(1000/2,770/2,40/2,10/2);
        g.fillRect(1050/2,770/2,10/2,10/2);
        g.fillRect(850/2,780/2,10/2,10/2);
        g.fillRect(940/2,780/2,20/2,10/2);
        g.fillRect(1010/2,780/2,60/2,10/2);
        g.fillRect(860/2,790/2,10/2,10/2);
        g.fillRect(980/2,790/2,10/2,20/2);
        g.fillRect(1010/2,790/2,20/2,10/2);
        g.fillRect(1040/2,790/2,40/2,10/2);
        g.fillRect(860/2,800/2,30/2,10/2);
        g.fillRect(1030/2,800/2,60/2,10/2);
        g.fillRect(870/2,810/2,20/2,20/2);
        g.fillRect(1020/2,810/2,20/2,10/2);
        g.fillRect(1050/2,810/2,50/2,20/2);
        g.fillRect(880/2,830/2,20/2,10/2);
        g.fillRect(1050/2,830/2,70/2,10/2);
        g.fillRect(880/2,840/2,30/2,10/2);
        g.fillRect(1090/2,840/2,40/2,10/2);
        g.fillRect(890/2,850/2,40/2,10/2);
        g.fillRect(1010/2,850/2,50/2,10/2);
        g.fillRect(890/2,860/2,50/2,10/2);
        g.fillRect(1110/2,860/2,50/2,10/2);
        g.fillRect(890/2,870/2,60/2,10/2);
        g.fillRect(1130/2,870/2,30/2,10/2);
        g.fillRect(880/2,880/2,10/2,10/2);
        g.fillRect(900/2,880/2,10/2,20/2);
        g.fillRect(920/2,880/2,60/2,10/2);
        g.fillRect(1130/2,880/2,40/2,10/2);
        g.fillRect(960/2,890/2,50/2,10/2);
        g.fillRect(1150/2,890/2,20/2,10/2);
        g.fillRect(990/2,900/2,30/2,10/2);
        g.fillRect(1160/2,900/2,20/2,10/2);
        g.fillRect(970/2,730/2,30/2,10/2);
        g.fillRect(960/2,720/2,40/2,10/2);
        g.fillRect(970/2,700/2,10/2,20/2);
        g.fillRect(1000/2,710/2,20/2,10/2);
        g.fillRect(1020/2,720/2,10/2,10/2);
        g.fillRect(1170/2,570/2,10/2,10/2);
        g.fillRect(1170/2,600/2,10/2,10/2);
        g.fillRect(1180/2,730/2,10/2,20/2);
        g.fillRect(800/2,550/2,10/2,10/2);
        g.setColor(greenColor4);
        g.fillRect(840/2,670/2,40/2,10/2);
        g.fillRect(850/2,680/2,30/2,10/2);
        g.fillRect(840/2,690/2,40/2,10/2);
        g.fillRect(850/2,720/2,10/2,10/2);
        g.fillRect(860/2,730/2,10/2,10/2);
        g.fillRect(840/2,750/2,40/2,10/2);
        g.fillRect(860/2,750/2,20/2,40/2);
        g.fillRect(870/2,790/2,10/2,10/2);
        g.fillRect(910/2,880/2,10/2,10/2);
        g.fillRect(910/2,890/2,50/2,10/2);
        g.fillRect(920/2,900/2,20/2,10/2);
        g.fillRect(930/2,910/2,20/2,10/2);
        g.fillRect(960/2,900/2,30/2,10/2);
        g.fillRect(960/2,910/2,10/2,10/2);
        g.fillRect(980/2,910/2,130/2,10/2);
        g.fillRect(990/2,920/2,40/2,10/2);
        g.fillRect(1020/2,900/2,60/2,10/2);
        g.fillRect(950/2,870/2,50/2,10/2);
        g.fillRect(980/2,880/2,40/2,10/2);
        g.fillRect(1010/2,890/2,20/2,10/2);
        g.fillRect(1080/2,870/2,50/2,10/2);
        g.fillRect(1100/2,880/2,30/2,10/2);
        g.fillRect(1120/2,890/2,30/2,10/2);
        g.fillRect(1130/2,900/2,30/2,10/2);
        g.fillRect(1130/2,910/2,50/2,10/2);
        g.fillRect(1110/2,920/2,70/2,10/2);
        g.fillRect(1170/2,610/2,10/2,270/2);
        g.fillRect(1180/2,750/2,10/2,20/2);
        g.fillRect(1170/2,580/2,10/2,20/2);
        //
        g.fillRect(650/2,450/2,10/2,10/2);
        g.fillRect(660/2,460/2,10/2,10/2);
        g.fillRect(690/2,470/2,10/2,10/2);
        g.fillRect(700/2,480/2,10/2,10/2);
        g.fillRect(640/2,490/2,30/2,10/2);
        g.fillRect(690/2,490/2,20/2,10/2);
        g.fillRect(730/2,490/2,10/2,10/2);
        g.fillRect(640/2,500/2,20/2,10/2);
        g.fillRect(720/2,500/2,60/2,10/2);
        g.fillRect(640/2,510/2,30/2,10/2);
        g.fillRect(770/2,510/2,10/2,10/2);
        g.fillRect(790/2,510/2,30/2,10/2);
        g.fillRect(650/2,520/2,30/2,10/2);
        g.fillRect(800/2,520/2,20/2,10/2);
        g.fillRect(830/2,520/2,40/2,10/2);
        g.fillRect(660/2,530/2,30/2,10/2);
        g.fillRect(840/2,530/2,20/2,10/2);
        g.fillRect(880/2,530/2,60/2,10/2);
        g.fillRect(950/2,530/2,10/2,10/2);
        g.fillRect(990/2,530/2,10/2,10/2);
        g.fillRect(1010/2,530/2,10/2,10/2);
        g.fillRect(670/2,540/2,40/2,10/2);
        g.fillRect(720/2,540/2,10/2,10/2);
        g.fillRect(870/2,540/2,30/2,10/2);
        g.fillRect(920/2,540/2,120/2,10/2);
        g.fillRect(680/2,550/2,50/2,10/2);
        g.fillRect(790/2,550/2,10/2,10/2);
        g.fillRect(910/2,550/2,20/2,10/2);
        g.fillRect(970/2,550/2,30/2,10/2);
        g.fillRect(1020/2,550/2,20/2,10/2);
        g.fillRect(690/2,560/2,10/2,20/2);
        g.fillRect(730/2,560/2,10/2,10/2);
        g.fillRect(700/2,570/2,10/2,10/2);
        g.fillRect(760/2,560/2,50/2,10/2);
        g.fillRect(770/2,570/2,10/2,10/2);
        g.fillRect(790/2,550/2,10/2,40/2);
        g.fillRect(780/2,580/2,30/2,10/2);
        g.fillRect(810/2,570/2,70/2,20/2);
        g.fillRect(820/2,560/2,10/2,10/2);
        g.fillRect(830/2,590/2,10/2,10/2);
        g.fillRect(850/2,580/2,60/2,20/2);
        g.fillRect(910/2,580/2,50/2,10/2);
        g.fillRect(920/2,590/2,10/2,10/2);
        g.fillRect(940/2,420/2,20/2,10/2);
        g.fillRect(960/2,430/2,50/2,10/2);
        g.fillRect(1020/2,420/2,10/2,10/2);
        g.fillRect(940/2,560/2,30/2,10/2);
        g.fillRect(950/2,570/2,70/2,10/2);
        g.fillRect(1020/2,560/2,10/2,10/2);
        g.setColor(greenColor2);
        g.fillRect(630/2,510/2,10/2,10/2);
        g.fillRect(640/2,520/2,10/2,10/2); 
        g.fillRect(670/2,550/2,10/2,10/2);
        g.fillRect(680/2,560/2,10/2,10/2);
        g.fillRect(690/2,580/2,10/2,10/2);
        g.fillRect(700/2,590/2,10/2,10/2);
        g.fillRect(720/2,620/2,10/2,10/2);
        g.fillRect(740/2,650/2,10/2,10/2);
        g.fillRect(760/2,670/2,10/2,10/2);
        g.fillRect(810/2,730/2,10/2,10/2);
        g.fillRect(830/2,760/2,10/2,10/2);
        g.fillRect(840/2,780/2,10/2,10/2);
        g.fillRect(850/2,790/2,10/2,10/2);
        g.fillRect(860/2,810/2,10/2,10/2);
        g.fillRect(870/2,830/2,10/2,10/2);
        g.fillRect(880/2,850/2,10/2,30/2);
        g.fillRect(890/2,880/2,10/2,30/2);
        g.fillRect(1180/2,910/2,10/2,10/2);
        g.fillRect(1170/2,880/2,10/2,20/2);
        g.fillRect(1160/2,870/2,10/2,10/2);
        g.fillRect(1180/2,770/2,10/2,50/2);
        g.fillRect(1180/2,680/2,10/2,50/2);
        g.fillRect(1170/2,540/2,10/2,30/2);
        g.fillRect(1160/2,510/2,10/2,10/2);
        g.fillRect(1150/2,490/2,10/2,20/2);
        g.fillRect(1140/2,480/2,10/2,10/2);
        g.fillRect(1130/2,470/2,10/2,10/2);
        g.fillRect(1120/2,460/2,10/2,10/2);
        g.fillRect(1110/2,440/2,10/2,20/2);
        g.fillRect(1100/2,430/2,10/2,20/2);
        g.fillRect(1090/2,420/2,10/2,10/2);
        g.fillRect(1080/2,410/2,10/2,10/2);
        g.fillRect(1050/2,380/2,20/2,10/2);
        g.fillRect(1050/2,380/2,10/2,20/2);
        g.fillRect(980/2,490/2,10/2,10/2);
        g.fillRect(920/2,470/2,20/2,10/2);
        g.fillRect(900/2,460/2,10/2,10/2);
        g.fillRect(640/2,480/2,40/2,10/2);
        g.fillRect(640/2,450/2,10/2,10/2);
        g.fillRect(630/2,430/2,20/2,10/2);
        g.fillRect(630/2,430/2,10/2,20/2);
        g.fillRect(660/2,430/2,20/2,10/2);
        g.fillRect(660/2,440/2,70/2,10/2);
        g.fillRect(690/2,450/2,30/2,10/2);
        g.fillRect(710/2,430/2,30/2,10/2);
        g.fillRect(750/2,450/2,10/2,10/2);
        g.fillRect(740/2,460/2,30/2,10/2);
        g.fillRect(730/2,410/2,10/2,10/2);
        g.fillRect(740/2,410/2,20/2,20/2);
        g.fillRect(750/2,420/2,20/2,20/2);
        g.fillRect(750/2,400/2,30/2,10/2);
        g.fillRect(760/2,390/2,20/2,20/2);
        g.fillRect(780/2,380/2,10/2,10/2);
        g.fillRect(780/2,420/2,20/2,10/2);
        g.fillRect(790/2,410/2,10/2,50/2);
        g.fillRect(780/2,460/2,10/2,10/2);
        g.fillRect(810/2,450/2,20/2,10/2);
        g.fillRect(810/2,430/2,10/2,10/2);
        g.fillRect(830/2,440/2,10/2,10/2);
        g.fillRect(820/2,420/2,20/2,20/2);
        g.fillRect(820/2,420/2,40/2,10/2);
        g.fillRect(810/2,400/2,10/2,10/2);
        g.fillRect(790/2,370/2,50/2,10/2);
        g.fillRect(820/2,360/2,10/2,30/2);
        g.fillRect(830/2,350/2,20/2,20/2);
        g.fillRect(780/2,380/2,10/2,10/2);
        g.fillRect(830/2,400/2,70/2,10/2);
        g.fillRect(840/2,380/2,10/2,30/2);
        g.fillRect(840/2,380/2,70/2,10/2);
        g.fillRect(860/2,410/2,20/2,10/2);
        g.fillRect(890/2,410/2,20/2,10/2);
        g.fillRect(870/2,350/2,20/2,60/2);
        g.fillRect(850/2,370/2,50/2,20/2);
        g.fillRect(860/2,340/2,10/2,30/2);
        g.fillRect(890/2,340/2,10/2,30/2);
        g.setColor(greenColor5);
        g.fillRect(690/2,480/2,10/2,10/2);
        g.fillRect(780/2,510/2,10/2,10/2);
        g.fillRect(820/2,520/2,10/2,10/2);
        g.fillRect(860/2,530/2,20/2,10/2);
        g.fillRect(900/2,540/2,20/2,10/2);
        g.fillRect(930/2,550/2,40/2,10/2);
        g.fillRect(970/2,560/2,30/2,10/2);
        g.fillRect(1000/2,550/2,20/2,20/2);
        g.fillRect(980/2,850/2,20/2,20/2);
        g.fillRect(1000/2,860/2,50/2,20/2);
        g.fillRect(1050/2,870/2,30/2,10/2);
        g.fillRect(1020/2,880/2,20/2,10/2);
        g.fillRect(1030/2,890/2,90/2,10/2);
        g.fillRect(1070/2,870/2,10/2,30/2);
        g.fillRect(1080/2,880/2,20/2,30/2);
        g.fillRect(1100/2,890/2,20/2,20/2);
        g.fillRect(1110/2,900/2,20/2,20/2);
        g.fillRect(910/2,670/2,30/2,10/2);
        g.fillRect(920/2,680/2,10/2,10/2);
        g.fillRect(940/2,660/2,50/2,30/2);
        g.fillRect(970/2,650/2,20/2,10/2);
        g.fillRect(990/2,670/2,10/2,10/2);
        g.fillRect(1000/2,660/2,20/2,20/2);
        g.fillRect(1000/2,640/2,20/2,10/2);
        g.fillRect(1020/2,630/2,10/2,10/2);
        g.fillRect(1020/2,650/2,20/2,20/2);
        g.fillRect(1030/2,640/2,20/2,20/2);
        g.fillRect(1040/2,620/2,30/2,30/2);
        g.fillRect(1030/2,620/2,10/2,10/2);
        g.fillRect(1020/2,630/2,10/2,10/2);
        g.fillRect(1000/2,640/2,20/2,10/2);
        g.fillRect(1050/2,610/2,40/2,30/2);
        g.fillRect(1060/2,600/2,40/2,30/2);
        g.fillRect(1080/2,590/2,30/2,30/2);
        g.fillRect(1100/2,580/2,10/2,10/2);
        g.fillRect(1110/2,590/2,10/2,20/2);
        g.fillRect(1110/2,600/2,20/2,10/2);
        g.fillRect(1070/2,740/2,10/2,10/2);
        g.fillRect(1080/2,730/2,10/2,10/2);
        g.fillRect(1080/2,750/2,20/2,10/2);
        g.fillRect(1090/2,770/2,40/2,10/2);
        g.fillRect(1110/2,750/2,20/2,20/2);
        g.fillRect(1100/2,780/2,20/2,10/2);
        g.fillRect(1120/2,780/2,40/2,20/2);
        g.fillRect(1140/2,770/2,20/2,10/2);
        g.fillRect(1150/2,760/2,10/2,10/2);
        g.fillRect(1140/2,750/2,20/2,10/2);
        g.fillRect(1130/2,800/2,40/2,30/2);
        g.fillRect(1140/2,830/2,30/2,10/2);
        g.fillRect(1150/2,840/2,20/2,10/2);
        g.setColor(greenColor6);
        g.fillRect(680/2,470/2,10/2,10/2);
        g.fillRect(710/2,490/2,20/2,10/2);
        g.fillRect(990/2,650/2,30/2,10/2);
        g.fillRect(990/2,650/2,10/2,20/2);
        g.fillRect(1020/2,640/2,10/2,10/2);
        g.fillRect(1030/2,630/2,10/2,10/2);
        g.fillRect(940/2,900/2,20/2,10/2);
        g.fillRect(970/2,910/2,10/2,10/2);
        g.fillRect(1040/2,880/2,30/2,10/2);
    }
}
class MasterBody
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public MasterBody(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
    {
        greenColor1 = gC1;
        greenColor2 = gC2;
        greenColor3 = gC3;
        greenColor4 = gC4;
        greenColor5 = gC5;
        greenColor6 = gC6;
        greenColor7 = gC7;
        drawBody(g);
    }
    public void drawBody(Graphics g)
    {
       g.setColor(greenColor5);
        g.fillRect(1100/2,1150/2,10/2,10/2);
        g.fillRect(1110/2,1160/2,40/2,10/2);
        g.fillRect(1110/2,1160/2,30/2,30/2);
        g.fillRect(1130/2,1190/2,20/2,40/2);
        g.fillRect(1160/2,1180/2,10/2,30/2);
        g.fillRect(1160/2,1210/2,20/2,20/2);
        g.fillRect(1140/2,1220/2,40/2,30/2);
        g.fillRect(1180/2,1230/2,10/2,30/2);
        g.fillRect(1190/2,1250/2,10/2,10/2);
        g.fillRect(1150/2,1250/2,20/2,10/2);
        g.fillRect(1150/2,1020/2,10/2,10/2);
        g.fillRect(1000/2,1230/2,20/2,10/2);
        g.fillRect(1030/2,1160/2,10/2,10/2);
        g.fillRect(1040/2,1130/2,10/2,30/2);
        g.fillRect(670/2,1070/2,10/2,20/2);
        g.fillRect(690/2,1050/2,10/2,10/2);
        g.fillRect(890/2,980/2,10/2,10/2);
        g.fillRect(950/2,910/2,10/2,10/2);
        //
        g.setColor(greenColor6);
        g.fillRect(1140/2,1170/2,20/2,20/2);
        g.fillRect(1150/2,1190/2,10/2,30/2);
        g.fillRect(1170/2,1250/2,10/2,10/2);
        g.fillRect(1140/2,1000/2,10/2,10/2);
        g.fillRect(1150/2,1010/2,10/2,10/2);
        g.fillRect(1160/2,1030/2,10/2,10/2);
        g.fillRect(1170/2,1050/2,10/2,20/2);
        g.fillRect(1180/2,1070/2,10/2,20/2);
        g.fillRect(1230/2,1000/2,10/2,10/2);
        g.fillRect(1240/2,1020/2,10/2,20/2);
        g.fillRect(1250/2,1040/2,10/2,20/2);
        g.fillRect(770/2,1010/2,10/2,10/2);
        g.fillRect(800/2,980/2,10/2,10/2);
        g.fillRect(810/2,970/2,10/2,10/2);
        g.fillRect(900/2,970/2,10/2,10/2);
        g.fillRect(940/2,900/2,20/2,10/2);
        g.fillRect(970/2,910/2,10/2,10/2);
        //
        g.setColor(greenColor4);
        g.fillRect(1230/2,1010/2,20/2,10/2);
        g.fillRect(1240/2,1040/2,10/2,10/2);
        g.fillRect(1250/2,1030/2,10/2,10/2);
        g.fillRect(1250/2,1060/2,10/2,80/2);
        g.fillRect(1180/2,1090/2,20/2,10/2);
        g.fillRect(1160/2,1070/2,20/2,20/2);
        g.fillRect(1160/2,1040/2,10/2,30/2);
        g.fillRect(1160/2,1040/2,20/2,10/2);
        g.fillRect(1170/2,1040/2,10/2,10/2);
        g.fillRect(1160/2,1020/2,10/2,10/2);
        g.fillRect(1150/2,1030/2,10/2,10/2);
        g.fillRect(1140/2,1010/2,10/2,20/2);
        g.fillRect(1130/2,1000/2,10/2,20/2);
        g.fillRect(1140/2,990/2,10/2,10/2);
        g.fillRect(1120/2,1020/2,10/2,30/2);
        g.fillRect(1180/2,1060/2,10/2,10/2);
        g.fillRect(1110/2,1050/2,10/2,30/2);
        g.fillRect(1100/2,1080/2,10/2,50/2);
        g.fillRect(1090/2,1110/2,10/2,150/2);
        g.fillRect(1110/2,1130/2,10/2,30/2);
        g.fillRect(1090/2,1140/2,30/2,10/2);
        g.fillRect(1110/2,1150/2,50/2,10/2);
        g.fillRect(1150/2,1160/2,20/2,10/2);
        g.fillRect(1160/2,1170/2,20/2,10/2);
        g.fillRect(1170/2,1180/2,20/2,30/2);
        g.fillRect(1180/2,1190/2,30/2,40/2);
        g.fillRect(1190/2,1200/2,30/2,50/2);
        g.fillRect(1200/2,1220/2,20/2,40/2);
        g.fillRect(1220/2,1210/2,10/2,10/2);
        g.fillRect(1220/2,1230/2,10/2,30/2);
        g.fillRect(1230/2,1240/2,10/2,20/2);
        g.fillRect(1110/2,1190/2,20/2,70/2);
        g.fillRect(1090/2,1160/2,20/2,100/2);
        g.fillRect(1130/2,1230/2,10/2,30/2);
        g.fillRect(1140/2,1250/2,10/2,10/2);
        g.fillRect(1090/2,1150/2,10/2,110/2);
        g.fillRect(1080/2,1150/2,10/2,60/2);
        g.fillRect(1080/2,1220/2,10/2,40/2);
        g.fillRect(1070/2,1220/2,10/2,30/2);
        g.fillRect(1060/2,1210/2,10/2,20/2);
        g.fillRect(1070/2,1200/2,10/2,10/2);
        g.fillRect(1070/2,1180/2,10/2,10/2);
        g.fillRect(1050/2,1110/2,10/2,90/2);
        g.fillRect(1060/2,1150/2,10/2,50/2);
        g.fillRect(1040/2,1160/2,10/2,20/2);
        g.fillRect(1040/2,1110/2,20/2,20/2);
        g.fillRect(990/2,1110/2,70/2,10/2);
        g.fillRect(990/2,1230/2,10/2,10/2);
        g.fillRect(1020/2,1230/2,20/2,10/2);
        g.fillRect(930/2,1230/2,40/2,10/2);
        g.fillRect(920/2,1250/2,50/2,10/2);
        g.fillRect(830/2,1230/2,80/2,10/2);
        g.fillRect(800/2,1230/2,20/2,10/2);
        g.fillRect(770/2,1230/2,20/2,10/2);
        g.fillRect(720/2,1230/2,20/2,10/2);
        g.fillRect(780/2,1110/2,40/2,10/2);
        g.fillRect(770/2,1020/2,10/2,10/2);
        g.fillRect(670/2,1090/2,30/2,10/2);
        g.fillRect(690/2,1100/2,10/2,10/2);
        g.fillRect(680/2,1060/2,20/2,20/2);
        g.fillRect(670/2,1030/2,10/2,40/2);
        g.fillRect(900/2,980/2,10/2,10/2);
        g.fillRect(650/2,1230/2,10/2,10/2);
        
        g.setColor(greenColor3);
        g.fillRect(1240/2,1120/2,10/2,10/2);
        g.fillRect(1130/2,1020/2,10/2,30/2);
        g.fillRect(1140/2,1030/2,10/2,20/2);
        g.fillRect(1150/2,1040/2,10/2,10/2);
        g.fillRect(1120/2,1050/2,40/2,30/2);
        g.fillRect(1110/2,1080/2,50/2,50/2);
        g.fillRect(1080/2,1140/2,10/2,10/2);
        g.fillRect(1100/2,1130/2,10/2,10/2);
        g.fillRect(1120/2,1130/2,110/2,20/2);
        g.fillRect(1160/2,1090/2,20/2,70/2);
        g.fillRect(1180/2,1100/2,20/2,80/2);
        g.fillRect(1170/2,1160/2,10/2,10/2);
        g.fillRect(1200/2,1110/2,10/2,20/2);
        g.fillRect(1200/2,1120/2,20/2,10/2);
        g.fillRect(1230/2,1210/2,30/2,30/2);
        g.fillRect(1220/2,1220/2,10/2,10/2);
        g.fillRect(1240/2,1240/2,20/2,20/2);
        g.fillRect(1220/2,1200/2,40/2,10/2);
        g.fillRect(1210/2,1190/2,50/2,10/2);
        g.fillRect(1190/2,1180/2,70/2,10/2);
        g.fillRect(1180/2,1170/2,80/2,10/2);
        g.fillRect(1170/2,1160/2,80/2,10/2);
        g.fillRect(1160/2,1150/2,80/2,10/2);
        g.fillRect(1120/2,1130/2,110/2,20/2);
        g.fillRect(1230/2,1140/2,10/2,10/2);
        g.fillRect(1180/2,920/2,10/2,10/2);
        g.fillRect(1160/2,930/2,20/2,10/2);
        g.fillRect(1040/2,920/2,70/2,10/2);
        g.fillRect(980/2,920/2,10/2,10/2);
        g.fillRect(1100/2,1130/2,10/2,10/2);
        g.fillRect(1080/2,1140/2,10/2,10/2);
        g.fillRect(1070/2,1170/2,10/2,10/2);
        g.fillRect(1070/2,1190/2,10/2,10/2);
        g.fillRect(1070/2,1210/2,20/2,10/2);
        g.fillRect(1050/2,1200/2,20/2,10/2);
        g.fillRect(1050/2,1200/2,10/2,30/2);
        g.fillRect(1040/2,1230/2,30/2,30/2);
        g.fillRect(1070/2,1250/2,10/2,10/2);
        g.fillRect(1010/2,1240/2,30/2,20/2);
        g.fillRect(990/2,1240/2,20/2,10/2);
        g.fillRect(970/2,1230/2,20/2,30/2);
        g.fillRect(930/2,1240/2,40/2,10/2);
        g.fillRect(910/2,1230/2,20/2,20/2);
        g.fillRect(760/2,1240/2,140/2,20/2);
        g.fillRect(900/2,1250/2,20/2,10/2);
        g.fillRect(820/2,1230/2,10/2,10/2);
        g.fillRect(780/2,1230/2,20/2,10/2);
        g.fillRect(740/2,11230/2,30/2,10/2);
        g.fillRect(740/2,1230/2,10/2,30/2);
        g.fillRect(750/2,1250/2,10/2,10/2);
        g.fillRect(730/2,1240/2,10/2,10/2);
        g.fillRect(710/2,1110/2,30/2,10/2);
        g.fillRect(680/2,1040/2,20/2,10/2);
        g.fillRect(680/2,1040/2,10/2,20/2);
        g.fillRect(770/2,1060/2,10/2,20/2);
        g.fillRect(820/2,1110/2,70/2,10/2);
        g.fillRect(960/2,1110/2,30/2,10/2);
        g.fillRect(740/2,1230/2,30/2,10/2);
        g.fillRect(930/2,1110/2,30/2,10/2);
        g.fillRect(890/2,1110/2,10/2,10/2);
        g.fillRect(860/2,1100/2,10/2,10/2);
        g.fillRect(710/2,1230/2,10/2,10/2);
        g.fillRect(660/2,1230/2,10/2,10/2);
        
        g.setColor(greenColor2);
        g.fillRect(990/2,1250/2,20/2,10/2);
        g.fillRect(900/2,1240/2,10/2,10/2);
        g.fillRect(900/2,1110/2,30/2,10/2);
        g.fillRect(750/2,1240/2,10/2,10/2);
        g.fillRect(670/2,1230/2,40/2,10/2);
        g.fillRect(680/2,1240/2,50/2,10/2);
        g.fillRect(670/2,1250/2,70/2,10/2);
        g.fillRect(650/2,1240/2,10/2,20/2);
        g.fillRect(690/2,1110/2,20/2,10/2);
        g.fillRect(700/2,1100/2,10/2,20/2);
        g.fillRect(680/2,1080/2,20/2,10/2);
        g.fillRect(740/2,1110/2,40/2,10/2);
        g.fillRect(760/2,1100/2,20/2,10/2);
        g.fillRect(770/2,1080/2,10/2,20/2);
        g.fillRect(770/2,1030/2,10/2,30/2);
        g.fillRect(770/2,1000/2,10/2,10/2);
        g.fillRect(790/2,980/2,10/2,10/2);
        g.fillRect(800/2,970/2,10/2,10/2);
        g.fillRect(810/2,960/2,20/2,10/2);
        g.fillRect(820/2,950/2,10/2,20/2);
        g.fillRect(900/2,1110/2,30/2,10/2);
        
        g.setColor(greenColor1);
        g.fillRect(660/2,1240/2,20/2,10/2);
        g.fillRect(660/2,1240/2,10/2,20/2);
        g.fillRect(870/2,880/2,20/2,10/2);
    }
}
class MasterKermitTheFrog extends MasterMeme
{
    public MasterKermitTheFrog(Graphics g, Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7, 
                                     Color wC1, Color wC2, Color wC3, Color wC4, Color wC5, 
                                     Color dlC1, Color dlC2, Color dlC3, Color dlC4, Color dlC5, Color dlC6, Color dlC7,
                                     Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6, 
                                     Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
                                     Color bC11, Color bC12, Color bC13, Color bC14, Color bC15, Color bC16, Color bC17, Color bC18, Color bC19, Color bC20, 
                                     Color bC21, Color bC22)
    {
        //Super Colors
        super(g, tC1, tC2, tC3, tC4, tC5, tC6,
                 bC1, bC2, bC3, bC4, bC5, bC6, bC7, bC8, bC9, bC10, 
                 bC11, bC12, bC13, bC14, bC15, bC16, bC17, bC18, bC19, bC20, 
                 bC21, bC22);
        MasterEye eye = new MasterEye(g, wC1, wC2, wC3, wC4, wC5);
        MasterDrink drink = new MasterDrink(g, dlC1, dlC2, dlC3, dlC4, dlC5, dlC6, dlC7);
        MasterNeckRing neckRing = new MasterNeckRing(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7);
    }
}
class MasterEye
{
    private Color whiteColor1, whiteColor2, whiteColor3, whiteColor4, whiteColor5, whiteColor6, whiteColor7, whiteColor8, whiteColor9, whiteColor10, whiteColor11, whiteColor12;
    public MasterEye(Graphics g, Color wC1, Color wC2, Color wC3, Color wC4, Color wC5)
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
class MasterDrink
{
    private Color drinkLiquidColor1, drinkLiquidColor2, drinkLiquidColor3, drinkLiquidColor4, drinkLiquidColor5, drinkLiquidColor6, drinkLiquidColor7, drinkLiquidColor8, fixColor1;
    public MasterDrink(Graphics g, Color dlC1, Color dlC2, Color dlC3, Color dlC4, Color dlC5, Color dlC6, Color dlC7)
    {
        drinkLiquidColor1 = dlC1;
        drinkLiquidColor2 = dlC2;
        drinkLiquidColor3 = dlC3;
        drinkLiquidColor4 = dlC4;
        drinkLiquidColor5 = dlC5;
        drinkLiquidColor6 = dlC6;
        drinkLiquidColor7 = dlC7;
        drinkLiquidColor8 = new Color(182,157,128);
        fixColor1 = new Color(0,91,161);
        drawGlass(g);
        drawLiquid(g);
    }
    public void drawLiquid(Graphics g)
    {
        g.setColor(drinkLiquidColor2);//the main polygon of the darkest liquid
        g.fillRect(360/2,630/2,10/2,10/2);
        g.fillRect(370/2,630/2,20/2,20/2);
        g.fillRect(390/2,630/2,10/2,40/2);
        g.fillRect(400/2,610/2,10/2,70/2);
        g.fillRect(410/2,600/2,10/2,80/2);
        g.fillRect(420/2,590/2,20/2,110/2);
        g.fillRect(440/2,570/2,10/2,140/2);
        g.fillRect(430/2,710/2,20/2,20/2);
        g.fillRect(430/2,520/2,20/2,10/2);
        g.fillRect(440/2,530/2,10/2,10/2);
        g.fillRect(450/2,520/2,30/2,200/2);
        g.fillRect(480/2,520/2,20/2,190/2);
        g.fillRect(500/2,510/2,20/2,190/2);
        g.fillRect(510/2,480/2,10/2,30/2);
        g.fillRect(520/2,450/2,10/2,240/2);
        g.fillRect(530/2,450/2,10/2,230/2);
        g.fillRect(540/2,460/2,10/2,200/2);
        g.fillRect(550/2,460/2,10/2,190/2);
        g.fillRect(560/2,460/2,10/2,180/2);
        g.fillRect(570/2,470/2,10/2,150/2);
        g.fillRect(580/2,460/2,10/2,130/2);
        g.fillRect(590/2,470/2,10/2,100/2);
        g.fillRect(600/2,470/2,10/2,70/2);
        g.fillRect(610/2,480/2,10/2,40/2);
        g.fillRect(620/2,470/2,10/2,30/2);
        g.fillRect(630/2,480/2,10/2,10/2);
        g.fillRect(600/2,550/2,10/2,10/2);
        g.fillRect(450/2,430/2,20/2,10/2);
        g.fillRect(450/2,450/2,20/2,10/2);
        g.fillRect(420/2,730/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor1);//the main polygon of the adjacent liquid
        Polygon c1 = new Polygon();
        c1.addPoint(450/2,510/2);
        c1.addPoint(410/2,510/2);
        c1.addPoint(410/2,500/2);
        c1.addPoint(400/2,500/2);
        c1.addPoint(400/2,510/2);
        c1.addPoint(390/2,510/2);
        c1.addPoint(390/2,540/2);
        c1.addPoint(400/2,540/2);
        c1.addPoint(400/2,560/2);
        c1.addPoint(380/2,560/2);
        c1.addPoint(380/2,600/2);
        c1.addPoint(290/2,600/2);
        c1.addPoint(290/2,610/2);
        c1.addPoint(280/2,610/2);
        c1.addPoint(280/2,630/2);
        c1.addPoint(290/2,630/2);
        c1.addPoint(290/2,640/2);
        c1.addPoint(310/2,640/2);
        c1.addPoint(310/2,650/2);
        c1.addPoint(320/2,650/2);
        c1.addPoint(320/2,660/2);
        c1.addPoint(340/2,660/2);
        c1.addPoint(340/2,670/2);
        c1.addPoint(360/2,670/2);
        c1.addPoint(360/2,680/2);
        c1.addPoint(370/2,680/2);
        c1.addPoint(370/2,690/2);
        c1.addPoint(390/2,690/2);
        c1.addPoint(390/2,700/2);
        c1.addPoint(400/2,700/2);
        c1.addPoint(400/2,710/2);
        c1.addPoint(410/2,710/2);
        c1.addPoint(410/2,730/2);
        c1.addPoint(430/2,730/2);
        c1.addPoint(430/2,710/2);
        c1.addPoint(440/2,710/2);
        c1.addPoint(440/2,700/2);
        c1.addPoint(420/2,700/2);
        c1.addPoint(420/2,680/2);
        c1.addPoint(400/2,680/2);
        c1.addPoint(400/2,670/2);
        c1.addPoint(390/2,670/2);
        c1.addPoint(390/2,650/2);
        c1.addPoint(370/2,650/2);
        c1.addPoint(370/2,640/2);
        c1.addPoint(360/2,640/2);
        c1.addPoint(360/2,630/2);
        c1.addPoint(400/2,630/2);
        c1.addPoint(400/2,610/2);
        c1.addPoint(410/2,610/2);
        c1.addPoint(410/2,600/2);
        c1.addPoint(420/2,600/2);
        c1.addPoint(420/2,590/2);
        c1.addPoint(440/2,590/2);
        c1.addPoint(440/2,570/2);
        c1.addPoint(450/2,570/2);
        c1.addPoint(450/2,540/2);
        c1.addPoint(440/2,540/2);
        c1.addPoint(440/2,530/2);
        c1.addPoint(430/2,530/2);
        c1.addPoint(430/2,520/2);
        c1.addPoint(450/2,520/2);
        g.fillPolygon(c1);
        
        g.fillRect(480/2,710/2,10/2,10/2);//the other segments within the glass of the previous color
        g.fillRect(250/2,620/2,30/2,10/2);
        g.fillRect(240/2,610/2,20/2,10/2);
        g.fillRect(240/2,600/2,10/2,10/2);
        g.fillRect(230/2,580/2,10/2,10/2);
        g.fillRect(430/2,430/2,20/2,10/2);
        g.fillRect(470/2,430/2,10/2,10/2);
        g.fillRect(470/2,450/2,20/2,10/2);
        g.fillRect(440/2,450/2,10/2,10/2);
        g.fillRect(260/2,440/2,20/2,10/2);
        g.fillRect(280/2,440/2,20/2,20/2);
        g.fillRect(310/2,440/2,20/2,20/2);
        g.fillRect(330/2,430/2,10/2,40/2);
        g.fillRect(340/2,430/2,10/2,50/2);
        g.fillRect(350/2,440/2,10/2,40/2);
        g.fillRect(360/2,440/2,10/2,30/2);
        g.fillRect(370/2,440/2,10/2,40/2);
        g.fillRect(380/2,440/2,10/2,50/2);
        g.fillRect(390/2,440/2,10/2,40/2);
        
        g.setColor(drinkLiquidColor3);//main polygon for the third liquid
        Polygon c2 = new Polygon();
        c2.addPoint(370/2,480/2);
        c2.addPoint(370/2,470/2);
        c2.addPoint(360/2,470/2);
        c2.addPoint(360/2,480/2);
        c2.addPoint(340/2,480/2);
        c2.addPoint(340/2,470/2);
        c2.addPoint(330/2,470/2);
        c2.addPoint(330/2,460/2);
        c2.addPoint(310/2,460/2);
        c2.addPoint(310/2,440/2);
        c2.addPoint(300/2,440/2);
        c2.addPoint(300/2,460/2);
        c2.addPoint(280/2,460/2);
        c2.addPoint(280/2,450/2);
        c2.addPoint(260/2,450/2);
        c2.addPoint(260/2,460/2);
        c2.addPoint(250/2,460/2);
        c2.addPoint(250/2,470/2);
        c2.addPoint(240/2,470/2);
        c2.addPoint(240/2,500/2);
        c2.addPoint(230/2,500/2);
        c2.addPoint(230/2,510/2);
        c2.addPoint(240/2,510/2);
        c2.addPoint(240/2,540/2);
        c2.addPoint(230/2,540/2);
        c2.addPoint(230/2,580/2);
        c2.addPoint(240/2,580/2);
        c2.addPoint(240/2,600/2);
        c2.addPoint(270/2,600/2);
        c2.addPoint(270/2,620/2);
        c2.addPoint(280/2,620/2);
        c2.addPoint(280/2,610/2);
        c2.addPoint(290/2,610/2);
        c2.addPoint(290/2,600/2);
        c2.addPoint(380/2,600/2);
        c2.addPoint(380/2,560/2);
        c2.addPoint(400/2,560/2);
        c2.addPoint(400/2,540/2);
        c2.addPoint(390/2,540/2);
        c2.addPoint(390/2,530/2);
        c2.addPoint(380/2,530/2);
        c2.addPoint(380/2,540/2);
        c2.addPoint(370/2,540/2);
        c2.addPoint(370/2,560/2);
        c2.addPoint(350/2,560/2);
        c2.addPoint(350/2,580/2);
        c2.addPoint(320/2,580/2);
        c2.addPoint(320/2,570/2);
        c2.addPoint(290/2,570/2);
        c2.addPoint(290/2,550/2);
        c2.addPoint(280/2,550/2);
        c2.addPoint(280/2,540/2);
        c2.addPoint(270/2,540/2);
        c2.addPoint(270/2,530/2);
        c2.addPoint(280/2,530/2);
        c2.addPoint(280/2,500/2);
        c2.addPoint(290/2,500/2);
        c2.addPoint(290/2,490/2);
        c2.addPoint(330/2,490/2);
        c2.addPoint(330/2,480/2);
        g.fillPolygon(c2);
        
        g.fillRect(340/2,480/2,40/2,10/2);//the other segments within the glass of the third color
        g.fillRect(280/2,630/2,10/2,10/2);
        g.fillRect(430/2,440/2,10/2,10/2);
        g.fillRect(480/2,440/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor4);//fourth liquid and tea bag
        g.fillRect(230/2,490/2,10/2,10/2);
        g.fillRect(230/2,510/2,10/2,30/2);
        g.fillRect(270/2,530/2,10/2,10/2);
        g.fillRect(250/2,600/2,20/2,10/2);
        g.fillRect(280/2,500/2,10/2,50/2);
        g.fillRect(290/2,490/2,10/2,80/2);
        g.fillRect(300/2,490/2,10/2,30/2);
        g.fillRect(310/2,490/2,10/2,20/2);
        g.fillRect(320/2,490/2,10/2,10/2);
        g.fillRect(330/2,480/2,10/2,30/2);
        g.fillRect(340/2,490/2,10/2,20/2);
        g.fillRect(350/2,490/2,10/2,70/2);
        g.fillRect(360/2,490/2,10/2,20/2);
        g.fillRect(370/2,490/2,20/2,10/2);
        g.fillRect(390/2,480/2,10/2,30/2);
        g.fillRect(400/2,410/2,10/2,90/2);
        g.fillRect(410/2,400/2,10/2,110/2);
        g.fillRect(420/2,400/2,10/2,20/2);
        g.fillRect(430/2,400/2,10/2,10/2);
        g.fillRect(420/2,430/2,10/2,80/2);
        g.fillRect(430/2,450/2,10/2,60/2);
        g.fillRect(440/2,460/2,10/2,50/2);
        g.fillRect(450/2,460/2,20/2,60/2);
        g.fillRect(470/2,460/2,10/2,10/2);
        g.fillRect(470/2,490/2,10/2,30/2);
        g.fillRect(480/2,430/2,10/2,10/2);
        g.fillRect(450/2,410/2,30/2,20/2);
        g.fillRect(360/2,580/2,10/2,10/2);
        g.fillRect(300/2,550/2,20/2,20/2);
        g.fillRect(320/2,550/2,20/2,30/2);
        g.fillRect(340/2,540/2,10/2,40/2);
        g.fillRect(360/2,520/2,10/2,40/2);
        g.fillRect(370/2,530/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor5);
        g.fillRect(270/2,640/2,10/2,10/2);
        g.fillRect(290/2,640/2,10/2,10/2);
        g.fillRect(290/2,660/2,10/2,10/2);
        g.fillRect(300/2,640/2,10/2,30/2);
        g.fillRect(310/2,650/2,10/2,20/2);
        g.fillRect(320/2,660/2,10/2,10/2);
        g.fillRect(320/2,680/2,10/2,10/2);
        g.fillRect(330/2,670/2,10/2,20/2);
        g.fillRect(340/2,690/2,40/2,10/2);
        g.fillRect(350/2,680/2,10/2,10/2);
        g.fillRect(360/2,700/2,10/2,10/2);
        g.fillRect(380/2,700/2,10/2,10/2);
        g.fillRect(390/2,710/2,20/2,10/2);
        g.fillRect(300/2,540/2,10/2,10/2);
        g.fillRect(300/2,520/2,10/2,10/2);
        g.fillRect(310/2,510/2,10/2,10/2);
        g.fillRect(320/2,500/2,10/2,10/2);
        g.fillRect(340/2,510/2,10/2,10/2);
        g.fillRect(340/2,530/2,10/2,10/2);
        g.fillRect(330/2,540/2,10/2,10/2);
        g.fillRect(360/2,510/2,10/2,10/2);
        g.fillRect(370/2,500/2,20/2,30/2);
        g.fillRect(290/2,420/2,10/2,10/2);
        g.fillRect(300/2,410/2,10/2,10/2);
        g.fillRect(310/2,430/2,10/2,10/2);
        g.fillRect(370/2,430/2,10/2,10/2);
        g.fillRect(400/2,400/2,10/2,10/2);
        g.fillRect(420/2,420/2,30/2,10/2);
        g.fillRect(430/2,410/2,10/2,10/2);
        g.fillRect(450/2,400/2,10/2,10/2);
        g.fillRect(480/2,410/2,10/2,10/2);
        g.fillRect(440/2,440/2,20/2,10/2);
        g.fillRect(470/2,440/2,10/2,10/2);
        g.fillRect(490/2,440/2,10/2,20/2);
        g.fillRect(470/2,470/2,10/2,10/2);
        g.fillRect(480/2,510/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor6);
        g.fillRect(310/2,670/2,20/2,10/2);
        g.fillRect(340/2,670/2,10/2,10/2);
        g.fillRect(260/2,610/2,10/2,10/2);
        g.fillRect(300/2,530/2,10/2,10/2);
        g.fillRect(310/2,520/2,10/2,30/2);
        g.fillRect(320/2,510/2,10/2,40/2);
        g.fillRect(330/2,510/2,10/2,30/2);
        g.fillRect(340/2,520/2,10/2,10/2);
        g.fillRect(320/2,410/2,10/2,20/2);
        g.fillRect(330/2,400/2,10/2,20/2);
        g.fillRect(340/2,390/2,10/2,10/2);
        g.fillRect(370/2,350/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor7);
        g.fillRect(390/2,700/2,10/2,10/2);
        g.fillRect(350/2,670/2,10/2,10/2);
        g.fillRect(240/2,620/2,10/2,10/2);
        g.fillRect(230/2,600/2,10/2,10/2);
        g.fillRect(250/2,450/2,10/2,10/2);
        g.fillRect(320/2,430/2,10/2,10/2);
        g.fillRect(460/2,440/2,10/2,10/2);
        
        g.setColor(drinkLiquidColor8);
        g.fillRect(480/2,490/2,10/2,20/2);
        g.fillRect(470/2,480/2,10/2,10/2);
        g.fillRect(480/2,460/2,10/2,10/2);
        g.fillRect(480/2,420/2,10/2,10/2);
        g.fillRect(460/2,400/2,30/2,10/2);
        g.fillRect(440/2,390/2,10/2,30/2);
        g.fillRect(440/2,390/2,20/2,10/2);
        g.fillRect(410/2,390/2,10/2,10/2);
        g.fillRect(330/2,420/2,50/2,10/2);
        g.fillRect(340/2,410/2,50/2,10/2);
        g.fillRect(350/2,400/2,30/2,10/2);
        g.fillRect(360/2,390/2,10/2,10/2);
        g.fillRect(370/2,380/2,10/2,10/2);
        g.fillRect(380/2,390/2,10/2,10/2);
        g.fillRect(390/2,400/2,10/2,10/2);
        g.fillRect(350/2,360/2,10/2,10/2);
        g.fillRect(330/2,380/2,10/2,10/2);
        g.fillRect(320/2,400/2,10/2,10/2);
        g.fillRect(300/2,420/2,20/2,10/2);
        g.fillRect(310/2,410/2,10/2,20/2);
        g.fillRect(380/2,710/2,10/2,10/2);
        g.fillRect(370/2,700/2,10/2,10/2);
        g.fillRect(360/2,680/2,10/2,10/2);
        g.fillRect(340/2,680/2,10/2,10/2);
        g.fillRect(330/2,660/2,10/2,10/2);
        g.fillRect(290/2,650/2,10/2,10/2);
        g.fillRect(260/2,640/2,10/2,10/2);
        g.fillRect(350/2,360/2,10/2,10/2);
        g.fillRect(330/2,380/2,10/2,10/2);
        g.fillRect(320/2,400/2,10/2,10/2);
        g.fillRect(280/2,410/2,20/2,10/2);
        g.fillRect(280/2,410/2,10/2,20/2);
        g.fillRect(340/2,340/2,10/2,10/2);
        g.fillRect(330/2,350/2,10/2,10/2);
        g.fillRect(320/2,360/2,10/2,20/2);
        g.fillRect(310/2,370/2,10/2,30/2);
        g.fillRect(290/2,390/2,10/2,30/2);
        g.fillRect(300/2,380/2,10/2,10/2);
        g.fillRect(230/2,590/2,10/2,10/2);
        g.fillRect(230/2,610/2,10/2,10/2);
        g.fillRect(250/2,630/2,30/2,10/2);
        g.fillRect(280/2,640/2,10/2,10/2);
        g.fillRect(290/2,650/2,10/2,10/2);
        g.fillRect(330/2,660/2,10/2,10/2);
        g.fillRect(340/2,680/2,10/2,10/2);
        g.fillRect(360/2,680/2,10/2,10/2);
        g.fillRect(280/2,650/2,10/2,10/2);
        //Fix
        g.setColor(fixColor1);
        g.fillRect(600/2,550/2,10/2,10/2);
        g.fillRect(480/2,710/2,10/2,10/2);
    }
    public void drawGlass(Graphics g)
    {
       g.setColor(new Color(196,190,166));
       g.fillRect(490/2,460/2,10/2,50/2);
       g.fillRect(480/2,470/2,20/2,20/2);
       g.fillRect(490/2,390/2,10/2,50/2);
       g.fillRect(460/2,390/2,40/2,10/2);
       g.fillRect(420/2,380/2,50/2,10/2);
       g.fillRect(440/2,370/2,20/2,10/2);
       g.fillRect(450/2,360/2,10/2,10/2);
       g.fillRect(620/2,460/2,10/2,10/2);
       g.fillRect(630/2,450/2,10/2,10/2);
       g.fillRect(520/2,440/2,10/2,10/2);
       g.fillRect(520/2,410/2,10/2,10/2);
       g.fillRect(540/2,400/2,10/2,10/2);
       g.fillRect(500/2,380/2,20/2,10/2);
       g.fillRect(490/2,370/2,20/2,10/2);
       g.fillRect(480/2,360/2,10/2,10/2);
       g.fillRect(470/2,340/2,10/2,20/2);
       g.fillRect(400/2,310/2,20/2,10/2);
       g.fillRect(420/2,340/2,20/2,30/2);
       g.fillRect(440/2,350/2,10/2,10/2);
       g.fillRect(440/2,330/2,20/2,20/2);
       g.fillRect(430/2,320/2,10/2,10/2);
       g.fillRect(320/2,360/2,80/2,70/2);
       g.fillRect(340/2,350/2,60/2,10/2);
       g.fillRect(350/2,330/2,40/2,20/2);
       g.fillRect(360/2,320/2,30/2,10/2);
       g.fillRect(370/2,310/2,30/2,10/2);
       g.fillRect(300/2,390/2,10/2,10/2);
       
        Color glassColor1 = new Color(210,210,202);
        g.setColor(new Color(148,114,93));//brownish
        g.fillRect(270/2,430/2,40/2,10/2);
        g.fillRect(350/2,430/2,10/2,10/2);
        g.fillRect(390/2,430/2,10/2,10/2);
        g.fillRect(510/2,460/2,10/2,20/2);
        g.fillRect(550/2,450/2,10/2,10/2);
        g.setColor(new Color(182,157,128));//pale brown
        g.fillRect(280/2,420/2,10/2,10/2);
        g.fillRect(290/2,410/2,10/2,10/2);
        g.fillRect(310/2,390/2,10/2,10/2);
        g.setColor(new Color(157,136,104));//pale green
        g.fillRect(300/2,400/2,20/2,10/2);
        g.fillRect(360/2,430/2,10/2,10/2);
        g.fillRect(420/2,390/2,20/2,10/2);
        g.fillRect(600/2,460/2,10/2,10/2);
        g.setColor(new Color(229,172,141));//pinkish
        g.fillRect(290/2,420/2,10/2,10/2);
        g.fillRect(300/2,410/2,10/2,10/2);
        g.fillRect(310/2,430/2,10/2,10/2);
        g.fillRect(370/2,430/2,10/2,10/2);
        g.fillRect(400/2,400/2,10/2,10/2);
        g.fillRect(450/2,400/2,10/2,10/2);
        g.fillRect(430/2,410/2,10/2,10/2);
        g.fillRect(420/2,420/2,30/2,10/2);
        g.fillRect(480/2,410/2,10/2,10/2);
        g.fillRect(440/2,440/2,20/2,10/2);
        g.fillRect(470/2,440/2,10/2,10/2);
        g.fillRect(490/2,440/2,10/2,20/2);
        g.fillRect(470/2,470/2,10/2,10/2);
        g.fillRect(480/2,510/2,10/2,10/2);
        g.setColor(new Color(242,220,159));
        g.fillRect(320/2,410/2,10/2,20/2);
        g.fillRect(330/2,400/2,10/2,20/2);
        g.fillRect(340/2,390/2,10/2,10/2);
        g.fillRect(370/2,350/2,10/2,10/2);
        g.setColor(new Color(139,123,78));//greenish
        g.fillRect(380/2,430/2,10/2,10/2);
        
        g.setColor(new Color(190,184,172));//ligher blue that looks like background
        g.fillRect(390/2,410/2,10/2,10/2);
        g.fillRect(360/2,330/2,10/2,10/2);
        g.fillRect(380/2,330/2,10/2,10/2);
        g.fillRect(390/2,340/2,10/2,10/2);
        g.fillRect(380/2,360/2,20/2,10/2);
        g.fillRect(390/2,370/2,10/2,10/2);
        g.fillRect(400/2,330/2,10/2,70/2);
        g.fillRect(410/2,320/2,10/2,70/2);
        g.fillRect(420/2,370/2,10/2,10/2);
        g.fillRect(420/2,330/2,20/2,10/2);
        g.fillRect(420/2,320/2,10/2,10/2);
        g.setColor(new Color(174,167,142));//darker blue that looks like background
        g.fillRect(390/2,420/2,10/2,10/2);
        g.fillRect(560/2,450/2,10/2,10/2);
        g.fillRect(610/2,460/2,10/2,10/2);
        //g.fillRect(
        
        g.setColor(new Color(162,155,134));
        g.fillRect(510/2,450/2,10/2,10/2);
        
        g.setColor(new Color(109,90,75));
        g.fillRect(540/2,450/2,10/2,10/2);
        g.fillRect(590/2,460/2,10/2,10/2);
        g.fillRect(630/2,470/2,10/2,10/2);
        
        g.setColor(new Color(54,34,14));//black
        g.fillRect(570/2,460/2,10/2,10/2);
        g.fillRect(610/2,470/2,10/2,10/2);
        
       g.setColor(new Color(196, 190, 166));//background to fix mistakes
       
       
       g.setColor(new Color(210,210,202));//white background "sword lightning"
       g.fillRect(630/2,460/2,10/2,10/2);
       g.fillRect(570/2,450/2,60/2,10/2);
       g.fillRect(530/2,440/2,100/2,10/2);
       g.fillRect(490/2,510/2,10/2,10/2);
       g.fillRect(500/2,390/2,10/2,120/2);
       g.fillRect(510/2,390/2,10/2,60/2);
       g.fillRect(520/2,420/2,100/2,20/2);
       g.fillRect(530/2,410/2,70/2,10/2);
       g.fillRect(520/2,380/2,20/2,30/2);
       g.fillRect(540/2,390/2,20/2,10/2);
       g.fillRect(550/2,400/2,30/2,10/2);
       g.fillRect(510/2,370/2,20/2,10/2);
       g.fillRect(490/2,360/2,20/2,10/2);
       g.fillRect(480/2,350/2,10/2,10/2);
       g.fillRect(430/2,370/2,10/2,10/2);
       g.fillRect(440/2,360/2,10/2,10/2);
       g.fillRect(450/2,350/2,10/2,10/2);
       g.fillRect(460/2,340/2,10/2,40/2);
       g.fillRect(470/2,360/2,10/2,30/2);
       g.fillRect(480/2,370/2,10/2,20/2);
       g.fillRect(490/2,380/2,10/2,10/2);
       g.fillRect(390/2,320/2,20/2,10/2);
       g.fillRect(390/2,330/2,10/2,10/2);
       g.fillRect(360/2,360/2,20/2,10/2);
       g.fillRect(360/2,370/2,10/2,10/2);
       g.fillRect(350/2,380/2,10/2,10/2);
    }
}
class MasterNeckRing
{
    private Color greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7; 
    public MasterNeckRing(Graphics g,Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7)
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
class MasterMeme extends Applet
{
    public MasterMeme(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6, 
                Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
                Color bC11, Color bC12, Color bC13, Color bC14, Color bC15, Color bC16, Color bC17, Color bC18, Color bC19, Color bC20, 
                Color bC21, Color bC22)
    {
        MasterBackground b = new MasterBackground(g, bC1, bC2, bC3, bC4, bC5, bC6, bC7, bC8, bC9, bC10, 
                                         bC11, bC12, bC13, bC14, bC15, bC16, bC17, bC18, bC19, bC20, 
                                         bC21, bC22);
        MasterTopText tT = new MasterTopText(g, tC1, tC2, tC3, tC4, tC5, tC6);
        MasterBottomText bT = new MasterBottomText(g, tC1, tC2, tC3, tC4, tC5, tC6);
    }
}
class MasterBackground
{
    private Color backgroundColor1, backgroundColor2, backgroundColor3, backgroundColor4, backgroundColor5, backgroundColor6, backgroundColor7, backgroundColor8, backgroundColor9, backgroundColor10, 
                  backgroundColor11, backgroundColor12, backgroundColor13, backgroundColor14, backgroundColor15, backgroundColor16, backgroundColor17, backgroundColor18, backgroundColor19, 
                  backgroundColor20, backgroundColor21, backgroundColor22;
    public MasterBackground(Graphics g, Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
                      Color bC11, Color bC12, Color bC13, Color bC14, Color bC15, Color bC16, Color bC17, Color bC18, Color bC19, Color bC20, 
                      Color bC21, Color bC22)
    {
        backgroundColor1 =  bC1;
        backgroundColor2 =  bC2;
        backgroundColor3 =  bC3;
        backgroundColor4 =  bC4;
        backgroundColor5 =  bC5;
        backgroundColor6 =  bC6;
        backgroundColor7 =  bC7;
        backgroundColor8 =  bC8;
        backgroundColor9 =  bC9;
        backgroundColor10 =  bC10;
        backgroundColor11 =  bC11;
        backgroundColor12 =  bC12;
        backgroundColor13 =  bC13;
        backgroundColor14 =  bC14;
        backgroundColor15 =  bC15;
        backgroundColor16 =  bC16;
        backgroundColor17 =  bC17;
        backgroundColor18 =  bC18;
        backgroundColor19 =  bC19;
        backgroundColor20 =  bC20;
        backgroundColor21 =  bC21;
        backgroundColor22 =  bC22;
        drawBackground(g);
    }
    public void drawBackground(Graphics g)
    {
        g.setColor(new Color(0,91,161));
        g.fillRect(10,10,1240/2,1240/2);
        // 63,63
        g.setColor(new Color(0,64,112));
        Polygon p1 = new Polygon();
        p1.addPoint(625/2,625/2);
        p1.addPoint(20/2,560/2);
        p1.addPoint(20/2,360/2);
        g.fillPolygon(p1);
        
        Polygon p2 = new Polygon();
        p2.addPoint(625/2,625/2);
        p2.addPoint(20/2,300/2);
        p2.addPoint(20/2,200/2);
        g.fillPolygon(p2);
        
        Polygon p3 = new Polygon();
        p3.addPoint(625/2,625/2);
        p3.addPoint(40/2,20/2);
        p3.addPoint(240/2,20/2);
        g.fillPolygon(p3);
        
        Polygon p4 = new Polygon();
        p4.addPoint(625/2,625/2);
        p4.addPoint(550/2,20/2);
        p4.addPoint(810/2,20/2);
        g.fillPolygon(p4);
        // 64,63
        Polygon p5 = new Polygon();
        p5.addPoint(625/2,625/2);
        p5.addPoint(1000/2,20/2);
        p5.addPoint(1150/2,20/2);
        g.fillPolygon(p5);
        
        Polygon p6 = new Polygon();
        p6.addPoint(625/2,625/2);
        p6.addPoint(1257/2,160/2);
        p6.addPoint(1257/2,310/2);
        g.fillPolygon(p6);
        
        Polygon p7 = new Polygon();
        p7.addPoint(625/2,625/2);
        p7.addPoint(1257/2,400/2);
        p7.addPoint(1257/2,550/2);
        g.fillPolygon(p7);
        
        Polygon p8 = new Polygon();
        p8.addPoint(625/2,625/2);
        p8.addPoint(1257/2,630/2);
        p8.addPoint(1257/2,800/2);
        g.fillPolygon(p8);
        
        Polygon p9 = new Polygon();
        p9.addPoint(625/2,625/2);
        p9.addPoint(1257/2,950/2);
        p9.addPoint(1257/2,1200/2);
        g.fillPolygon(p9);
        
        Polygon p10 = new Polygon();
        p10.addPoint(625/2,625/2);
        p10.addPoint(1080/2,1257/2);
        p10.addPoint(790/2,1257/2);
        g.fillPolygon(p10);
        
        Polygon p11 = new Polygon();
        p11.addPoint(625/2,625/2);
        p11.addPoint(590/2,1257/2);
        p11.addPoint(360/2,1257/2);
        g.fillPolygon(p11);
        
        Polygon p12 = new Polygon();
        p12.addPoint(625/2,625/2);
        p12.addPoint(180/2,1258/2);
        p12.addPoint(20/2,1258/2);
        p12.addPoint(20/2,1040/2);
        g.fillPolygon(p12);
        
        Polygon p13 = new Polygon();
        p13.addPoint(625/2,625/2);
        p13.addPoint(20/2,770/2);
        p13.addPoint(20/2,680/2);
        g.fillPolygon(p13);
    }
}
class MasterTopText
{
    private Color textColor1, textColor2, textColor3, textColor4, textColor5, textColor6;
    public MasterTopText(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6)
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
class MasterBottomText
{
    private Color textColor1, textColor2, textColor3, textColor4, textColor5, textColor6;
    public MasterBottomText(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6)
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