import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	/**
	 * Default constructor that creates the symbols object as an
	 * empty Stack and the exp object as an empty String
	 */
	public SyntaxChecker() {
		this.exp = "";
		this.symbols = new Stack<Character>();
	}
	/**
	 * Overloaded constructor that initializes the exp to be equal to
	 * the passed String object s. Then call the setExpression method
	 * @param s	A String denoting the expression
	 */
	public SyntaxChecker(String s) {
		this.exp = exp;
		this.symbols = new Stack<Character>();
		this.setExpression(this.exp);
	}
	public void setExpression(String s) {
		this.exp = s;
		// Create a List representation of the input
		List<Character> asList = new ArrayList<Character>();
		String[] arr = s.split("");
		for(String temp : arr) {
			asList.add(temp.charAt(0));
		}
		// Ignoring non Syntactic characters, instantiate the symbols Stack
		ListIterator<Character> temp = asList.listIterator();
		while(temp.hasNext()) {
			Character curr = temp.next();
			if(this.isSyntactical(curr)) {
				symbols.push(curr);
			}
		}
	}
	/**
	 * Helper method that tests to see if a Character passed is a valid
	 * syntactical character of either {(<[ or })>]
	 * @param c	The Character that is in question
	 * @return	True if the character is syntactical or false if it is not
	 */
	private boolean isSyntactical(Character c) {
		return c.equals('{') || c.equals('(') || c.equals('<') || c.equals('[') 
				|| c.equals(']') || c.equals('>') || c.equals(')') || c.equals('}'); 
	}
	/**
	 * Traverses through the symbols Stack and checks to see if the input 
	 * maintains proper syntax.
	 * @return	True if the input maintains proper syntax or false if it does not.
	 */
	public boolean checkExpression() {
		Stack<Character> close = new Stack<Character>();
		while(!symbols.isEmpty()) {
			Character curr = symbols.pop();
			if(this.isClose(curr)) {
				close.push(curr);
			}
			else {
				Character alternative = null;
				switch(curr) {
					case '{' : {
						alternative = '}';
						break;
					}
					case '(' : {
						alternative = ')';
						break;
					}
					case '<' : {
						alternative = '>';
						break;
					}
					case '[' : {
						alternative = ']';
						break;
					}
				}
				if(close.isEmpty() || !close.pop().equals(alternative)) {
					return false;
				}
			}
		}
		return close.isEmpty();
		
	}
	/**
	 * Helper method used to determine if a Syntactical character is the 
	 * closing version of its kind.
	 * @param c	The Character in question
	 * @return	True if c is the closed variant of a syntactical character
	 */
	private boolean isClose(Character c) {
		return c.equals(']') || c.equals('>') || c.equals(')') || c.equals('}'); 
	}
	public String toString() {
		return this.exp + " is " + (this.checkExpression() ? "correct" : "incorrect") + "\n";
	}
}