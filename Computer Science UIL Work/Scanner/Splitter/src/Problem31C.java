import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem31C {
	public static void main (String[] args) throws IOException{
		Scanner file = new Scanner(new File("pr31c.dat"));
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes; i++) {
			String temp = file.nextLine();
			System.out.println(temp = temp.replaceAll("(/\\*)(.)*(\\*/)", ""));
		}
	}
}
