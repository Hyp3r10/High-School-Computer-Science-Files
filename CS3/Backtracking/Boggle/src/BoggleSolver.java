import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class BoggleSolver
{
	public HashSet<String> dictionary;	// The dictionary of all of the words
	public HashSet<String> prefixes; 	// Longest prefixes of all of the words (used for saving time) 

	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A - Z.)
	public BoggleSolver(String dictionaryName)
	{
		try {
			Scanner scan = new Scanner(new File(dictionaryName));
			this.dictionary = new HashSet<String>();
			while(scan.hasNext()) {
				this.dictionary.add(scan.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} 

	// Returns the set of all valid words in the given Boggle board, as an Iterable object
	public Iterable<String> getAllValidWords(BoggleBoard board)
	{
		HashSet<String> words = new HashSet<String>();
		int rows = board.rows();
		int cols = board.cols();
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				words = this.getWordsStartingFromRC(r, c, new boolean[rows][cols], words, "", board);
			}
		}
		return words;
	}
	/**
	 * Recursively checks all neighboring elements, marking them as visited, and appending the current
	 * character to the current "word." Checks to see if the current word is in the dictionary, if so, 
	 * add the current word to the words set. 
	 * @param r			The current row
	 * @param c			The current column
	 * @param visited	A boolean representation of the board determining if a given cell has already been visited
	 * @param words		A HashSet of Strings containing the current words on the board
	 * @param curr		The current String that has been created by all previous calls of this method
	 * @param board		The BoggleBoard object used for determining bounds and characters at a given index
	 * @return			
	 */
	private HashSet<String> getWordsStartingFromRC(int r, int c, boolean[][] visited, HashSet<String> words, String curr, BoggleBoard board) {
		boolean[][] newVisited = clone(visited);
		// If the current index is in bounds and we haven't visited it before
		if(this.inBounds(r, c, board) && !visited[r][c]) {
			char tempChar = board.getLetter(r, c);
			// Append the current character to the word
			curr += (tempChar != 'Q') ? tempChar : "QU";
			// Mark the cell as visited
			newVisited[r][c] = true;
			// If the current word is a valid dictionary word and it is not already in the set
			if(this.dictionary.contains(curr)) {
				words.add(curr);
			}
			// Search the neighbors
			words = getWordsStartingFromRC(r-1, c-1, newVisited, words, curr, board);	// Top left
			words = getWordsStartingFromRC(r-1, c, newVisited, words, curr, board);	// Top middle
			words = getWordsStartingFromRC(r-1, c+1, newVisited, words, curr, board);	// Top right
			words = getWordsStartingFromRC(r, c-1, newVisited, words, curr, board);	// Middle left
			words = getWordsStartingFromRC(r, c+1, newVisited, words, curr, board);	// Middle right
			words = getWordsStartingFromRC(r+1, c-1, newVisited, words, curr, board);	// Bottom left
			words = getWordsStartingFromRC(r+1, c, newVisited, words, curr, board);	// Bottom middle
			words = getWordsStartingFromRC(r+1, c+1, newVisited, words, curr, board);	// Bottom right
			// return the updated set of words
			return words;
		}
		else {
			// return the unmodified set of words
			return words;
		}
	}
	/**
	 * Checks to see if the passed (r,c) pair is in bounds in the passed board
	 * @param r		The row of the current cell
	 * @param c		The column of the current cell
	 * @param board	The BoggleBoard object that contains the size of the board
	 * @return		If (r,c) is in bounds
	 */
	private boolean inBounds(int r, int c, BoggleBoard board) {
		return (0 <= r && r < board.rows() && 0 <= c && c < board.cols());
	} 
	/**
	 * Clones the oldVisited boolean map into a new one to prevent memory linking
	 * @param oldVisited	The original visited map
	 * @return				A copy of the original visited map
	 */
	private boolean[][] clone(boolean[][] oldVisited) {
		boolean[][] newVisited = new boolean[oldVisited.length][oldVisited[0].length];
		for(int i = 0; i < oldVisited.length; i++) {
			for(int j = 0; j < oldVisited[0].length; j++) {
				newVisited[i][j] = oldVisited[i][j];
			}
		}
		return newVisited;
	}
	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A - Z.)
	public int scoreOf(String word)
	{
		int length = word.length();
		if(length <= 2) { return 0; }
		else if(length <= 4) { return 1; }
		else if(length == 5) { return 2; }
		else if(length == 6) { return 3; }
		else if(length == 7) { return 5; }
		else { return 11; }
	}

	public static void main(String[] args) {
		System.out.println("WORKING");

		final String PATH   = "./data/";
		BoggleBoard  board  = new BoggleBoard(PATH + "board-q.txt");
		BoggleSolver solver = new BoggleSolver(PATH + "dictionary-algs4.txt");

		int totalPoints = 0;

		for (String s : solver.getAllValidWords(board)) {
			System.out.println(s + ", points = " + solver.scoreOf(s));
			totalPoints += solver.scoreOf(s);
		}

		System.out.println("Score = " + totalPoints); //should print 84

		//new BoggleGame(4, 4);
	}

}
