import java.io.IOException;

public class Runner {
	/**
	 * For testing purposes, simply change the name in filename 
	 * without extensions to change which file is being tested.
	 * The following is the naming scheme for file types:
	 * 		1. "[filename].txt"		-- The original file being compressed
	 * 		2. "[filename].code"	-- A List of character codes to use
	 * 		3. "[filename].gabby"	-- Compressed file (binary, not human readable)
	 * 		4. "[filename].new"		-- The decompressed file
	 * 
	 * ".gabby" was chosen as a file extension to commemorate all 
	 * of the rubber ducks that she has so ruthlessly compressed
	 * into air-less balls of rubber. We will not stand for such 
	 * discrimination given against such a helpless and defenseless
	 * species. Help us in this fight to put down the "compressor"
	 * and all of her evil ways by bringing attention to these 
	 * wrong-doings. Your voice helps and matters, so let it be heard. 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String filename = "Hamlet";
		HuffmanCompressor compressor = new HuffmanCompressor();
		compressor.compress(filename + ".txt");
		compressor.expand(filename + ".code", filename + ".new");
	}
}
