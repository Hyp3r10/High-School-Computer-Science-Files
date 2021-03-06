import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	public int x, y, ID;		// The location of this vertex at (x,y) with unique ID
	public List<Integer> edges;	// The list of connecting Vertices
	public boolean visited;		// Whether or not this vertex has been visited in the current iteration
	public double distance;		// The distance to some point, that gets updated over time
	/**
	 * Constructs a Vertex object such that it represents the 
	 * unique ID at the point (x,y)
	 * @param x		The x coordinate of the Vertex
	 * @param y		The y coordinate of the Vertex
	 * @param ID	The ID of this Vertex
	 */
	public Vertex(int ID, int x, int y) {
		this.x = x;
		this.y = y;
		this.ID = ID;
		edges = new ArrayList<Integer>();
		visited = false;
		distance = Double.POSITIVE_INFINITY;
	}
	/**
	 * Calculates the distance between this Vertex and the other Vertex
	 * @param other	The Other vertex
	 * @return		The distance between this and other
	 */
	public double getDistanceTo(Vertex other) {
		return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
	}
	/**
	 * Sets the distance of this Vertex to be equal to the distance to the passed Vertex
	 * @param other	The other vertex
	 */
	public void setDistanceTo(Double distance) {
		this.distance = distance;
	}
	/**
	 * Updates this vertex's measure of having been visited to the passed value of visited
	 * @param visited	Whether or not this vertex has been visited
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	/**
	 * Adds the passed Vertex, other, to the list of edges
	 * @param other
	 */
	public void addEdge(int other) {
		this.edges.add(other);
	}
	@Override
	public int compareTo(Vertex other) {
		return Double.compare(this.distance, other.distance);
	}
	@Override
	public String toString() {
		return "" + this.ID + ",\t(" + this.x + ", " + this.y + "),\t" + this.visited + ",\t" + String.format("%.1f", this.distance);
	}
}
