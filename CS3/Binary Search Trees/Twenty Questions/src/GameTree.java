import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class GameTree {
	/**
	 * Used to differentiate answers from questions.
	 */
	enum Type {
		ANSWER, QUESTION;
	}
	/**
	 * Private class that handles the node aspect of the
	 * Binary Search Tree.
	 */
	private class GameTreeNode {
		public String data;					// The String values that it is holding
		public Type type;					// Whether or not the node is a question or answer
		public GameTreeNode yes, no;		// The children of the current node
		public GameTreeNode() {}			// Default constructor used for instantiation of the game
		// Used to get the type of data that this node is
		public boolean isQuestion() { return this.type == Type.QUESTION; }
		// String representation of the current node
		public String toString() { return this.data; }	
		// Used to change the current node in a short method
		public void changeData(String data) {
			if(data.contains("?")) { this.type = Type.QUESTION; } 
			else { this.type = Type.ANSWER; }
			this.data = data;
		}
	}
	/**
	 * A reference to the overall root node in the tree
	 */
	public GameTreeNode root;
	/**
	 * A reference to the current node in the BST
	 */
	private GameTreeNode curr;
	/**
	 * A reference to the filename that we are working on
	 */
	private String fileName;
	/**
	 * Constructor needed to create the game.
	 *
	 * @param fileName this is the name of the file we need to import the game
	 *                 questions and answers from.
	 */
	public GameTree(String fileName) {
		try {
			Scanner scan = new Scanner(new File(fileName));
			this.fileName = fileName;
			this.root = new GameTreeNode();
			this.instantiateGame(this.root, scan);
			this.curr = this.root;
		} catch (FileNotFoundException s) {
			System.out.println("File does Not Exist Please Try Again: ");
		}
	}

	/**
	 * Helper method that creates a BST from the input file
	 * @param currentNode	A reference to the current node of data (either a question or an answer)
	 * @param scan			A reference to the scanner object used to get the current line of data
	 */
	private void instantiateGame(GameTreeNode currentNode, Scanner scan) {
		// We actually have another line from the file
		if(scan.hasNextLine()) {
			// Pull the current line from the text file into a String object
			String line = scan.nextLine();
			// Set the current element to be equal to the current line from the scanner
			currentNode.changeData(line);
			// If the current node is also a question, search its two children as well
			if(currentNode.isQuestion()) {
				// Create blank yes and no child nodes that will be changed from the recursive building process
				GameTreeNode yesChild = new GameTreeNode();
				GameTreeNode noChild = new GameTreeNode();
				// Change the yes and no children nodes of the current element to be references to those nodes
				currentNode.yes = yesChild;
				currentNode.no = noChild;
				// Recursively build the game doing yes (left) nodes first and then no (right) nodes.
				instantiateGame(yesChild, scan);
				instantiateGame(noChild, scan);
			}
		}
	}

	/*
	 * Add a new question and answer to the currentNode. If the current node has the
	 * answer chicken, theGame.add("Does it swim?", "goose"); should change that
	 * node like this:
	 */
	// -----------Feathers?-----------------Feathers?------
	// -------------/----\------------------/-------\------
	// ------- chicken horse-----Does it swim?-----horse--
	// -----------------------------/------\---------------
	// --------------------------goose--chicken-----------
	/**
	 * @param newQ The question to add where the old answer was.
	 * @param newA The new Yes answer for the new question.
	 */
	public void add(String newQ, String newA) {
		String oldA = curr.data;
		curr.changeData(newQ);
		GameTreeNode yesChild = new GameTreeNode();
		GameTreeNode noChild = new GameTreeNode();
		yesChild.changeData(newA);
		noChild.changeData(oldA);
		curr.yes = yesChild;
		curr.no = noChild;
	}

	/**
	 * True if getCurrent() returns an answer rather than a question.
	 * @return False if the current node is an internal node rather than an answer
	 *         at a leaf.
	 */
	public boolean foundAnswer() {
		return !this.curr.isQuestion(); 
	} 

	/**
	 * Return the data for the current node, which could be a question or an answer.
	 * Current will change based on the users progress through the game. 
	 * @return The current question or answer.
	 */
	public String getCurrent() {
		return this.curr.data;
	}

	/**
	 * Ask the game to update the current node by going left for Choice.yes or right
	 * for Choice.no Example code: theGame.playerSelected(Choice.Yes);
	 * @param yesOrNo
	 */
	public void playerSelected(Choice yesOrNo) {
		if(yesOrNo == Choice.Yes) {
			this.curr = curr.yes;
		} else {
			this.curr = curr.no;
		}
	}

	/**
	 * Begin a game at the root of the tree. getCurrent should return the question
	 * at the root of this GameTree.
	 */
	public void reStart() {
		this.curr = this.root;
	}

	@Override
	public String toString() {
		return this.toString(this.root, 0, "");
	}
	/**
	 * Private pair to toString that allows the program to 
	 * recursively print the BST.
	 * @param root		The current node being searched
	 * @param level		The level of the current node
	 * @param output	The current String representation of the BST
	 * @return			The String representation of the BST
	 */
	private String toString(GameTreeNode root, Integer level, String output) {
		if(root != null) {
			// Search the right node
			output = this.toString(root.no, level + 1, output); 
			// Add the current node
			for(int i = 0; i < level; i++) {
				output += ("- ");
			}
			output += (root.data + "\n");
			// Search the left node
			output = this.toString(root.yes, level + 1, output);
		}
		return output;
	}
	/**
	 * Overwrite the old file for this gameTree with the current state that may have
	 * new questions added since the game started.
	 */
	public void saveGame() {
		try {
			PrintWriter write = new PrintWriter(new File(this.fileName));
			this.saveGame(this.root, write);
			write.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	/**
	 * If the computer looses, it gets smarter. This method will edit the current
	 * text file that it is reading from and replace it with the new version
	 * so that in the future, it knows the answer.
	 * @param root	The current node that we are looking at
	 * @param write	The file that we are writing to
	 */
	private void saveGame(GameTreeNode root, PrintWriter write) {
		if(root != null) {
			write.println(root.data);
			this.saveGame(root.yes, write);
			this.saveGame(root.no, write);
		}
	}
}
