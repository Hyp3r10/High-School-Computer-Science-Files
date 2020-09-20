import java.util.Scanner;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		/* Scanner scan = new Scanner(System.in);
		IteratorRemover remover = new IteratorRemover(" ", " ");
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String toRemove = scan.nextLine();
			remover.setTest(line, toRemove);
			remover.remove();
			System.out.println(remover.toString() + "\n\n");
		} */
		IteratorRemover tester = new IteratorRemover("a b c a b c a", "a");
		tester.remove();
		System.out.println(tester.toString() + "\n\n");
		tester.setTest("a b c d e f g h i j x x x x", "x");
		tester.remove();
		System.out.println(tester.toString() + "\n\n");
		tester.setTest("1 2 3 4 5 6 a b c a b c", "b");
		tester.remove();
		System.out.println(tester.toString() + "\n\n");
	}
}