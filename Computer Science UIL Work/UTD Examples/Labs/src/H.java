import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class H {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("H.dat"));
		
		while(file.hasNextInt()) {
			int a = file.nextInt();
			int b = file.nextInt();
			
			int gcf = gcf(a, b);
			
			System.out.println(gcf);
		}
	}
	
	// Recursive method to find the greatest common factor
	public static int gcf(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0) {
			return 0;
		}
		// base case 
		else if(a == b) {
			return a;
		}
		// a is greater
		else if(a > b) {
			return gcf(a-b, b);
		}
		else {
			return gcf(a, b-a);
		}
	}
}
