
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap100ptRunner {
	public static void main( String args[] ) {
		KittyMap100pt km = new KittyMap100pt(100, 100);
		System.out.println( km + "\n\n");
		km.printKittyCount();
	}
}