import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class HuffmanCompressor {
	public HuffmanTree decoder;	// Used to store *how* to decode the encoded message
	/**
	 * Compresses the passed file name in three steps:
	 * 		1.	Take in the original file and convert it into a frequency
	 * 		   	table where the index represents an ASCII value and the
	 * 		   	value assigned to that spot represents the frequency.
	 * 		2.	Take the frequency table and construct a HuffmanTree using
	 * 		  	the frequency table to construct the paths to a given character.
	 * 			Store this HuffmanTree so that we are able to uncompress this
	 * 			file later. Otherwise, we wouldn't know how to decode this mess.
	 * 		3.	Re-read the original file, this time encoding the original text
	 * 			using the HuffmanTree created earlier, and output that to the
	 * 			compressed file. 
	 * @param filename	The name of the original file
	 * @throws IOException
	 */
	public void compress(String filename) throws IOException {
		// Take in the input and make a frequency table
		// --------------------------------------------
		Scanner scan = new Scanner(new File(filename));
		int[] asciiValues = new int[256];
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(!line.equals("")) {
				String[] parts = line.split("");
				for(String temp : parts) {
					asciiValues[(int) temp.charAt(0)]++;
				}
			}
			asciiValues[(int)'\n']++;
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
		BitOutputStream out = new BitOutputStream(filename.substring(0, filename.indexOf('.')) + ".gabby");
		scan = new Scanner(new File(filename));
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(!line.equals("")) {
				String[] parts = line.split("");
				for(String temp : parts) {
					String[] path = (charToPath.get(temp.charAt(0))).split("");
					for(String bit : path) {
						out.writeBit(Integer.parseInt(bit));
					}
				}
			}
			String[] newLinePath = charToPath.get('\n').split("");
			for(String bit : newLinePath) {
				out.writeBit(Integer.parseInt(bit));
			}
		}
		// Add the end of line character to the compressed file
		String[] path = charToPath.get((char) 256).split("");
		for(String bit : path) {
			out.writeBit(Integer.parseInt(bit));
		}
		out.close();
		
	}
	/**
	 * Taking in the compressed filename, output the expanded
	 * file into the fileName specified
	 * @param codeFile	The name of the compressed file
	 * @param fileName	The name of the file to ouput to
	 * @throws IOException
	 */
	public void expand(String codeFile, String fileName) throws IOException {
		decoder.decode(new BitInputStream(codeFile.substring(0, codeFile.indexOf('.')) + ".gabby"), fileName);
	}
}
