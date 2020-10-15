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
		do {
			System.out.println(temp.p);
			temp = temp.next;
		} while(temp != this.head);
	}

	/** draw the tour using StdDraw */
	public void draw() {
		Node pred = this.head;
		Node succ = pred.next;
		// Draw a line between points until the next element equals the beginning.
		while(succ != this.head) {
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
		// Add up the distance until the next element equals the beginning.
		while(succ != this.head) {
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
			Node pAsNode = new Node(p);
			this.head = pAsNode;
			pAsNode.next = this.head;
		}
		else {
			// Determine which node is closest to the passed Point p
			Node nearestNodeToP = null;
			double nearestDistanceToP = Double.MAX_VALUE;
			Node temp = this.head;
			while(temp != this.head) {
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
	/** insert p using smallest increase heuristic 
	 *  Version II -- Incredibly fast and finds the shortest path,
	 *  but a different shortest path than most other peopele's.
	 */
	public void insertSmallest(Point p) {
		// Make p a Node object
		Node pAsNode = new Node(p);
		// If this is the first time adding an element
		if(this.size == 0) {
			this.head = pAsNode;
			// Make this a circular linked list
			pAsNode.next = this.head;
		}
		else {
			// Use temp as the node to iterate through the CLL
			Node temp = this.head;
			// Use smallestSucc to store the node that we are inserting the new node before
			Node smallestSucc = this.head;
			// Iterate through the CLL size number of indexes
			for(int i = 0; i < this.size; i++) {
				/*
				 * This distance represents the distance from the proposed new node's two neighbors
				 * The first part gets the distance from the current node to the new node
				 * The second part gets the distance from the current node's neighbor to the new node
				 * The third part gets the distance from the current node to the neighbor
				 * 
				 * Add the first two to represent the chain created from the current node, to the new node, 
				 * to the neighbor node, then subtract the distance that was originally factored into from
				 * the current node to the neighbor node. This last part is important because it is the difference
				 * from the insertNearest method in the sense that it takes into consideration the node's neighbor.
				 */
				double distance1 = temp.p.distanceTo(p) + temp.next.p.distanceTo(p) - temp.p.distanceTo(temp.next.p);
				// Repeat the above calculations, except with the currently smallest node to insert into (used for determinging new smallest node)
				double distance2 = smallestSucc.p.distanceTo(p) + smallestSucc.next.p.distanceTo(p) - smallestSucc.p.distanceTo(smallestSucc.next.p);
				// If the proposed node is shorter than the currently smallest one, replace it. 
				if(distance1 < distance2) {
					smallestSucc = temp;
				}
				// Progress through the loop
				temp = temp.next;
			}
			// Alter the CLL to have the new element's neighbor point to the smallest node's neighbor and then the smallest neighbor point to the new node
			pAsNode.next = smallestSucc.next;
			smallestSucc.next = pAsNode;
		}
		this.size++;
	}
}