import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class HuffmanCompressor {
	public HuffmanTree decoder;
	public void compress(String filename) throws IOException {
		// Take in the input and make a frequency table
		// --------------------------------------------
		Scanner scan = new Scanner(new File(filename));
		int[] asciiValues = new int[256];
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(line.length() != 1) {
				String[] parts = line.split("");
				for(String temp : parts) {
					asciiValues[(int) temp.charAt(0)]++;
				}
			}
			else {
				asciiValues[(int) line.charAt(0)]++;
			}
		}
		scan.close();
		
		// Take the frequency table and construct the tree from the frequencies
		// --------------------------------------------------------------------
		decoder = new HuffmanTree(asciiValues);
		decoder.write(filename.substring(0, filename.indexOf('.')) + ".code");
		
		// Compress the original file using the encoding scheme
		// ----------------------------------------------------
		// Take in the encoder and map it into a TreeMap
		TreeMap<Character, String> charToPath = new TreeMap<Character, String>();
		scan = new Scanner(new File(filename.substring(0, filename.indexOf('.')) + ".code"));
		while(scan.hasNextLine()) {
			char currChar = (char) Integer.parseInt(scan.nextLine());
			String path = scan.nextLine();
			charToPath.put(currChar, path);
		}
		// Re-read the text and encode it using the map
		PrintWriter out = new PrintWriter(new File(filename.substring(0, filename.indexOf('.')) + ".gabby"));
		scan = new Scanner(new File(filename));
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().split("");
			for(String temp : line) {
				out.print(charToPath.get(temp.charAt(0)));
			}
		}
		out.close();
		
		TreePrinter.printTree(this.decoder.root);
	}
	public void expand(String codeFile, String fileName) throws IOException {
		decoder.decode(new BitInputStream(codeFile), fileName);
	}
}
