import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticTester {
	public static void main(String[] args) throws IOException {
		// Insertion
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> IDs = new ArrayList<Integer>();
		Scanner scan = new Scanner(new File("Large Data Set.txt"));
		while(scan.hasNextLine()) {
			String[] parts = scan.nextLine().split(" ");
			IDs.add(Integer.parseInt(parts[0]));
			names.add(parts[1] + " " + parts[2]);
		}
		double a = 0.67;
		EmployeeDatabaseQuadratic quadraticTester = new EmployeeDatabaseQuadratic((int) ((double) names.size() / a));
		double buildTableTimer = System.nanoTime();
		for(int i = 0; i < names.size(); i++) {
			quadraticTester.put(IDs.get(i), names.get(i));
		}
		buildTableTimer = (System.nanoTime() - buildTableTimer) / 1000000000.0;

		// Successful searching
		scan = new Scanner(new File("Successful Search Records.txt"));
		names = new ArrayList<String>();
		IDs = new ArrayList<Integer>();
		while(scan.hasNextLine()) {
			String[] parts = scan.nextLine().split(" ");
			IDs.add(Integer.parseInt(parts[0]));
			names.add(parts[1] + " " + parts[2]);
		}
		int successfulSize = names.size();
		double successfulSearchTimer = System.nanoTime();
		for(int i = 0; i < names.size(); i++) {
			Employee temp = quadraticTester.get(IDs.get(i));
		}
		successfulSearchTimer = ((double) System.nanoTime() - successfulSearchTimer) / 1000000000.0;
		int successfulProbes = quadraticTester.currentProbes;
		quadraticTester.resetCurrentProbes();

		// Unsuccessful searching
		scan = new Scanner(new File("Unsuccessful Search Records.txt"));
		names = new ArrayList<String>();
		IDs = new ArrayList<Integer>();
		while(scan.hasNextLine()) {
			String[] parts = scan.nextLine().split(" ");
			IDs.add(Integer.parseInt(parts[0]));
			names.add(parts[1] + " " + parts[2]);
		}
		int unsuccessfulSize = names.size();
		double unsuccessfulSearchTimer = System.nanoTime();
		for(int i = 0; i < names.size(); i++) {
			Employee temp = quadraticTester.get(IDs.get(i));
		}
		unsuccessfulSearchTimer = ((double) System.nanoTime() - unsuccessfulSearchTimer) / 1000000000.0;
		int unsuccessfulProbes = quadraticTester.currentProbes;
		quadraticTester.resetCurrentProbes();

		// Output
		PrintWriter out = new PrintWriter(new File("QuadraticTester.out"));
		out.println("Type of Hashing: Quadratic Probing");
		out.println("\nHash Function Used: ((ID + (ID % this.hashTable.length)) % this.hashTable.length)");
		out.println("\nNumber of records added to the table: " + quadraticTester.size + "\nTable Size: " + quadraticTester.hashTable.length + "\nLoad Factor: " + a);
		out.println("\nTotal Insertion Time: " + buildTableTimer + " seconds\n" + "Average Insertion time per element: " + buildTableTimer / quadraticTester.size + " seconds");
		out.println("\nTotal Table Insertion Collisions: " + quadraticTester.collisionCounter  + "\nAverage Table Insertion Collisions: " + (double) quadraticTester.collisionCounter / quadraticTester.size);
		out.println("\nNumber of collisions vs. Number of Insertions: "  +  ((double) quadraticTester.collisionCounter / quadraticTester.size) * 100.0 + "%");
		out.println("\nTotal Successful Search Time: " + successfulSearchTimer + " seconds\nAverage Successful Search Time: " + ((double) successfulSearchTimer / successfulSize) + " seconds\nTotal Probes Needed: " + successfulProbes + "\nAverage Probes Needed: " + (double) successfulProbes / successfulSize);
		out.println("\nTotal Unsuccessful Search Time: " + unsuccessfulSearchTimer + " seconds\nAverage Unsuccessful Search Time: " + ((double) unsuccessfulSearchTimer / unsuccessfulSize) + " seconds\nTotal Probes Needed: " + unsuccessfulProbes + "\nAverage Probes Needed: " + (double) unsuccessfulProbes / unsuccessfulSize);
		out.close();
	}
}
