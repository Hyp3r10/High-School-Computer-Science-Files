import java.util.*;

public class ProblemF2ndEdition {
	final static int MAX = 11;

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int numTimes = scan.nextInt();
		while(numTimes-->0) {
			int x = scan.nextInt(), y = scan.nextInt();
			int[][] coords = new int[MAX][2];
			coords[0][0] = scan.nextInt();
			coords[0][1] = scan.nextInt();

			int n = scan.nextInt();
			for (int i = 1; i <= n; i++) {
				coords[i][0] = scan.nextInt();
				coords[i][1] = scan.nextInt();
			}

			int[][] graph = new int[n+1][n+1];
			for (int i = 0; i < n+1; i++) {
				for (int j = i+1; j < n+1; j++) {
					int dx = Math.abs(coords[i][0] - coords[j][0]);
					int dy = Math.abs(coords[i][1] - coords[j][1]);
					graph[i][j] = graph[j][i] = dx + dy;
				}
			}

			boolean[] visited = new boolean[n+1];
			int ans = getAns(graph, 0, n, 0, 0, visited);
			System.out.println(ans);
		}
	}

	static int getAns(int[][] graph, int count, int totalNodes, int currIndex, int total, boolean[] visited) {
		if (count == totalNodes) {
			return total + graph[currIndex][0];
		}
		visited[currIndex] = true;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < totalNodes+1; i++) {
			if (!visited[i]) {
				int val = getAns(graph, count+1, totalNodes, i, total+graph[currIndex][i], visited);
				ans = Math.min(val, ans);
			}
		}
		visited[currIndex] = false;
		return ans;
	}
}
