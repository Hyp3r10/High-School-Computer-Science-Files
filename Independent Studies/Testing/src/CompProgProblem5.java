import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 * Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order
 * them first by ascending birth months (MM), then by ascending birth dates (DD), and
 * finally by ascending age. */
public class CompProgProblem5 {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		Comparator<GregorianCalendar> comparator1 = new Comparator<GregorianCalendar>() {
			@Override
			public int compare(GregorianCalendar c1, GregorianCalendar c2) {
				if(c1.MONTH < c2.MONTH) {
					return -1;
				}
				else if(c1.MONTH > c2.MONTH) {
					return 1;
				}
				else {
					if(c1.DAY_OF_MONTH < c2.DAY_OF_MONTH) {
						return -1;
					}
					else if(c1.DAY_OF_MONTH > c2.DAY_OF_MONTH) {
						return 1;
					}
					else {
						if(c1.getTimeInMillis() < c2.getTimeInMillis()) {
							return -1;
						}
						else {
							return 1;
						}
					}
				}
			}
		};
		
		String done = "y";
		PriorityQueue<GregorianCalendar> list = new PriorityQueue<GregorianCalendar>(comparator1);
		while(done.equals("y")) {
			System.out.print("Enter the Day (DD): ");
			int dayOfMonth = scan.nextInt(); scan.nextLine();

			System.out.print("Enter the Month (MM): ");
			int month = scan.nextInt();

			System.out.print("Enter the Year (YYYY): ");
			int year = scan.nextInt(); scan.nextLine();

			list.add(new GregorianCalendar(year, month, dayOfMonth));
			
			System.out.print("Would you like to enter another response? (y/n): ");
			done = scan.nextLine();
		}
		scan.close();
		System.out.println("\n\n");
		for(GregorianCalendar temp : list) {
			System.out.println(temp.toString());
		}
	}
	
}