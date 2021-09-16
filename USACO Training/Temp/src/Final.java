import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.ImageIcon;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Final extends JPanel
{
	//provides access to Game and RetryButton class
	private Game game;
	private RetryButton button;
	
	//allows us to connect the jpg of the Bowling Ball to Graphics
	private BufferedImage img;
	
	public Final(Game g)
	{
		//adjusts JFrame
		setLayout(null);
		
		//provides local access to current Game
		game = g;
		
		//imports image
		add(Box.createVerticalStrut(280));
		add(Box.createVerticalGlue());  
		
		try {
                img = ImageIO.read(new File("final.jpg"));
            } catch (IOException e) {}
		
		//creates and adds button to end game
		button = new RetryButton(new ImageIcon("retry.jpg"), game);
		button.setBorder(null);
        button.setBounds(424, 424, 151, 45);
        
        add(button);
	}
	
	//paints the Strings
	public void paint(Graphics g)
	{
		//passes g to JPanel
		super.paint(g);
		
		//sets Color
		g.setColor(new Color(255, 125, 180));
		
		//sets Font
        g.setFont(new Font("Lobster", 1, 20));
        
        String str = "" + game.getScore() + " pins out of 50";
        
        //paints String
        g.drawString(str, 435, 381);
		
	}
	
	//paints background
	@Override
	public void paintComponent(Graphics g)
	{
		//sends g to JPanel
		super.paintComponent(g);
		
		//paints image
		g.drawImage(img, 0, 0, this);
	}
	
	//provides preferred size of image
	 @Override
	 public Dimension getPreferredSize() 
	 {
		 return new Dimension(img.getWidth(), img.getHeight());
     } 
}