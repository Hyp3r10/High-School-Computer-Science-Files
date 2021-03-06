import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		IteratorRemover remover = new IteratorRemover("a b c a b c a", "a");
		System.out.println(remover);
		
		remover = new IteratorRemover("a b c d e f g h i j x x x x", "x");
		System.out.println(remover);
		
		remover = new IteratorRemover("1 2 3 4 5 6 a b c a b c", "b");
		System.out.println(remover);
	}
}