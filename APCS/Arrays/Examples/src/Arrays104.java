//Enhanced for loop (AKA for each loop) and other array printing options
import java.util.Arrays;

public class Arrays104 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Devon";
		names[1] = "Lukas";
		names[2] = "Sean";
		names[3] = "Teja";
		names[4] = "Rohit";
		
		// Basic forLoop
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println("\n");
		
		// Enhanced forLoop
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("Directly Printing Array (Memmory Reference)");
		System.out.println(names);
		System.out.println();
		
		System.out.println("\nPrinting an array with toString from Array class");
		// Must import the package of Arrays to get access to the names toString
		System.out.println(Arrays.toString(names));
	
	
	}
}
