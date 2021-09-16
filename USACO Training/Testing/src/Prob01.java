import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		while(numTimes-->0) {
			String[] parts = scan.nextLine().split(":");
			double v = Double.parseDouble(parts[0]);
			double x = Double.parseDouble(parts[1]);
			double t = x/v;
			String output = "SAFE";
			if(t <= 1) {
				output = "SWERVE";
			}
			else if(t <= 5) {
				output = "BRAKE";
			}
			System.out.println(output);
		}
	}
}
