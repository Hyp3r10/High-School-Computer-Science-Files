import java.util.*;

public class PostFixEvaluator
{
	private String[] test = {"4 5 +",
	                         "3 4 2 * +",
	                         "2 6 * 2 5 * +",
	                         "7 4 + 8 - 3 *",
	                         "2 3 + 4 5 * - 2 1 / +"};

	public PostFixEvaluator()
	{
		for(String exp : test)
		{
			System.out.println(exp + " = " + evaluate(exp));
		}
	}
	/* evaluates the postfix expression exp
	 * @param exp the postfix expression to be evaluated
	 * @return the total of exp
	 *    Precondition: exp is a well-formed postfix expression
	 */
	public int evaluate(String exp)
	{

	}

	/* returns true if str in ["+","-","*","/"]
	 *   false otherwise
	 */
	public boolean isOperator(String str)
	{
		if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
			return true;
		else
			return false;
	}

    public static void main(String[] args)
    {
        PostFixEvaluator app = new PostFixEvaluator();
    }
}