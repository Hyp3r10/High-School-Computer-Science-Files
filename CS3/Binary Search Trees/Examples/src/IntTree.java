
public class IntTree {
	private IntTreeNode overallRoot;
	/**
	 * Prints the Tree in a in-order traversal
	 */
	public void print() {
		print(this.overallRoot);
	}
	/**
	 * Private helper method for the print method that is 
	 * recursively called in order to traverse the tree in-order
	 * @param root	The current node being looked at
	 */
	private void print(IntTreeNode root) {
		if(root != null) {
			print(root.left);
			System.out.print(root.val + " ");
			print(root.right);
		}
	}
	public boolean contains(int val) {
		return contains(this.overallRoot, val);
	}
	private boolean contains(IntTreeNode root, int val) {
		if(root != null) {
			if(root.val == val) {
				return true;
			}
			else {
				return contains(root.left, val) || contains(root.right, val);
			}	
		}
		else {
			return false;
		}
	}
}
