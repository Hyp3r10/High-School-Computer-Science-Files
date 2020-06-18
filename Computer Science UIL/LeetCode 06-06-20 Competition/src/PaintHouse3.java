import java.util.Arrays;

class Solution {
    int[][][] dp;
    int[] h;
    int[][] c;
    int m, n, tar;
    int inf = Integer.MAX_VALUE / 2;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        h = houses;
        c = cost;
        this.m = m;
        this.n = n;
        tar = target;
        dp = new int[m][n + 1][target + 1];
        for (int[][] i : dp) for (int[] j : i) Arrays.fill(j, -1);
        int res = dfs(0, 0, 0);
        return res == inf ? -1 : res;
        
    }
    int dfs(int pos, int lastCol, int targ) {
        if (targ > tar) return inf;
        if (pos == m) {
            if (targ < tar) return inf;
            return 0;
        }
        if (dp[pos][lastCol][targ] >= 0) return dp[pos][lastCol][targ];
        int res = inf;
        if (h[pos] == 0) {
            for (int col = 0; col < c[pos].length; col++) {
                res = Math.min(res, c[pos][col] + dfs(pos + 1, col + 1, (targ + ((col + 1 == lastCol) ? 0 : 1))));    
            }
        } else {
            res = dfs(pos + 1, h[pos], (targ + ((h[pos] == lastCol) ? 0 : 1)));
        }
        Integer.com
        return dp[pos][lastCol][targ] = res;
    }
}
