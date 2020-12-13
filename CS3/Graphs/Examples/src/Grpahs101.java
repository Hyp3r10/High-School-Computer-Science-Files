import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Grpahs101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numElements = scan.nextInt(); scan.nextLine();
		HashMap<String, HashSet<String>> graph = new HashMap<String, HashSet<String>>();
		while(numElements-->0) {
			String[] line = scan.nextLine().split(" ");
			// first node --> second node
			if(graph.containsKey(line[0])) {
				HashSet<String> tempSet = graph.get(line[0]);
				tempSet.add(line[1]);
				graph.put(line[0], tempSet);
			}
			else {
				HashSet<String> tempSet = new HashSet<String>();
				tempSet.add(line[1]);
				graph.put(line[0], tempSet);
			}
			// second node --> first node
			if(graph.containsKey(line[1])) {
				HashSet<String> tempSet = graph.get(line[1]);
				tempSet.add(line[0]);
				graph.put(line[1], tempSet);
			}
			else {
				HashSet<String> tempSet = new HashSet<String>();
				tempSet.add(line[0]);
				graph.put(line[1], tempSet);
			}
		}
		String[] line = scan.nextLine().split(" ");
		System.out.println(dfs(graph, line[0], line[1], new HashSet<String>()) ? "Path was found" : "Path was not found");
	}
	// DFS / BFS
	public static boolean dfs(HashMap<String, HashSet<String>> graph, String curr, String end, HashSet<String> visited) {
		System.out.println(curr);
		if(visited.contains(curr)) {
			return false;
		}
		if(curr.equals(end)) {
			return true;
		}
		else {
			visited.add(curr);
			HashSet<String> neighbors = graph.get(curr);
			for(String temp : neighbors) {
				if(dfs(graph, temp, end, visited)) {
					return true;
				}
			}
			return false;
		}
	}
}
