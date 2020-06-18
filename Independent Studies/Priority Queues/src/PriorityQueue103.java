import java.util.PriorityQueue;
import java.util.Scanner;
/** @author MatthewSheldon
 * 	This is a program that allows you to look at how a PriorityQueue works when adding in String Objects.
 * 	This allows you to see how the sorting works and when it works.
 *	Try playing around with this until you get a general idea how PriorityQueues work.
 */
public class PriorityQueue103 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		Scanner scan = new Scanner(System.in);
		
		String response = "yes";
		while(response.equals("yes")) {
			System.out.print("Enter element " + (queue.size()+1) + " of the PriorityQueue: ");
			queue.add(scan.nextLine());
			System.out.println(queue);
			System.out.print("\nWould you like to enter another element? (yes/no) ");
			response = scan.nextLine();
		}
		scan.close();
	}
}
