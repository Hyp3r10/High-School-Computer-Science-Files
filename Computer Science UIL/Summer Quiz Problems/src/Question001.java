import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
public class Question001 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		URLDecoder decoder = new URLDecoder();
		String s = decoder.decode("JTYzJTMwJTZlJTc2JTMzJTcyJTc0JTMxJTZlJTY3JTVm", "2x");
		System.out.print(s);
	}
}
