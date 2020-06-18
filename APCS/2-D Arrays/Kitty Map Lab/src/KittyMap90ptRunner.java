
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap90ptRunner {
	public static void main( String args[] ) throws IOException {
		KittyMap90pt km = new KittyMap90pt(10, 10);
		System.out.println( km + "\n\n");
		km.printKittyCount();
	}
}