import java.util.Scanner;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		/*Scanner scan = new Scanner(System.in);
		IteratorReplacer replacer = new IteratorReplacer("1", "1", "1");
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String toRemove = scan.nextLine();
			String replaceWith = scan.nextLine();
			replacer.setEmAll(line, toRemove, replaceWith);
			replacer.replace();
			System.out.println(replacer.toString() + "\n\n");
		}*/
		IteratorReplacer tester = new IteratorReplacer("1 2 3 1 2 4", "1", "5");
		tester.replace();
		System.out.println(tester.toString());
		tester.setEmAll("1 2 3 4 5 6 7 8 9 10 -1 -1 -1", "-1", "42");
		tester.replace();
		System.out.println(tester.toString());
		tester.setEmAll("3 1 4 1 5 9 33 72 -3 2 3 6", "3", "0");
		tester.replace();
		System.out.println(tester.toString());
	}
}