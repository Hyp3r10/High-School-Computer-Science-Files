/*
ID: punchwo1
LANG: JAVA
TASK: friday
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class friday {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("friday.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")))) {
				long N = scan.nextLong();
				LocalDate start = LocalDate.of(1900, 1, 1);
				LocalDate curr = LocalDate.of((int)(1900+N-1), 12, 31);
				long numSunday = 0, numMonday = 0, numTuesday = 0, 
					numWednesday = 0, numThursday = 0, numFriday = 0, numSaturday = 0;
				while(!curr.equals(start)) {
					DayOfWeek currDay = curr.getDayOfWeek();
					String dayOfWeek = currDay.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
					int dayOfMonth = curr.getDayOfMonth();
					if(dayOfMonth == 13) { 
						switch(dayOfWeek) {
							case "Tuesday" : {
								numTuesday++;
								break;
							}
							case "Saturday" : {
								numSaturday++;
								break;
							}
							case "Sunday" : {
								numSunday++;
								break;
							}
							case "Monday" : {
								numMonday++;
								break;
							}
							
							case "Wednesday" : {
								numWednesday++;
								break;
							}
							case "Thursday" : {
								numThursday++;
								break;
							}
							case "Friday" : {
								numFriday++;
								break;
							}
							
						}
					}
					curr = curr.minusDays(1);
				}
				out.println(numSaturday + " " +  numSunday + " " + numMonday + " " + numTuesday + " " + numWednesday + " " + numThursday + " " + numFriday);
			}
		}
	}
}
