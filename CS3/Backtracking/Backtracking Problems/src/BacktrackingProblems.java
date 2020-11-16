import java.util.Arrays;
import java.util.List;

public class BacktrackingProblems {
	public void climbStairs(int steps) {
		this.climbStairsHelper(0, steps, "");
	}
	private void climbStairsHelper(int currSteps, int totalSteps, String steps) {
		if(currSteps == totalSteps) {
			System.out.println(steps.substring(0, steps.length()-2));
		}
		else if(currSteps < totalSteps) {
			this.climbStairsHelper(currSteps + 1, totalSteps, steps + "1, ");
			this.climbStairsHelper(currSteps + 2, totalSteps, steps + "2, ");
		}
		else {
			return;
		}
	}
	public void campsite(int x, int y) {
		this.campsiteSolver(x, y, 0, 0, "");
	}
	private void campsiteSolver(int targetX, int targetY, int currX, int currY, String path) {
		if(currX == targetX && currY == targetY) {
			System.out.println(path.trim());
		}
		else if(currX <= targetX && currY <= targetY) {
			this.campsiteSolver(targetX, targetY, currX+1, currY, path + "E ");
			this.campsiteSolver(targetX, targetY, currX, currY+1, path + "N ");
			this.campsiteSolver(targetX, targetY, currX+1, currY+1, path + "NE ");
		}
		else {
			return;
		}
	}
	private int maxTotal;
	public int getMax(List<Integer> nums, int limit) {
		this.maxTotal = Integer.MIN_VALUE;
		for(int i = 0; i < nums.size(); i++) {
			this.knapsack(nums, limit, i, 0);
		}
		return this.maxTotal;
	}
	private int knapsack(List<Integer> nums, int limit, int index, int currTotal) {
		currTotal += nums.get(index);
		System.out.println(index + " " + currTotal);
		if(currTotal > limit) {
			return currTotal;
		}
		else {
			 index++;
			 for(int i = index; i < nums.size(); i++) {
				 int iterationTotal = knapsack(nums, limit, i, currTotal);
				 if(iterationTotal > maxTotal && iterationTotal < limit) {
					 maxTotal = iterationTotal;
				 }
			 }
		}
		return currTotal;
	}
	public static void main(String[] args) {
		BacktrackingProblems tester = new BacktrackingProblems();
		tester.climbStairs(4);
		System.out.println("\n\nCampsite: ");
		System.out.println("----------------------------");
		tester.campsite(2, 1);
		System.out.println("\n\ngetMax: ");
		System.out.println("----------------------------");
		System.out.println(tester.getMax(Arrays.asList(30, 2, 8, 22, 6, 4, 20), 19));
	}
}