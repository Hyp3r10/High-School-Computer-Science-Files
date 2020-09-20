import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Timer;

public class LifeModel implements ActionListener
{

	/*
	 *  This is the Model component.
	 */

	private static int SIZE = 60;
	private LifeCell[][] grid;

	LifeView myView;
	Timer timer;
	private String fileName;

	/** Construct a new model using a particular file */
	public LifeModel(LifeView view, String fileName) throws IOException
	{       
		this.fileName = fileName;
		int r, c;
		grid = new LifeCell[SIZE][SIZE];
		for ( r = 0; r < SIZE; r++ )
			for ( c = 0; c < SIZE; c++ )
				grid[r][c] = new LifeCell();

		if ( this.fileName == null ) //use random population
		{                                           
			for ( r = 0; r < SIZE; r++ )
			{
				for ( c = 0; c < SIZE; c++ )
				{
					if ( Math.random() > 0.85) //15% chance of a cell starting alive
						grid[r][c].setAliveNow(true);
				}
			}
		}
		else
		{                 
			Scanner input = new Scanner(new File(this.fileName));
			int numInitialCells = input.nextInt();
			for (int count=0; count<numInitialCells; count++)
			{
				r = input.nextInt();
				c = input.nextInt();
				grid[r][c].setAliveNow(true);
			}
			input.close();
		}
		myView = view;
		myView.updateView(grid);

	}

	/** Constructor a randomized model */
	public LifeModel(LifeView view) throws IOException
	{
		this(view, null);
	}

	/** pause the simulation (the pause button in the GUI */
	public void pause()
	{
		timer.stop();
	}

	/** resume the simulation (the pause button in the GUI */
	public void resume()
	{
		timer.restart();
	}

	/** run the simulation (the pause button in the GUI */
	public void run()
	{
		timer = new Timer(50, this);
		timer.setCoalesce(true);
		timer.start();
	}
	
	/** change the color of the living cells */
	public void changeColor() {
		myView.updateColor();
	}
	
	/** reset the board state to either a new random state or the file name */
	public void reset() {
		
	}

	/** called each time timer fires */
	public void actionPerformed(ActionEvent e)
	{
		oneGeneration();
		myView.updateView(grid);
	}

