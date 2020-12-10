import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Dijkstra {
	public Graph graph;	// The Graph object of this Dijkstra object
	/**
	 * Sets this object's graph field to be equal to the passed Graph object
	 * @param graph
	 */
	public Dijkstra(Graph graph) {
		this.graph = graph;
	}
	/**
	 * Runs Dijkstra's algorithm on the current graph, getting the shortest 
	 * distance from the source node to every other node, and then runs a
	 * bfs starting from the destination node back to the source node
	 * adding the smallest additional node to the stack of shortest path
	 * until we are looking at the source node.
	 * @param source		The starting location 
	 * @param destination	The ending location
	 */
	private void dijkstra(int source, int destination) {
		// Grab the lsit of vertices from the grpah object
		Vertex[] vertices = graph.vertices;
		// Set the source node to have a distance of 0.0
		vertices[source].setDistanceTo(0.0);
		// Use a priority queue to determine what vertices need to be searched
		PriorityQueue<Vertex> toSearch = new PriorityQueue<Vertex>();
		// Add the initial vertex to the priority queue
		toSearch.add(vertices[source]);
		// Search the graph until the queue is empty
		while(!toSearch.isEmpty()) {
			// Grab the current vertex that we are looking at
			Vertex curr = toSearch.poll();
			// Grab all of the edges that this vertex connects to
			List<Integer> edges = curr.edges;
			// Set the current vertex as visited
			curr.setVisited(true);
			// Output the fact that we are processing this vertex
			System.out.println("process node " + curr.ID + " (dist " + String.format("%.1f", curr.distance) + ")");
			// Search all of the edges of the current vertex
			for(Integer node : edges) {
				// If they haven't been visited before (already determined shortest path)...
				if(!vertices[node].visited) {
					/* ... and the current temporary distance at that node is greater than the new distance 
					 * that would be created if we were to go from this vertex to the current edge vertex...
					 */
					if(vertices[node].distance > vertices[node].getDistanceTo(curr) + curr.distance) { 
						// Then update the current edge's distance to be reflective of the change
						vertices[node].setDistanceTo(curr.distance + curr.getDistanceTo(vertices[node]));
						// Output that we are relaxing this current edge
						System.out.println("\tlower " + node + " to " + String.format("%.1f", vertices[node].distance));
						// And add this edge to the list of Vertices that need to be searched
						toSearch.add(vertices[node]);
					}
				}
			}
		}
		// Create a stack used to get the path from the destination vertex to the source vertex
		Stack<Vertex> pathFromExit = new Stack<Vertex>();
		// Grab the destination vertex
		Vertex curr = vertices[destination];
		// Search until we reach the source vertex
		while(curr.ID != source) {
			// Add the current vertex to the path
			pathFromExit.add(curr);
			// Some variables to determine the lowest insertion
			double lowestDistance = Double.MAX_VALUE;
			int lowestLocation = -1;
			// Search the edges of the current vertex
			for(int temp : curr.edges) {
				// If this current edge has a shorter distance than the current lowest distance
				if(vertices[temp].distance <= lowestDistance) {
					// Update the variables
					lowestDistance = vertices[temp].distance;
					lowestLocation = temp;
				}
			}
			// Update the current node (to search) to be the vertex that gives us the lowest added distnace
			curr = vertices[lowestLocation];
		}
		// Add the source node to the path
		pathFromExit.add(curr);
		// Print out the path to the exit
		System.out.println("\nShortest path from " + source + " to " + destination + ":");
		String output = "";
		while(!pathFromExit.isEmpty()) {
			output += pathFromExit.pop().ID + " -> ";
		}
		System.out.println(output.substring(0, output.length()-4));
	}
	/**
	 * Runs Dijkstra's Algorithm on the test case. Replace "input6.txt" 
	 * with a different file name to test a different set of input.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("input6.txt"));
		Graph tester = new Graph(scan);
		Dijkstra d = new Dijkstra(tester);
		d.dijkstra(scan.nextInt(), scan.nextInt());
	}
}
