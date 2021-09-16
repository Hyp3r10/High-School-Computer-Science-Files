import java.util.Scanner;

public class IndexCreator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String countryName = scan.nextLine();
			System.out.printf("<li><a href=\"%s/index.html\">%s</a></li>%n", countryName, countryName);
		}
	}
}
