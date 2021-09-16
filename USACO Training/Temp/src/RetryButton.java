import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

@SuppressWarnings("serial")
public class RetryButton extends JButton
{
	
	public RetryButton(ImageIcon i, Game g)
	{
		//sends ImageIcon to JButton where it paints
		super(i);
		
		//adjusts frame
		setVisible(true);
		
		//adds input of button
		addListener();
	}
	
	//sets cursor
    public void setCursor(int HAND_CURSOR)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
	public void addListener()
	{
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				//ends program if button is clicked
				System.exit(0);
			}
		});

		//cursor
	    this.addMouseListener(new MouseAdapter() {                      
	        public void mouseEntered(MouseEvent e) 
	        {                         
	        		setCursor(new Cursor(Cursor.HAND_CURSOR));         
	        }                    
	     });
	}
}
