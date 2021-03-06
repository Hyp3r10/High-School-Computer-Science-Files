import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Graph {
	public int V, E;			// The number of vertices and edges in this graph
	public Vertex[] vertices; 	// The list of vertices in this graph
	/**
	 * Constructs the graph reading in from the input stream passed
	 * @param scan	The input stream that is being read from
	 */
	public Graph(Scanner scan) {
		V = scan.nextInt();
		E = scan.nextInt();
		vertices = new Vertex[V];
		for(int i = 0; i < V; i++) {
			vertices[i] = new Vertex(scan.nextInt(), scan.nextInt(), scan.nextInt());
		}
		for(int i = 0; i < E; i++) {
			int currIndex = scan.nextInt();
			int endIndex = scan.nextInt();
			Vertex curr = this.vertices[currIndex];
			curr.addEdge(endIndex);
			this.vertices[currIndex] = curr;
			curr = this.vertices[endIndex];
			curr.addEdge(currIndex);
			this.vertices[endIndex] = curr;
		}
	}
	/**
	 * Returns the distance between the two points
	 * @param from	The starting location	(x1,y1)
	 * @param to	The ending location		(x2,y2)
	 * @return		The distance between (x1,y1) and (x2,y2)
	 */
	public double distance(int from, int to) {
		return this.vertices[from].getDistanceTo(vertices[to]);
	}
	@Override
	public String toString() {
		String output = "";
		for(Vertex v : this.vertices) {
			output += v + ": " + v.edges + "\n";
		}
		return output;
	}
	public static void main(String[] args) throws IOException {
		Graph tester = new Graph(new Scanner(new File("input6.txt")));
		System.out.println(tester);
	}
}
