import java.awt.*;
import java.applet.*;
public class Background
{
    private Color backgroundColor1, backgroundColor2, backgroundColor3, backgroundColor4, backgroundColor5, backgroundColor6, backgroundColor7, backgroundColor8, backgroundColor9, backgroundColor10, 
                  backgroundColor11, backgroundColor12, backgroundColor13, backgroundColor14, backgroundColor15, backgroundColor16, backgroundColor17, backgroundColor18, backgroundColor19, 
                  backgroundColor20, backgroundColor21, backgroundColor22;
    public Background(Graphics g, Color bC1, Color bC2, Color bC3, Color bC4, Color bC5, Color bC6, Color bC7, Color bC8, Color bC9, Color bC10, 
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