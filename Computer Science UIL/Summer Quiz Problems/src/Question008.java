import java.util.Scanner;

public class Question008 {
	public static void main(String[] args) {
		String g = "aplus,comp,sci,com";
		Scanner file = new Scanner(g);
		file.useDelimiter(",");
		file.next();
		String s = file.next();
		System.out.println(s);
	}
}
