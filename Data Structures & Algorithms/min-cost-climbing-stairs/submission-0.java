

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(f(0, cost, dp), f(1, cost, dp));
    }

    public int f(int n, int[] cost, int[] dp) {
        if(n >= cost.length) return 0;

        if(dp[n] != -1) return dp[n];

        int oneStep = f(n + 1, cost, dp);
        int twoStep = f(n + 2, cost, dp);

        return dp[n] = cost[n] + Math.min(oneStep, twoStep);
    }
}
