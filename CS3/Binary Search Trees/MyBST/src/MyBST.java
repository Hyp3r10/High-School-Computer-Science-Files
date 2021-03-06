import java.util.NoSuchElementException;

public class MyBST {
	/**
	 * Private class that handles the node aspect of the
	 * Binary Search Tree.
	 */
	private class BSTNode {
		public Integer val;
		public BSTNode left, right;
		public BSTNode(Integer val) {
			this.val = val;
			left = right = null;
		}
		@Override
		public String toString() { return "" + this.val; }
	}
	/**
	 * A reference to the overall root node in the tree
	 */
	public BSTNode root;
	/**
	 * A reference to the size of the tree. Should be the same
	 * as the size() method. Calling this variable will retrieve
	 * the size of the tree in O(1) while size() will retrieve 
	 * the size of the tree in O(n)
	 */
	public int size;
	/**
	 * Public pair of size that calls the private pair.
	 * Calculates and returns the size of the tree.
	 * @return	The size of the BST
	 */
	public int size() {
		return this.size(this.root);
	}
	/**
	 * Private pair of size that recursively searches the BST
	 * for nodes and calculates and returns the size.
	 * @param root	The current node being searched
	 * @return		The size of the BST
	 */
	private int size(BSTNode root) {
		if(root == null) {
			return 0;
		}
		else {
			return 1 + size(root.left) + size(root.right);
		}
	}
	/**
	 * Public pair of insert that calls the private pair.
	 * Inserts the passed integer, n, into the BST while
	 * still satisfying the conditions of a BST
	 * @param n	The element being added
	 */
	public void insert(Integer n) {
		this.root = this.insert(n, this.root);
	}
	/**
	 * Private pair of insert that calls itself recursively.
	 * Inserts the passed integer, n, into the BST by finding
	 * where in the BST it satisfies the conditions of a BST.
	 * Increases the local size variable for constant retrieval.
	 * @param val	The value to insert into the BST
	 * @param root	The current node being searched
	 * @return		The new BST with the new element added
	 */
	private BSTNode insert(Integer val, BSTNode root) {
		if(root == null) {
			root = new BSTNode(val);
			this.size++;
		}
		else {
			if(val < root.val) {
				root.left = insert(val, root.left);
			}
			else if(val > root.val) {
				root.right = insert(val, root.right);
			}
		}
		return root;
	}
	/**
	 * Public pair of contains that calls the private pair.
	 * Determines if the passed value, val, is contained
	 * within the BST
	 * @param val	The element being searched for
	 * @return		Whether or not the element was found
	 */
	public boolean contains(Integer val) {
		return this.contains(this.root, val);
	} 
	/**
	 * Private pair of contains that calls itself recursively
	 * until the given element is found or determined to not
	 * be contained within the BST
	 * @param root	The current node bing searched
	 * @param val	The value being searched for
	 * @return		Whether or not the element was found
	 */
	private boolean contains(BSTNode root, Integer val) {
		if(root != null) {
			if(root.val == val) {
				return true;
			}
			else {
				if(val < root.val) {
					return contains(root.left, val);
				}
				return contains(root.right, val);
			}
		}
		return false;
	}
	/**
	 * Public pair of getMax that calls the private pair.
	 * Calculates and returns the largest element in the BST
	 * @return	The largest element in the BST
	 * @throws NoSuchElementException
	 */
	public int getMax() throws NoSuchElementException {
		if(this.root == null) {
			throw new NoSuchElementException();
		}
		return this.getMax(this.root);
	}
	/**
	 * Private pair of getMax that calls itself recursively
	 * as far right as it can go until it hits a non-existent
	 * node and returns the current value.
	 * @param root	The current node
	 * @return		The largest value in the BST
	 */
	private int getMax(BSTNode root) {
		if(root.right == null) {
			return root.val;
		}
		else {
			return this.getMax(root.right);
		}
	}
	/**
	 * Public pair of getMin that calls the private pair.
	 * Calculates and returns the smallest element in the BST
	 * @return	The smallest element in the BST
	 * @throws NoSuchElementException
	 */
	public int getMin() throws NoSuchElementException {
		if(this.root == null) {
			throw new NoSuchElementException();
		}
		return this.getMin(this.root);
	}
	/**
	 * Private pair of getMin that calls itself recursively
	 * as far left as it can go until it hits a non-existent
	 * node and returns the current value.
	 * @param root	The current node
	 * @return		The smallest value in the BST
	 */
	private int getMin(BSTNode root) {
		if(root.left == null) {
			return root.val;
		}
		else {
			return this.getMin(root.left);
		}
	}
	/**
	 * Public pair of delete that calls the private pair.
	 * Removes the specified element, n, from the BST
	 * @param n	The element to be removed. 
	 */
	public void delete(Integer n) {
		this.root = this.delete(this.root, n);
	}
	/**
	 * Private pair of delete that calls itself recursively.
	 * Removes the integer specified. Has special instructions for
	 * 0, 1, or 2 children of the specified element.
	 * @param root	The current node being searched
	 * @param n		The value being searched for
	 * @return		The new BST with the specified element removed
	 */
	private BSTNode delete(BSTNode root, Integer n) {
		if(root == null) {
			return root;
		}
		else if(n < root.val) {
			root.left = this.delete(root.left, n);
		}
		else if(n > root.val) {
			root.right = this.delete(root.right, n);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				// replace the current value of the root with 
				// the greatest node from the left sub-tree
				root.val = this.getMin(root.right); 
				// Delete the greatest value from the left sub-tree
				root.right = delete(root.right, root.val);
			} 
		}
		return root;
	}
	/**
	 * Public pair of inOrder that calls the private pair.
	 * Prints the contents of the BST in a in-order traversal
	 */
	public void inOrder() {
		String output = inOrder(this.root, "").replaceAll(" ", ", ");
		output = "[" + output.substring(0, output.length()-2) + "]";
		System.out.println(output);
	}
	/**
	 * Private pair of inOrder that calls itself recursively
	 * in order to traverse the tree in-order manner.
	 * @param root	The current node being looked at
	 */
	private String inOrder(BSTNode root, String output) {
		if(root != null) {
			output = inOrder(root.left, output);
			output += (root.val + " ");
			output = inOrder(root.right, output);
		}
		return output;
	}
	/**
	 * Public pair of print that calls the private pair.
	 * Prints the contents of the BST in a "tree like" 
	 * format. 
	 */
	public void print() {
		this.print(this.root, 0);
	}
	/**
	 * Private pair of print that calls itself recursively
	 * searching as far right as possible, then printing the
	 * current node, and then searching as far right as possible
	 * @param root	The current node
	 * @param level	The level of the current node 
	 */
	private void print(BSTNode root, Integer level) {
		if(root != null) {
			// Search the right node
			this.print(root.right, level + 1); 
			// Print the current node
			for(int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			System.out.print(root.val + "\n");
			// Search the left node
			this.print(root.left, level + 1);
		}
	}
}