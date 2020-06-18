import java.util.Scanner;

public class SemesterAverage {
	private static String name;
	private static int nw1;
	private static int nw2;
	private static int nw3;
	private static int e;
	private static double avg;
	
	public static void main(String[] args) {
		setScores();
		average();
		print();
	}
	public static void setScores() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter students name --> ");
		name = scan.nextLine();
		System.out.print("Enter 1st 6 weeks Avg --> ");
		nw1 = scan.nextInt();
		System.out.print("Enter 2nd 6 weeks Avg --> ");
		nw2 = scan.nextInt();
		System.out.print("Enter 3rd 6 weeks Avg --> ");
		nw3 = scan.nextInt();
		System.out.print("Enter Final Exam Grade --> ");
		e = scan.nextInt();
		scan.close();
	}
	public static void average() {
		avg = (((nw1 + nw2 + nw3)/3)*0.8)+(e*0.2);
	}
	public static void print() {
		System.out.printf("%-24s%-5s%-5s%-5s%-6s%s%n", "Name", "1", "2", "3", "E", "Avg");
		System.out.println("--------------------------------------------------");
		System.out.printf("%-20s%5d%5d%5d%5d%8.0f", name, nw1, nw2, nw3, e, avg);
	}
}
