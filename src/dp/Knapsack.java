package dp;

import java.util.Arrays;

public class Knapsack {

    // Recursive function with memoization to solve 0/1 Knapsack
    public static int knapsackMemoization(int[] weights, int[] values, int capacity, int n, int[][] memo) {
        // Base case: If either the capacity or the number of items is zero, return 0
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // Check if the result for the current subproblem is already memoized
        if (memo[n][capacity] != -1) {
            return memo[n][capacity];
        }

        // If the weight of the current item exceeds the remaining capacity, skip it
        if (weights[n - 1] > capacity) {
            memo[n][capacity] = knapsackMemoization(weights, values, capacity, n - 1, memo);
            return memo[n][capacity];
        } else {
            // Calculate and memoize the result for the current subproblem
            int includeCurrentItem = values[n - 1] + knapsackMemoization(weights, values, capacity - weights[n - 1], n - 1, memo);
            int excludeCurrentItem = knapsackMemoization(weights, values, capacity, n - 1, memo);
            memo[n][capacity] = Math.max(includeCurrentItem, excludeCurrentItem);
            return memo[n][capacity];
        }
    }

    public static void main(String[] args) {
        int[] weights = {4,3,5};
        int[] values = {7,6,11};
        int capacity = 5;
        int n = weights.length;

        // Initialize memoization table with -1
        int[][] memo = new int[n + 1][capacity + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int maxValue = knapsackMemoization(weights, values, capacity, n, memo);

        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
