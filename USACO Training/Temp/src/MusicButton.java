import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings({ "serial"})
public class MusicButton extends JButton 
{
	
	//Allows us to import jpg for each button
    private BufferedImage img;
    
    //provides access to game class
    private Game game;
    
    //Constructor
    public MusicButton(ImageIcon m, String s, Game g)
    {
    	//sends ImageIcon to JButton
        super(m);
        
        //setting background of button
        setVisible(true);
        addListener(s);      
        try{
            img = ImageIO.read(new File(m + ".jpg"));
        }catch (IOException e) {}   
        
        //Accessing the game class
        game = g;
    }
    
    //paints each button
    @Override
    protected void paintComponent(Graphics g) 
    {
    	//sends g to JPanel
    	super.paintComponent(g);
    	
    	//paints image
    	g.drawImage(img, 100, 100, this);

    }
    
    //sets cursor
    public void setCursor(int HAND_CURSOR)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    //when button is clicked, this operation will be done
    public void addListener(String s)
    {
    	//action for when button is clicked
        this.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
        	try {
        		//obtains audio
        		URL url = Menu.class.getResource("\\Music\\" + s + ".wav");
        		AudioInputStream audio = AudioSystem.getAudioInputStream(url);
        		Clip music = AudioSystem.getClip();
        		music.open(audio);
        		music.loop(-1);
        	}catch (Exception ex) {}
        	
        	//start game
        	game.setStarted(true);
        	Main.setPanelSwitch(1);
        }
        });
        
        //cursor
        this.addMouseListener(new MouseAdapter() {                      
        	public void mouseEntered(MouseEvent e) {                         
        		setCursor(new Cursor(Cursor.HAND_CURSOR));         
        	}                    
        });
    }
}