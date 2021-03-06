public class GemList {
	public static void main(String [] args) {
		GemList list = new GemList();
		System.out.println(list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.9);		

		list.insertBefore(new Gem(GemType.BLUE, 10), 0);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.8);

		list.insertBefore(new Gem(GemType.BLUE, 20), 99);  //not a mistake, should still work
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.7);

		list.insertBefore(new Gem(GemType.ORANGE, 30), 1);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.6);

		list.insertBefore(new Gem(GemType.ORANGE, 10), 2);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.5);

		list.insertBefore(new Gem(GemType.ORANGE, 50), 3);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.4);

		list.insertBefore(new Gem(GemType.GREEN, 50), 2);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.3);		
	}	
	/**
	 * A reference to the first element in the list
	 */
	public Node head;
	/**
	 * A reference to the last element in the list
	 */
	public Node tail;
	/**
	 * Stores the size of the LinkedList
	 */
	public int size;
	/**
	 * This class acts as a node for holding the current Gem and the next Gem
	 * @author MatthewSheldon
	 */
	private class Node {
		public Gem gem;
		public Node next;
		/**
		 * Default constructor that sets the current gem to be null
		 */
		public Node() {
			this.gem = null;	
		}
		/**
		 * Overloaded constructor that sets the current gem to be equal to the passed gem
		 * @param gem
		 */
		public Node(Gem gem) {
			this.gem = gem;
		}
		@Override
		public String toString() {
			return "" + this.gem.toString();
		}
	}
	/**
	 * Default constructor that sets head to null
	 */
	public GemList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	/**
	 * Returns the number of gems in the list
	 * @return	The number of gems in the list
	 */
	public int size() {
		return this.size;
	}
	/**
	 * Draw all of the current gems in the list at y
	 * @param y	The y-coordinate to draw the gems at
	 */
	public void draw(double y) {
		Node curr = this.head;
		int index = 0;
		while(curr != null) {
			curr.gem.draw(GemGame.indexToX(index), y);
			curr = curr.next;
			index++;
		}
	}
	/**
	 * Insert the given gem before the 0-based index
	 * @param gem		The gem to insert
	 * @param index		The index to insert the gem into
	 */
	public void insertBefore(Gem gem, int index) {
		this.size++;
		if(index >= size) {
			index = size-1;
		}
		// If we are adding to the first index, change the link in header
		if(index == 0) {
			Node temp = this.head;
			this.head = new Node(gem);
			this.head.next = temp;
		}
		// Else, find the predecessor and change its link
		else {
			// Store the current node
			Node pred = this.head;
			Node succ = pred.next;
			while(index != 1) {
				index--;
				succ = succ.next;
				pred = pred.next;
			}
			Node temp = new Node(gem);
			temp.next = succ;
			pred.next = temp;
		}
	}
	/**
	 * Calculates the total score of the list
	 * @return	The total score of the list
	 */
	public int score() {
		int score = 0;
		if(this.size != 0) {
			Node curr = this.head;
			GemType currType = this.head.gem.getType();
			int count = 0;
			int tempScore = 0;
			while(curr != null) {
				Gem currGem = curr.gem;
				// If the current gem is of the same type as the previous one, add the score and increase the count
				if(currGem.getType() == currType) {
					count++;
					tempScore += currGem.getPoints();
				}
				// If we have run into a different gem, add the tempScore to score and start a new set of the same type
				else {
					currType = curr.gem.getType();
					score += (tempScore * count);
					tempScore = currGem.getPoints();
					count = 1;
				}
				curr = curr.next;
			}
			score += (tempScore * count);
		}
		return score;
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if(this.size() == 0) {
			output.append("<none>");
		}
		else {
			Node curr = this.head;
			while(curr != null) {
				output.append(curr.toString() + " " + curr.gem.getPoints() +" -> ");
				curr = curr.next;
			}
			output.delete(output.length()-4, output.length()-1);

		}
		return output.toString();
	}
}
