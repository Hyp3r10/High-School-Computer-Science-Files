import static java.util.Calendar.DAY_OF_WEEK;

import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author MatthewSheldon
 * Given a date, determine the day of the week (Monday, . . . , Sunday) on that day.
 * (e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)
 */
public class CompProgProblem3 {
	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Day: ");
		int dayOfMonth = scan.nextInt(); scan.nextLine();

		System.out.print("Enter the Month: ");
		String temp = scan.nextLine();

		System.out.print("Enter the Year: ");
		int year = scan.nextInt(); scan.nextLine();
		scan.close();

		int month = 0;

		switch(temp) {
		case "January" : month = 0; break;
		case "February" : month = 1; break;
		case "March" : month = 2; break;
		case "April" : month = 3; break;
		case "May" : month = 4; break;
		case "June" : month = 5; break;
		case "July" : month = 6; break;
		case "August" : month = 7; break;
		case "September" : month = 8; break;
		case "October" : month = 9; break;
		case "November" : month = 10; break;
		case "December" : month = 11; break;
		}

		GregorianCalendar calendar = new GregorianCalendar(year, month, dayOfMonth);
		String[] weekdays = new DateFormatSymbols().getWeekdays();
		
		System.out.println(weekdays[calendar.get(DAY_OF_WEEK)]);
	}
}
