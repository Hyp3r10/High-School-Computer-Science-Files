import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenderRace {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("gender_race.dat"));

		Racers R = new Racers("n", 0, "g");
		int times = scan.nextInt();
		ArrayList<Racers> racers = new ArrayList<Racers>();

		for (int i = 0; i < times; i++) {
			String n = scan.next();
			int t = scan.nextInt();
			String g = scan.next();

			Racers r = new Racers(n, t, g);
			racers.add(r);
		}

		ArrayList<Racers> females = new ArrayList<Racers>();
		for (int i = 0; i < times; i++) {
			if (racers.get(i).gender().equalsIgnoreCase("F")) {
				females.add(racers.get(i));
			}
		}

		ArrayList<Racers> males = new ArrayList<Racers>();
		for (int i = 0; i < times; i++) {
			if (racers.get(i).gender().equalsIgnoreCase("M")) {
				males.add(racers.get(i));
			}
		}

		Collections.sort(males);
		Collections.sort(females);
		Collections.sort(racers);
		
		System.out.println(racers.get(0));
		System.out.println(racers.get(1));
		
		System.out.println(males.get(0));
		System.out.println(males.get(1));
		
		System.out.println(females.get(0));
		System.out.println(females.get(1));

	}
}
class Racers implements Comparable<Racers>
{
	String name;
	int time;
	String gender;
	
	public Racers(String n, int t, String g) 
	{
		name = n;
		time = t;
		gender = g;
	}
	
	public String name()
	{
		return name;
	}
	
	public int time()
	{
		return time;
	}
	
	public String gender()
	{
		return gender;
	}
	
	public String toString()
	{
		return name + " " + time + " " + gender;
	}

	@Override
	public int compareTo(Racers o) {
		if (this.time == o.time)  {
			return 0;
		} else if (this.time > o.time)  {
			return 1;
		} else {
			return -1;
		}
	}
}
