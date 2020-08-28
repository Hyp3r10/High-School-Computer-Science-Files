package TheGameOfLife;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

/** The view (graphical) component */
public class LifeView extends JPanel
{
	private static final long serialVersionUID = 1L;
	private static int SIZE = 60;
	private boolean isRandom;

	/** store a reference to the current state of the grid */
    private LifeCell[][] grid;

    public LifeView()
    {
        grid = new LifeCell[SIZE][SIZE];
    }

    /** entry point from the model, requests grid be redisplayed */
    public void updateView( LifeCell[][] mg )
    {
        grid = mg;
        repaint();
    }
    
    /** Toggles between Color.BLUE and a random Color */
    public void updateColor() {
    	this.isRandom = !isRandom;
    }
    
    /** 
     * Uses the toggled isRandom variable to determine whether or not to 
     * display the living cells as Color.BLUE or some other Color
     * 
     * @return	a color for the living cells
     */
    private Color getColor() {
    	Random rand = new Random();
    	if(isRandom) {
    		return new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    	}
    	else {
    		return Color.BLUE;
    	}
    } 
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int testWidth = getWidth() / (SIZE+1);
        int testHeight = getHeight() / (SIZE+1);
        // keep each life cell square
        int boxSize = Math.min(testHeight, testWidth);

        for ( int r = 0; r < SIZE; r++ )
        {
            for (int c = 0; c < SIZE; c++ )
            {
                if (grid[r][c] != null)
                {
                    if ( grid[r][c].isAliveNow() )
                        g.setColor(getColor());
                    else
                        g.setColor( new Color(235,235,255) );

                    g.fillRect( (c+1)*boxSize, (r+1)* boxSize, boxSize-2, boxSize-2);
                }
            }
        }
    }
}
