/*
ID: punchwo1
LANG: JAVA
TASK: gift1
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gift1 {
	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("gift1.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")))) {
				int numNames = scan.nextInt(); scan.nextLine();
				Person[] people = new Person[numNames];
				for(int i = 0; i < numNames; i++) {
					people[i] = new Person(scan.nextLine());
				}
				// Until we have no more lines perform the operations of adding and removing money
				while(scan.hasNextLine()) {
					String donatingName = scan.nextLine();
					int numMoneyDonating = scan.nextInt();
					int numFriends = scan.nextInt(); scan.nextLine();
					// Make sure that we actually have money to donate

					String[] namesToDonateTo = new String[numFriends];
					for(int i = 0; i < numFriends; i++) {
						namesToDonateTo[i] = scan.nextLine();
					}
					if(numMoneyDonating != 0 && numFriends != 0) {
						int moneyForFriends = numMoneyDonating / numFriends;
						int moneyForDonator = numMoneyDonating % numFriends;

						// find the donator; remove/add money; add it back to the array
						Person donator = new Person("");
						int index = 0;
						for(Person temp : people) {
							if(temp.equals(donatingName)) {
								donator = temp;
								break;
							}
							else {
								index++;
							}
						}
						donator.addMoney(moneyForDonator-numMoneyDonating);
						people[index] = donator;

						// add the moneyForFriends to each of the people in the namesToDonateTo array
						for(String currFriend : namesToDonateTo) {
							index = 0; 
							for(Person currPerson : people) {
								if(currPerson.equals(currFriend)) {
									currPerson.addMoney(moneyForFriends);
									people[index] = currPerson;
									break;
								}
								else {
									index++;
								}
							}
						}
					}
				}
				for(Person currPerson : people) {
					out.println(currPerson);
				}
			}
		}
	}
}
class Person {
	public int money;
	public String name;
	public Person(String name) {
		this.name = name;
	}
	public void addMoney(int money) {
		this.money += money;
	}
	public boolean equals(String other) {
		return this.name.equals(other);
	}
	public String toString() {
		return this.name + " " + this.money;
	}
}
