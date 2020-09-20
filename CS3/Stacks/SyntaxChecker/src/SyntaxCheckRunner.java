public class SyntaxCheckRunner {
	public static void main ( String[] args ) {
		String test1 = "(abc(*def)";	
		String test2 = "[{}]";
		String test3 = "[";
		String test4 = "[{<()>}]";
		String test5 = "{<html[value=4]*(12)>{$x}}";
		String test6 = "[one]<two>{three}(four)";
		String test7 = "car(cdr(a)(b)))";
		String test8 = "car(cdr(a)(b))";
		
		SyntaxChecker tester = new SyntaxChecker();
		tester.setExpression(test1);
		System.out.println(tester);
		tester.setExpression(test2);
		System.out.println(tester);
		tester.setExpression(test3);
		System.out.println(tester);
		tester.setExpression(test4);
		System.out.println(tester);
		tester.setExpression(test5);
		System.out.println(tester);
		tester.setExpression(test6);
		System.out.println(tester);
		tester.setExpression(test7);
		System.out.println(tester);
		tester.setExpression(test8);
		System.out.println(tester);
	}
}