import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumberOfTriangles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();
		for(long i = 0; i < t; i++) {
			long N = scan.nextLong();
			long B1 = scan.nextLong();
			long B2 = scan.nextLong();
			long numberOfEdges = N;
			// If the edges are adjacent, subtract 3 edges.
			if(B1+1 == B2 || B1-1 == B2 || B2+1 == B1 || B2-1 == B1) {
				numberOfEdges -= 3;
			}
			else {
				numberOfEdges -= 4;
			}
			
		}
	}
}
class Step implements Comparable<Step>{
    public Character node;
    public List<Character> visited;
    public long totalTriangles;
    
    public Step(Character node) {
        this.node = node;
        visited = new ArrayList<Character>();
    }
    public Step moveTo(Character node, Graph graph) {
        Step newStep = new Step(node);
        newStep.visited = new ArrayList<Character>(this.visited);
        newStep.visited.add(this.node);
        newStep.totalTriangles = this.totalTriangles + graph.edges.get(node).get(this.node);
        return newStep;
    }
    public List<Step> neighbors(Graph graph) {
        List<Step> neighbors = new ArrayList<Step>();
        for(Character neighbor : graph.edges.get(this.node).keySet()) {
            neighbors.add(this.moveTo(neighbor, graph));
        }
        return neighbors;    
    }
    public int compareTo(Step other) {
        return Integer.compare(this.visited.size(), other.visited.size());
    }
}
class Graph {
    public Set<Character> nodes;
    public Map<Character, Map<Character, Integer>> edges;
    public Graph() {
        nodes = new HashSet<Character>();
        edges = new HashMap<Character, Map<Character, Integer>>();
    }
    public void addNode(Character node) {
        nodes.add(node);
    }
    public void addEdge(Character nodeA, Integer weight, Character nodeB) {
        if(!edges.containsKey(nodeA)) {
            edges.put(nodeA, new HashMap<Character, Integer>());
        }
        edges.get(nodeA).put(nodeB, weight);
        if(!edges.containsKey(nodeB)) {
            edges.put(nodeB, new HashMap<Character, Integer>());
        }
        edges.get(nodeB).put(nodeA, weight);
    }
}
