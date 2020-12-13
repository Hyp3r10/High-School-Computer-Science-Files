import java.io.*;
import java.util.*;

public class Solution {

	public static List<String> notesUp = Arrays.asList(new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"});

	public static List<String> notesDown = Arrays.asList(new String[]{"A", "Bb", "B", "C", "Db", "D","Eb", "E", "F", "Gb", "G", "Ab"});

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int transpo = sc.nextInt();
		Scanner linescan = new Scanner(line);
		while(linescan.hasNext()) {
			// we are going flat
			if(transpo < 0) {
				String l = linescan.next();
				int index = notesDown.indexOf(l) + transpo;

				if(index < 0) {
					index = notesDown.size() + (index%notesDown.size());
					System.out.print(notesDown.get(index) + " ");
				} else {
					index = index%notesDown.size();
					System.out.print(notesDown.get(index) + " ");
				}
			}
			else {
				String l = linescan.next();
				int index = notesUp.indexOf(l)+transpo;
				if(index < 0) {
					index = notesUp.size() + (index%notesUp.size());
					System.out.print(notesUp.get(index) + " ");
				} else {
					index = index%notesDown.size();
					System.out.print(notesUp.get(index) + " ");
				}
			} 
		}
	}
}