import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ProblemF {
	public static int numNodes;
	public static long shortestDistance = Integer.MAX_VALUE;
	public static Stack<Integer[]> shortestPath;
	public static HashMap<Integer[], HashMap<Integer[], Integer>> graph;
	public static Integer[] startLoc;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		while(numTimes-->0) {
			int xSize = scan.nextInt();
			int ySize = scan.nextInt();
			int startX = scan.nextInt();
			int startY = scan.nextInt();
			startLoc = new Integer[] {startX, startY};
			int numLoc = scan.nextInt();
			
			ArrayList<Integer[]> locations = new ArrayList<Integer[]>();
			locations.add(startLoc);
			for(int i = 0; i < numLoc; i++) {
				locations.add(new Integer[] {scan.nextInt(), scan.nextInt()});
			}
			numNodes = locations.size();
			
			graph = new HashMap<Integer[], HashMap<Integer[], Integer>>();
			for(Integer[] loc : locations) {
				HashMap<Integer[], Integer> connections = new HashMap<Integer[], Integer>();
				HashSet<Integer[]> listOfConnections = new HashSet<Integer[]>(locations);
				listOfConnections.remove(loc);
				for(Integer[] temp : listOfConnections) {
					connections.put(temp, calculatDistance(loc, temp));
				}
				graph.put(loc, connections);
			}
			
			getAns();
			System.out.println(shortestDistance);
		}
	}
	
	public static void getAns() {
		HashMap<Integer[], Integer> startVisited = new HashMap<Integer[], Integer>();
		Stack<Integer[]> startPath = new Stack<Integer[]>();
		startPath.push(startLoc);
		
		Queue<Query> toSearch = new LinkedList<Query>();
		Query start = new Query(startVisited, startPath, 0);
		toSearch.add(start);
		while(!toSearch.isEmpty()) {
			Query curr = toSearch.poll();
			Stack<Integer[]> currPath = curr.getCurrPath();
			HashMap<Integer[], Integer> visited = copy(curr.getVisited());
			long currDistance = curr.getCurrDistance();
			
			Integer[] currLoc = currPath.peek();
			if(currPath.size() == numNodes + 1 && equals(currLoc, startLoc)) {
				if(currDistance < shortestDistance) {
					shortestDistance = currDistance;
					shortestPath = copy(currPath);
				}
			}
			else {
				visited.put(currLoc, 1);
				HashMap<Integer[], Integer> edges = graph.get(currLoc);
				for(Integer[] node : edges.keySet()) {
					if(visited.containsKey(node) && !equals(node, startLoc)) {
						
					}
					else {
						Stack<Integer[]> newPath = copy(currPath);
						newPath.push(node);
						currDistance += graph.get(currLoc).get(node);
						Query q = new Query(visited, newPath, currDistance);
						currDistance -= graph.get(currLoc).get(node);
						toSearch.add(q);
					}
				}
			}
		}
	}
	
	public static Stack<Integer[]> copy(Stack<Integer[]> original) {
		Stack<Integer[]> dup = new Stack<Integer[]>();
		for(Integer[] temp : original) {
			dup.push(temp);
		}
		return dup;
	}
	
	public static HashMap<Integer[], Integer> copy(HashMap<Integer[], Integer> original) {
		HashMap<Integer[], Integer> dup = new HashMap<Integer[], Integer>();
		for(Integer[] temp : original.keySet()) {
			dup.put(temp, original.get(temp));
		}
		return dup;
	}
	
	public static boolean equals(Integer[] loc1, Integer[] loc2) {
		return (loc1[0] == loc2[0]) && (loc1[1] == loc2[1]);
	}
	
	public static int calculatDistance(Integer[] loc1, Integer[] loc2) {
		return Math.abs(loc1[0] - loc2[0]) + Math.abs(loc1[1] - loc2[1]);
	}
}
class Query {
	private HashMap<Integer[], Integer> visited;
	private Stack<Integer[]> currPath;
	private long currDistance;
	public Query(HashMap<Integer[], Integer> visited, Stack<Integer[]> currPath, long currDistance) {
		this.visited = visited;
		this.currPath = currPath;
		this.currDistance = currDistance;
	}
	public HashMap<Integer[], Integer> getVisited() {
		return this.visited;
	}
	public Stack<Integer[]> getCurrPath() {
		return this.currPath;
	}
	public long getCurrDistance() {
		return this.currDistance;
	}
	public String toString() {
		return "" + this.currDistance;
	}
}
