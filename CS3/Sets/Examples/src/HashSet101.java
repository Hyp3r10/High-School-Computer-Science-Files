import java.util.Set;
import java.util.HashSet;

public class HashSet101
{
	public static void main(String[] args)
	{
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(3);
		nums.add(2);
		System.out.println(nums.add(6));
		System.out.println("nums: " + nums + "\n");
		
		System.out.println(nums.add(6)); //duplicates will not be added
		System.out.println("nums: " + nums + "\n");
				
		System.out.println(nums.add(-4)); //natural ordering is maintained
		System.out.println("nums: " + nums + "\n");
		
		//removing elements
		System.out.println(nums.remove(2));
		System.out.println(nums.remove(5));
		System.out.println("nums: " + nums + "\n");
		
		System.out.println("=========================================================================\n");
		
		Set<String> words = new HashSet<String>();
		words.add("rock");
		words.add("paper");
		System.out.println(words.add("scissors"));
		System.out.println("words: " + words + "\n");
		
		System.out.println(words.add("rock"));
		System.out.println("words: " + words + "\n");
		
		System.out.println(words.add("lizard"));
		System.out.println("words: " + words + "\n");
		
		//removing
		System.out.println(words.remove("scissors"));
		System.out.println(words.remove("spock"));
		System.out.println("words: " + words + "\n");

	}

}
