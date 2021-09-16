import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Box;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Menu extends JPanel// implements ActionListener 
{
	//Allows us to import menu jpg
    private BufferedImage img;
    
    //Calls MusicButton class
    private MusicButton j;
    private MusicButton c;
    private MusicButton e;
    private MusicButton r;
    private MusicButton m;
    private MusicButton p;
    
	public Menu(Game g)
	{
		//adjusts frame
		setLayout(null);
		
		//gets background image
		add(Box.createVerticalStrut(280));
		add(Box.createVerticalGlue());  
		try {
                img = ImageIO.read(new File("b.jpg"));
              } catch (IOException e) {
              }
         
		//gets musicbutton images and instantiates objects
         j = new MusicButton(new ImageIcon("jazz.jpg"), "jazz", g);
         j.setBorder(null);
         j.setBounds(215, 592, 151, 45);
         c = new MusicButton(new ImageIcon("relax.jpg"), "calm", g);
         c.setBorder(null);
         c.setBounds(375, 592, 151, 45);
         e = new MusicButton(new ImageIcon("exciting.jpg"), "exciting", g);
         e.setBorder(null);
         e.setBounds(535, 592, 151, 45);
         r = new MusicButton(new ImageIcon("rock.jpg"), "rock", g);
         r.setBorder(null);
         r.setBounds(695, 592, 151, 45);
         m = new MusicButton(new ImageIcon("mystery.jpg"), "mystery", g);
         m.setBorder(null);
         m.setBounds(375, 650, 151, 45);
         p = new MusicButton(new ImageIcon("pop.jpg"), "pop", g);
         p.setBorder(null);
         p.setBounds(535, 650, 151, 45);
         
        //adds MusicButton objects to frame
        add(j);
        add(c);
        add(e);
        add(r);
        add(m);
        add(p);
	}
	
	@Override
    protected void paintComponent(Graphics g) 
	{
		//passes g to JPanel
		super.paintComponent(g);
		
		//paints image
        g.drawImage(img, 0, 0, this);
    }
	
	//gets preferred dimensions of image and sets size of panel
    @Override
    public Dimension getPreferredSize() 
    {
    	return new Dimension(img.getWidth(), img.getHeight());
    }
}