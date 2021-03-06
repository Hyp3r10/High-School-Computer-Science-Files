public class Tour {
	public static void main(String[] args) {
		//define 4 points forming a square
		//		Point a = new Point(100.0, 100.0);
		//		Point b = new Point(500.0, 100.0);
		//		Point c = new Point(500.0, 500.0);
		//		Point d = new Point(100.0, 500.0);
		//		Tour squareTour = new Tour(a, b, c, d);
		//		squareTour.show();
		//		System.out.println(squareTour.distance());
		//		StdDraw.setXscale(0, 600);
		//		StdDraw.setYscale(0, 600);
		//		squareTour.draw();
	}

	/**
	 * @author MatthewSheldon
	 * This class represents a link of Nodes of Point object types.
	 */
	private class Node {
		public Point p;
		public Node next;
		/**
		 * Constructor that sets p to be equal to the passed Point object.
		 * Sets the next variable to be equal to null;
		 * @param p	The passed Point object
		 */
		public Node(Point p) {
			this.p = p;
			this.next = null;
		}
	}

	/**
	 * Stores the first element in the LinkedList data structure
	 */
	public Node head;

	/**
	 * Stores the size of the LinkedList disregarding the loop
	 */
	private int size;

	/** create an empty tour */
	public Tour() {
		this.head = null;
		this.size = 0;
	}

	/** create a four-point tour, for debugging */
	public Tour(Point a, Point b, Point c, Point d) {
		this.insertInOrder(a,b,c,d);
	}

	/** print tour (one point per line) to std output */
	public void show() {
		Node temp = this.head;
		while(temp != null) {
			System.out.println(temp.p);
			temp = temp.next;
		}
	}

	/** draw the tour using StdDraw */
	public void draw() {
		Node pred = this.head;
		Node succ = pred.next;
		// Draw a line between points until the next element equals the null.
		while(succ != null) {
			pred.p.drawTo(succ.p);
			pred = succ;
			succ = pred.next;
		}
		// Include the line from the last element to the first.
		pred.p.drawTo(this.head.p);
	}

	/** return number of nodes in the tour */
	public int size() {
		return this.size;
	}

	/** return the total distance "traveled", from start to all nodes and back to start */
	public double distance() {
		double distance = 0.0;
		Node pred = this.head;
		Node succ = pred.next;
		// Add up the distance until the next element equals the null.
		while(succ != null) {
			distance += pred.p.distanceTo(succ.p);
			pred = succ;
			succ = pred.next;
		}
		// Include the distance from the last element to the first.
		distance += pred.p.distanceTo(this.head.p);
		return distance;
	}
	/** helper method to the parameterized constructor for instantiating all of the points */
	private void insertInOrder(Point...points) {
		size = points.length;
		this.head = new Node(points[0]);
		Node temp = this.head;
		for(int i = 1; i < points.length; i++) {
			temp.next = new Node(points[i]);
			temp = temp.next;
		}
		temp = this.head;
	}
	/** insert p using nearest neighbor heuristic */
	public void insertNearest(Point p) {
		if(size == 0) {
			this.head = new Node(p);
			this.head.next = null;
		}
		else {
			// Determine which node is closest to the passed Point p
			Node nearestNodeToP = null;
			double nearestDistanceToP = Double.MAX_VALUE;
			Node temp = this.head;
			while(temp != null) {
				double distance = p.distanceTo(temp.p);
				if(distance < nearestDistanceToP) {
					nearestDistanceToP = distance;
					nearestNodeToP  = temp;
				}
				temp = temp.next;
			}
			// Insert the node p after the nearestNodeToP
			temp = nearestNodeToP.next;
			Node nodeP = new Node(p); nodeP.next = temp;
			nearestNodeToP.next = nodeP;
		}
		this.size++;
	}
	
	public void insertSmallest(Point p) {
		// If this is the first element being inserted, add it at the front.
		if(this.size == 0) {
			this.head = new Node(p);
			this.head.next = null;
		}
		else {
			/*
			 * Iterate through the LinkedList inserting the point p at every index
			 * 
			 * As it is iterating, store the smallest distance of the graph
			 * 
			 * For each index visited, if the distance of the graph when the point p
			 * is added at the index is less than the current smallest distance, store the
			 * index of where p is currently being stored.
			 * 
			 * Regardless of whether or not the distance created when P is added at the index
			 * it currently is, reset the chain of Nodes to be what it used to be.
			 * 
			 * At the end of iterating through the list, add the Point p where the smallest 
			 * distance is created stored in index.
			 */
			double smallestDeltaDistance = Double.MAX_VALUE;
			Node smallestPred = this.head;
			Node smallestSucc = this.head;
			Node temp = this.head;
			Node pAsNode = new Node(p);
			// Find the index where we need to insert P into for the smallest delta distance of the graph
			while(temp != null) {
				// Store the original state of the temporary Node's next value
				Node tempNext = temp.next;
				// Temporarily insert the element P into the linked list for calculations
				pAsNode.next = tempNext;
				temp.next = pAsNode;
				// Calculate the distance with P where it currently is
				double distance = this.distance();
				// If we have a smaller change in distance than a different node, change what
				// index we will insert p to
				if(distance < smallestDeltaDistance) {
					smallestPred = temp;
					smallestSucc = tempNext;
					smallestDeltaDistance = distance;
				}
				// Reset the LinkedList to its original state
				temp.next = tempNext;
				// Advance the search by changing the node that we are currently looking at
				temp = temp.next;
			}
			// Insert the Point p into the LinkedList where delta distance is the smallest
			pAsNode.next = smallestSucc;
			smallestPred.next = pAsNode;
		}
		this.size++;
	}
}