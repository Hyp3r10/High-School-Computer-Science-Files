import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodeTwo {

	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("code2.txt"));

		int numTimes = file.nextInt();
		file.nextLine();

		int perfectSquare;

		for(int i = 0; i < numTimes; i++) {
			String code = file.nextLine(); 

			// figure out the perfect square length
			perfectSquare = (int)Math.sqrt(code.length());

			ArrayList<String> lines = new ArrayList<String>();
			// Divide the string into perfectSquare Times
			for(int j = 0; j < perfectSquare; j++) {
				lines.add(code.substring(j*perfectSquare, (j*perfectSquare) + perfectSquare));
			}

			//Print out the decoded message
			String[] arr = lines.toArray(new String[lines.size()]);
			for(int k = 0; k < perfectSquare; k++) {
				for(int j = perfectSquare-1; j >= 0; j--) {
					System.out.print(arr[j].charAt(k));
				}
			}
			System.out.println();
		}
	}

}
