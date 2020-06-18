import java.awt.*;
import java.applet.*;
public class Meme extends Applet
{
    public Meme(Graphics g, Color tC1, Color tC2, Color tC3, Color tC4, Color tC5, Color tC6, 
                Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
                Color bC11, Color bC12, Color bC13, Color bC14, Color bC15, Color bC16, Color bC17, Color bC18, Color bC19, Color bC20, 
                Color bC21, Color bC22)
    {
        Background b = new Background(g, bC1, bC2, bC3, bC4, bC5, bC6, bC7, bC8, bC9, bC10, 
                                         bC11, bC12, bC13, bC14, bC15, bC16, bC17, bC18, bC19, bC20, 
                                         bC21, bC22);
        TopText tT = new TopText(g, tC1, tC2, tC3, tC4, tC5, tC6);
        BottomText bT = new BottomText(g, tC1, tC2, tC3, tC4, tC5, tC6);
    }
}