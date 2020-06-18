import java.awt.*;
import java.applet.*;
public class MemeRunner extends Applet
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
        GreenFrog frog = new GreenFrog(g, greenColor1, greenColor2, greenColor3, greenColor4, greenColor5, greenColor6, greenColor7,
                                          whiteColor1, whiteColor2, whiteColor3, whiteColor4, whiteColor5,
                                          drinkLiquidColor1, drinkLiquidColor2, drinkLiquidColor3, drinkLiquidColor4, drinkLiquidColor5, drinkLiquidColor6, drinkLiquidColor7, 
                                          textColor1, textColor2, textColor3, textColor4, textColor5, textColor6, 
                                          backColor1, backColor2, backColor3, backColor4, backColor5, backColor6, backColor7, backColor8, backColor9, backColor10, 
                                          backColor11, backColor12, backColor13, backColor14, backColor15, backColor16, backColor17, 
                                          backColor18, backColor19, backColor20, backColor21, backColor22);
    }
}