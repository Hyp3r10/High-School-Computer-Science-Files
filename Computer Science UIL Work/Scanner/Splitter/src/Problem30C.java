import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem30C {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr30c.txt"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String temp = file.nextLine();
			String[] blocks = temp.split(" |/");
			int one = Integer.parseInt(blocks[0]);
			int two = Integer.parseInt(blocks[1]);
			int three = Integer.parseInt(blocks[3]);
			int four = Integer.parseInt(blocks[4]);
			
			int numerator = 0;
			int denominator = 0;
			
			if(blocks[2].equals("+")) {
				numerator = (one*four + two*three);
				denominator = two*four;
			}
			else if(blocks[2].equals("-")) {
				numerator = ((one*four) - (two*three));
				denominator = two*four;
			}
			else if(blocks[2].equals("*")) {
				numerator = (one*three);
				denominator = (two*four);
			}
			else {
				numerator = (one*four);
				denominator = (two*three);
			}
			System.out.println(temp + " = " + numerator + "/" + denominator);
		}
	}
}
