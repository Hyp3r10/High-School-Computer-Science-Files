import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class TrailOfPrimes {
	public static TreeSet<PrimeNode> primes; 					// A Set of all four digit prime numbers
	public static TreeMap<PrimeNode, TreeSet<PrimeNode>> graph;	// Keeps track of the current graph of prime numbers and their edges
	/**
	 * Calculates the shortest path between two prime integers following the following rules:
	 * 		1. You may only alter one digit per step
	 * 		2. Every step must lead to another prime number
	 * Type "stop" to stop querying
	 */
	public static void main(String[] args) {
		// Get the list of 4 digit prime numbers
		generateFourDigitPrimeNumbers();
		// Generate the graph
		generateGraph();
		// Get input
		Scanner scan = new Scanner(System.in);
		System.out.print("Input\t: ");
		String line = scan.nextLine();
		while(!line.equals("stop")) {
			Scanner in = new Scanner(line);
			PrimeNode start = new PrimeNode(in.nextInt());
			PrimeNode end = new PrimeNode(in.nextInt());
			// Solve the graph
			System.out.println("Output\t: " + (bfs(start, end).size()-1) + "\n");
			System.out.print("Input\t: ");
			line = scan.nextLine();
		}
	}
	/**
	 * Searches for a path from start to end in a BFS manner
	 * @param start	The starting prime number
	 * @param end	The ending prime number
	 * @return		The smallest number of steps needed to take to go from start to end
	 */
	public static Stack<PrimeNode> bfs(PrimeNode start, PrimeNode end) {
		Queue<Stack<PrimeNode>> toSearch = new LinkedList<Stack<PrimeNode>>();
		Stack<PrimeNode> tempStack = new Stack<PrimeNode>();
		TreeSet<PrimeNode> visited = new TreeSet<PrimeNode>();
		tempStack.add(start);
		toSearch.add(tempStack);
		while(!toSearch.isEmpty()) {
			Stack<PrimeNode> currStack = toSearch.poll();
			PrimeNode curr = currStack.peek();
			if(curr.equals(end)) {
				return currStack;
			}
			if(!visited.contains(curr)) {
				visited.add(curr);
				for(PrimeNode search : graph.get(curr)) {
					Stack<PrimeNode> newStack = clone(currStack);
					newStack.add(search);
					toSearch.add(newStack);
				}
			}
 		}
		return new Stack<PrimeNode>();
	}
	/**
	 * Clones the passed stack and returns a copy of it
	 * @param stack	The original stack
	 * @return		The copied stack
	 */
	private static Stack<PrimeNode> clone(Stack<PrimeNode> stack) {
		Stack<PrimeNode> backwards = new Stack<PrimeNode>();
		while(!stack.isEmpty()) {
			backwards.push(stack.pop());
		}
		Stack<PrimeNode> newStack = new Stack<PrimeNode>();
		while(!backwards.isEmpty()) {
			PrimeNode curr = backwards.pop();
			stack.push(curr);
			newStack.push(curr);
		}
		return newStack;
	}
	/**
	 * Generates the graph of 4 digit prime numbers
	 */
	public static void generateGraph() {
		Queue<PrimeNode> toSearch = new LinkedList<PrimeNode>();
		graph = new TreeMap<PrimeNode, TreeSet<PrimeNode>>();
		toSearch.addAll(primes);
		while(!toSearch.isEmpty()) {
			PrimeNode curr = toSearch.poll();
			TreeSet<PrimeNode> neighbors = getOneDiff(curr);
			graph.put(curr, neighbors);
		}
	}
	/**
	 * Generates a Set of PrimeNodes that are one off of the current PrimeNode
	 * and is contained within the list of 4 digit prime numbers
	 * @param curr	The PrimeNode in question
	 * @return		The set of PrimeNodes that are one off of the current PrimeNode
	 */
	private static TreeSet<PrimeNode> getOneDiff(PrimeNode curr) {
		TreeSet<PrimeNode> neighbors = new TreeSet<PrimeNode>();
		for(PrimeNode temp : primes) {
			if(curr.getNumDifference(temp) == 1) {
				neighbors.add(temp);
			}
		}
		return neighbors;
	}
	/**
	 * Generates a Set of 4-digit Prime numbers
	 */
	public static void generateFourDigitPrimeNumbers() {
		// Generate prime numbers from 2 ... 9999
		Queue<Integer> original = new LinkedList<Integer>();
		for(int i = 2; i <= 9999; i++) {
			original.add(i);
		}
		Queue<Integer> primesQueue = new LinkedList<Integer>();
		while(!original.isEmpty()) {
			// Add the first value in the queue (P, the next prime) to the queue of primes
			int P = original.remove();
			primesQueue.add(P);
			// Iterate through the queue, eliminating numbers divisible by the P that 
			// can't be primes while leaving numbers not divisible by P
			Queue<Integer> temp = new LinkedList<Integer>();
			while(!original.isEmpty()) {
				Integer curr = original.poll();
				boolean trash = curr%P == 0 ? false : temp.add(curr);
			}
			original = temp;
		}
		// Only add all 4 digit numbers
		primes = new TreeSet<PrimeNode>();
		while(!primesQueue.isEmpty()) {
			int curr = primesQueue.poll();
			if(("" + curr).length() == 4) {
				primes.add(new PrimeNode(curr));
			}
		}
	}
}
class PrimeNode implements Comparable<PrimeNode> {
	public int[] num;	// Handles this PrimeNode's number
	/**
	 * Constructs a PrimeNode object with the passed number num
	 * @param num	The number that this PrimeNode represents
	 */
	public PrimeNode(int num) {
		this.num = new int[4];
		String[] temp = ("" + num).split("");
		int i = 0;
		for(String curr : temp) {
			this.num[i++] = Integer.parseInt(curr);
		}
	}
	/**
	 * Tests to see if two PrimeNodes are identical
	 * @param other	The other PrimeNode object in question
	 * @return		Whether or not the two PrimeNodes are the same
	 */
	public boolean equals(PrimeNode other) {
		for(int i = 0; i < 4; i++) {
			if(other.num[i] != this.num[i]) {
				return false;
			}
		}
		return true;
	}
	@Override
	public int compareTo(PrimeNode other) {
		return Integer.compare(this.getIntRepresentation(), other.getIntRepresentation());
	}
	/**
	 * Returns the current PrimeNode object as it's integer representation
	 * @return	The integer representation of the current PrimeNode
	 */
	private int getIntRepresentation() {
		return (1000*num[0]) + (100*num[1]) + (10*num[2]) + (num[3]);
	}
	/**
	 * Calculates and returns the number of numbers that are different 
	 * between this and the other PrimeNode objects
	 * @param other	The other PrimeNode object
	 * @return		The number of numbers that are different
	 */
	public int getNumDifference(PrimeNode other) {
		int diff = 0;
		for(int i = 0; i < 4; i++) {
			if(other.num[i] != this.num[i]) {
				diff++;
			}
		}
		return diff;
	}
	@Override
	public String toString() {
		return "" + this.num[0] + this.num[1] + this.num[2] + this.num[3];
	}
}