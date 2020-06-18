import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		IteratorReplacer replacer = new IteratorReplacer("a b c a b c", "a", "+");
		System.out.println(replacer);
		
		replacer = new IteratorReplacer("a b c d e f g h i j x x x x", "x", "7");
		System.out.println(replacer);
		
		replacer = new IteratorReplacer("1 2 3 4 5 6 a b c a b c", "b", "#");
		System.out.println(replacer);
	}
}