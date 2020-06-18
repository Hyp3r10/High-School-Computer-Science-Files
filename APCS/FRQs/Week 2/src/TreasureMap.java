public class TreasureMap 
{ 
	private boolean[][] myGrid;   // myGrid[r][c] being true indicates a treasure at (r, c) 
	// the matrix is sized by the constructor
	// constructor                             
	public TreasureMap(boolean [][] map)
	{
		myGrid = map;
	}

	// part (a)
	// returns true if the cell at location (row, col)
	// contains a treasure;
	// returns false if location (row, col) is not within
	// the bounds of the grid or if there is no treasure 
	// at that location 
	public boolean hasTreasure(int row, int col)
	{   
		if(row > 0 && row <= numRows()) {
			if(col > 0 && col <= numCols()) {
				return myGrid[row][col];
			}
		}
		return false;
	}

	// part (b)
	// precondition:    0 <= row < NumRows(); 0 <= col < NumCols()
	// returns a count of the number of treasures in the
	// cells adjacent to the location (row, col),
	// horizontally, vertically, and diagonally
	public int numAdjacent(int row, int col)
	{   
		int count = 0;
		for(int i = row-1; i <= row+1; i++) {
			for(int k = col-1; k <= col+1; k++) {
				if(hasTreasure(i,k)) {
					count++;
				}
			}
		}
		if(hasTreasure(row,col)) {
			count--;
		}
		return count;
	}


	// returns the number of rows in the treasure map 
	public int numRows()
	{   
		return myGrid.length;
	}


	// returns the number of columns in the treasure map
	public int numCols()
	{
		return myGrid[0].length;
	}

}