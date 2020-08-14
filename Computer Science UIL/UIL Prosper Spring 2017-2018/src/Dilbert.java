/**
 * @author MatthewSheldon
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dilbert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Person> listOfPeople = new ArrayList<Person>();
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().split(" ");
			String name = line[0] + " " + line[1];
			String date = line[2];
			double price = Double.parseDouble(line[3]);
			boolean contains = false;
			int index = 0;
			for(int i = 0; i < listOfPeople.size(); i++) {
				if(listOfPeople.get(i).equals(name)) {
					contains = true;
					index = i;
					i = listOfPeople.size();
				}
			}
			if(contains) {
				Person existingPerson = listOfPeople.get(index);
				existingPerson.addTransaction(date, price);
				listOfPeople.set(index, existingPerson);
			}
			else {
				Person newPerson = new Person(name);
				newPerson.addTransaction(date, price);
				listOfPeople.add(newPerson);
			}
		}
		double grandTotal = 0.0;
		Collections.sort(listOfPeople);
		Collections.reverse(listOfPeople);
		for(int i = 0; i < listOfPeople.size(); i++) {
			System.out.println(listOfPeople.get(i));
			System.out.println();
			grandTotal += listOfPeople.get(i).totalSales;
		}
		System.out.println("Grand Total $" + String.format("%.2f", grandTotal));
	}
}
class Person implements Comparable<Person> {
	public String fullName;
	public ArrayList<Purchase> listOfPurchases;
	public double totalSales;
	public Person(String name) {
		this.fullName = name;
		this.listOfPurchases = new ArrayList<Purchase>();
	}
	public void addTransaction(String date, double price) {
		this.listOfPurchases.add(new Purchase(date, price));
		this.totalSales += price;
	}
	public boolean equals(String name) {
		return this.fullName.equals(name);
	}
	public int compareTo(Person other) {
		return Double.compare(this.totalSales, other.totalSales);
	}
	public String toString() {
		String output = this.fullName + "\n";
		Collections.sort(listOfPurchases);
		for(int i = 0; i < listOfPurchases.size(); i++) {
			output += (listOfPurchases.get(i)) + "\n";
		}
		output += "Total Sales $" + String.format("%.2f", this.totalSales);
		return output;
	}
}
class Purchase implements Comparable<Purchase> {
	public Date dateOfPurchase;
	public double priceOfPurchase;
	public Purchase(String date, double price) {
		this.dateOfPurchase = new Date(date);
		this.priceOfPurchase = price;
	}
	public int compareTo(Purchase other) {
		return this.dateOfPurchase.compareTo(other.dateOfPurchase);
	}
	public String toString() {
		return this.dateOfPurchase + " $" + String.format("%.2f", this.priceOfPurchase);
	}
}
class Date implements Comparable<Date>{
	public String newDate;
	public String oldDate;
	public Date(String date) {
		this.oldDate = date;
		String[] parts = date.split("/");
		if(parts[1].length() == 1) {
			parts[1] = "0" + parts[1];
		}
		this.newDate = parts[0] + "/" + parts[1] + "/" + parts[2]; 
	}
	public int compareTo(Date other) {
		return this.newDate.compareTo(other.newDate);
	}
	public String toString() {
		return this.oldDate;
	}
}