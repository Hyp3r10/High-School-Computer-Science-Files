import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException {
		String filename = "War and Peace";
		HuffmanCompressor compressor = new HuffmanCompressor();
		compressor.compress(filename + ".txt");
		compressor.expand(filename + ".gabby", filename + ".new");
	}
}
