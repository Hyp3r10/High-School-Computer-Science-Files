import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("happy hip hop.txt"));
		int[] characters = new int[256];
		while(scan.hasNextLine()) {
			String temp = scan.nextLine();
			if(!temp.equals("")) { 
			String[] line = temp.trim().split("");
			for(int i = 0; i < line.length; i++) {
				char curr = line[i].charAt(0);
				characters[curr]++;
			}
			}
		}
		
		HuffmanTree tester = new HuffmanTree(characters);
		TreePrinter.printTree(tester.root);
		tester.write("happy hip hop.out");
		
		tester = new HuffmanTree("happy hip hop.out");
		TreePrinter.printTree(tester.root);
	}
}
