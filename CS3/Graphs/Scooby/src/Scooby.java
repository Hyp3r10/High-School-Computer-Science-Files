import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Scooby {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("Data/scooby.dat"));
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numTimes; i++) {
			TreeMap<String, HashSet<String>> graph = new TreeMap<String, HashSet<String>>();
			// Instantiate the graph
			Scanner in = new Scanner(scan.nextLine());
			while(in.hasNext()) {
				// Parse the current pair into left and right
				String[] line = in.next().split("");
				// First to second
				HashSet<String> tempSet = (graph.containsKey(line[0])) ? graph.get(line[0]) : new HashSet<String>();
				tempSet.add(line[1]);
				graph.put(line[0], tempSet);
				// Second to first
				tempSet = (graph.containsKey(line[1])) ? graph.get(line[1]) : new HashSet<String>();
				tempSet.add(line[0]);
				graph.put(line[1], tempSet);
			}
			// Get the start and end
			String[] line = scan.nextLine().split("");
			// Search for a path
			HashSet<String> searched = new HashSet<String>();
			if(graph.keySet().contains(line[0]) && graph.keySet().contains(line[1])) {
				System.out.println(dfs(line[1], line[0], graph, searched) ? "yes" : "no");
			}
			else {
				System.out.println("no");
			}
		}
	}
	/**
	 * Searches the graph using a DFS algorithm starting from the current location, grabbing all neighbors
	 * and then searching those neighbors as far as possible before going to the next node.
	 * @param end		The Key of the end of the query
	 * @param curr		The Key of the current element being queried
	 * @param graph		The graph representing Nodes and Edges
	 * @param visited	A Set of all previously visited Nodes (keys)
	 * @return			Whether or not a path from the starting current node could be found to the end node
	 */
	public static boolean dfs(String end, String curr, TreeMap<String, HashSet<String>> graph, HashSet<String> visited) {
		if(curr.equals(end)) {
			return true;
		}
		if(!visited.contains(curr)) {
			visited.add(curr);
			HashSet<String> toSearch = graph.get(curr);
			for(String search : toSearch) {
				boolean found = dfs(end, search, graph, visited);
				if(found) {
					return true;
				}
			}
		}
		return false;
	}
}
