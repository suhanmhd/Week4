package dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShortestDistance {

public static int shortestPath(int[][] grid, int i,int j,int memo[][]){

    if(i==0&&j==0){

        return grid[i][j];
    }

    if(i<0||j<0){
   return (int) Math.pow(10, 9);
    }

    if(memo[i][j]!=-1)return memo[i][j];


     int up = grid[i][j]+ shortestPath(grid,i-1,j,memo);
//    int left = Integer.MAX_VALUE;
//       if(j>=0) {
           int left = grid[i][j] + shortestPath(grid, i, j - 1,memo);
//       }

      return memo[i][j]= Math.min(up,left);





}

//public static  int shortestPathIterative(int[][] grid, int i,int j,int[][]dp){
//
//   dp[0][0]= grid[0][0];
//
//
//     for(int i =0;i<grid.length;i++){
//
//
//         for(int j=0;j<grid[0].length;j++){
//
//             int up = grid[i][j];
//
//             up+=dp[i-1][j];
//
//             int left = grid[i][j];
//              left += dp[i][j-1];
//
//
//              dp[i][j]= Math.min(up,left);
//
//
//
//         }
//
//
//     }
//
//}

    public static void main(String[] args) {

     int[][] grid = {{1, 3, 1},{1, 5, 1},{4, 2, 1}};
     int[][] dp = new int[grid.length][grid[0].length];
     for(int[] nums:dp){
         Arrays.fill(nums,-1);
     }

     int i= grid.length;
     int j = grid[0].length;

     int result =shortestPath(grid,i-1,j-1,dp);
        System.out.println(result);



    }


}
