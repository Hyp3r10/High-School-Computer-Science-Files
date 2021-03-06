import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class BinaryMaze {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("maze3.txt"));
		// Size of the maze
		int r = scan.nextInt(); int c = scan.nextInt();
		// Will handle the graph aspect of this "maze"
		TreeMap<Node, TreeSet<Node>> graph = new TreeMap<Node, TreeSet<Node>>();
		// Front load the board as 2D Array
		int[][] grid = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				grid[i][j] = scan.nextInt();
			}
		}
		// Search the board and add the neighbors of the 
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(grid[i][j] == 1) {
					TreeSet<Node> neighbors = new TreeSet<Node>();
					// Search the neighbors
					@SuppressWarnings("unused")
					boolean trash = (inBounds(i-1, j, r, c)) && (grid[i-1][j] == 1) ? neighbors.add(new Node(i-1, j)) : false;
					trash = (inBounds(i+1, j, r, c)) && (grid[i+1][j] == 1) ? neighbors.add(new Node(i+1, j)) : false;
					trash = (inBounds(i, j-1, r, c)) && (grid[i][j-1] == 1) ? neighbors.add(new Node(i, j-1)) : false;
					trash = (inBounds(i, j+1, r, c)) && (grid[i][j+1] == 1) ? neighbors.add(new Node(i, j+1)) : false;
					// Set the current node (key) to have the neighbors as their value in the graph
					graph.put(new Node(i, j), neighbors);
				}
			}
		}
		// Get the values of the start and end nodes
		int startR = scan.nextInt();
		int startC = scan.nextInt();
		int endR = scan.nextInt();
		int endC = scan.nextInt();
		// Get the solution (represented as a stack of Nodes from (startR, startC) --> (endR, endC))
		System.out.println(bfs(startR, startC, endR, endC, graph, new TreeSet<Node>()).size()-1);
	}
	/**
	 * Determines if the passed coordinate pair of (r,c) is contained 
	 * within the bounds of maxR and maxC
	 * @param r		The r coordinate in question
	 * @param c		The c coordinate in question
	 * @param maxR	The top bound of r
	 * @param maxC	The top bound of c
	 * @return		If (r,c) is in bounds
	 */
	private static boolean inBounds(int r, int c, int maxR, int maxC) {
		return r < maxR && r >= 0 && c < maxC && c >= 0;
	}
	/**
	 * Searches for a path from (startR, startC) to (endR, endC) in a BFS manner
	 * @param currR		The starting row
	 * @param currC		The starting column
	 * @param endR		The target row
	 * @param endC		The target column
	 * @param graph		The graph that has all Nodes and neighbors of the nodes
	 * @param visited	The list of Nodes that have previously been visited
	 * @return			The smallest number of steps needed to take to go from (startR, startC) to (endR, endC)
	 */
	public static Stack<Node> bfs(int currR, int currC, int endR, int endC, TreeMap<Node, TreeSet<Node>> graph, TreeSet<Node> visited) {
		Queue<Stack<Node>> toSearch = new LinkedList<Stack<Node>>();
		Node start = new Node(currR, currC);
		Node end = new Node(endR, endC);
		Stack<Node> tempStack = new Stack<Node>();
		tempStack.add(start);
		toSearch.add(tempStack);
		while(!toSearch.isEmpty()) {
			Stack<Node> currStack = toSearch.poll();
			Node curr = currStack.peek();
			if(curr.equals(end)) {
				return currStack;
			}
			if(!visited.contains(curr)) {
				visited.add(curr);
				for(Node search : graph.get(curr)) {
					Stack<Node> newStack = clone(currStack);
					newStack.add(search);
					toSearch.add(newStack);
				}
			}
 		}
		return new Stack<Node>();
	}
	/**
	 * Clones the passed stack and returns a copy of it
	 * @param stack	The original stack
	 * @return		The copied stack
	 */
	private static Stack<Node> clone(Stack<Node> stack) {
		Stack<Node> backwards = new Stack<Node>();
		while(!stack.isEmpty()) {
			backwards.push(stack.pop());
		}
		Stack<Node> newStack = new Stack<Node>();
		while(!backwards.isEmpty()) {
			Node curr = backwards.pop();
			stack.push(curr);
			newStack.push(curr);
		}
		return newStack;
	}
}
class Node implements Comparable<Node> {
	public int r, c;	// Handles the location of this node on the grid
	/**
	 * Constructs a Node object with the passed coordinate pair (r,c)
	 * @param r	The r component
	 * @param c	The c component	
	 */
	public Node(int r, int c) {
		this.r = r;
		this.c = c;
	}
	/**
	 * Tests to see if two nodes are identical
	 * @param other	The other Node object in question
	 * @return		Whether or not the two nodes are the same
	 */
	public boolean equals(Node other) {
		return (this.r == other.r) && (this.c == other.c);
	}
	@Override
	public int compareTo(Node other) {
		if(this.equals(other)) {
			return 0;
		}
		else {
			if(this.r < other.r) {
				return -1;
			}
			else if(this.r > other.r) {
				return 1;
			}
			else {
				if(this.c < other.c) {
					return -1;
				}
				else {
					return 1;
				}
			}
		}
	}
	@Override
	public String toString() {
		return "(" + this.r + ", " + this.c + ")";
	}
}