import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem31E {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr31e.dat"));
		
		int numV, numC, numS, numO, numW = 0;
		String words = file.nextLine();
		
		String[] v = words.split("[aeiou]");
		String[] c = words.split("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXZ]");
		String[] s = words.split(" ");
		String[] o = words.split("[^a-zA-Z ]");
		String[] w = words.split("[^ ]+");
		
		System.out.println("VOWELS CONSONANTS SPACES OTHER WORDS");
		System.out.println("    "+ (v.length-1) +"         " + (c.length-1) + "     " + (s.length-1) + "    " + (o.length-1) + "    " + (w.length-1));
	}
}
