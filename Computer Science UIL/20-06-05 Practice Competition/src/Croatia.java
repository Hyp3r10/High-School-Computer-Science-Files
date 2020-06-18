import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class Croatia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numTimes; i++) {
			String[] line = scan.nextLine().split("");
			ArrayList<Character> top = new ArrayList<Character>();
			ArrayList<Character> bottom = new ArrayList<Character>();
			for(int j = 0; j < line.length; j++) {
				if(line[j].charAt(0) == '\\' && j+1 < line.length) {
					char next = line[j+1].charAt(0);
					if(next == '\\') {
						top.add(' ');
						bottom.add(line[j].charAt(0));
						j++;
					}
					else {
						top.add(next);
						bottom.add(line[j+2].charAt(0));
						j+=2;
					}
				}
				else {
					top.add(' ');
					bottom.add(line[j].charAt(0));
				}
			}
			for(int j = 0; j < top.size(); j++) {
				System.out.print(top.get(j));
			}
			System.out.println();
			for(int j = 0; j < bottom.size(); j++) {
				System.out.print(bottom.get(j));
			}
			System.out.println();
			System.out.println();
		}
	}
}
