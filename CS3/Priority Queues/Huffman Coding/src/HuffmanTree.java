import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
/**
 * This class acts as the Node for the tree being built in HuffmanTree
 * @author MatthewSheldon
 */
class Node implements Comparable<Node> {
	/**
	 * This enumeration is just a representation of whether 
	 * or not the current Node is a leaf or internal element
	 * @author MatthewSheldon
	 */
	enum Type {
		LEAF, INTERNAL;
	}
	public Character character;	// The character of this node
	public Integer weight;		// The weight of this tree
	public Node left, right;	// The left and right nodes of this node
	public Type type;			// If the node is a leaf or an internal node
	/**
	 * Constructs a Node object with the passed character and weight
	 * @param character	The character of this node 
	 * @param weight	The weight of this node
	 */
	public Node(Character character, Integer weight) {
		this.character = character;
		this.weight = weight;
		this.left = null;
		this.right = null;
		this.type = Type.LEAF;
	}
	/**
	 * Update the right node of this node to be the passed
	 * value of right. Update the weight and change the type.
	 * @param right	The node that is being added to the right
	 * 				of the current node
	 */
	public void updateRight(Node right) {
		this.weight += right.weight;
		this.right = right;
		this.type = Type.INTERNAL;
	}
	/**
	 * Update the left node of this node to be the passed
	 * value of left. Update the weight and change the type.
	 * @param left	The node that is being added to the left
	 * 				of the current node
	 */
	public void updateLeft(Node left) {
		this.weight += left.weight;
		this.left = left;
		this.type = Type.INTERNAL;
	}
	/**
	 * Determines if the current node is a leaf
	 * @return	If the current node is a leaf
	 */
	public boolean isLeaf() { return this.type == Type.LEAF; }
	@Override
	public int compareTo(Node other) {
		return this.weight.compareTo(other.weight);
	}
	@Override
	public String toString() {
		return "" + (this.isLeaf() ? "" + (char) this.character : this.weight);
	}
}
/**
 * This class acts as the tree used for encoding and 
 * decoding the message into a more compressed version
 * @author MatthewSheldon
 */
public class HuffmanTree {
	public Node root;	// The element at the root of the tree
	/**
	 * Constructs a HuffmanTree with the passed counts of
	 * characters and the number of occurrences that there are
	 * @param count	An array of integers where the index i indicates
	 * 				the ASCII value of a character and the value
	 * 				at the index indicates the number of occurrences
	 */
	public HuffmanTree(int[] count) {
		PriorityQueue<Node> nodes = new PriorityQueue<Node>();
		for(int i = 0; i < count.length; i++) {
			int numCharacters = count[i];
			if(numCharacters > 0) {
				nodes.add(new Node((char) i, numCharacters));
			}
		}
		nodes.add(new Node((char) 256, 1));
		while(nodes.size() != 1) {
			Node newNode = new Node(null, 0);
			newNode.updateLeft(nodes.poll());
			newNode.updateRight(nodes.poll());
			nodes.add(newNode);
		}
		this.root = nodes.poll();
	}
	/**
	 * Writes the Huffman encoding tree in a file using 
	 * a standard format to the specified filename
	 * @param filename	The name of the file to output the 
	 * 					decoder of the current HuffmanTree
	 */
	public void write(String filename) {
		try {
			PrintWriter out = new PrintWriter(new File(filename));
			this.recursiveSearch(out, this.root, "");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Helper method that recursively searches the HuffmanTree searching 
	 * as far left as possible and then printing the current element 
	 * followed by going right.
	 * @param out	The PrintWriter used to output to a file 
	 * @param curr	The current node being searched 
	 * @param path	The current path represented as a string of 1's and 0's
	 */
	private void recursiveSearch(PrintWriter out, Node curr, String path) {
		if(curr != null) {
			this.recursiveSearch(out, curr.left, path+"0");
			if(curr.isLeaf()) {
				out.println((int) curr.character);
				out.println(path);
			}
			this.recursiveSearch(out, curr.right, path+"1");
		}
	}
}
