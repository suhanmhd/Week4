package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[]arr ={6,5,4,0,12,3,2,1};
        int n=arr.length;

//        for(int i=1;i<n;i++){
//            for(int j=0;j<i;j++){
//                if(arr[j]>arr[i]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

        for(int i =1;i<arr.length;i++){
            int key =arr[i];
            int j =i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
        System.out.println(Arrays.toString(arr));
    }
}
