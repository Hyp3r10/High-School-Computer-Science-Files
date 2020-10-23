
public class IntTreeNode {
	public int val;
	public IntTreeNode left, right;
	public IntTreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
	public IntTreeNode(int val, IntTreeNode left, IntTreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
