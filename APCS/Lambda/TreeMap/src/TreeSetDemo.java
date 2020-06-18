import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		String phrase = "hello this is the the the new way to type";
		String[] list = phrase.split(" ");
		
		TreeSet<String> words = new TreeSet<>();
		words.addAll(Arrays.asList(list));
		
		System.out.print(words);
		
	}
}
