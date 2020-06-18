import java.util.Scanner;

/**
 * @author MatthewSheldon
 */
public class TimeAndTimeAgain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt(); scan.nextLine();
		Time[] times = new Time[numTimes];
		for(int i = 0; i < numTimes; i++) {
			times[i] = new Time();
			String line = scan.nextLine();
			String[] tempArr = line.split("[^0-9hms]");
			for(int j = 0; j < tempArr.length; j++) {
				if(tempArr[j].contains("h")) {
					times[i].updateHours(Integer.parseInt(tempArr[j].substring(0, tempArr[j].length()-1)));
				}
				if(tempArr[j].contains("m")) {
					times[i].updateMinutes(Integer.parseInt(tempArr[j].substring(0, tempArr[j].length()-1)));
				}
				if(tempArr[j].contains("s")) {
					times[i].updateSeconds(Integer.parseInt(tempArr[j].substring(0, tempArr[j].length()-1)));
				}
			}
		}
		for(Time current : times) {
			System.out.println(current);
		}
	}
}
class Time {
	public int hours, minutes, seconds;
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	public void updateHours(int numHours) {
		this.hours += numHours;
	}
	public void updateMinutes(int numMinutes) {
		this.minutes += numMinutes;
	}
	public void updateSeconds(int numSeconds) {
		this.seconds += numSeconds;
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
	}
}
