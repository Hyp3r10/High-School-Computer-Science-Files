import java.util.ArrayList;
import java.util.Arrays;

public class MySolutionBouquet {
	public static int minDays(int[] bloomDay, int m, int k) {
		if((m * k) > bloomDay.length) {
			return -1;
		}
		else if(m == 1) {
			Arrays.sort(bloomDay);
			return bloomDay[0];
		}
		else {
			int smallest = Integer.MAX_VALUE;
			for(int temp : bloomDay) {
				if(temp < smallest) {
					smallest = temp;
				}
			}
			ArrayList<Flower> flowers = new ArrayList<Flower>();
			for(int days : bloomDay) {
				flowers.add(new Flower(days-smallest, k));
			}
			boolean allBouquetsMade = false;
			int numMade = 0;
			int time = smallest;
			while(!allBouquetsMade) {
				if(numMade >= m) {
					allBouquetsMade = true;
				}
				else {
					flowers = increaseDay(flowers);
					numMade = getNumBouquets(flowers, k);
					time++;
				}
			}
			return time;
		}
	}
	public static ArrayList<Flower> increaseDay(ArrayList<Flower> flowers) {
		for(int i = 0; i < flowers.size(); i++) {
			Flower temp = flowers.get(i);
			temp.decreaseDays();
			flowers.set(i, temp);
		}
		return flowers;
	}
	public static int getNumBouquets(ArrayList<Flower> flowers, int k) {
		int numBouquets = 0;
		for(int i = 0; i < flowers.size();) {
			if(flowers.get(i).isBloomed()) {
				if(k == 1) {
					numBouquets++;
					i++;
				}
				else {
					int count = 1;
					for(int j = 1; j < k && i+j < flowers.size(); j++) {
						if(!flowers.get(i+j).isBloomed()) {
							i = i+j;
							j = k;
						}
						else {
							count++;
						}
					}
					if(count == k) {
						numBouquets++;
						i = i + k;
					}
					else {
						i++;
					}
				}
			}
			else {
				i++;
			}
		}
		return numBouquets;
	}
}
class Flower {
	public int numDaysTillBloom;
	public int orriginalDaysTillBloom;
	public int numFlowersInBoquet;
	public Flower(int orriginalDays, int num) {
		this.numDaysTillBloom = orriginalDays;
		this.orriginalDaysTillBloom = orriginalDays;
		this.numFlowersInBoquet = num;
	}
	public void decreaseDays() {
		numDaysTillBloom--;
	}
	public boolean isBloomed() {
		return numDaysTillBloom <= 0;
	}
	public String toString() {
		return "" + numDaysTillBloom;
	}
}