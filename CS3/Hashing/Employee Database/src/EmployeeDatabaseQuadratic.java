public class EmployeeDatabaseQuadratic {
	/**
	 * Class that handles both the ID of an employee
	 * and the employee object.
	 * @author MatthewSheldon
	 */
	class Entry {
		int ID;				// The ID of the employee
		Employee employee;	// The employee object
		/**
		 * Constructs an Entry object with the passed variables
		 * @param ID		The ID of the entry
		 * @param employee	The employee of the entry
		 */
		public Entry(int ID, Employee emp) { this.ID = ID; this.employee = emp; }
		@Override
		public String toString() { return "" + this.ID + " - " + this.employee.toString(); }
	}
	/**
	 * The backing structure of the hash table
	 */
	public Entry[] hashTable;
	/**
	 * The number of collisions that have occurred while 
	 * attempting to add any and all elements to the hasTable
	 */
	public int collisionCounter;
	/**
	 * The logical size of the hashTable
	 */
	public int size;
	/**
	 * The number of current probes from a type of search
	 */
	public int currentProbes;
	/**
	 * Constructs a hashTable object that has a default prime size of 11
	 * Used simply for testing purposes during the original phase of coding
	 */
	public EmployeeDatabaseQuadratic() {
		this.size = 0;
		this.collisionCounter = 0;
		this.currentProbes = 0;
		this.hashTable = new Entry[11];
	}
	/**
	 * Constructs a hashTable object that has a size of passed size.
	 * @param size	The size of the database
	 */
	public EmployeeDatabaseQuadratic(int size) {
		this.size = 0;
		this.collisionCounter = 0;
		this.currentProbes = 0;
		this.hashTable = new Entry[size];
	}
	/**
	 * Generates a semi-unique hash-code for the passed 5 digit ID
	 * @param key	The 5 digit ID of the Employee
	 * @return		The hash-code for the ID
	 */
	public int hashCode(int ID) {
		return ((ID + (ID % this.hashTable.length)) % this.hashTable.length);
		//return (int) ((((long) ID * ID) / 9973L) % this.hashTable.length);
	}
	/**
	 * Adds the passed Entry object into the hashTable data structure
	 * @param key	The 5-digit unique ID of the Entry
	 * @param val	The name of the Entry
	 * @return		The Employee object that was added to the hashTable
	 */
	public Employee put(int key, String val) {
		Employee emp = new Employee(val);
		int pos = this.hashCode(key);
		int original = pos,	count = 0;
		do {
			if(count == this.hashTable.length) {
				// System.out.println("Hash Table is Full");
				break;
			}
			if(this.hashTable[pos] == null) {
				Entry temp = new Entry(key, emp);
				this.hashTable[pos] = temp;
				this.size++;
				return emp;
			}
			else { this.collisionCounter++; }
			count++;
			pos = (int) (pos + ((long) count * count)) % this.hashTable.length;
		} while(count != this.hashTable.length+1);
		return null;
	}
	/**
	 * Searches the Hash Table for the passed key ID. 
	 * Returns the Employee Object if it exists in the array.
	 * @param key	The ID of the employee that we are looking for.
	 * @return		The Employee that is associated with the ID
	 */
	public Employee get(int key) {
		int count = 0;
		int pos = this.hashCode(key);
		int original = this.hashCode(key);
		do {
			this.currentProbes++;
			if(count == this.hashTable.length) {
				// System.out.println("Target is not in the Hash Table");
				break;
			}
			else if(this.hashTable[pos] == null) {
				// System.out.println("Target is not in the Hash Table");
				break;
			}
			else if(this.hashTable[pos].ID == key) {
				return this.hashTable[pos].employee;
			}
			count++;
			pos = (int) (pos + ((long) count * count) );
			
		} while(count != this.hashTable.length+1);
		return null;
	}
	@Override
	public String toString() {
		String output = "";
		for(Entry temp : this.hashTable) {
			output += temp + "\n";
		}
		return output;
	}
	/**
	 * Resets the current number of probes
	 */
	public void resetCurrentProbes() {
		this.currentProbes = 0;
	}
} 
