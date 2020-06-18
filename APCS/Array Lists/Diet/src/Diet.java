import java.util.ArrayList;
import java.util.Scanner;
public class Diet {
	//Instance Variables
	public ArrayList<Entry> list;
	public int weightD;
	public int net;
	//Constructors
	public Diet() {
		list = new ArrayList<Entry>();
		weightD = 0;
		net = 0;
	}
	//Mutator Methods
	public void addEntry() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter date --> ");
		String date = scan.nextLine();
		System.out.print("Enter weight --> ");
		int weight = scan.nextInt();
		list.add(new Entry(date, weight));
	}
	//Accessor Methods
	public Entry getEntry(String date) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getDate().equalsIgnoreCase(date)) {
				return list.get(i);
			}
		}
		return null;
	}
	public int getWeightDifferential(int weight1, int weight2) {
		return weight2 - weight1;
	}
	public void viewList() {
		String output = "";
		for(int i = 0; i < list.size(); i++) {
			if(i==0) { output += list.get(i).toString() + getWeightDifferential(0, 0); }
			else { output += list.get(i).toString() + getWeightDifferential(list.get(i-1).getWeight(), list.get(i).getWeight()); }
		}
		System.out.println(output);
	}
}
