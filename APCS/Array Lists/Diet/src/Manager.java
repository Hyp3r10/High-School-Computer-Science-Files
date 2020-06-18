import java.util.Scanner;
public class Manager {
	//Instance Variables
	public static Diet app;
	public static Scanner scan;
	public static Manager test;
	//Constructor
	public Manager() {
		app = new Diet();
		scan = new Scanner(System.in);
		Manager.mainMenu();
	}
	//Main
	public static void mainMenu() {
		int choice = 0;
		do {
			System.out.println("========================");
			System.out.println("       Main Menu");
			System.out.println("========================");
			System.out.println("");
			System.out.println("1. Add Record");
			System.out.println("2. View Record");
			System.out.println("3. View All Records");
			System.out.println("4. Exit");
			System.out.print("Selection: ");
			choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("========================");
				System.out.println("       Add Record");
				System.out.println("========================");
				Manager.addRecord();
			}
			else if(choice == 2) {
				System.out.println("========================");
				System.out.println("       View Record");
				System.out.println("========================");
				Manager.viewRecord();
			}
			else if(choice == 3) {
				System.out.println("========================");
				System.out.println("       View All Records");
				System.out.println("========================");
				System.out.println("DATE  WEIGHT  DIFFERENCE");
				System.out.println("--------------------------");
				Manager.viewAllRecords();
			}
			else if(choice == 4) {
				System.out.println("Thanks, have a nice day.");
			}
			else {
				System.out.println("Please enter a valid choice.");
			}
		} while(choice != 4);
	}
	public static void addRecord() {
		app.addEntry();
	}
	public static void viewRecord() {
		scan = new Scanner(System.in);
		System.out.print("Enter date --> ");
		System.out.println(app.getEntry(scan.nextLine()));
	}
	public static void viewAllRecords() {
		app.viewList();
	}
	public static void main(String[] args) {
		test = new Manager();
	}
}