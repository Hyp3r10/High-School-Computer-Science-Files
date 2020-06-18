import java.awt.*;
import java.applet.*;
public class KermitTheFrog extends Meme
{
    public KermitTheFrog(Graphics g, Color gC1, Color gC2, Color gC3, Color gC4, Color gC5, Color gC6, Color gC7, 
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
        Eye eye = new Eye(g, wC1, wC2, wC3, wC4, wC5);
        Drink drink = new Drink(g, dlC1, dlC2, dlC3, dlC4, dlC5, dlC6, dlC7);
        NeckRing neckRing = new NeckRing(g, gC1, gC2, gC3, gC4, gC5, gC6, gC7);
    }
}