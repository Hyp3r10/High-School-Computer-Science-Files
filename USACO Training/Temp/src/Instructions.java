import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class Instructions extends JPanel
{
    private BufferedImage img;
    
    public Instructions()
    {
    	//updates frame
        setLayout(null);
		
        //obtains image
		add(Box.createVerticalStrut(280));
		add(Box.createVerticalGlue());  
		
		try {
              img = ImageIO.read(new File("inst.png"));
        } catch (IOException e) {}
        
		//makes new button to move to next screen and sets location
		JButton b = new JButton(new ImageIcon("next.jpg"));
        b.setBorder(null);
        b.setBounds(430, 524, 151, 45);
        
        //adds button to panel
        add(b);
        
        //if b is clicked, panel is switched
        b.addActionListener((new ActionListener() { 
             public void actionPerformed(ActionEvent e) 
             { 
            	//sends panel to Game
                Main.setPanelSwitch(2);
             }  
        }));
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