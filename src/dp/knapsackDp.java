package dp;


public class knapsackDp {

    // Function to solve 0/1 Knapsack using dynamic programming
    public static int knapsackDP(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
           for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
//        int[] weights = {1, 2, 3, 4, 5};
//        int[] values = {10, 20, 30, 40, 50};
//        int capacity = 7;

        int[] weights = {4,3,5};
        int[] values = {7,6,11};
        int capacity = 5;

        int maxValue = knapsackDP(weights, values, capacity);

        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
