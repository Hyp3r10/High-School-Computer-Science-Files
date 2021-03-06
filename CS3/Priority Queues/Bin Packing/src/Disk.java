import java.util.ArrayList;

public class Disk implements Comparable<Disk> {
	private Integer remainingCapacityKB;	// The remaining amount of storage on this disk
	private ArrayList<Integer> partitions;	// A list of the size of the partitions on this disk
	private int diskNumber;					// A unique number indicating the number disk this is in the drive bay
	private int usedSpace;
	/**
	 * Default constructor that initialized this disk to have 1GB (1000000KB) of data
	 * as well as a blank set of partition sizes in the disk.
	 */
	public Disk(int diskNum) {
		this.remainingCapacityKB = 1000000;
		this.partitions = new ArrayList<Integer>();
		this.diskNumber = diskNum;
		this.usedSpace = 1000000 - this.remainingCapacityKB;
	}
	/**
	 * Determines if there is enough available space for the passed 
	 * partition size to be added to the disk.
	 * @param capacity	The storage size of the partition
	 * @return			Whether or not we can add this size to the partition
	 */
	public boolean canAdd(Integer capacity) {
		return (this.remainingCapacityKB - capacity) >= 0;
	}
	/**
	 * Adds the passed partition of storage to the disc
	 * @param other	The size of the partition in MBs
	 * @return		The size of the disk after the partition was added
	 */
	public int add(Integer other) {
		this.partitions.add(other);
		this.remainingCapacityKB -= other;
		this.usedSpace = 1000000 - this.remainingCapacityKB;
		return this.remainingCapacityKB;
	}
	/**
	 * @return	The total amount of space remaining on this disk
	 */
	public int getRemainingCapacity() {
		return this.remainingCapacityKB;
	}
	/**
	 * @return 	The total amount of space on this disk that has been used
	 */
	public int getUsedSpace() {
		return this.usedSpace;
	}
	@Override
	public boolean equals(Object other) {
		return this.remainingCapacityKB.equals(((Disk) other).remainingCapacityKB);
	}
	@Override
	public int compareTo(Disk o) {
		return (-1) * this.remainingCapacityKB.compareTo(o.remainingCapacityKB);
	}
	@Override
	public String toString () {
		String output = "";
		output += this.diskNumber + " " + this.remainingCapacityKB + ": ";
		for(Integer temp : this.partitions) {
			output += temp + " ";
		}
		return output;
	}
}