	/** main logic method for updating the state of the grid / simulation */
	private void oneGeneration()
	{
		// Generate a list of coordinates indicating the current living cells
		ArrayList<int[]> currentLivingCells = getCurrentLivingCells();
		// Generate a new temp grid that indicates the number of neighbors for each living cell. 
		int[][] livingCellNeighbors = generateNeighbors(currentLivingCells);
		// Generate a list of coordinates indicating the cells to die at the beginning of this generation
		ArrayList<int[]> cellsToBeKilled = cellsToBeKilled(currentLivingCells, livingCellNeighbors);
		// Generate a list of coordinates indicating cells that need to be birthed after the current gen deaths occur.
		ArrayList<int[]> cellsToBeBirthed = cellsToBeBirthed(currentLivingCells);
		// Update the grid to reflect the changes defined earlier
		updateBoard(cellsToBeKilled, cellsToBeBirthed);
		
	}
	/**
	 * Looks through the grid array and creates a list of coordinate positions of currently alive cells
	 * 
	 * @return list of currently alive cells.
	 */
	private ArrayList<int[]> getCurrentLivingCells() {
		ArrayList<int[]> currentLifeCells = new ArrayList<int[]>();
		int out = 0;
		for(LifeCell[] arr : grid) {
			int in = 0;
			for(LifeCell curr : arr) {
				if(curr.isAliveNow()) {
					currentLifeCells.add(new int[] {out, in});
				}
				in++;
			}
			out++;
		}
		return currentLifeCells;
	}
	/**
	 * Given a list of coordinates of currently living cells, generate a grid 
	 * indicating the number of adjacent living cells for each living cell
	 * 
	 * @param currentLivingCells	a list of coordinates indicating the current living cells
	 * @return						a grid where the value at index i,j is the number of adjacent living cells. 
	 */
	private int[][] generateNeighbors(ArrayList<int[]> currentLivingCells) {
		int[][] neighborsOfAlive = new int[SIZE][SIZE];
		for(int i = 0; i < currentLivingCells.size(); i++) {
			int[] currCords = currentLivingCells.get(i);
			neighborsOfAlive[currCords[0]][currCords[1]] = getNumberOfAdjacentAliveCells(currCords);
		}
		return neighborsOfAlive;
	}
	/**
	 * Given a position on the board, count the number of adjacent living cells
	 * Used by the generateNeighbors method
	 * 
	 * @param pos	the current index in question on grid
	 * @return		the number of adjacent living cells
	 */
	private int getNumberOfAdjacentAliveCells(int[] pos) {
		int count = 0;
		int R = pos[0];
		int C = pos[1];
		for(int i = R-1; i <= R+1; i++) {
			for(int j = C-1; j <= C+1; j++) {
				// If the cell is not the original and it is actually in bounds...
				if(!(i == R && j == C) && (i < SIZE && j < SIZE && i >= 0 && j >= 0)) {
					if(grid[i][j].isAliveNow()) {
						count++;
					}
				}
			}
		}
		return count;
	}
	/**
	 * Given a list of coordinates of living cells and a grid representing their respective 
	 * number of neighbors, return a list of coordinates indicating which cells will die at 
	 * the beginning of this generation
	 * Used by the oneGeneration method
	 * 
	 * @param currentlyLivingCells	a list of coordinates indicating the current living cells
	 * @param livingCellNeighbors	a grid where the value at index i,j is the number of adjacent living cells
	 * @return						a list of coordinates indicating the cells to die at the beginning of this generation
	 */
	private ArrayList<int[]> cellsToBeKilled(ArrayList<int[]> currentlyLivingCells, int[][] livingCellNeighbors) {
		ArrayList<int[]> cellsToBeKilled = new ArrayList<int[]>();
		for(int i = 0; i < currentlyLivingCells.size(); i++) {
			int[] currCoord = currentlyLivingCells.get(i);
			// if the number is not 2 or 3, then the cell dies
			if(livingCellNeighbors[currCoord[0]][currCoord[1]] != 2 && livingCellNeighbors[currCoord[0]][currCoord[1]] != 3) {
				cellsToBeKilled.add(currCoord);
			}
		}
		return cellsToBeKilled;
	}
	/**
	 * Generate a list of coordinates indicating cells that will be birthed 
	 * once the current cells die off. 
	 * Used by the oneGeneration method
	 * 
	 * @param currentLivingCells	a list indicating the coordinates of all living cells
	 * @return						a list of indicating the coordinates of the cells to be birthed
	 */
	private ArrayList<int[]> cellsToBeBirthed(ArrayList<int[]> currentLivingCells) {
		int[][] nextGenGrid = getNextGenGrid(currentLivingCells);
		ArrayList<int[]> nextGenCoords = getNextGenCoords(nextGenGrid);
		return nextGenCoords;
	}
	/**
	 * Generate a grid that will be used to figure out which cells need to be birthed. 
	 * Used by the cellsToBeBirthed method
	 * 
	 * @param currentLivingCells	a list indicating the coordinates of all living cells
	 * @return						a grid where the value at index i,j is equal to the number 
	 * 								of living neighbors that an empty cell is adjacent to
	 */
	private int[][] getNextGenGrid(ArrayList<int[]> currentLivingCells) {
		int[][] nextGrid = new int[SIZE][SIZE];
		/* 
		 * Iterate through all currently living cells and test to see if there 
		 * are any empty neighbors surrounding them. If so, increment that count 
		 * on the  nextGrid. This will be used to determine if cells are able to be birthed
		 */
		for(int i = 0; i < currentLivingCells.size(); i++) {
			int[] currCoord = currentLivingCells.get(i);
			int R = currCoord[0];
			int C = currCoord[1];
			for(int j = R-1; j <= R+1; j++) {
				for(int k = C-1; k <= C+1; k++) {
					// If the cell is not the original and it is actually in bounds and not a living cell...
					if((j < SIZE && k < SIZE && j >= 0 && k >= 0) && !grid[j][k].isAliveNow()) {
						nextGrid[j][k]++;
					}
				}
			}
		}
		return nextGrid;
	}
	/**
	 * Given a grid containing the number of living neighbors for empty cells, generate
	 * a list of coordinates indicating cells that need to be birthed after the current
	 * gen deaths occur.
	 * Used by the cellsToBeBirthed method
	 * 
	 * @param nextGenGrid	a grid where the value at index i,j is equal to the number 
	 * 						of living neighbors that an empty cell is adjacent to
	 * @return				a list of coordinates indicating cells that need to be birthed 
	 * 						after the current gen deaths occur.
	 */
	private ArrayList<int[]> getNextGenCoords(int[][] nextGenGrid) {
		ArrayList<int[]> nextGenCoords = new ArrayList<int[]>();
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(nextGenGrid[i][j] == 3) {
					nextGenCoords.add(new int[] {i,j});
				}
			}
		}
		return nextGenCoords;
	}
	/**
	 * This method will update the grid to reflect the changes defined earlier
	 * Used by the oneGeneration method
	 * 
	 * @param cellsToBeKilled	a list of coordinates indicating the cells to die at the beginning of this generation 
	 * @param cellsToBeBirthed	a list of coordinates indicating cells that need to be birthed 
	 * 							after the current gen deaths occur.
	 */
	private void updateBoard(ArrayList<int[]> cellsToBeKilled, ArrayList<int[]> cellsToBeBirthed) {
		for(int i = 0; i < cellsToBeKilled.size(); i++) {
			int[] curr = cellsToBeKilled.get(i);
			grid[curr[0]][curr[1]].setAliveNow(false);
		}
		for(int i = 0; i < cellsToBeBirthed.size(); i++) {
			int[] curr = cellsToBeBirthed.get(i);
			grid[curr[0]][curr[1]].setAliveNow(true);
		}
	}
}

