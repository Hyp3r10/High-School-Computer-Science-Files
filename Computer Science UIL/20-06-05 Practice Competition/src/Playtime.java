import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class Playtime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		for(int i = 0; i < numTimes; i++) {
			String[] line = scan.nextLine().split(",");
			int time = Integer.parseInt(line[1]);
			System.out.print(line[0] + " - ");
			if(time / (365 * 24 * 60) >= 1) {
				System.out.print(time / (365 * 24 * 60) + " year(s) ");
				time %= (365 * 24 * 60);
			}
			if(time / (24 * 60) >= 1) {
				System.out.print(time / (24*60) + " day(s) ");
				time %= (24 * 60);
			}
			if(time / (60) >= 1) {
				System.out.print(time / (60) + " hour(s) ");
				time %= (60);
			}
			if(time > 0) {
				System.out.print(time + " minute(s) ");
			}
			System.out.println();
		}
	}
}
