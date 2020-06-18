import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem31F {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr31f.dat"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) { 
			String temp = file.nextLine();
			String[] nZ = temp.split("[A-M ]");
			String[] aM = temp.split("[N-Z ]");
			
			for(int j = 0; j < aM.length; j++) {
				System.out.print(aM[j]);
			}

			System.out.println();
			
			for(int j = 0; j < nZ.length; j++) {
				System.out.print(nZ[j]);
			}
			
			System.out.println("\n");
		}
	}
}
