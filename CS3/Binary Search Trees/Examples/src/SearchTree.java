import java.util.NoSuchElementException;

public class SearchTree {
	public IntTreeNode overallRoot;

	public boolean contians(int val) {
		return this.contains(this.overallRoot, val);
	} 
	private boolean contains(IntTreeNode root, int val) {
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

	public void add(int val) {
		this.overallRoot = this.add(this.overallRoot, val);
	}
	private IntTreeNode add(IntTreeNode root, int val) {
		if(root == null) {
			root = new IntTreeNode(val);
		}
		else if(val < root.val) {
			root.left = add(root.left, val);
		}
		else if(val > root.val) {
			root.right = add(root.right, val);
		}
		return root;
	}
	
	public int getMin() throws NoSuchElementException {
		if(this.overallRoot == null) {
			throw new NoSuchElementException();
		}
		return this.getMin(this.overallRoot);
	}
	private int getMin(IntTreeNode root) {
		if(root.left == null) {
			return root.val;
		}
		else {
			return this.getMin(root.left);
		}
	}
}
