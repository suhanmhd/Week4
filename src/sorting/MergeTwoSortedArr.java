package sorting;

import java.util.Arrays;

public class MergeTwoSortedArr {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] arr2 ={6,7,8,9,10,11,18};

        System.out.println(Arrays.toString(  merge(arr,arr2)));

    }

    static int[] merge(int[]arr,int[]arr2){
        int[] ans = new int[arr.length+arr2.length];
        int i=arr.length-1;
        int j=arr2.length-1;
        int k=0;


        while(i>=0&&j>=0){
            if(arr[i]>arr2[j]){
                ans[k++]=arr[i--];
            }
            else{
                ans[k++]=arr2[j--];
            }
        }
        while (i>=0){
            ans[k++]=arr[i--];
        }
        while (j>=0){
            ans[k++]=arr2[j--];
        }
        return ans;
    }
}
