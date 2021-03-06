import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearTester {
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
		EmployeeDatabaseLinear linearTester = new EmployeeDatabaseLinear((int) ((double) names.size() / a));
		double buildTableTimer = System.nanoTime();
		for(int i = 0; i < names.size(); i++) {
			linearTester.put(IDs.get(i), names.get(i));
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
			Employee temp = linearTester.get(IDs.get(i));
		}
		successfulSearchTimer = ((double) System.nanoTime() - successfulSearchTimer) / 1000000000.0;
		int successfulProbes = linearTester.currentProbes;
		linearTester.resetCurrentProbes();
		
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
			Employee temp = linearTester.get(IDs.get(i));
		}
		unsuccessfulSearchTimer = ((double) System.nanoTime() - unsuccessfulSearchTimer) / 1000000000.0;
		int unsuccessfulProbes = linearTester.currentProbes;
		linearTester.resetCurrentProbes();
		
		// Output
		PrintWriter out = new PrintWriter(new File("LinearTester.out"));
		out.println("Type of Hashing: Linear Probing");
		out.println("\nHash Function Used: ((ID + (ID % this.hashTable.length)) % this.hashTable.length)");
		out.println("\nNumber of records added to the table: " + linearTester.size + "\nTable Size: " + linearTester.hashTable.length + "\nLoad Factor: " + a);
		out.println("\nTotal Insertion Time: " + buildTableTimer + " seconds\n" + "Average Insertion time per element: " + buildTableTimer / linearTester.size + " seconds");
		out.println("\nTotal Table Insertion Collisions: " + linearTester.collisionCounter  + "\nAverage Table Insertion Collisions: " + (double) linearTester.collisionCounter / linearTester.size);
		out.println("\nNumber of collisions vs. Number of Insertions: "  +  ((double) linearTester.collisionCounter / linearTester.size) * 100.0 + "%");
		out.println("\nTotal Successful Search Time: " + successfulSearchTimer + " seconds\nAverage Successful Search Time: " + ((double) successfulSearchTimer / successfulSize) + " seconds\nTotal Probes Needed: " + successfulProbes + "\nAverage Probes Needed: " + (double) successfulProbes / successfulSize);
		out.println("\nTotal Unsuccessful Search Time: " + unsuccessfulSearchTimer + " seconds\nAverage Unsuccessful Search Time: " + ((double) unsuccessfulSearchTimer / unsuccessfulSize) + " seconds\nTotal Probes Needed: " + unsuccessfulProbes + "\nAverage Probes Needed: " + (double) unsuccessfulProbes / unsuccessfulSize);
		out.close();
	}
}
