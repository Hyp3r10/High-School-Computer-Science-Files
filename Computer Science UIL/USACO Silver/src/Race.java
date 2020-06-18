import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Race {
	/*public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(new BufferedReader(new FileReader("word.in")))) {
			try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")))) {
				int distanceOfGoal = scan.nextInt();
				int numTimes = scan.nextInt();
				for(int i = 0; i < numTimes; i++) {
					int maxSpeed = scan.nextInt();
					System.out.println(recursion(maxSpeed, new Cow(), 0, distanceOfGoal));
				}
			}
		}
	}*/



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int distanceOfGoal = scan.nextInt();
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int maxSpeed = scan.nextInt();
			Cow tempCow = new Cow();
			tempCow.addNewSpeed(1);
			System.out.println(recursion(maxSpeed, tempCow, 1, distanceOfGoal));
		}
	}


	/*public static int iterative(int maxSpeed, int goal) {
		int currentDistance = 0;
		int time = 0;
		Cow cow = new Cow();
		cow.addNewSpeed(1);
		do {
			int distanceLeft = goal-cow.getCurrentDistance();
			if(distanceLeft - cow.getCurrentDistance() <= 0) {
				time = time*2;
				break;
			}
			if(distanceLeft - cow.getCurrentDistance() + cow.getCurrentSpeed() <= 0) {
				time = time*2 +1;
			}
			if(distanceLeft - cow.getCurrentDistance() + cow.getCurrentSpeed()+1 <= 0) {
				time = time*2 +2;
			}
		} while(currentDistance != goal);

		return time;
	}*/


	public static int recursion(int maxSpeed, Cow currentCow, int currentSpeed, int goal) {
		// Base Case
		if(currentCow.getCurrentDistance() >= goal) {
			if(currentCow.getCurrentSpeed() <= maxSpeed) {
				return currentCow.getCurrentTime();
			}
			else {
				return Integer.MAX_VALUE;
			}
		}
		else {

			Cow moreCow = new Cow(currentCow.getListOfSpeeds(), currentCow.getCurrentSpeed(), currentCow.getCurrentDistance());
			Cow lessCow = new Cow(currentCow.getListOfSpeeds(), currentCow.getCurrentSpeed(), currentCow.getCurrentDistance());
			int time1 = 0, time2 = 0;
			
			moreCow.addNewSpeed(currentCow.getCurrentSpeed()+1);
			System.out.println("more : " + moreCow.getCurrentSpeed() +  moreCow.getListOfSpeeds());
			time1 = recursion(maxSpeed, moreCow, moreCow.getCurrentSpeed(), goal);
			
			
			
			if(currentCow.getCurrentSpeed()-1 >= 1) {
				lessCow.addNewSpeed(moreCow.getCurrentSpeed()-1);
				System.out.println("less : " + lessCow.getCurrentSpeed() + lessCow.getListOfSpeeds());
				time2 = recursion(maxSpeed, lessCow, lessCow.getCurrentSpeed(), goal);
			}

			if(time1 < time2) {
				currentCow = moreCow;
			}

			else {
				currentCow = lessCow;
			}
			return currentCow.getCurrentTime();
		}
	}
}
class Cow {
	public ArrayList<Integer> listOfSpeeds; 
	public int currentSpeed;
	public int currentTotalDistance;
	public Cow() {
		listOfSpeeds = new ArrayList<Integer>();
		currentSpeed = 0;
		currentTotalDistance = 0;
	}
	public Cow(ArrayList<Integer> previousList, int previousCurrentSpeed, int previousCurrentTotalDistance) {
		listOfSpeeds = previousList;
		currentSpeed = previousCurrentSpeed;
		currentTotalDistance = previousCurrentTotalDistance;
	}
	public int addNewSpeed(int newSpeed) {
		listOfSpeeds.add(newSpeed);
		currentTotalDistance += newSpeed;
		currentSpeed = newSpeed;
		return this.getCurrentDistance();
	}
	// Return the current speed
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	// Return the total distance traveled since start.
	public int getCurrentDistance() {
		return currentTotalDistance;
	}
	// Return the number of seconds that have passed
	public int getCurrentTime() {
		return listOfSpeeds.size();
	}
	// Return the list of Speeds that have been being used
	public ArrayList<Integer> getListOfSpeeds() {
		return listOfSpeeds;
	}
}
