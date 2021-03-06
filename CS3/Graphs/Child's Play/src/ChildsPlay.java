import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ChildsPlay {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("play.dat"));
		int numTimes = scan.nextInt();
		while(numTimes-->0) {
			int n = scan.nextInt(); // Number of Dominos 
			int m = scan.nextInt(); // Domino pairs
			int l = scan.nextInt(); // Test cases 
			HashMap<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
			// Front load the graph
			for(int i = 1; i <= n; i++) {
				graph.put(i, new HashSet<Integer>());
			}
			// read in the domino pairs (directed)
			while(m-->0) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				HashSet<Integer> tempSet = graph.get(x);
				tempSet.add(y);
				graph.put(x, tempSet);
			}
			// read in the Dominos being pushed over
			while(l-->0) {
				System.out.println(pushOver(scan.nextInt(), graph, new HashSet<Integer>(), 0));
			}
		}
	}
	/**
	 * Takes a given domino number, pushes it over, add the current domino to the 
	 * visited and increase the count, and then searches the touching dominos
	 * to see what they would knock over.
	 * @param curr		The current domino
	 * @param graph		The graph of dominos
	 * @param visited	The list of dominos that have already been pushed over
	 * @param count		The current number of dominos that have been pushed over
	 * @return			The total number of dominos that have been pushed over so far
	 */
	public static int pushOver(Integer curr, HashMap<Integer, HashSet<Integer>> graph, HashSet<Integer> visited, int count) {
		if(!visited.contains(curr)) {
			count++;
			visited.add(curr);
			for(Integer visit : graph.get(curr)) {
				count = pushOver(visit, graph, visited, count);
			}
		}
		return count;
	}
}
