import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		//add test cases
		WordSort s1 = new WordSort("abc ABC 12321 fred alexander");
		s1.sort();
		System.out.println(s1);
		
		WordSort s2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		s2.sort();
		System.out.println(s2);
		
		WordSort s3 = new WordSort("b x 4 r s y $");
		s3.sort();
		System.out.println(s3);
		
		WordSort s4 = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		s4.sort();
		System.out.println(s4);
		
	}
}