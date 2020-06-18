import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Krabby
{
	public static void main(String [] args) throws IOException
	{
		Scanner scan = new Scanner(new File("krabby.dat"));
		int num = scan.nextInt();
		int years = scan.nextInt();
		int days = scan.nextInt();
		int rtotal = days + (years*365);
		ArrayList<Person> list = new ArrayList<Person>();
		
		while(num>0)
		{
			String name = scan.next();
			int y = scan.nextInt();
			int d = scan.nextInt();
			list.add(new Person(name, y, d));
			num--;
		}
		
		Collections.sort(list);
		
		// All indices relate to the indices of the arrayList
		boolean[] canGo = new boolean[list.size()];
		// Always tracking the highest non-adult
		int indexOfHighestNonAdult = 0;
		// Will be converted into years and days at the end
		int numDaysPassed = 0;
		// Will be the index of the youngest person not accounted for
		int lowestNonAdult = list.size()-1;
		
		do {
			if(indexOfHighestNonAdult < list.size() && list.get(indexOfHighestNonAdult).isAdult(rtotal)) {
				canGo[indexOfHighestNonAdult] = true;
				if(lowestNonAdult-2 >= 0) {
					canGo[lowestNonAdult-1] = true;
				}
				if(lowestNonAdult-1 >= 0) {
					canGo[lowestNonAdult] = true;
				}
				indexOfHighestNonAdult++;
				lowestNonAdult-=2;
			}
			else {
				numDaysPassed++;
				for(int i = 0; i < list.size(); i++) {
					list.get(i).increaseAge();
				}
			}
		} while(!allAccountedFor(canGo));
		System.out.printf("%d year(s) and %d day(s)", (int) numDaysPassed/365, (int)numDaysPassed%365);
	
	}
	// Check to see if all people are accounted by an adult
	public static boolean allAccountedFor(boolean[] canGo) {
		int numPeopleAccountedFor = 0;
		for(boolean temp : canGo) {
			if(temp) {
				numPeopleAccountedFor++;	
			}
		}
		if(numPeopleAccountedFor == canGo.length) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Person implements Comparable<Person>
{
	private String name;
	private int y = 0;
	private int d = 0;
	private int age = (365)*(y) + d;
	
	Person(String s, int ye, int da)
	{
		name = s;
		y = ye;
		d = da;
		age = (365)*(y) + d;	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean isAdult(int rtotal)
	{
		if(age >= rtotal)
			return true;
		return false;
	}
	
	public void increaseAge() {
		age++;
	}
	
	public String toString()
	{
		return name;
	}

	@Override
	public int compareTo(Person p)
	{
		if(p.getAge() > this.getAge())
			return 1;
		if(p.getAge() < this.getAge())
			return -1;
		return 0;
	}
}