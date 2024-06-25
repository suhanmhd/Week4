package dp;

import java.util.*;
public class CoinChange {



//class TUF {
    // Recursive function to count the ways to make change
    static long countWaysToMakeChangeUtil(int[] arr, int ind, int T, long[][] dp) {
        // Base case: If the current index is 0
        if (ind == 0) {
            // If T is divisible by the first element of the array, return 1, else return 0
            if (T % arr[0] == 0)
                return 1;
            else
                return 0;
        }

        // If the result for this subproblem has already been calculated, return it
        if (dp[ind][T] != -1)
            return dp[ind][T];

        // Calculate the number of ways without taking the current element
        long notTaken = countWaysToMakeChangeUtil(arr, ind - 1, T, dp);

        // Initialize the number of ways taking the current element as 0
        long taken = 0;

        // If the current element is less than or equal to T, calculate 'taken'
        if (arr[ind] <= T)
            taken = countWaysToMakeChangeUtil(arr, ind, T - arr[ind], dp);

        // Store the result in the dp array and return it
        return dp[ind][T] = notTaken + taken;
    }

    // Function to count the ways to make change
    static long countWaysToMakeChange(int[] arr, int n, int T) {
        // Create a 2D array to store results of subproblems
        long dp[][] = new long[n][T + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (long row[] : dp)
            Arrays.fill(row, -1);

        // Call the countWaysToMakeChangeUtil function to calculate the number of ways
        return countWaysToMakeChangeUtil(arr, n - 1, T, dp);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5};
        int target = 3;
        int n = arr.length;

        // Call the countWaysToMakeChange function and print the result
        System.out.println("The total number of ways is " + countWaysToMakeChange(arr, n, target));
    }
}
