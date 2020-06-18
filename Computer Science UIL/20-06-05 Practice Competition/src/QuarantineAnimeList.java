import java.util.Scanner;
/**
 * @author MatthewSheldon
 */
public class QuarantineAnimeList {
	public static int[] happinessArr;
	public static int[] episodeArr;
	public static int maxHappiness;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numItems = scan.nextInt();
			int maxEpisodeCount = scan.nextInt();
			happinessArr = new int[numItems];
			episodeArr = new int[numItems];
			maxHappiness = 0;
			for(int k = 0; k < numItems; k++) {
				happinessArr[k] = scan.nextInt();
			}
			for(int k = 0; k < numItems; k++) {
				episodeArr[k] = scan.nextInt();
			}
			for(int k = 0; k < numItems; k++) {
				knapsack(maxEpisodeCount, k, 0, 0);
			}
			System.out.println(maxHappiness);
		}
	} 
	public static int knapsack(int maxEpisodeCount, int index, int currentEpisodeCount, int currentHappiness) {
		currentEpisodeCount += episodeArr[index];
		if(currentEpisodeCount > maxEpisodeCount) {
			return currentHappiness;
		}
		else {
			 currentHappiness += happinessArr[index];
			 index++;
			 for(int i = index; i < episodeArr.length; i++) {
				 int iterationHappiness = knapsack(maxEpisodeCount, i, currentEpisodeCount, currentHappiness);
				 if(iterationHappiness > maxHappiness) {
					 maxHappiness = iterationHappiness;
				 }
			 }
		}
		return currentHappiness;
	}
}