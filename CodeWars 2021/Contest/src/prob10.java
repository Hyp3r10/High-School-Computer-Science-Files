/**
 * @author MatthewSheldon
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob10 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); // Used for submission
		//Scanner scan = new Scanner(new File("prob10/prob10-4-in.txt")); // Used for testing
		String line = scan.nextLine();
		ArrayList<String> eat = new ArrayList<String>();
		while(!line.equals("END")) {
			String[] parts = line.split(" ");
			String ID = parts[0].substring(parts[0].indexOf('-') + 1);
			String[] timeParts = parts[1].split(":");
			long hour = Long.parseLong(timeParts[0]);
			long minute = Long.parseLong(timeParts[1]);
			long VPF = Long.parseLong(parts[2]) * 10;
			minute += VPF;
			hour += minute / 60;
			minute %= 60;
			if(hour < 17L) {
				eat.add(ID);
			}
			line = scan.nextLine();
		}
		if(eat.isEmpty()) {
			System.out.println("Blah, blah, blah, time to order delivery");
		}
		else {
			String list = eat.toString().substring(1, eat.toString().length()-1);
			System.out.println("Villagers (" + list + ") look tasty");
		}
		scan.close();
	}
}
