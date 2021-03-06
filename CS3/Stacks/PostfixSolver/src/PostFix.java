import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostFix {
	private Stack<Double> stack;
	private String expression;
	/**
	 * Default constructor that initializes the stack variable to be equal
	 * to an empty Stack object and sets the expression variable to be null
	 */
	public PostFix() {
		this.stack = new Stack<Double>();
		this.expression = null;
	}
	/**
	 * Overloaded constructor that initializes the stack variable to be equal
	 * to an empty Stack object and sets the expression variable to be equal to exp
	 * @param exp	A String representation of the input 
	 */
	public PostFix(String exp) {
		this.stack = new Stack<Double>();
		this.expression = exp;
	}
	/**
	 * Sets the global variable expression to be equal to exp
	 * @param exp	A String representation of the input
	 */
	public void setExpression(String exp) {
		this.expression = exp;
		this.solve();
	}
	/**
	 * Returns the solution to the postfix expression
	 * @param one	the first value
	 * @param two	the second value
	 * @param op	the operator to apply to the first and second values
	 * @return		the result of the operation of one op two
	 */
	public double calc(double one, double two, char op) {
		switch(op) {
			case '+' : {
				return two + one;
			}
			case '-' : {
				return two - one;
			}
			case '*' : {
				return two * one;
			}
			case '/' : {
				return two / one;
			}
		}
		return Double.NaN;
	}
	/**
	 * Traverses through the stack stopping to do an operation when it 
	 * has two elements in the numbers stack
	 */
	public void solve() {
		stack = new Stack<Double>();
		String[] arr = this.expression.split(" ");
		for(String temp : arr) {
			if(!this.isOperand(temp)) {
				stack.add(Double.parseDouble(temp));
			}
			else {
				double one = stack.pop();
				double two = stack.pop();
				stack.push(this.calc(one, two, temp.charAt(0)));
			}
		}
	}
	/**
	 * Helper method that tests if the current element is an operand or not 
	 * @param curr	The element in question
	 * @return		True of the element is an operand and false if it is not
	 */
	private boolean isOperand(String curr) {
		return curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/");
	}
	//add a toString
	public String toString() {
		return this.expression + " = " + stack.pop(); 
	} 
}