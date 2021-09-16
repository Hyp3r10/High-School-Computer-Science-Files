import javax.swing.*;

//By: Jai Benegal, Aadarsh Balireddy, Parker Freeburg, and Jordan Hayes
//Assignment Title: Cyber Bowling Game
//Date: 12/17/2020

public class Main
{
    private static int panelSwitch;
    
	@SuppressWarnings("unused")
	public Main(JFrame f)
	{
		//adjusts Frame
		f.setBounds(10,10,1000,750);
		f.setTitle("CyberBowling");
		f.setResizable(false);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Setter
	public static void setPanelSwitch(int s)
	{
		panelSwitch = s;
	}
	
	//getter
	public int getPanelSwitch()
	{
		return panelSwitch;
	}
	
	public static void main(String args[])
	{
		//creates new JFrame, Game, Menu, Final
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Game g = new Game();
        Menu panel = new Menu(g);
        Final f = new Final(g);
        Instructions i = new Instructions();
        
        boolean ran = false;
		
        //changes panel to Menu
        while(panelSwitch == 0)
        {
        	if(!ran)
            {
        		frame.setContentPane(panel);
                ran = true;
            }
        	//sets frame
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        ran = false;
        while(panelSwitch == 1)
        {
        	if(!ran)
        	{
        		frame.setContentPane(i);
        		ran = true;
        	}
        	frame.pack();
        	frame.setResizable(false);
        	frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        ran = false;
        //changes panel to Game
        while(panelSwitch == 2)
        {
            JButton b = g.getButton();
			if(!ran)
            {
				frame.setContentPane(g);
				ran = true;
            }
			//sets frame
            frame.setTitle("Cyber Bowling");
            frame.setLocationRelativeTo(null);
            frame.setSize(1000, 750);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.add(b);
            if(g.getStarted())
            	g.startTimer();
        }
        ran = false;
        //changes panel to Final
        while(panelSwitch == 3)
        {
        	if(!ran)
            {
				frame.setContentPane(f);
				ran = true;
            }
        	//sets frame
        	frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
     }
}