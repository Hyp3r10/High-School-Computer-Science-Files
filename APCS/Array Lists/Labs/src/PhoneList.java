import java.util.*;

public class PhoneList
{
	private ArrayList<Contact> phoneList = new ArrayList<Contact>();
	private Contact tmp;

	public void getContactInfo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name --> ");
		String name = scan.nextLine();
		System.out.print("Enter phone number --> ");
		String phoneNumber = scan.nextLine();
		phoneList.add(new Contact(name, phoneNumber));

	}
	public void printContactInfo()
	{
		System.out.println("       Contact List");
		System.out.println("-----------------------------");
		for(int i = 0; i < phoneList.size(); i++) {
			System.out.println(phoneList.get(i));
		}
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		PhoneList app = new PhoneList();
		String response = "";
		do {
			app.getContactInfo();
			System.out.print("\nContinue [Y or N]? ");
			response = scan.nextLine();
			System.out.println();
		} while(!response.equalsIgnoreCase("n"));
		app.printContactInfo();
	}
}