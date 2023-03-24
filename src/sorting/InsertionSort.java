package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[]arr ={6,5,4,3,2,1};
        int n=arr.length;

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
