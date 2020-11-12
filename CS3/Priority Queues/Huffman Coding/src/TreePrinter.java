import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class used to print a binary tree of integers, for testing purposes
 * 
 * Borrowed from StackOverflow with minor modifications
 * 
 * To use, call the printNode() method, supplying your tree's overall root.  Example:
 * 
 *    TreePrinter.printNode(tree.getRoot());
 *    
 * where tree is an object of your TreeMethods class, which has a getRoot() method
 */
class TreePrinter 
{
	/** 
	 * print the tree in a tree-like form
	 * @param root the overall root of the tree
	 */
	public static void printTree(Node root) {
		int maxLevel = TreePrinter.maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || TreePrinter.isAllElementsNull(nodes))
			return;

		int floor         = maxLevel - level;
		int endgeLines    = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces   = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		TreePrinter.printWhitespaces(firstSpaces);

		List<Node> newNodes = new ArrayList<>();
		for (Node node : nodes) {
			if (node != null) {
				System.out.print(node);
				newNodes.add(node.left);
				newNodes.add(node.right);
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			TreePrinter.printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				TreePrinter.printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					TreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).left != null)
					System.out.print("/");
				else
					TreePrinter.printWhitespaces(1);

				TreePrinter.printWhitespaces(i + i - 1);

				if (nodes.get(j).right != null)
					System.out.print("\\");
				else
					TreePrinter.printWhitespaces(1);

				TreePrinter.printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private static int maxLevel(Node node) {
		if (node == null)
			return 0;

		return Math.max(TreePrinter.maxLevel(node.left), TreePrinter.maxLevel(node.right)) + 1;
	}

	@SuppressWarnings("rawtypes")
	private static boolean isAllElementsNull(List list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}
}