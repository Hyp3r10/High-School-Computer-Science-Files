public class GrayImage
{
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	/** The 2-dimensional representation of this image. Guaranteed not to be null.
	 * All values in the array are within the range [BLACK, WHITE], inclusive.
	 */
	private int[][] pixelValues;

	public GrayImage(int[][] p)
	{
		pixelValues = p;
	}

	/*******************/
	/* Part (A)        */
	/*******************/
	/** @return the total number of white pixels in this image.
	 * Postcondition: this image has not been changed.
	 */
	public int countWhitePixels()
	{
		int count = 0;
		for(int[] temp : pixelValues) {
			for(int num : temp) {
				if(num == WHITE) {
					count++;
				}
			}
		}
		return count;
	}

	/*******************/
	/* Part (B)        */
	/*******************/
	/** Processes this image in row-major order and decreases the value of each pixel at
	 * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
	 * Resulting values that would be less than BLACK are replaced by BLACK.
	 * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
	 */
	public void processImage()
	{
		for(int r = 0; r < pixelValues.length; r++) {
			for(int c = 0; c < pixelValues[r].length; c++) {
				if(r+2 < pixelValues.length && c+2 < pixelValues[r+2].length) {
					pixelValues[r][c] -= pixelValues[r+2][c+2];
				}
				if(pixelValues[r][c] < BLACK) {
					pixelValues[r][c] = BLACK;
				}
			}
		}
	}

	public String toString()
	{
		String str = "";

		for(int r = 0; r < pixelValues.length; r++)
		{
			for(int c = 0; c < pixelValues[r].length; c++)
			{
				str += String.format("%4d", pixelValues[r][c]);
			}
			str += "\n";
		}

		return str;
	}
}