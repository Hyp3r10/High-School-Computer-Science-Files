import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem31A {
	public static void main (String[] args) throws IOException {
		Scanner file = new Scanner(new File("pr31a.dat"));

		int numTimes = file.nextInt();
		file.nextLine();

		for(int i = 0; i < numTimes; i++) {
			String temp = file.nextLine();
			Scanner line = new Scanner(temp);

			int sum = 0;
			String[] split = temp.split(temp.substring(0, 1));
			sum = split.length-1;
			System.out.println(temp.substring(0, 1) + ": " + sum);
		}
	}
}
