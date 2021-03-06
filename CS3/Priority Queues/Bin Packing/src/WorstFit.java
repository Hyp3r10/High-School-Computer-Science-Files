import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class WorstFit {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("input20.txt"));
		PriorityQueue<Disk> disks = new PriorityQueue<Disk>();
		int diskNumber = 0;
		disks.add(new Disk(diskNumber++));
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Disk smallest = disks.poll();
			Integer size = Integer.parseInt(line);

			// There is enough storage on the current disk to add this storage to this disk
			if(smallest.canAdd(size)) {
				smallest.add(size);
				disks.add(smallest);
			}
			// There is not enough storage... create a new disk
			else {
				disks.add(smallest);
				Disk newDisk = new Disk(diskNumber++);
				newDisk.add(size);
				disks.add(newDisk);
			}
		}

		// Output
		double totalSize = 0.0;
		for(Disk disk : disks) {
			totalSize += disk.getUsedSpace();
		}
		System.out.println("Total size: " + totalSize / 1000000 + " GB");
		System.out.println("Disks req'd = " + disks.size() + "\n");
		System.out.println("\t# Avail");
		while(!disks.isEmpty()) {
			System.out.print("\t" + disks.poll() + "\n");
		}
	}
}
