public class PostFixRunner {
	public static void main ( String[] args ) {
		String test1 = "2 7 + 1 2 + +";
		String test2 = "1 2 3 4 + + +";
		String test3 = "9 3 * 8 / 4 +";
		String test4 = "3 3 + 7 * 9 2 / +";
		String test5 = "9 3 / 2 * 7 9 * + 4 -";
		String test6 = "5 5 + 2 * 4 / 9 +";
		
		PostFix tester = new PostFix();
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
	}
}