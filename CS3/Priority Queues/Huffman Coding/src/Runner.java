import java.io.IOException;

public class Runner {
	public static void main(String[] args) throws IOException {
		String filename = "happy hip hop";
		HuffmanCompressor compressor = new HuffmanCompressor();
		compressor.compress(filename + ".txt");
		compressor.expand(filename + ".gabby", filename + ".new");
	}
}
