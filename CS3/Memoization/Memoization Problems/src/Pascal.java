import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Pascal {
	/**
	 * This class handles a positions row and column number
	 * We use this class because you can't store in a Map an
	 * array of integers because it doesn't implement Comparable
	 */
	class Node implements Comparable<Node> {
		public long r, c;	// Represents this node's position in the pascal's triangle
		/**
		 * Constructs a Node object at (r,c)
		 * @param r	This node's row 
		 * @param c	This node's column
		 */
		public Node(long r, long c) {
			this.r = r;
			this.c = c;
		}
		@Override
		public int compareTo(Node other) {
			if(this.r == other.r && this.c == other.c) { return 0; }
			else if(this.r < other.r) { return -1; }
			else if(this.r > other.r) { return 1; }
			else {
				if(this.c < other.c) { return -1; }
				else { return 1; }
			}
		}
	}
	public TreeMap<Node, Long> memo;			// This is the TreeMap that stores the previous values of the pascal's triangle
	public TreeMap<Long, List<Long>> pascal;	// This represents a Row pointing to all of the values on that row (used for printing)
	/**
	 * Constructs a new Pascal's Triangle object and front-loads the first row (special case) 
	 */
	public Pascal() {
		memo = new TreeMap<Node, Long>();
		memo.put(new Node(0, 0), 1L);
		pascal = new TreeMap<Long, List<Long>>();
		List<Long> tempList = new ArrayList<Long>();
		tempList.add(1L);
		pascal.put(0L, tempList);
	}
	/**
	 * Returns the value in the Pascal's triangle at (row,col)
	 * Uses memoization to only calculate a given location's value once
	 * @param row	The row of the query 
	 * @param col	The column of the query 
	 * @return		The value at (row,col)
	 */
	public long pascal(long row, long col) {
		if(!pascal.containsKey(row)) {
			this.generateRow(row);
		}
		Node loc = new Node(row, col);
		if(row == 0L || col == 0L || col == (long) row+1) {
			return 1L;
		}
		if(row < 0L || col < 0L) {
			return 0L;
		}
		if(memo.containsKey(loc)) {
			return memo.get(loc);
		} 
		else {
			long result = pascal(row-1, col-1) + pascal(row-1, col);
			memo.put(loc, result);
			return result;
		}

	}
	/**
	 * Generates an entire row of a Pascal's triangle (if not already created)
	 * Used for speeding up calculations in the long-run.
	 * @param row	The row that is being generated
	 */
	private void generateRow(long row) {
		// Can't generate any rows that don't exist
		if(row < 0L) {
			return;
		}
		// Generate any previously ungenerated rows first
		if(row-1 >= 0L && !pascal.containsKey(row-1)) {
			this.generateRow(row-1);
		}
		// Now generate this row
		List<Long> listForRow = new ArrayList<Long>();
		// The first node will always be 1 
		Node startNode = new Node(row, 0L);
		memo.put(startNode, 1L);
		listForRow.add(1L);
		// Row 0 and row 1 are special cases, as they don't have any internal nodes
		for(long i = 1L; i < row; i++) {
			Node internalNode = new Node(row, i);
			long val = memo.get(new Node(row-1, i)) + memo.get(new Node(row-1, i-1));
			memo.put(internalNode, val);
			listForRow.add(val);
		}
		// The last node (row 0 is a special case as it only has 1 node)
		if(row > 0L) {
			Node endNode = new Node(row, row);
			memo.put(endNode, 1L);
			listForRow.add(1L);
		}
		// Add the row to the pascal's triangle map
		this.pascal.put(row, listForRow);
	}
	/**
	 * Prints the requested row to the console
	 * Generates any rows necessary to print this row
	 * @param row	The row in question
	 */
	public void printPascalRow(long row) {
		String output = "";
		if(!pascal.containsKey(row)) {
			this.generateRow(row);
		}
		List<Long> numsOnRow = pascal.get(row);
		for(Long temp : numsOnRow) {
			output += temp + " ";
		}
		System.out.println(output.trim());
	}
}
