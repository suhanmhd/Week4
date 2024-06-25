package dp;

import java.util.HashMap;

public class UniqueBst {
   static HashMap<Integer,Integer> memo = new HashMap<>();
    public static void main(String[] args) {

        System.out.println(numTrees(3));

//        System.out.println(numTreesDp(4));



    }

//RECURSIVE APPROACH WITH MEMOIZATION
    public static int numTrees(int n) {
        if(n<=1){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int sum =0;
        for(int i =1;i<=n;i++){
            sum+= numTrees(i-1)* numTrees(n-i);
        }
        memo.put(n,sum);
        return sum;
    }

//DP APPROACH
    public static int numTreesDp(int n) {
        int[] dp = new int[n+1];
          dp[0]=1;
        for(int i =1;i<=n;i++){
            for(int root =1; root<=i;root++){
                dp[i]+= dp[root-1]*dp[i-root];
            }
        }
        return dp[n];
    }
}
