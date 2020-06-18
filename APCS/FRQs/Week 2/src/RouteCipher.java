public class RouteCipher
{
	/** A two-dimensional array of single-character strings, instantiated in the constructor */
	private String[][] letterBlock;

	/** The number of rows of letterBlock, set by the constructor */
	private int numRows;

	/** The number of columns of letterBlock, set by the constructor */
	private int numCols;

	public RouteCipher(int r, int c, String s)
	{
		numRows = r;
		numCols = c;
		letterBlock = new String[r][c];
		fillBlock(s);
	}

	/************************/
	/* Part A */
	/************************/
	/** Places a string into letterBlock in row-major order.
	 * @param str the string to be processed
	 * Postcondition:
	 * if str.length() < numRows * numCols, "A" is placed in each unfilled cell
	 * if str.length() > numRows * numCols, trailing characters are ignored
	 */
	private void fillBlock(String str)
	{
		int k = 0; 
		for(int r = 0; r < numRows; r++) {
			for(int c = 0; c < numCols; c++) {
				if(k < str.length()) {
					letterBlock[r][c] = str.substring(k, k+1);
					k++;
				}
				else {
					letterBlock[r][c] = "A";
				}
			}
		}
	}

	/** Extracts encrypted string from letterBlock in column-major order.
	 * Precondition: letterBlock has been filled
	 * @return the encrypted string from letterBlock
	 */
	private String encryptBlock()
	{
		String str = "";

		for(int c = 0; c < numCols; c++)
		{
			for(int r = 0; r < numRows; r++)
			{
				str += letterBlock[r][c] + " ";
			}
		}

		return str;
	}

	// toString
	public String toString()
	{
		String str = "";

		for(int r = 0; r < numRows; r++)
		{
			for(int c = 0; c < numCols; c++)
			{
				str += letterBlock[r][c] + " ";
			}
			str += "\n";
		}

		return str;
	}

}